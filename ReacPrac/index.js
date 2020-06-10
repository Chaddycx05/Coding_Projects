import React from "react";
import ReactDOM from "react-dom";

function Welcome(props){
return <h1>Engineer Projects: {props.name}</h1>
}

// What is this? HTML mixed with JavaScript
let contents = <section> 
        <Welcome name = "Website Development!" />
        <Welcome name = "The piece of mind to understanding this" />
     </section>;


ReactDOM.render(
    contents,
    document.getElementById("root")
);