# javamachinetest
Java Machine test of Nimap Infotech
This is a Spring Boot application implementing a RESTful API for managing Categories and Products with a one-to-many relationship. It uses:

Spring Boot
JPA with Hibernate 
RDBMS as the database

My SQL Querys:

create database JavaMachineTest; 
use javamachinetest;

CREATE TABLE category (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255) NOT NULL
);

CREATE TABLE product (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    price DECIMAL,
    category_id BIGINT,
    FOREIGN KEY (category_id) REFERENCES category(id)
);

