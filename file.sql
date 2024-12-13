create table users
(
    id BIGSERIAL PRIMARY KEY not null ,
    email VARCHAR(128) not null ,
    password VARCHAR(128) not null ,
    username VARCHAR(64) not null unique ,
    status VARCHAR(8)  DEFAULT 'ACTIVE'
);