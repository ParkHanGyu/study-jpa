import "./style.css";

const UserList = () => {
  return (
    <div className="userList-wrap">
      <div className="userList-header">
        <div className="allCheckBox">
          <input type="checkbox" />
        </div>
        <div className="header-name">Name</div>
        <div className="header-age">Age</div>
        <div className="header-join-date">Join Date</div>
        <div className="header-department">Department</div>
        <div className="header-actions">Actions</div>
      </div>

      <div className="userList-Item">
        <div className="checkBox">
          <input type="checkbox" />
        </div>
        <div className="name">{"Jennie Torres"}</div>
        <div className="age">{"25"}</div>
        <div className="join-date">{"2023-09-28"}</div>
        <div className="department">{"asdfsdf"}</div>
        <div className="actions-icon">
          <div className="actions-icon-img"></div>
        </div>
      </div>
    </div>
  );
};

export default UserList;
