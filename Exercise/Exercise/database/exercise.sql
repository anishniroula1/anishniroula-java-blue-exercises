DROP TABLE IF EXISTS authorities;
DROP TABLE IF EXISTS users;
DROP TABLE IF EXISTS loginlog;
DROP TABLE IF EXISTS workout;
DROP TABLE IF EXISTSworkoutinstructions;

CREATE TABLE users (
  id serial ,
  name varchar(255) NOT NULL,
  username varchar(255) NOT NULL UNIQUE PRIMARY KEY,     -- Username
  email varchar(255) NOT NULL UNIQUE,
  password varchar(32) NOT NULL,      -- Password (in plain-text)
  salt varchar(256) NOT NULL,		  -- Password Salt
  location varchar(255) NOT NULL,
  gender varchar(50) NOT NULL,
  fromdate TIMESTAMP DEFAULT NOW()   
);


CREATE TABLE authorities (
id serial ,
 username varchar(255) NOT NULL,
 authority varchar(50) NOT NULL,
 foreign key(username) references users(username)
);



CREATE TABLE loginlog (
  id serial PRIMARY KEY,
  username varchar(255) NOT NULL,
  date_time TIMESTAMP DEFAULT NOW()
);

CREATE TABLE image (
  id serial PRIMARY KEY,
  name varchar(255) NOT NULL,
  imagename varchar(255) NOT NULL
);

CREATE TABLE workout (
  id serial PRIMARY KEY,
  code varchar(300) NOT NULL UNIQUE,
  imagename varchar(255) NOT NULL,
  workoutname varchar(255) NOT NULL,
  instructions varchar(3000) NOT NULL,
  videolink varchar(255) NOT NULL,
  timelength varchar(255) NOT NULL,
  bodylocation varchar(255) NOT NULL,
  typesofexercise varchar(255) NOT NULL,
  choicethatfallunder varchar(255) NOT NULL
);


CREATE TABLE workoutinstructions (
  id serial PRIMARY KEY,
  code varchar(300) NOT NULL,
  instructions varchar(2000) NOT NULL
  );
  
CREATE TABLE userupload(
        id serial PRIMARY KEY,
        username varchar(255) NOT NULL,
        profilepicture varchar(500),
        regularupload varchar(500),
        filelocation varchar(500),
        userpost varchar(8000),
        date_time TIMESTAMP DEFAULT NOW()    
);

CREATE TABLE post(
        id serial PRIMARY KEY,
        username varchar(255),
        post varchar(500) 
);
