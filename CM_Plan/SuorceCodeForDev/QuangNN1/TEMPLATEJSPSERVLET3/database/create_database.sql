create database jspservletjdbc
GO

use jspservletjdbc;
GO

CREATE TABLE roles(
  id bigint NOT NULL IDENTITY(1,1) PRIMARY KEY,
  name NVARCHAR(255) NOT NULL,
  code VARCHAR(255) NOT NULL,
  createddate DATETIME NULL,
  modifieddate DATETIME NULL,
  createdby VARCHAR(255) NULL,
  modifiedby VARCHAR(255) NULL
);

CREATE TABLE users (
  id bigint NOT NULL IDENTITY(1,1) PRIMARY KEY,
  username VARCHAR(150) NOT NULL,
  password VARCHAR(150) NOT NULL,
  fullname NVARCHAR(150) NULL,
  status int NOT NULL,
  roleid bigint NOT NULL,
  createddate DATETIME NULL,
  modifieddate DATETIME NULL,
  createdby VARCHAR(255) NULL,
  modifiedby VARCHAR(255) 
);

ALTER TABLE users ADD CONSTRAINT fk_users_roles FOREIGN KEY (roleid) REFERENCES roles(id);

CREATE TABLE news (
  id bigint NOT NULL IDENTITY(1,1) PRIMARY KEY,
  title NVARCHAR(255) NULL,
  thumbnail NVARCHAR(255) NULL,
  shortdescription TEXT NULL,
  content TEXT NULL,
  categoryid bigint NOT NULL,
  createddate DATETIME NULL,
  modifieddate DATETIME NULL,
  createdby VARCHAR(255) NULL,
  modifiedby VARCHAR(255) NULL
);

CREATE TABLE category (
  id bigint NOT NULL IDENTITY(1,1) PRIMARY KEY,
  name NVARCHAR(255) NOT NULL,
  code VARCHAR(255) NOT NULL,
  createddate DATETIME NULL,
  modifieddate DATETIME NULL,
  createdby VARCHAR(255) NULL,
  modifiedby VARCHAR(255) NULL
);

ALTER TABLE news ADD CONSTRAINT fk_news_category FOREIGN KEY (categoryid) REFERENCES category(id);

CREATE TABLE comment (
  id bigint NOT NULL IDENTITY(1,1) PRIMARY KEY,
  content TEXT NOT NULL,
  user_id bigint NOT NULL,
  new_id bigint NOT NULL,
  createddate DATETIME NULL,
  modifieddate DATETIME NULL,
  createdby VARCHAR(255) NULL,
  modifiedby VARCHAR(255) NULL
);

ALTER TABLE comment ADD CONSTRAINT fk_comment_user FOREIGN KEY (user_id) REFERENCES users(id);
ALTER TABLE comment ADD CONSTRAINT fk_comment_news FOREIGN KEY (new_id) REFERENCES news(id);
















