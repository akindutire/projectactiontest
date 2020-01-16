import React from 'react';
import logo from "./logo.svg";
import "./App.css";

class App extends React.Component{

  constructor(props){
    super(props);
    this.state = {
      list : []
    }
  }
  
  render(){
    return (
      <div className="app-container">
        
        <header className="app-title">
  
          <h1>Project-Action</h1>

        </header>
  
  
        <footer className="app-text-light app-centralize app-bottom">VGG: Project-Action</footer>
      </div>
    );
  
  };
}

export default App;