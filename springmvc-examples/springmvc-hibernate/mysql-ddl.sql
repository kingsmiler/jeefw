DROP USER `oas`;
DROP SCHEMA `oas`;

CREATE DATABASE IF NOT EXISTS `oas`
    CHARACTER SET utf8
    COLLATE utf8_general_ci;

CREATE USER 'oas'@'%'
    IDENTIFIED BY 'oas';

USE oas;

CREATE TABLE `strategy` (
    `ID`   INT(6) UNSIGNED NOT NULL AUTO_INCREMENT,
    `TYPE` VARCHAR(20)     NOT NULL,
    `NAME` VARCHAR(20)     NOT NULL,
    PRIMARY KEY (`ID`)
)
    COLLATE = 'utf8_general_ci'
    ENGINE = InnoDB
    AUTO_INCREMENT = 8;
