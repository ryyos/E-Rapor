DROP DATABASE IF EXISTS erapor;

CREATE DATABASE erapor;

USE erapor;

CREATE TABLE students(
    id VARCHAR(36) PRIMARY KEY NOT NULL ,
    `name` VARCHAR(255),
    dob DATE,
    nisn VARCHAR(12),
    major VARCHAR(12),
    gender VARCHAR(255),
    city VARCHAR(255),
    country VARCHAR(255)
);

CREATE TABLE `values`(
    id VARCHAR(36) PRIMARY KEY NOT NULL ,
    IPA INT(3),
    MTK INT(3),
    IPS INT(3),
    TOTAL INT(5),
    student_id VARCHAR(36) NOT NULL,
    FOREIGN KEY (student_id) REFERENCES students(id)
);

CREATE TABLE accounts(
    id int(6) NOT NULL AUTO_INCREMENT,
    email VARCHAR(100) NOT NULL,
    password VARCHAR(100) NOT NULL,
    username VARCHAR(100) NOT NULL ,
    token VARCHAR(100),
    token_expired BIGINT,
    student_id VARCHAR(36) NOT NULL,
    PRIMARY KEY (id),
    FOREIGN KEY (student_id) REFERENCES students(id),
    UNIQUE (token)
)

UPDATE `values` SET total = MTK + IPA + IPS;