
create table manager
(
	manager_email varchar(50) primary key,
	manager_name varchar(50)	
);

create table customer (
	email varchar(50) PRIMARY key
);


create table festival_event 
(
	event_number serial primary key,
	audience_capacity integer,
	event_name varchar(50),
	event_location varchar(50),
	event_start_date date,
	event_end_date date,
	event_desc varchar(500),
	manager_email varchar(50)
);

create table validation
(
	val_email varchar(50) primary key,
	val_password varchar(50)
);

create table stage
(
	stage_number int primary key,
	event_number int,
	stage_name varchar(50),
	crew_email varchar(50) 
);

create table schedule
(
	stage_number int,
	start_time timestamp,
	end_time timestamp,
	artist_name varchar(50),
	
	primary key (stage_number, start_time)
);

create table crew
(
	crew_email varchar(50) primary key
);

create table promoter
(
	promo_email varchar(50) primary key
);

create table artist 
(
	artist_email varchar(50) primary key,
	artist_name varchar(50)
);

alter table manager add foreign key (manager_email) references validation(val_email);
alter table customer add foreign key (email) references validation(val_email);
alter table crew add foreign key (crew_email) references validation(val_email);
alter table promoter add foreign key (promo_email) references validation(val_email);
alter table artist add foreign key (artist_email) references validation(val_email);
alter table stage add foreign key (event_number) references festival_event(event_number);
alter table schedule add foreign key (stage_number) references stage(stage_number);