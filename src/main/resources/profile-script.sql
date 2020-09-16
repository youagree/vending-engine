-- create database
/*CREATE DATABASE vending;*/

-- connect to database
/*\connect vending;*/
-- create schema
CREATE SCHEMA vdn;

CREATE USER postgres1 WITH password '1234';

ALTER USER postgres1 WITH SUPERUSER;

GRANT USAGE ON SCHEMA vdn TO postgres1;

ALTER SCHEMA vdn OWNER TO postgres1;