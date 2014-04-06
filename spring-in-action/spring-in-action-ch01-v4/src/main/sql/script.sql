DROP TABLE IF EXISTS Employee;

CREATE TABLE Employee (
  id INTEGER NOT NULL PRIMARY KEY AUTO_INCREMENT,
  first_name VARCHAR(50) NOT NULL,
  last_name VARCHAR(50) NOT NULL,
  email VARCHAR(50),
  join_date DATE NOT NULL
);

INSERT INTO Employee (id, first_name, last_name, email, join_date) VALUES (1, 'Alice', 'Brooks', 'alice@gmail.com', '2014-01-01');
INSERT INTO Employee (id, first_name, last_name, email, join_date) VALUES (2, 'Bob', 'Wallace', 'bob@gmail.com', '2014-02-01');
INSERT INTO Employee (id, first_name, last_name, email, join_date) VALUES (3, 'Clarice', 'Walden', 'clarice@gmail.com', '2014-03-01');

