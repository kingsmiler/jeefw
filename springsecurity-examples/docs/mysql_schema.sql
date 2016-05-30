DROP USER `jeewf`;
DROP SCHEMA `jeewf`;

CREATE DATABASE IF NOT EXISTS `jeewf`
    CHARACTER SET utf8
    COLLATE utf8_general_ci;

CREATE USER 'jeewf'@'%'
    IDENTIFIED BY 'jeewf';

USE jeewf;
/*All User's are stored in APP_USER table*/
CREATE TABLE APP_USER (
    id         BIGINT       NOT NULL AUTO_INCREMENT,
    sso_id     VARCHAR(30)  NOT NULL,
    password   VARCHAR(100) NOT NULL,
    first_name VARCHAR(30)  NOT NULL,
    last_name  VARCHAR(30)  NOT NULL,
    email      VARCHAR(30)  NOT NULL,
    state      VARCHAR(30)  NOT NULL,
    PRIMARY KEY (id),
    UNIQUE (sso_id)
)
    ENGINE = InnoDB
    DEFAULT CHARSET = utf8;

/* USER_PROFILE table contains all possible roles */
CREATE TABLE USER_PROFILE (
    id   BIGINT      NOT NULL AUTO_INCREMENT,
    type VARCHAR(30) NOT NULL,
    PRIMARY KEY (id),
    UNIQUE (type)
)
    ENGINE = InnoDB
    DEFAULT CHARSET = utf8;

/* JOIN TABLE for MANY-TO-MANY relationship*/
CREATE TABLE APP_USER_USER_PROFILE (
    user_id         BIGINT NOT NULL,
    user_profile_id BIGINT NOT NULL,
    PRIMARY KEY (user_id, user_profile_id),
    CONSTRAINT FK_APP_USER FOREIGN KEY (user_id) REFERENCES APP_USER (id),
    CONSTRAINT FK_USER_PROFILE FOREIGN KEY (user_profile_id) REFERENCES USER_PROFILE (id)
)
    ENGINE = InnoDB
    DEFAULT CHARSET = utf8;

/* Populate USER_PROFILE Table */
INSERT INTO USER_PROFILE (type)
VALUES ('USER');

INSERT INTO USER_PROFILE (type)
VALUES ('ADMIN');

INSERT INTO USER_PROFILE (type)
VALUES ('DBA');

/* Populate APP_USER Table */
INSERT INTO APP_USER (sso_id, password, first_name, last_name, email, state)
VALUES ('bill', 'abc123', 'Bill', 'Watcher', 'bill@xyz.com', 'Active');

INSERT INTO APP_USER (sso_id, password, first_name, last_name, email, state)
VALUES ('danny', 'abc124', 'Danny', 'Theys', 'danny@xyz.com', 'Active');

INSERT INTO APP_USER (sso_id, password, first_name, last_name, email, state)
VALUES ('sam', 'abc125', 'Sam', 'Smith', 'samy@xyz.com', 'Active');

INSERT INTO APP_USER (sso_id, password, first_name, last_name, email, state)
VALUES ('nicole', 'abc126', 'Nicole', 'warner', 'nicloe@xyz.com', 'Active');

INSERT INTO APP_USER (sso_id, password, first_name, last_name, email, state)
VALUES ('kenny', 'abc127', 'Kenny', 'Roger', 'kenny@xyz.com', 'Active');

/* Populate JOIN Table */
INSERT INTO APP_USER_USER_PROFILE (user_id, user_profile_id)
    SELECT
        user.id,
        profile.id
    FROM APP_USER user, USER_PROFILE profile
    WHERE user.sso_id = 'bill' AND profile.type = 'USER';

INSERT INTO APP_USER_USER_PROFILE (user_id, user_profile_id)
    SELECT
        user.id,
        profile.id
    FROM APP_USER user, USER_PROFILE profile
    WHERE user.sso_id = 'danny' AND profile.type = 'USER';

INSERT INTO APP_USER_USER_PROFILE (user_id, user_profile_id)
    SELECT
        user.id,
        profile.id
    FROM APP_USER user, USER_PROFILE profile
    WHERE user.sso_id = 'sam' AND profile.type = 'ADMIN';

INSERT INTO APP_USER_USER_PROFILE (user_id, user_profile_id)
    SELECT
        user.id,
        profile.id
    FROM APP_USER user, USER_PROFILE profile
    WHERE user.sso_id = 'nicole' AND profile.type = 'DBA';

INSERT INTO APP_USER_USER_PROFILE (user_id, user_profile_id)
    SELECT
        user.id,
        profile.id
    FROM APP_USER user, USER_PROFILE profile
    WHERE user.sso_id = 'kenny' AND profile.type = 'ADMIN';

INSERT INTO APP_USER_USER_PROFILE (user_id, user_profile_id)
    SELECT
        user.id,
        profile.id
    FROM APP_USER user, USER_PROFILE profile
    WHERE user.sso_id = 'kenny' AND profile.type = 'DBA';