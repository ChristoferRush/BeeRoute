create table domino.loc_country
(
	id_country smallint not null
		constraint loc_country_pkey
			primary key,
	code varchar(255) not null,
	iso varchar(255) not null,
	name varchar(255) not null
)
;

create table domino.loc_state
(
	id_state bigint not null
		constraint loc_state_pkey
			primary key,
	name varchar(255),
	country_id_country smallint
		constraint fk7wkng4wcl5ow6bs5ia5irl5hf
			references loc_country
)
;

create table domino.loc_city
(
	id_city bigint not null
		constraint loc_city_pkey
			primary key,
	name varchar(255),
	country_id_country smallint
		constraint fkjk5t0jvpr62sak4f79o2xovvf
			references loc_country,
	state_id_state bigint
		constraint fkqu6ajqkew28paxvigfgi5ropu
			references loc_state
)
;

create table domino.loc_address
(
	id_loc_address bigint not null
		constraint loc_address_pkey
			primary key,
	flat_number varchar(255),
	home_number varchar(255),
	postal_code varchar(255),
	street_address varchar(255),
	city_id_city bigint
		constraint fk6ogdd9sia68q0vsa7v2pr1ftd
			references loc_city,
	location_id_location bigint
)
;

create table domino.loc_location
(
	id_location bigint not null
		constraint loc_location_pkey
			primary key,
	address_id_loc_address bigint
		constraint fkny2w9a4sds55mtbkyit8vm53q
			references loc_address
)
;

alter table domino.loc_address
	add constraint fkbaxpo7yxc4wd2kfcspsh1pdj4
		foreign key (location_id_location) references loc_location
;

create table domino.usr_account
(
	id_account bigint not null
		constraint usr_account_pkey
			primary key,
	name varchar(255),
	passwd varchar(255),
	user_id_user bigint
)
;

create table domino.usr_permission
(
	id_permission bigint not null
		constraint usr_permission_pkey
			primary key,
	name varchar(255)
)
;

create table domino.usr_role
(
	id_role bigint not null
		constraint usr_role_pkey
			primary key,
	name varchar(255) not null,
	permission_id_permission bigint
		constraint fkgnv4ft4rsaudpixb0dwvwapf0
			references usr_permission
)
;

create table domino.usr_user
(
	id_user bigint not null
		constraint usr_user_pkey
			primary key,
	email varchar(255) not null,
	first_name varchar(255) not null,
	last_name varchar(255) not null,
	account_id_account bigint
		constraint fk4y5x0kl6rujftsabcjkykr529
			references usr_account,
	role_id_role bigint
		constraint fkqy8dmymbjetu3f0id9ttsbge4
			references usr_role
)
;

alter table domino.usr_account
	add constraint fks5y8ji3howd8ahoxy0nj8h46k
		foreign key (user_id_user) references usr_user
;

create table domino.usr_address
(
	id_usr_address bigint not null
		constraint usr_address_pkey
			primary key,
	main boolean not null,
	address_id_loc_address bigint
		constraint fkaj6g9nvvc4p4qdjfji8kkrg64
			references loc_address,
	user_id_user bigint
		constraint fkhintlxn3cpb1qukvtfbnprpfb
			references usr_user
)
;

