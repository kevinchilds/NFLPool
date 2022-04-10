CREATE TABLE users(
	id serial PRIMARY KEY
	,username varchar(100) UNIQUE NOT null
	,PASSWORD varchar(100) NOT NULL 
	,firstname varchar(100) NOT NULL
	,lastname varchar(100) NOT NULL
);

CREATE TABLE pools(
	id serial PRIMARY KEY 
	,name varchar(200) NOT NULL 
	,user_id_fk int REFERENCES users(id) NOT NULL 
);


CREATE TABLE teams(
	id serial PRIMARY KEY
	,name varchar(200) NOT NULL
	,logo varchar(400) NOT NULL
);
