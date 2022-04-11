CREATE TABLE users(
	id serial PRIMARY KEY
	,username varchar(100) UNIQUE NOT null
	,PASSWORD varchar(100) NOT NULL 
	,firstname varchar(100) NOT NULL
	,lastname varchar(100) NOT NULL
);

CREATE TABLE pools(
	id serial PRIMARY KEY 
	,pool_name varchar(200) NOT NULL 
	,user_created_fk int REFERENCES users(id) NOT NULL 
	,user_in_pool_fk int REFERENCES users(id) NOT NULL
);


CREATE TABLE poolsheets(
	id serial PRIMARY KEY
	,date_of_first_game timestamp NOT NULL
	,date_of_last_game timestamp NOT NULL
	,created_date timestamp DEFAULT now()
	,pool_id_fk int REFERENCES pools(id) NOT NULL 
);


CREATE TABLE picks(
	id serial PRIMARY KEY
	,user_id_fk int REFERENCES users(id) NOT NULL 
	,poolsheet_id_fk int REFERENCES poolsheets(id) NOT NULL 
);

CREATE TABLE games(
	id serial PRIMARY KEY
	,game_date timestamp NOT NULL
	,home_team varchar(100) NOT NULL 
	,away_team varchar(100) NOT NULL 
	,betting_on varchar(100) NOT NULL 
	,pick_id_fk int REFERENCES picks(id) NOT NULL 
);

DROP TABLE games;






DROP TABLE games, picks, poolsheets, pools, users;