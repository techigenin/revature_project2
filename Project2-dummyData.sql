select setval('add_role_event_num_seq', 1, false);
select setval('event_role_event_id_seq', 1, false);
select setval('event_role_id_seq', 1, false);
select setval('festival_event_event_number_seq', 1, false);
select setval('festival_event_manager_id_seq', 1, false);
select setval('stage_crew_id_seq', 1, false);
select setval('users_id_seq', 1, false);

truncate table add_role, event_role, festival_event, roles, schedule, stage, users;

insert into users 
	(val_email, val_password, collected_roles, manager_name, artist_name, promoter_name) 
		values
			('this@thatmail.com', 'myPassword', 'manager', 'Andria Anderson', null, null);
insert into users 
	(val_email, val_password, collected_roles, manager_name, artist_name, promoter_name) 
		values
			('that@thismail.com', 'password', 'manager, artist, crew', 'Betty Bradock', 'Betty Bonzai', null);
insert into users 
	(val_email, val_password, collected_roles, manager_name, artist_name, promoter_name) 
		values
			('blue@redmail.com', '1234', 'manager, promoter, artist', 'Carl Carlston', 'Blue Yeti', 'Captain Yetipants');
insert into users 
	(val_email, val_password, collected_roles, manager_name, artist_name, promoter_name) 
		values
			('carey@x96.com	', 'pass2468', 'promoter', null, null, 'Carey Jackson');
insert into users 
	(val_email, val_password, collected_roles, manager_name, artist_name, promoter_name) 
		values
			('customer@email.com', '1029', 'customer', null, null, null);
		
insert into festival_event
	(audience_capacity, event_name, event_location, event_start_date, event_end_date, event_desc, manager_id)
		values
			(2500, 'Exciting Event', 'City Park', '2019-09-01', '2019-09-09', 'Fun for everyone', 6);
insert into festival_event
	(audience_capacity, event_name, event_location, event_start_date, event_end_date, event_desc, manager_id)
		values
			(500, 'Another Event', 'University Square', '2019-10-01', '2019-10-05', 'Favorite Day', 7);
insert into festival_event
	(audience_capacity, event_name, event_location, event_start_date, event_end_date, event_desc, manager_id)
		values
			(80, 'Latte & Lovin', 'Coffee Shop', '2019-02-14', '2019-02-14', 'Mellowness Embodied', 6);
insert into festival_event
	(audience_capacity, event_name, event_location, event_start_date, event_end_date, event_desc, manager_id)
		values
			(1000, 'Get Freaky!', 'Remote Rathole', '2019-10-31', '2019-11-01', 'NSFW', 3);

insert into stage 
	(event_number, stage_name, crew_id)
		values
			(1, 'Blue Stage', 6);
insert into stage 
	(event_number, stage_name, crew_id)
		values
			(1, 'Red Stage', 6);
insert into stage 
	(event_number, stage_name, crew_id)
		values
			(4, 'Inside Stage', 6);
insert into stage 
	(event_number, stage_name, crew_id)
		values
			(4, 'Outside Stage', 6);
		
insert into schedule
	(stage_number, start_time, end_time, artist_name)
		values
			(1, '2019-09-01T18:00:00', '2019-09-01T19:00:00', 'Betty Bonzai');
insert into schedule
	(stage_number, start_time, end_time, artist_name)
		values
			(1, '2019-09-01T19:00:00', '2019-09-01T19:45:00', 'Carl Carlston');
insert into schedule
	(stage_number, start_time, end_time, artist_name)
		values
			(1, '2019-09-01T20:00:00', '2019-09-01T21:00:00', 'Betty Bonzai');
insert into schedule
	(stage_number, start_time, end_time, artist_name)
		values
			(1, '2019-09-01T21:15:00', '2019-09-01T22:00:00', 'Carl Carlston');

