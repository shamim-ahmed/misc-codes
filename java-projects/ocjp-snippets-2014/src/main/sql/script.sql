/* the user table */
DROP TABLE IF EXISTS User;

CREATE TABLE User (
  user_id INTEGER NOT NULL PRIMARY KEY AUTO_INCREMENT,
  username VARCHAR(50) NOT NULL,
  email VARCHAR(50)
);

INSERT INTO User (username, email) VALUES ('shamim', 'shamim@gmail.com');
INSERT INTO User (username, email) VALUES ('derek', 'derek@gmail.com');

/* the product table */
DROP TABLE IF EXISTS Product;

CREATE TABLE Product(
  product_id INTEGER NOT NULL PRIMARY KEY AUTO_INCREMENT,
  name VARCHAR(50) NOT NULL,
  available INTEGER NOT NULL
);

INSERT INTO Product (name, available) VALUES ('laptop', 1);
INSERT INTO Product (name, available) VALUES ('ipad', 0);
