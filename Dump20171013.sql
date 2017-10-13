-- MySQL dump 10.13  Distrib 5.7.17, for macos10.12 (x86_64)
--
-- Host: localhost    Database: znjj
-- ------------------------------------------------------
-- Server version	5.7.19

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `body_sensor_info`
--

DROP TABLE IF EXISTS `body_sensor_info`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `body_sensor_info` (
  `bid` int(11) NOT NULL AUTO_INCREMENT,
  `deviceId` int(11) NOT NULL,
  `time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `isCheck` int(1) NOT NULL DEFAULT '0',
  PRIMARY KEY (`bid`)
) ENGINE=InnoDB AUTO_INCREMENT=60 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `body_sensor_info`
--

LOCK TABLES `body_sensor_info` WRITE;
/*!40000 ALTER TABLE `body_sensor_info` DISABLE KEYS */;
INSERT INTO `body_sensor_info` VALUES (9,6,'2017-05-13 16:17:09',1),(10,6,'2017-05-13 16:17:35',1),(11,6,'2017-05-13 16:19:27',1),(12,6,'2017-05-13 16:21:19',1),(13,6,'2017-05-13 16:23:11',1),(14,6,'2017-05-13 16:24:59',1),(15,6,'2017-05-13 16:26:46',1),(16,6,'2017-05-13 16:28:49',1),(17,6,'2017-05-13 16:30:41',1),(18,6,'2017-05-13 16:32:39',1),(19,6,'2017-05-13 16:34:26',1),(20,6,'2017-05-13 16:36:19',1),(21,6,'2017-05-13 16:38:07',1),(22,6,'2017-05-13 16:39:49',1),(23,6,'2017-05-13 16:41:42',1),(24,6,'2017-05-13 16:43:50',1),(25,6,'2017-05-13 16:45:48',1),(26,6,'2017-05-13 16:47:46',1),(27,6,'2017-05-13 16:49:49',1),(28,6,'2017-05-13 16:51:37',1),(29,6,'2017-05-13 16:53:29',1),(30,9,'2017-06-06 09:17:27',1),(31,9,'2017-06-06 09:18:16',1),(32,9,'2017-06-06 09:20:06',1),(33,9,'2017-06-06 09:22:00',1),(34,9,'2017-06-06 09:23:48',1),(35,9,'2017-06-06 09:25:43',1),(36,9,'2017-06-06 09:27:40',1),(37,9,'2017-06-06 09:29:26',1),(38,9,'2017-06-09 14:11:15',1),(39,9,'2017-06-09 14:12:55',1),(40,9,'2017-06-09 14:13:42',1),(41,9,'2017-06-09 14:16:26',1),(42,9,'2017-06-09 14:17:16',1),(43,9,'2017-06-09 14:18:01',1),(44,9,'2017-06-09 14:19:07',1),(45,9,'2017-06-09 14:20:56',1),(46,9,'2017-06-09 14:22:51',1),(47,9,'2017-06-09 14:24:42',1),(48,9,'2017-06-09 14:26:39',1),(49,9,'2017-06-09 14:28:33',1),(50,9,'2017-06-09 14:30:21',1),(51,9,'2017-06-09 14:32:59',1),(52,9,'2017-06-09 14:34:57',1),(53,9,'2017-06-09 14:36:55',1),(54,9,'2017-06-09 14:38:51',1),(55,9,'2017-06-09 14:40:57',1),(56,9,'2017-06-09 14:42:57',1),(57,9,'2017-06-09 14:44:49',1),(58,9,'2017-06-09 14:46:56',1),(59,9,'2017-06-09 14:48:47',0);
/*!40000 ALTER TABLE `body_sensor_info` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `device_list`
--

DROP TABLE IF EXISTS `device_list`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `device_list` (
  `device_id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` int(11) NOT NULL,
  `device_name` varchar(255) NOT NULL,
  `device_stat` varchar(255) NOT NULL DEFAULT '0',
  `device_type_id` int(11) NOT NULL,
  `device_online` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `device_gpio` int(11) NOT NULL,
  PRIMARY KEY (`device_id`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `device_list`
--

LOCK TABLES `device_list` WRITE;
/*!40000 ALTER TABLE `device_list` DISABLE KEYS */;
INSERT INTO `device_list` VALUES (4,1,'温度','1',3,'2017-06-09 16:13:34',22),(8,1,'测试开关','0',2,'2017-06-09 16:13:34',17),(9,1,'客厅传感器','0',6,'2017-06-09 16:13:34',27),(11,1,'厨房煤气传感器','1',4,'2017-06-09 16:13:34',23);
/*!40000 ALTER TABLE `device_list` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `device_type`
--

DROP TABLE IF EXISTS `device_type`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `device_type` (
  `device_type_id` int(11) NOT NULL AUTO_INCREMENT,
  `device_type_name` varchar(255) NOT NULL,
  PRIMARY KEY (`device_type_id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `device_type`
--

LOCK TABLES `device_type` WRITE;
/*!40000 ALTER TABLE `device_type` DISABLE KEYS */;
INSERT INTO `device_type` VALUES (1,'遥控器'),(2,'开关'),(3,'温湿度传感器'),(4,'可燃气体传感器'),(5,'红外传感器'),(6,'人体传感器');
/*!40000 ALTER TABLE `device_type` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `family_group`
--

DROP TABLE IF EXISTS `family_group`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `family_group` (
  `fid` int(11) NOT NULL AUTO_INCREMENT,
  `family_name` varchar(45) NOT NULL,
  `family_person_id1` int(11) NOT NULL,
  `family_person_id2` int(11) DEFAULT NULL,
  `family_person_id3` int(11) DEFAULT NULL,
  `family_person_id4` int(11) DEFAULT NULL,
  `family_person_id5` int(11) DEFAULT NULL,
  PRIMARY KEY (`fid`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `family_group`
--

LOCK TABLES `family_group` WRITE;
/*!40000 ALTER TABLE `family_group` DISABLE KEYS */;
INSERT INTO `family_group` VALUES (4,'家庭组1',1,2,3,4,5);
/*!40000 ALTER TABLE `family_group` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `gas_sensor_list`
--

DROP TABLE IF EXISTS `gas_sensor_list`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `gas_sensor_list` (
  `gid` int(11) NOT NULL AUTO_INCREMENT,
  `deviceId` int(11) NOT NULL,
  `time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `ischeck` int(1) NOT NULL DEFAULT '0',
  PRIMARY KEY (`gid`)
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `gas_sensor_list`
--

LOCK TABLES `gas_sensor_list` WRITE;
/*!40000 ALTER TABLE `gas_sensor_list` DISABLE KEYS */;
INSERT INTO `gas_sensor_list` VALUES (1,1,'2017-05-11 22:39:25',0),(2,5,'2017-05-11 23:37:17',1),(3,5,'2017-05-11 23:37:22',1),(4,5,'2017-05-11 23:37:28',1),(5,5,'2017-05-11 23:37:33',1),(6,5,'2017-05-11 23:37:38',1),(7,5,'2017-05-11 23:37:43',1),(8,5,'2017-05-11 23:37:48',1),(9,5,'2017-05-11 23:37:53',1),(10,5,'2017-05-11 23:37:59',1),(11,5,'2017-05-11 23:50:40',1),(12,5,'2017-05-11 23:52:23',1),(13,5,'2017-05-11 23:52:43',1),(14,11,'2017-06-09 14:18:34',0),(15,11,'2017-06-09 15:13:43',0),(16,11,'2017-06-09 16:01:04',0);
/*!40000 ALTER TABLE `gas_sensor_list` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `message_board`
--

DROP TABLE IF EXISTS `message_board`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `message_board` (
  `mid` int(11) NOT NULL AUTO_INCREMENT,
  `uid` int(11) NOT NULL,
  `content` text NOT NULL,
  `time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `isread` int(1) NOT NULL DEFAULT '0',
  PRIMARY KEY (`mid`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `message_board`
--

LOCK TABLES `message_board` WRITE;
/*!40000 ALTER TABLE `message_board` DISABLE KEYS */;
INSERT INTO `message_board` VALUES (9,1,'记得烧水','2017-06-07 18:16:30',0),(10,2,'已拖地','2017-06-08 14:49:39',0);
/*!40000 ALTER TABLE `message_board` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Temporary view structure for view `message_view`
--

DROP TABLE IF EXISTS `message_view`;
/*!50001 DROP VIEW IF EXISTS `message_view`*/;
SET @saved_cs_client     = @@character_set_client;
SET character_set_client = utf8;
/*!50001 CREATE VIEW `message_view` AS SELECT 
 1 AS `mid`,
 1 AS `uid`,
 1 AS `content`,
 1 AS `time`,
 1 AS `isread`,
 1 AS `user_icon`,
 1 AS `user_name`*/;
SET character_set_client = @saved_cs_client;

--
-- Table structure for table `plan`
--

DROP TABLE IF EXISTS `plan`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `plan` (
  `pid` int(11) NOT NULL AUTO_INCREMENT,
  `p_name` varchar(45) NOT NULL,
  `p_time` time NOT NULL,
  `p_device_id_or_profile` varchar(45) NOT NULL,
  `p_stat` int(1) NOT NULL,
  `p_isopen` int(1) NOT NULL,
  PRIMARY KEY (`pid`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `plan`
--

LOCK TABLES `plan` WRITE;
/*!40000 ALTER TABLE `plan` DISABLE KEYS */;
INSERT INTO `plan` VALUES (8,'测试1','22:05:00','1,8',1,0),(9,'测试1','22:07:00','1,8',0,0),(10,'测试3','20:02:00','1,8',1,0);
/*!40000 ALTER TABLE `plan` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `profile_action`
--

DROP TABLE IF EXISTS `profile_action`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `profile_action` (
  `aid` int(11) NOT NULL AUTO_INCREMENT,
  `a_deviceId` int(11) NOT NULL,
  `a_action` int(11) NOT NULL,
  `a_pid` int(11) NOT NULL,
  PRIMARY KEY (`aid`)
) ENGINE=InnoDB AUTO_INCREMENT=19 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `profile_action`
--

LOCK TABLES `profile_action` WRITE;
/*!40000 ALTER TABLE `profile_action` DISABLE KEYS */;
INSERT INTO `profile_action` VALUES (14,4,1,3),(15,8,1,3),(17,9,1,3),(18,11,1,3);
/*!40000 ALTER TABLE `profile_action` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Temporary view structure for view `profile_action_view`
--

DROP TABLE IF EXISTS `profile_action_view`;
/*!50001 DROP VIEW IF EXISTS `profile_action_view`*/;
SET @saved_cs_client     = @@character_set_client;
SET character_set_client = utf8;
/*!50001 CREATE VIEW `profile_action_view` AS SELECT 
 1 AS `aid`,
 1 AS `a_deviceId`,
 1 AS `a_action`,
 1 AS `a_pid`,
 1 AS `device_name`*/;
SET character_set_client = @saved_cs_client;

--
-- Table structure for table `profile_list`
--

DROP TABLE IF EXISTS `profile_list`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `profile_list` (
  `pid` int(11) NOT NULL AUTO_INCREMENT,
  `pname` varchar(45) NOT NULL,
  `puid` int(11) NOT NULL,
  PRIMARY KEY (`pid`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `profile_list`
--

LOCK TABLES `profile_list` WRITE;
/*!40000 ALTER TABLE `profile_list` DISABLE KEYS */;
INSERT INTO `profile_list` VALUES (3,'回家',1);
/*!40000 ALTER TABLE `profile_list` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `telecontrol_list`
--

DROP TABLE IF EXISTS `telecontrol_list`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `telecontrol_list` (
  `telecontrol_id` int(11) NOT NULL AUTO_INCREMENT,
  `telecontrol_key` text NOT NULL,
  `telecontrol_type` int(1) NOT NULL,
  `telecontrol_tname` varchar(255) NOT NULL,
  `telecontrol_device_id` int(11) NOT NULL,
  PRIMARY KEY (`telecontrol_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `telecontrol_list`
--

LOCK TABLES `telecontrol_list` WRITE;
/*!40000 ALTER TABLE `telecontrol_list` DISABLE KEYS */;
INSERT INTO `telecontrol_list` VALUES (1,'asdsadadasdasd',1,'寝室空调遥控器',2);
/*!40000 ALTER TABLE `telecontrol_list` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `telecontrol_type`
--

DROP TABLE IF EXISTS `telecontrol_type`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `telecontrol_type` (
  `telecontrol_type_id` int(11) NOT NULL AUTO_INCREMENT,
  `telecontrol_type_name` varchar(255) NOT NULL,
  PRIMARY KEY (`telecontrol_type_id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `telecontrol_type`
--

LOCK TABLES `telecontrol_type` WRITE;
/*!40000 ALTER TABLE `telecontrol_type` DISABLE KEYS */;
INSERT INTO `telecontrol_type` VALUES (1,'温度+'),(2,'温度-'),(3,'开关');
/*!40000 ALTER TABLE `telecontrol_type` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `temp_list`
--

DROP TABLE IF EXISTS `temp_list`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `temp_list` (
  `temp_id` int(11) NOT NULL AUTO_INCREMENT,
  `device_id` int(11) NOT NULL,
  `time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `temperature` float NOT NULL,
  `humidity` float NOT NULL,
  PRIMARY KEY (`temp_id`)
) ENGINE=InnoDB AUTO_INCREMENT=101 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `temp_list`
--

LOCK TABLES `temp_list` WRITE;
/*!40000 ALTER TABLE `temp_list` DISABLE KEYS */;
INSERT INTO `temp_list` VALUES (8,4,'2017-05-09 17:16:37',24,65),(9,4,'2017-05-09 17:30:47',24,64),(10,4,'2017-05-09 17:43:43',24,64),(11,4,'2017-05-09 18:03:44',24,65),(12,4,'2017-05-09 18:08:48',24,65),(13,4,'2017-05-09 18:13:52',24,65),(14,4,'2017-05-09 18:16:24',24,65),(15,4,'2017-05-09 18:18:56',24,63),(16,4,'2017-05-09 18:21:28',23,64),(17,4,'2017-05-09 18:26:32',24,64),(18,4,'2017-05-09 18:29:04',24,65),(19,4,'2017-05-09 18:31:36',24,64),(20,4,'2017-05-09 18:34:08',24,64),(21,4,'2017-05-09 18:39:12',24,64),(22,4,'2017-05-09 18:41:45',24,64),(23,4,'2017-05-09 18:44:18',24,64),(24,4,'2017-05-09 18:46:51',22,65),(25,4,'2017-05-09 18:49:24',24,64),(26,4,'2017-05-09 18:54:29',24,65),(27,4,'2017-05-09 18:57:01',24,65),(28,4,'2017-05-09 18:59:33',23,64),(29,4,'2017-05-09 19:04:37',23,64),(30,4,'2017-05-09 19:07:09',24,65),(31,4,'2017-05-09 19:12:13',24,65),(32,4,'2017-05-09 19:14:45',22,65),(33,4,'2017-05-09 19:19:49',22,65),(34,4,'2017-05-09 19:22:21',24,64),(35,4,'2017-05-09 19:24:53',24,64),(36,4,'2017-05-09 19:27:25',24,64),(37,4,'2017-05-09 19:32:29',24,64),(38,4,'2017-05-09 19:37:33',24,64),(39,4,'2017-05-09 19:42:37',24,64),(40,4,'2017-05-09 19:45:09',24,64),(41,4,'2017-05-09 19:50:12',24,64),(42,4,'2017-05-09 19:52:44',24,64),(43,4,'2017-05-09 19:55:16',24,64),(44,4,'2017-05-09 20:15:51',24,65),(45,4,'2017-05-09 20:20:55',24,64),(46,4,'2017-05-09 20:25:58',24,65),(47,4,'2017-05-09 20:31:02',23,65),(48,4,'2017-05-09 20:33:35',22,65),(49,4,'2017-05-09 20:36:06',23,65),(50,4,'2017-05-09 20:38:38',23,65),(51,4,'2017-05-09 20:45:48',23,65),(52,4,'2017-05-09 20:50:06',23,65),(53,4,'2017-05-09 20:56:40',23,65),(54,4,'2017-05-09 20:59:13',24,64),(55,4,'2017-05-09 21:01:45',24,64),(56,4,'2017-05-09 21:04:17',24,64),(57,4,'2017-05-09 21:06:49',24,64),(58,4,'2017-05-09 21:09:21',24,64),(59,4,'2017-05-09 21:11:53',24,64),(60,4,'2017-05-09 21:14:25',24,64),(61,4,'2017-05-09 21:19:28',24,65),(62,4,'2017-05-09 21:22:00',24,65),(63,4,'2017-05-09 21:24:32',24,65),(64,4,'2017-05-09 21:27:04',24,65),(65,4,'2017-05-09 21:34:39',22,65),(66,4,'2017-05-09 21:37:11',22,65),(67,4,'2017-05-09 21:39:43',24,65),(68,4,'2017-05-09 21:44:46',24,65),(69,4,'2017-05-09 21:47:18',22,65),(70,4,'2017-05-09 21:49:50',24,65),(71,4,'2017-05-09 21:52:22',24,65),(72,4,'2017-05-09 21:54:53',24,66),(73,4,'2017-05-09 21:58:50',22,66),(75,4,'2017-06-05 18:42:35',24,71),(76,4,'2017-06-05 18:45:10',23,72),(77,4,'2017-06-05 18:50:21',24,71),(78,4,'2017-06-05 18:52:56',24,73),(79,4,'2017-06-05 18:55:32',23,71),(80,4,'2017-06-05 18:58:10',24,72),(81,4,'2017-06-05 19:00:45',24,72),(82,4,'2017-06-05 19:03:20',24,73),(83,4,'2017-06-05 19:05:55',24,73),(84,4,'2017-06-05 19:08:29',26,76),(85,4,'2017-06-05 19:14:05',25,69),(86,4,'2017-06-05 19:16:40',25,70),(87,4,'2017-06-05 19:19:15',24,71),(88,4,'2017-06-06 10:13:04',27,60),(89,4,'2017-06-06 10:15:43',27,59),(90,4,'2017-06-06 10:18:23',27,59),(91,4,'2017-06-06 10:21:01',27,59),(92,4,'2017-06-09 14:20:40',27,69),(93,4,'2017-06-09 14:23:25',28,80),(94,4,'2017-06-09 14:26:12',27,79),(95,4,'2017-06-09 14:28:56',27,80),(96,4,'2017-06-09 14:31:43',27,79),(97,4,'2017-06-09 14:34:28',27,79),(98,4,'2017-06-09 14:37:17',26,81),(99,4,'2017-06-09 14:45:51',26,81),(100,4,'2017-06-09 14:57:05',26,81);
/*!40000 ALTER TABLE `temp_list` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user_list`
--

DROP TABLE IF EXISTS `user_list`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `user_list` (
  `user_id` int(11) NOT NULL AUTO_INCREMENT,
  `user_name` varchar(255) NOT NULL,
  `user_password` varchar(255) NOT NULL,
  `user_type` int(1) NOT NULL,
  `user_icon` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user_list`
--

LOCK TABLES `user_list` WRITE;
/*!40000 ALTER TABLE `user_list` DISABLE KEYS */;
INSERT INTO `user_list` VALUES (1,'admin','admin',1,'8e5581a46667ee373c0a3ecc9ecbe8bb.jpg'),(2,'luozhijie','QQwsad8246',2,'33c7df32c2cd25e1e24e70159c2cd713.jpg'),(3,'lzj','QQwsad8246',2,NULL),(4,'aaa','aaa',2,NULL),(5,'bbbbbb','bbbbbb',2,NULL),(6,'bbbbbb','bbbbbb',2,NULL),(7,'ces','aaa',2,NULL),(8,'luo1','luozhijie',2,NULL);
/*!40000 ALTER TABLE `user_list` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user_type`
--

DROP TABLE IF EXISTS `user_type`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `user_type` (
  `user_type_id` int(11) NOT NULL AUTO_INCREMENT,
  `user_type_name` varchar(255) NOT NULL,
  PRIMARY KEY (`user_type_id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user_type`
--

LOCK TABLES `user_type` WRITE;
/*!40000 ALTER TABLE `user_type` DISABLE KEYS */;
INSERT INTO `user_type` VALUES (1,'管理员'),(2,'用户');
/*!40000 ALTER TABLE `user_type` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Temporary view structure for view `view_device`
--

DROP TABLE IF EXISTS `view_device`;
/*!50001 DROP VIEW IF EXISTS `view_device`*/;
SET @saved_cs_client     = @@character_set_client;
SET character_set_client = utf8;
/*!50001 CREATE VIEW `view_device` AS SELECT 
 1 AS `device_id`,
 1 AS `user_id`,
 1 AS `device_name`,
 1 AS `device_stat`,
 1 AS `device_type_id`,
 1 AS `device_online`,
 1 AS `device_gpio`,
 1 AS `device_type_name`*/;
SET character_set_client = @saved_cs_client;

--
-- Temporary view structure for view `view_telecontrol`
--

DROP TABLE IF EXISTS `view_telecontrol`;
/*!50001 DROP VIEW IF EXISTS `view_telecontrol`*/;
SET @saved_cs_client     = @@character_set_client;
SET character_set_client = utf8;
/*!50001 CREATE VIEW `view_telecontrol` AS SELECT 
 1 AS `telecontrol_id`,
 1 AS `telecontrol_key`,
 1 AS `telecontrol_type`,
 1 AS `telecontrol_tname`,
 1 AS `telecontrol_device_id`,
 1 AS `telecontrol_type_name`*/;
SET character_set_client = @saved_cs_client;

--
-- Temporary view structure for view `view_user_list`
--

DROP TABLE IF EXISTS `view_user_list`;
/*!50001 DROP VIEW IF EXISTS `view_user_list`*/;
SET @saved_cs_client     = @@character_set_client;
SET character_set_client = utf8;
/*!50001 CREATE VIEW `view_user_list` AS SELECT 
 1 AS `user_id`,
 1 AS `user_name`,
 1 AS `user_password`,
 1 AS `user_type`,
 1 AS `user_icon`,
 1 AS `user_type_name`*/;
SET character_set_client = @saved_cs_client;

--
-- Final view structure for view `message_view`
--

/*!50001 DROP VIEW IF EXISTS `message_view`*/;
/*!50001 SET @saved_cs_client          = @@character_set_client */;
/*!50001 SET @saved_cs_results         = @@character_set_results */;
/*!50001 SET @saved_col_connection     = @@collation_connection */;
/*!50001 SET character_set_client      = utf8 */;
/*!50001 SET character_set_results     = utf8 */;
/*!50001 SET collation_connection      = utf8_general_ci */;
/*!50001 CREATE ALGORITHM=UNDEFINED */
/*!50013 DEFINER=`root`@`localhost` SQL SECURITY DEFINER */
/*!50001 VIEW `message_view` AS select `message_board`.`mid` AS `mid`,`message_board`.`uid` AS `uid`,`message_board`.`content` AS `content`,`message_board`.`time` AS `time`,`message_board`.`isread` AS `isread`,`user_list`.`user_icon` AS `user_icon`,`user_list`.`user_name` AS `user_name` from (`message_board` left join `user_list` on((`message_board`.`uid` = `user_list`.`user_id`))) order by `message_board`.`time` desc */;
/*!50001 SET character_set_client      = @saved_cs_client */;
/*!50001 SET character_set_results     = @saved_cs_results */;
/*!50001 SET collation_connection      = @saved_col_connection */;

--
-- Final view structure for view `profile_action_view`
--

/*!50001 DROP VIEW IF EXISTS `profile_action_view`*/;
/*!50001 SET @saved_cs_client          = @@character_set_client */;
/*!50001 SET @saved_cs_results         = @@character_set_results */;
/*!50001 SET @saved_col_connection     = @@collation_connection */;
/*!50001 SET character_set_client      = utf8 */;
/*!50001 SET character_set_results     = utf8 */;
/*!50001 SET collation_connection      = utf8_general_ci */;
/*!50001 CREATE ALGORITHM=UNDEFINED */
/*!50013 DEFINER=`root`@`localhost` SQL SECURITY DEFINER */
/*!50001 VIEW `profile_action_view` AS select `profile_action`.`aid` AS `aid`,`profile_action`.`a_deviceId` AS `a_deviceId`,`profile_action`.`a_action` AS `a_action`,`profile_action`.`a_pid` AS `a_pid`,`device_list`.`device_name` AS `device_name` from (`profile_action` left join `device_list` on((`profile_action`.`a_deviceId` = `device_list`.`device_id`))) */;
/*!50001 SET character_set_client      = @saved_cs_client */;
/*!50001 SET character_set_results     = @saved_cs_results */;
/*!50001 SET collation_connection      = @saved_col_connection */;

--
-- Final view structure for view `view_device`
--

/*!50001 DROP VIEW IF EXISTS `view_device`*/;
/*!50001 SET @saved_cs_client          = @@character_set_client */;
/*!50001 SET @saved_cs_results         = @@character_set_results */;
/*!50001 SET @saved_col_connection     = @@collation_connection */;
/*!50001 SET character_set_client      = utf8 */;
/*!50001 SET character_set_results     = utf8 */;
/*!50001 SET collation_connection      = utf8_general_ci */;
/*!50001 CREATE ALGORITHM=UNDEFINED */
/*!50013 DEFINER=`root`@`localhost` SQL SECURITY DEFINER */
/*!50001 VIEW `view_device` AS select `device_list`.`device_id` AS `device_id`,`device_list`.`user_id` AS `user_id`,`device_list`.`device_name` AS `device_name`,`device_list`.`device_stat` AS `device_stat`,`device_list`.`device_type_id` AS `device_type_id`,`device_list`.`device_online` AS `device_online`,`device_list`.`device_gpio` AS `device_gpio`,`device_type`.`device_type_name` AS `device_type_name` from (`device_list` join `device_type` on((`device_list`.`device_type_id` = `device_type`.`device_type_id`))) */;
/*!50001 SET character_set_client      = @saved_cs_client */;
/*!50001 SET character_set_results     = @saved_cs_results */;
/*!50001 SET collation_connection      = @saved_col_connection */;

--
-- Final view structure for view `view_telecontrol`
--

/*!50001 DROP VIEW IF EXISTS `view_telecontrol`*/;
/*!50001 SET @saved_cs_client          = @@character_set_client */;
/*!50001 SET @saved_cs_results         = @@character_set_results */;
/*!50001 SET @saved_col_connection     = @@collation_connection */;
/*!50001 SET character_set_client      = utf8 */;
/*!50001 SET character_set_results     = utf8 */;
/*!50001 SET collation_connection      = utf8_general_ci */;
/*!50001 CREATE ALGORITHM=UNDEFINED */
/*!50013 DEFINER=`root`@`localhost` SQL SECURITY DEFINER */
/*!50001 VIEW `view_telecontrol` AS select `telecontrol_list`.`telecontrol_id` AS `telecontrol_id`,`telecontrol_list`.`telecontrol_key` AS `telecontrol_key`,`telecontrol_list`.`telecontrol_type` AS `telecontrol_type`,`telecontrol_list`.`telecontrol_tname` AS `telecontrol_tname`,`telecontrol_list`.`telecontrol_device_id` AS `telecontrol_device_id`,`telecontrol_type`.`telecontrol_type_name` AS `telecontrol_type_name` from (`telecontrol_list` join `telecontrol_type` on((`telecontrol_type`.`telecontrol_type_id` = `telecontrol_list`.`telecontrol_type`))) */;
/*!50001 SET character_set_client      = @saved_cs_client */;
/*!50001 SET character_set_results     = @saved_cs_results */;
/*!50001 SET collation_connection      = @saved_col_connection */;

--
-- Final view structure for view `view_user_list`
--

/*!50001 DROP VIEW IF EXISTS `view_user_list`*/;
/*!50001 SET @saved_cs_client          = @@character_set_client */;
/*!50001 SET @saved_cs_results         = @@character_set_results */;
/*!50001 SET @saved_col_connection     = @@collation_connection */;
/*!50001 SET character_set_client      = utf8 */;
/*!50001 SET character_set_results     = utf8 */;
/*!50001 SET collation_connection      = utf8_general_ci */;
/*!50001 CREATE ALGORITHM=UNDEFINED */
/*!50013 DEFINER=`root`@`localhost` SQL SECURITY DEFINER */
/*!50001 VIEW `view_user_list` AS select `user_list`.`user_id` AS `user_id`,`user_list`.`user_name` AS `user_name`,`user_list`.`user_password` AS `user_password`,`user_list`.`user_type` AS `user_type`,`user_list`.`user_icon` AS `user_icon`,`user_type`.`user_type_name` AS `user_type_name` from (`user_list` join `user_type` on((`user_type`.`user_type_id` = `user_list`.`user_type`))) */;
/*!50001 SET character_set_client      = @saved_cs_client */;
/*!50001 SET character_set_results     = @saved_cs_results */;
/*!50001 SET collation_connection      = @saved_col_connection */;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-10-13 17:54:55
