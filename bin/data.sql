--Insert, update, delete operations
-- Any operations that is not coupled to altering or creation of a table

-- ============== tasks and requirements ======
 -- TASK 2:: Create SQL insert statements, to add 2 sample users, 3 sample roles, and to assign each user to have at least 2 of the created roles.
-- ===============
 --------- Two sample users
INSERT INTO USERS (NAME) VALUES('Andrew Mwebi');
INSERT INTO USERS (NAME) VALUES('Andie Mititi');

------------======================--------------
 ------- Three sample roles
 INSERT INTO ROLES(ROLE) VALUES('admin');
 INSERT INTO ROLES(ROLE) VALUES('user');
 INSERT INTO ROLES(ROLE) VALUES('manager');

 -----------====================---------
 ---------- and to assign each user to have at least 2 of the created roles
INSERT INTO user_roles(userId, roleId) VALUES(1,1);
INSERT INTO user_roles(userId, roleId) VALUES(1,2);
INSERT INTO user_roles(userId, roleId) VALUES(2,2);
INSERT INTO user_roles(userId, roleId) VALUES(2,3);

-- =========================== -----------------
--------- Write a select statement that lists all roles for a specific user.
SELECT
  users.*,
  roles.*
FROM users
JOIN user_roles
  ON users.id = user_roles.userId
JOIN roles
  ON roles.id = user_roles.roleId;


-- ================== -------------
--- Write a select statement that lists all users that have a specific role.
--- for this i have decide to implicitly provide a query pre filled with type of role. for live applications, this will be provided
--- explicitly by the programmer and should be dynamic
--- Distinct must be applied to force uniq and non repeated results from the database

-- ======= the role id chosen is abitrary in this case 2

SELECT DISTINCT
  users.*,
  roles.*
FROM users
JOIN user_roles
  ON users.id = user_roles.userId
JOIN roles
  ON roles.id = 2;