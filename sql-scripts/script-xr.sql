CREATE DATABASE  IF NOT EXISTS `spring_db` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `spring_db`;
-- MySQL dump 10.13  Distrib 8.0.19, for Win64 (x86_64)
--
-- Host: localhost    Database: spring_db
-- ------------------------------------------------------
-- Server version	8.0.19

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `car`
--

DROP TABLE IF EXISTS `car`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `car` (
  `id` int NOT NULL AUTO_INCREMENT,
  `brand` varchar(45) NOT NULL,
  `model` varchar(45) NOT NULL,
  `segment` varchar(45) NOT NULL,
  `production_year` int NOT NULL,
  `car_body` varchar(45) NOT NULL,
  `color` varchar(45) NOT NULL,
  `nr_of_doors` int NOT NULL,
  `nr_of_seats` int NOT NULL,
  `min_distance` int NOT NULL,
  `max_distance` int NOT NULL,
  `fast_charge` double NOT NULL,
  `features` longtext NOT NULL,
  `casco` double NOT NULL,
  `luggage` int NOT NULL,
  `status` varchar(45) NOT NULL,
  `img` varchar(45) NOT NULL,
  `price1` double NOT NULL,
  `price2` double NOT NULL,
  `price3` double NOT NULL,
  `price4` double NOT NULL,
  `price5` double NOT NULL,
  `weight` int NOT NULL,
  `traction` varchar(45) NOT NULL,
  `horsepower` double NOT NULL,
  `minimal_age` int NOT NULL,
  `driving_exp` int NOT NULL,
  `garant` double NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `car`
--

LOCK TABLES `car` WRITE;
/*!40000 ALTER TABLE `car` DISABLE KEYS */;
INSERT INTO `car` VALUES (1,'Tesla','Model X','J',2016,'SUV','Gray',5,5,383,490,1.5,'Autopilot, Air conditioning, Cruise Control, MP3/AUX/USB, ABS/TC/ESP, Steering Controls, 8 airbags',12,5,'Available','tesla-model-x.jpg',78,73,68,63,55,2458,'AWD',259,23,3,2100),(2,'Tesla','Model S','A',2012,'Sedan','Gray',5,5,401,628,1,'Autopilot, Air conditioning, Cruise Control, MP3/AUX/USB, Heating Seats, Steering Controls, 10 airbags',30,4,'Available','tesla-model-s.jpg',150,145,140,135,125,2107,'RWD',785,24,4,2500),(3,'BMW','i3','J',2017,'Micro','Brown',2,5,130,200,2,'Climat Control, ABS, EBD, AM/FM Radio, MP3 Player/USB, 6 airbags, 2WD, Heated seats',15,4,'Available','bmw-i3.jpg',80,77,73,68,60,1195,'AWD',170,23,3,900),(4,'Tesla','Model 3','F',2019,'Sedan','Black',5,5,402,518,1,'Autopilot, Control, ABS, EBD, AM/FM Radio, MP3 Player/USB, 12 airbags, 2WD, Heated seats',25,3,'Available','tesla-model-3.jpg',90,87,85,80,72,1611,'RWD',283,23,3,2200),(5,'Nissan','Leaf','F',2015,'Sedan','Gray',5,5,117,243,2.5,'Audio System, Climat Control, ABS, EBD, AM/FM Radio, MP3 Player/USB, 4 airbags, 2WD, Heated seats',15,3,'Not Available','nissan-leaf.jpg',75,73,70,64,55,1521,'FWD',147,20,2,700),(6,'Renault','Zoe','F',2020,'Micro','Blue',2,5,210,400,2.5,'Climat Control, ABS, EBD, AM/FM Radio, MP3 Player/USB, 6 airbags, 2WD, Heated seats',10,3,'Not Available','renault-zoe.jpg',68,63,58,53,45,1468,'FWD',136,20,2,300),(13,'Tesla','Panamera','A',2020,'Sedan','Black',5,7,5,12,4.5,'fff',0,0,'Available','bg2 (2).jpg',0,0,0,0,0,0,'AWD',250,0,0,0);
/*!40000 ALTER TABLE `car` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `contact`
--

DROP TABLE IF EXISTS `contact`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `contact` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(45) NOT NULL,
  `email` varchar(45) NOT NULL,
  `phone_nr` varchar(45) NOT NULL,
  `message` longtext NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `contact`
--

LOCK TABLES `contact` WRITE;
/*!40000 ALTER TABLE `contact` DISABLE KEYS */;
INSERT INTO `contact` VALUES (1,'Radu Castraveț','radu.ask@gmail.com','744279994','Test'),(2,'Radu Castraveț','radu.ask@gmail.com','744279994','Test'),(3,'Radu Castraveț','radu.ask@gmail.com','744279994','edede'),(6,'Radu Castraveț','radu.ask@gmail.com','744279994','fdsafd'),(9,'Radu Castraveț','radu.ask@gmail.com','0744279994','Test');
/*!40000 ALTER TABLE `contact` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `customer`
--

DROP TABLE IF EXISTS `customer`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `customer` (
  `id` int NOT NULL AUTO_INCREMENT,
  `first_name` varchar(45) NOT NULL,
  `last_name` varchar(45) NOT NULL,
  `email` varchar(45) NOT NULL,
  `phone_nr` varchar(45) NOT NULL,
  `address` varchar(45) DEFAULT NULL,
  `date_birth` date NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=87 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `customer`
--

LOCK TABLES `customer` WRITE;
/*!40000 ALTER TABLE `customer` DISABLE KEYS */;
INSERT INTO `customer` VALUES (85,'Radu','Castraveț','radu.ask@gmail.com','744279994','str Parcului Nr 9A, Bl E11','1999-12-31'),(86,'Vasile','Cotorobai','vasile@gmail.com','0744896332','Str. Test','1998-01-13');
/*!40000 ALTER TABLE `customer` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `orders`
--

DROP TABLE IF EXISTS `orders`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `orders` (
  `id` int NOT NULL AUTO_INCREMENT,
  `order_date` datetime NOT NULL,
  `start_date` datetime NOT NULL,
  `end_date` datetime NOT NULL,
  `hire_days` int NOT NULL,
  `total_cost` float NOT NULL,
  `status` varchar(45) NOT NULL,
  `payment_status` varchar(45) NOT NULL,
  `payment_method` varchar(45) NOT NULL,
  `casco` varchar(45) NOT NULL,
  `details` longtext,
  `car_id` int NOT NULL,
  `customer_id` int NOT NULL,
  `user_id` int NOT NULL,
  PRIMARY KEY (`id`,`car_id`,`customer_id`,`user_id`),
  KEY `fk_order_car1_idx` (`car_id`),
  KEY `fk_order_customer1_idx` (`customer_id`),
  KEY `fk_order_user1_idx` (`user_id`),
  CONSTRAINT `fk_order_car1` FOREIGN KEY (`car_id`) REFERENCES `car` (`id`),
  CONSTRAINT `fk_order_customer1` FOREIGN KEY (`customer_id`) REFERENCES `customer` (`id`),
  CONSTRAINT `fk_order_user1` FOREIGN KEY (`user_id`) REFERENCES `user` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=47 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `orders`
--

LOCK TABLES `orders` WRITE;
/*!40000 ALTER TABLE `orders` DISABLE KEYS */;
INSERT INTO `orders` VALUES (43,'2020-06-30 22:41:00','2020-06-30 22:41:00','2020-07-15 22:41:00',15,1020,'In Process','Pending','Cash','0','Test',3,85,3),(44,'2020-06-30 23:59:00','2020-06-30 23:59:00','2020-07-16 23:59:00',16,1008,'In Process','Pending','Card','1','Test',6,85,3),(45,'2020-07-01 00:53:00','2020-07-02 00:53:00','2020-07-04 00:53:00',2,180,'In Process','Pending','Cash','1','Test',5,86,3),(46,'2020-07-01 06:45:00','2020-07-01 06:45:00','2020-07-18 06:45:00',17,1343,'In Process','Pending','Cash','1','fdsafd',5,85,3);
/*!40000 ALTER TABLE `orders` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `role`
--

DROP TABLE IF EXISTS `role`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `role` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `role`
--

LOCK TABLES `role` WRITE;
/*!40000 ALTER TABLE `role` DISABLE KEYS */;
INSERT INTO `role` VALUES (1,'ROLE_EMPLOYEE'),(2,'ROLE_MANAGER'),(3,'ROLE_ADMIN');
/*!40000 ALTER TABLE `role` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `user` (
  `id` int NOT NULL AUTO_INCREMENT,
  `username` varchar(50) NOT NULL,
  `password` char(80) NOT NULL,
  `first_name` varchar(50) NOT NULL,
  `last_name` varchar(50) NOT NULL,
  `email` varchar(50) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user`
--

LOCK TABLES `user` WRITE;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` VALUES (1,'john','$2a$04$eFytJDGtjbThXa80FyOOBuFdK2IwjyWefYkMpiBEFlpBwDH.5PM0K','John','Doe','john@gmail.com'),(2,'mary','$2a$04$eFytJDGtjbThXa80FyOOBuFdK2IwjyWefYkMpiBEFlpBwDH.5PM0K','Mary','Poppins','mary@gmail.com'),(3,'susan','$2a$04$eFytJDGtjbThXa80FyOOBuFdK2IwjyWefYkMpiBEFlpBwDH.5PM0K','Susan','Adams','susan@gmail.com'),(7,'radu','$2a$10$5MGtL2M7n6W1SKgALXvJ4eWNKCQFKH9b7LZR/OUBKwYBIgx8DurUa','Radu','Castravet','radu.ask@gmail.com'),(8,'vasy','$2a$10$fBwSAouD2xUD0WIAs7908OM3B1u8RmICzFFlLDF6VNXMAaVcG1HSW','Vasile','Cotorobai','vasy@gmail.com');
/*!40000 ALTER TABLE `user` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `users_roles`
--

DROP TABLE IF EXISTS `users_roles`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `users_roles` (
  `user_id` int NOT NULL,
  `role_id` int NOT NULL,
  PRIMARY KEY (`user_id`,`role_id`),
  KEY `FK_ROLE_idx` (`role_id`),
  CONSTRAINT `FK_ROLE` FOREIGN KEY (`role_id`) REFERENCES `role` (`id`),
  CONSTRAINT `FK_USER_05` FOREIGN KEY (`user_id`) REFERENCES `user` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `users_roles`
--

LOCK TABLES `users_roles` WRITE;
/*!40000 ALTER TABLE `users_roles` DISABLE KEYS */;
INSERT INTO `users_roles` VALUES (1,1),(2,1),(3,1),(7,1),(8,1),(2,2),(3,2),(7,2),(3,3),(7,3);
/*!40000 ALTER TABLE `users_roles` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-07-03 10:19:00
