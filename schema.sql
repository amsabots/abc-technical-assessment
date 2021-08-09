-- table schema operations
-- TASK 1:: A user management database schema, where users have different roles. Include necessary constraints.
CREATE TABLE Users(
id BIGSERIAL PRIMARY KEY ,
name VARCHAR(20) NOT NULL
);

CREATE TABLE Roles(
id BIGSERIAL PRIMARY KEY ,
role VARCHAR(20) NOT NULL
);

create table user_roles
(
  userId int,
  roleId int,
  CONSTRAINT user_role_pk PRIMARY KEY (userId, roleId),
  CONSTRAINT FK_user
      FOREIGN KEY (userId) REFERENCES Users (id),
  CONSTRAINT FK_role
      FOREIGN KEY (roleId) REFERENCES Roles (id)
)

-- ==================== end of task 1
