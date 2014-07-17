DELIMITER $$

CREATE PROCEDURE `get_all_users`()
  BEGIN
    SELECT * FROM User;
  END