import React from "react";
import UserList from "./views/UserList";
import UserList2 from "./views/UserList2";
import { BrowserRouter as Router } from "react-router-dom";

const App = () => {
  return (
    <Router>
      <UserList />
    </Router>
  );
};

export default App;
