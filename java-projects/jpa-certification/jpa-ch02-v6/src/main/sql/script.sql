DROP TABLE IF EXISTS USER;
DROP TABLE IF EXISTS SEQUENCE_GENERATOR_TBL;

CREATE TABLE USER(
  ID INTEGER NOT NULL PRIMARY KEY,
  USER_NAME VARCHAR(50) NOT NULL UNIQUE,
  EMAIL_ADDR VARCHAR(50) NOT NULL UNIQUE,
  FIRST_NAME VARCHAR(50),
  LAST_NAME VARCHAR(50),
  DATE_OF_BIRTH DATE
);

CREATE TABLE SEQUENCE_GENERATOR_TBL (
  SEQUENCE_NAME VARCHAR(50) NOT NULL PRIMARY KEY,
  SEQUENCE_VALUE INTEGER NOT NULL
);

INSERT INTO SEQUENCE_GENERATOR_TBL (SEQUENCE_NAME, SEQUENCE_VALUE) VALUES ('user_id_seq', 0);