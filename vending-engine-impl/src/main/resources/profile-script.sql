-- create database
/*CREATE DATABASE vending;*/

-- connect to database
/*\connect vending;*/
-- create schema
CREATE SCHEMA vdn;

CREATE USER vdn_user WITH password 'vdn';

ALTER USER vdn_user WITH SUPERUSER;

GRANT USAGE ON SCHEMA vdn TO vdn_user;

ALTER SCHEMA vdn OWNER TO vdn_user;
