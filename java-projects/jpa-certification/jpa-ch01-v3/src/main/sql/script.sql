DROP TABLE IF EXISTS VEHICLE;

CREATE TABLE VEHICLE (
  VIN VARCHAR(20) NOT NULL PRIMARY KEY,
  MAKE VARCHAR(50) NOT NULL,
  MODEL VARCHAR (50) NOT NULL,
  MODEL_YEAR INTEGER,
  VERSION INTEGER
);