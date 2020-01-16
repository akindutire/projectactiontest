import React from 'react';
import axios from 'axios';
import "./App.css";



class App extends React.Component{

  constructor(props){
    super(props);
    this.state = {
      projects : []
    }
  }

  componentDidMount(){
    axios.get('http://localhost:8081/project/all', { 'headers': { 'Access-Control-Allow-Origin': '*' } })
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

  openProjectDetails(){
    alert("Clicked");
  };

  render(){

    const { projects } = this.state;
    // [
    //   {id:1, name: "Lawma", description: "Manage waste", completed: false},
    //   {id:1, name: "Pawma", description: "Manage waste", completed: false},
    //   {id:1, name: "Loan", description: "Loan", completed: false},
    // ];

    
   

    return (
      <div className="app-container">
        
        <header className="app-title p-4 mb-3">
  
          <h1 className="">Project-Action</h1>

        </header>
  
        <main className="container">
          <div className="row mt-4">
            {
  
              projects.map( project => {

                return (
                  <div className="col-sm-12 col-md-4">
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

                        <a onClick={this.openProjectDetails} className="btn btn-light-blue btn-block">Open</a>
                      </div>
                    </div>
                  </div>
                );
              
              }) 
  
            }

          </div>
        </main>
  
      </div>
    );
  
  };
}

export default App;