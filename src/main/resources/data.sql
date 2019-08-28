-- DROP TABLE IF EXISTS  account ;
--
-- CREATE TABLE  account  (
--    id  varchar(100),
--    password  varchar(100) ,
--    email varchar(100) ,
--    account_type  varchar(2) ,
--    auth_yn  varchar(2),
--    auth_key  varchar(100),
--   PRIMARY KEY ( id )
-- ) ;

-- LOCK TABLES  account  WRITE;
/*!40000 ALTER TABLE  account  DISABLE KEYS */;

INSERT INTO  account  ( id ,  password ,  email ,  account_type ,  auth_yn ,  auth_key )
VALUES
	('abc','abc','abc@abc.com','1','N',NULL),
	('john419@naver.com','123qwe','john419@naver.com','1','N','tPG0mwaYwOfPGS2tTsQq7c0YOQu9RoQKPoWfGDMTt3nkx0LiWa'),
	('sample','sample','sample@sample.com','2','N',NULL),
	('sample2','sample2','sample2@sample.com','2','N',NULL);


INSERT INTO `photographer` (`id`, `name`, `address2_id`, `homepage`)
VALUES
	('sample', '사진사', 20, 'www.sample.com'),
	('sample2', '강사진', 22, NULL);


/*!40000 ALTER TABLE  account  ENABLE KEYS */;
-- UNLOCK TABLES;



/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
