drop table users, event_role, festival_event, stage, schedule, add_role;

select * from users;
select * from festival_event;
select * from stage;
select * from schedule;
select * from add_role;
create table users -- user pojo
(
	id serial primary key,
	val_email varchar unique,
	val_password varchar,
	collected_roles varchar, -- combination of all roles in all events
	manager_name varchar,
	artist_name varchar,
	promoter_name varchar
);

create table event_role (
	id serial primary key,
	user_id serial, -- user id
	event_id serial,
	user_role varchar
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
	manager_id serial,
	image_url varchar
);

select * from schedule;

create table stage
(
	stage_number serial primary key,
	event_number int,
	stage_name varchar(50),
	crew_id serial 
);

create table schedule
(
	schedule_id serial primary key,
	stage_number serial,
	start_time timestamp,
	end_time timestamp,
	artist serial
);

create table add_role (
	req_num 	bigint primary key,
	role_type	varchar,
	event_num	serial,
	accepted	boolean,
	valid		boolean
);

alter table stage add foreign key (event_number) references festival_event(event_number);
alter table schedule add foreign key (stage_number) references stage(stage_number);

alter table stage add foreign key (crew_id) references crew(id);
alter table festival_event add foreign key (manager_id) references manager(id);

alter table manager add foreign key (id) references users(id);
alter table customer add foreign key (id) references users(id);
alter table crew add foreign key (id) references users(id);
alter table promoter add foreign key (id) references users(id);
alter table artist add foreign key (id) references users(id);

alter table event_role add foreign key (id) references users(id);
alter table event_role add foreign key (event_id) references festival_event(event_number);

--select * from manager;

--create table manager
--(
--	id serial primary key,
--	manager_name varchar(50)	
--);
--
--create table customer (
--	id serial PRIMARY key
--);
--
--create table crew
--(
--	id serial primary key
--);
--
--create table promoter
--(
--	id serial primary key,
--	promo_name varchar(50)
--);
--
--create table artist 
--(
--	id serial primary key,
--	artist_name varchar(50)
--);

-- We could/should probably delete this...
--create table roles (
--	role_num integer unique,
--	role_description varchar(20)
--);
--
--insert into roles values (1, 'manager');
--insert into roles values (2, 'promoter');
--insert into roles values (3, 'artist');
--insert into roles values (4, 'crew');
--insert into roles values (5, 'customer');
