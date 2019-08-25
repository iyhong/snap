DROP TABLE IF EXISTS  account ;

CREATE TABLE  account  (
   id  varchar(100),
   password  varchar(100) ,
   email varchar(100) ,
   account_type  varchar(2) ,
   auth_yn  varchar(2),
   auth_key  varchar(100),
  PRIMARY KEY ( id )
) ;

-- LOCK TABLES  account  WRITE;
/*!40000 ALTER TABLE  account  DISABLE KEYS */;

INSERT INTO  account  ( id ,  password ,  email ,  account_type ,  auth_yn ,  auth_key )
VALUES
	('abc','abc','abc@abc.com','1','N',NULL),
	('john419@naver.com','123qwe','john419@naver.com','1','N','tPG0mwaYwOfPGS2tTsQq7c0YOQu9RoQKPoWfGDMTt3nkx0LiWa'),
	('sample','sample','sample@sample.com','2','N',NULL),
	('sample2','sample2','sample2@sample.com','2','N',NULL),
	('string1','string','loverman85@hanmail.net','1','Y','u82fct7JDoz2CcyRGJJqeA1ZzaRupw99buMxzHb6PWRvAydWkk'),
	('string11','string','loverman85@hanmail.net','1','N','19xv411yrINb5aWnraF9U7hVwo1NaPKMq3Hz1ZOAUtyDUcfJEt'),
	('string1234','string','loverman85@hanmail.net','1','Y','k9LA3VNZA14yEg9cpP9nnzWCCLw8DM2ZTFDuWULBvLEPOjkJ7A'),
	('string9','string','loverman85@hanmail.net','1','Y','wZoO4M2yyAQeJAqRwVTWwkY5vskcGL4jcaUUEEaV9jnqBpdRTR'),
	('string9273','string','john0419.yem@samsung.com','1','N','CJaHs5Pawz90ZvlRP5AW85od3Hj5hjM0fY9KlRTNB1CuqTr101'),
	('test','test','test@test.com','2','N',NULL),
	('test122','string','loverman85@hanmail.net','1','N','k0V6zvug4lScFlGkXU71Ci0JAL95odbx8JqXU8aqYqhAdHM6oV'),
	('test4433','string','loverman85@hanmail.net','1','N','d7zre5cX4jTNXQskw6tnSzxFVoFhr62vVIwV4RIs1vSAk3Ed9I'),
	('test_id','abc123','iy@abc.com','1','N',NULL);

/*!40000 ALTER TABLE  account  ENABLE KEYS */;
-- UNLOCK TABLES;



/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
