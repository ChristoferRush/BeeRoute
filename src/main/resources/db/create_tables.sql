create database who;

create sequence hibernate_sequence;

create table usr_permission
(
  id   bigserial not null
    constraint usr_permission_pkey
    primary key,
  name varchar(255)
);

create table usr_role
(
  id_role       bigserial    not null
    constraint usr_role_pkey
    primary key,
  name          varchar(255) not null,
  permission_id bigint
    constraint fkhkhigi42rugpa5gqp4ni9pwxh
    references usr_permission
);

create table usr_user
(
  id_user      bigserial    not null
    constraint usr_user_pkey
    primary key,
  email        varchar(255) not null,
  first_name   varchar(255) not null,
  last_name    varchar(255) not null,
  password     varchar(255) not null,
  username     varchar(30),
  role_id_role bigint
    constraint fkqy8dmymbjetu3f0id9ttsbge4
    references usr_role
);

Commit;
