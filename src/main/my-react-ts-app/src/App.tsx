import React from "react";
import { Route, Router, Routes } from "react-router-dom";
import UserList from "./views/userList";
import UserList2 from "./views/userList2";

const App = () => {
  return (
    <>
      <UserList2 />
      <UserList />
    </>
  );
};

export default App;
