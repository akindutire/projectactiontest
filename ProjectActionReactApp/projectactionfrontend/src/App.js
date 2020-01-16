import React from 'react';
import logo from "./logo.svg";
import "./App.css";

class App extends React.Component{

  constructor(props){
    
  }
  
  render(){
    return (
      <div className="App">
        
        <header className="App-header">
  
          <img src={logo} className="App-logo"/>
          <p>Setup a Project</p>
  
        </header>
  
  
      </div>
    );
  
  };
}

export default App;