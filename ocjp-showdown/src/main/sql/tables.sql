DROP TABLE IF EXISTS STUDENT;
CREATE TABLE STUDENT (
  SID INTEGER NOT NULL PRIMARY KEY,
  NAME VARCHAR(50)
);
INSERT INTO STUDENT (SID, NAME) VALUES (1, 'Amy');
INSERT INTO STUDENT (SID, NAME) VALUES (2, 'Bob');
INSERT INTO STUDENT (SID, NAME) VALUES (3, 'Cathy');

DROP TABLE IF EXISTS ENROLMENT;
CREATE TABLE ENROLMENT (
  SID INTEGER NOT NULL,
  SUBJECT VARCHAR(50)
);
INSERT INTO ENROLMENT (SID, SUBJECT) VALUES (1, 'Math');
INSERT INTO ENROLMENT (SID, SUBJECT) VALUES (1, 'Science');
INSERT INTO ENROLMENT (SID, SUBJECT) VALUES (2, 'Economics');

DROP TABLE IF EXISTS TEACHER;
CREATE TABLE TEACHER (
  TID INTEGER NOT NULL,
  NAME VARCHAR (50),
  SUBJECT VARCHAR (50)
);
INSERT INTO TEACHER (TID, NAME, SUBJECT) VALUES (11, 'Mr. Peter', 'Math');
INSERT INTO TEACHER (TID, NAME, SUBJECT) VALUES (12, 'Mr. Chan', 'Science');
INSERT INTO TEACHER (TID, NAME, SUBJECT) VALUES (13, 'Mr. Stilgitz', 'Economics');
