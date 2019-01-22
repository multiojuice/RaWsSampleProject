import React, { Component } from 'react';
import { Wrapper, Input, RestButton, Label, RowContainer } from './StyledComponents'
import { loadavg } from 'os';
class App extends Component {
  constructor(props) {
    super(props);
    this.state = {
      endpoint: ''
    };
    this.webSocket = null;
  }

  restRequest = (event) => {
    const restMethod = event.target.id;
    fetch(`http://127.0.0.1:8080/${this.state.endpoint}`, {method: restMethod})
      .then(resp => resp.json())
      .then(response => console.warn(response))
  }

  changeEndpoint = (event) => {
    this.setState({endpoint: event.target.value})
  }

  createWebSocket = () => {
    this.webSocket = new WebSocket('ws://127.0.0.1:1337', 'stream');
  }

  render() {
    console.warn(this.state.endpoint)
    return (
      <Wrapper>
        <RowContainer>
          <Label>Current endpoint: </Label>
          <Input onChange={this.changeEndpoint}/>
        </RowContainer>
        <RowContainer>
          <Label>Trigger rest method call:</Label>
          <RestButton onClick={this.restRequest} id="GET">GET</RestButton>
          <RestButton onClick={this.restRequest} id="POST">POST</RestButton>
          <RestButton onClick={this.restRequest} id="PUT">PUT</RestButton>
          <RestButton onClick={this.restRequest} id="PATCH">PATCH</RestButton>
          <RestButton onClick={this.restRequest} id="DELETE">DELETE</RestButton>
        </RowContainer>

        <RowContainer>
          <Label>Web-socket stuff:</Label>
          <RestButton onClick={this.createWebSocket}>Create</RestButton>
        </RowContainer>

      </Wrapper>
    );
  }
}

export default App;
