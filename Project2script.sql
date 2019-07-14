
create table manager
(
	id serial primary key,
	manager_name varchar(50)	
);

create table customer (
	id serial PRIMARY key
);

create table crew
(
	id serial primary key
);

create table promoter
(
	id serial primary key,
	promo_name varchar(50)
);

create table artist 
(
	id serial primary key,
	artist_name varchar(50)
);

create table validation -- user pojo
(
	id serial primary key,
	val_email varchar(50),
	val_password varchar(50)
);

create table event_role (
	id serial, -- user id
	event_id serial,
	user_role integer,
	primary key (id, event_id)
);

create table roles (
	role_num integer unique,
	role_description varchar(20)
);

insert into roles values (1, 'manager');
insert into roles values (2, 'promoter');
insert into roles values (3, 'artist');
insert into roles values (4, 'crew');
insert into roles values (5, 'customer');

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

alter table manager add foreign key (manager_email) references validation(val_email);
alter table customer add foreign key (email) references validation(val_email);
alter table crew add foreign key (crew_email) references validation(val_email);
alter table promoter add foreign key (promo_email) references validation(val_email);
alter table artist add foreign key (artist_email) references validation(val_email);
alter table stage add foreign key (event_number) references festival_event(event_number);
alter table stage add foreign key (crew_email) references crew(crew_email);
alter table festival_event add foreign key (manager_email) references manager(manager_email);
alter table schedule add foreign key (stage_number) references stage(stage_number);

alter table manager add foreign key (id) references validation(id);
alter table customer add foreign key (id) references validation(id);
alter table crew add foreign key (id) references validation(id);
alter table promoter add foreign key (id) references validation(id);
alter table artist add foreign key (id) references validation(id);

alter table event_role add foreign key (id) references validation(id);
alter table event_role add foreign key (event_id) references festival_event(event_number);
alter table event_role add foreign key (user_role) references roles(role_num);