import React from "react";
import { Route, Router, Routes } from "react-router-dom";
import UserList from "./views/UserList";
import UserList2 from "./views/UserList2";

const App = () => {
  return (
    <>
      <UserList2 />
      <UserList />
    </>
  );
};

export default App;
