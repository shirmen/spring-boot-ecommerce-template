CREATE TABLE users (
  id int(11) NOT NULL AUTO_INCREMENT,
  role varchar(45) NOT NULL,
  username varchar(45) NOT NULL,
  password varchar(45) NOT NULL,
  enabled int(1) NOT NULL DEFAULT '0',
  PRIMARY KEY (id)
);

CREATE TABLE products (
  id int(11) NOT NULL AUTO_INCREMENT,
  name varchar(45) NOT NULL,
  price int(11) NOT NULL DEFAULT '0',
  PRIMARY KEY (id)
);
