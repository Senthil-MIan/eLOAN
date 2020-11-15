-- MySQL dump 10.13  Distrib 8.0.17, for Win64 (x86_64)
--
-- Host: localhost    Database: eloan
-- ------------------------------------------------------
-- Server version	8.0.17

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `loan`
--

DROP TABLE IF EXISTS `loan`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `loan` (
  `app_num` int(11) NOT NULL AUTO_INCREMENT,
  `loan_name` varchar(45) DEFAULT NULL,
  `loan_amount` float DEFAULT NULL,
  `application_date` date DEFAULT NULL,
  `business` varchar(20) DEFAULT NULL,
  `billing_indicator` varchar(20) DEFAULT NULL,
  `tax_indicator` varchar(20) DEFAULT NULL,
  `address` varchar(100) DEFAULT NULL,
  `mobile` varchar(45) DEFAULT NULL,
  `email` varchar(45) DEFAULT NULL,
  `status` varchar(15) DEFAULT 'UnApproved',
  `amount_sanctioned` float DEFAULT NULL,
  `term` int(11) DEFAULT NULL,
  `payment_start_date` date DEFAULT NULL,
  `closure_date` date DEFAULT NULL,
  `monthly_payment` float DEFAULT NULL,
  `interest_rate` float DEFAULT NULL,
  `customer_name` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`app_num`),
  UNIQUE KEY `app_num_UNIQUE` (`app_num`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='loan data';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `loan`
--

LOCK TABLES `loan` WRITE;
/*!40000 ALTER TABLE `loan` DISABLE KEYS */;
INSERT INTO `loan` VALUES (1,'Home Loan',10000,'2020-10-10','1','1','1','Next street,KG palayam','9876543210','test@gmail.com','1',1000,10,'2020-11-01','2020-11-02',10,7.5,'A'),(2,'Car Loan',20000,'2020-11-01','1','1','1','ABC street,KG palayam','9876543210','test@gmail.com','Approved',10000,10,'2020-11-01','2020-11-10',100,10,'B'),(4,'Vehicle',1001,'2020-11-01','Individual','Salaried','TaxPayer','44','1234567890','  mian@gmail.com','UnApproved',NULL,NULL,NULL,NULL,NULL,NULL,'C'),(5,'Home Loan',2000,'2020-11-01','Individual','Salaried',NULL,'20','9874651230','tester2@gmail.com','UnApproved',NULL,NULL,NULL,NULL,NULL,NULL,'D'),(7,'Home Loan',100,'2020-11-02','Individual','Salaried',NULL,'20, Street, Bangalore','1234567890','mian@gmail.com','Approved',500,5,'2020-10-01','2020-11-10',50,NULL,'E'),(9,'G',100,'2020-11-04','Individual','Salaried',NULL,'123','8525863963','tester3@gmail.com','UnApproved',NULL,NULL,NULL,NULL,NULL,NULL,NULL),(10,'Mortgage',50000,'2020-11-04','Individual','Salaried',NULL,'123','1234567890','tester6@gmail.com','Approved',2000,5,'2020-11-01','2020-11-13',100,5,'Test5');
/*!40000 ALTER TABLE `loan` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `users`
--

DROP TABLE IF EXISTS `users`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `users` (
  `userid` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(45) NOT NULL,
  `password` varchar(45) NOT NULL,
  `role` char(5) NOT NULL,
  `fullname` varchar(45) NOT NULL,
  PRIMARY KEY (`userid`),
  UNIQUE KEY `userid_UNIQUE` (`userid`),
  UNIQUE KEY `username_UNIQUE` (`username`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `users`
--

LOCK TABLES `users` WRITE;
/*!40000 ALTER TABLE `users` DISABLE KEYS */;
INSERT INTO `users` VALUES (1,'admin','admin','admin','admin'),(2,'test','test123','user','Test User'),(3,'test1','test1','user','Test user'),(4,'test2','test2','user','Tester2');
/*!40000 ALTER TABLE `users` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-11-15 10:55:49
