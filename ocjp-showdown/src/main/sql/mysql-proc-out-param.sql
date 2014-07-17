DELIMITER $$

CREATE PROCEDURE `get_user_count`(OUT n INTEGER)
  BEGIN
    SELECT COUNT(*) 
    INTO n
    FROM User;
  END
