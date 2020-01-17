import React from 'react';
import axios from 'axios';


import "./App.css";

class ProjectDetail extends React.Component{

    constructor(props){
        super(props);
        this.state = {
            project : []
          }

          this.addAction.bind(this);
    }

    addAction(event){

        event.preventDefault();

    }

    componentWillMount(){
        axios.get('http://localhost:8081/project/all')
        .then( (response) => {
          this.setState({
            projects: response.data
          });
          console.log(response);
        } )
        .catch( err => {
          console.log(err);
        })
      }
    
      

    render(){

        const { project } = this.state;
        
    
        return(

            <div className="app-container">
        
                <header className="app-title p-4 mb-3">
        
                <h1>{project.name}</h1>

                </header>
    
                <main className="container">
                    <div className="row mt-4">
                        
                            
                                
                                <div className="col-sm-12 col-md-8 offset-col-md-2">
                                    <div className="card">
                                    <div className="card-body">
                                        <h5 className="card-title">{project.name}</h5>
                                        <div className="card-text">{project.description}</div>
                                        <hr/>
                                        <b>Actions</b>
                                        {
                                        project.action.map( action => {

                                            return(
                                                <p className="card-text"><b>{action.id}:</b> {action.description}</p>
                                            );

                                        })
                                        }

                                        <form onSubmit={this.addAction}>
                                            <div className="form-group">
                                                <input className="form-control" type="text" placeholder="description" ref={ input => this.description = input  }/>
                                            </div>
                                            <div className="form-group">
                                                <input className="form-control" type="text" placeholder="note" ref={ input => this.note = input }/>
                                            </div>
                                            <div className="form-group">
                                                <input className="form-control" type="checkbox" ref={ input => this.note = input  }/> 
                                                <label className="form-label">is Completed</label>
                                            </div>
                                            
                                        </form>

                                    </div>
                                    </div>
                                </div>
                            );
                        
                        
                        

                    </div>
                </main>
  
            </div>
        );
        
    }
}

export default ProjectDetail;