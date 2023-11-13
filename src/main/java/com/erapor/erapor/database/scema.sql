DROP DATABASE IF EXISTS erapor;

CREATE DATABASE erapor;

USE erapor;

CREATE TABLE students(
    id VARCHAR(50) PRIMARY KEY NOT NULL ,
    `name` VARCHAR(100) NOT NULL ,
    dob DATE NOT NULL,
    nisn VARCHAR(20) NOT NULL,
    major VARCHAR(20) NOT NULL,
    gender VARCHAR(50) NOT NULL,
    city VARCHAR(100) NOT NULL,
    country VARCHAR(100) NOT NULL,
    UNIQUE (id)
);

CREATE TABLE `values`(
    id INT(10) PRIMARY KEY NOT NULL ,
    IPA INT(3),
    MTK INT(3),
    IPS INT(3),
    TOTAL INT(5),
    student_id VARCHAR(50) NOT NULL,
    FOREIGN KEY (student_id) REFERENCES students(id)
);

CREATE TABLE accounts(
    id int(10) NOT NULL AUTO_INCREMENT,
    email VARCHAR(100) NOT NULL,
    password VARCHAR(100) NOT NULL,
    username VARCHAR(100) NOT NULL,
    phone INT(50),
    token VARCHAR(100),
    token_expired BIGINT,
    student_id VARCHAR(50) NOT NULL,
    PRIMARY KEY (id),
    FOREIGN KEY (student_id) REFERENCES students(id),
    UNIQUE (token)
);

UPDATE `values` SET total = MTK + IPA + IPS;