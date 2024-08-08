-- MySQL dump 10.13  Distrib 8.0.34, for Win64 (x86_64)
--
-- Host: localhost    Database: collegemanagementsystm
-- ------------------------------------------------------
-- Server version	8.0.34

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
-- Table structure for table `fee`
--

DROP TABLE IF EXISTS `fee`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `fee` (
  `course` varchar(20) DEFAULT NULL,
  `semester1` varchar(20) DEFAULT NULL,
  `semester2` varchar(20) DEFAULT NULL,
  `semester3` varchar(20) DEFAULT NULL,
  `semester4` varchar(20) DEFAULT NULL,
  `semester5` varchar(20) DEFAULT NULL,
  `semester6` varchar(20) DEFAULT NULL,
  `semester7` varchar(20) DEFAULT NULL,
  `semester8` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `fee`
--

LOCK TABLES `fee` WRITE;
/*!40000 ALTER TABLE `fee` DISABLE KEYS */;
INSERT INTO `fee` VALUES ('BTech','48000','43000','42000','41000','40000','40000','40000','38000'),('MA','40000','40000','40000','40000','40000','40000','',''),('Bsc','40000','38000','36000','35000','35000','32000','',''),('BCA','48000','43000','42000','41000','40000','40000','',''),('Msc','48000','41000','41000','41000','40000','40000','','');
/*!40000 ALTER TABLE `fee` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `feecollege`
--

DROP TABLE IF EXISTS `feecollege`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `feecollege` (
  `rollno` varchar(20) DEFAULT NULL,
  `course` varchar(20) DEFAULT NULL,
  `branch` varchar(20) DEFAULT NULL,
  `semester` varchar(20) DEFAULT NULL,
  `total` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `feecollege`
--

LOCK TABLES `feecollege` WRITE;
/*!40000 ALTER TABLE `feecollege` DISABLE KEYS */;
INSERT INTO `feecollege` VALUES ('15332585 ','BTech','Computer Science','semester1','48000'),('15332676 ','BCA','Computer Science','semester1','48000');
/*!40000 ALTER TABLE `feecollege` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `login`
--

DROP TABLE IF EXISTS `login`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `login` (
  `username` varchar(20) DEFAULT NULL,
  `password` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `login`
--

LOCK TABLES `login` WRITE;
/*!40000 ALTER TABLE `login` DISABLE KEYS */;
INSERT INTO `login` VALUES ('vandna','12345'),('yukti','12345');
/*!40000 ALTER TABLE `login` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `marks`
--

DROP TABLE IF EXISTS `marks`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `marks` (
  `rollno` varchar(20) DEFAULT NULL,
  `semester` varchar(20) DEFAULT NULL,
  `marks1` varchar(50) DEFAULT NULL,
  `marks2` varchar(50) DEFAULT NULL,
  `marks3` varchar(50) DEFAULT NULL,
  `marks4` varchar(50) DEFAULT NULL,
  `marks5` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `marks`
--

LOCK TABLES `marks` WRITE;
/*!40000 ALTER TABLE `marks` DISABLE KEYS */;
INSERT INTO `marks` VALUES ('15332585 ','1st','90','98','97','96','95'),('15331508 ','1st','99','99','99','98','98'),('15334096 ','1st','77','77','77','77','77'),('15331008 ','1st','78','79','80','81','82'),('15332676 ','1st','66','66','66','67','68'),('15332153 ','1st','666','66','66','66','hh'),('15332153 ','1st','666','66','66','66','55'),('15332153 ','1st','666','66','66','66','55');
/*!40000 ALTER TABLE `marks` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `student`
--

DROP TABLE IF EXISTS `student`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `student` (
  `name` varchar(40) DEFAULT NULL,
  `fname` varchar(40) DEFAULT NULL,
  `rollno` varchar(20) DEFAULT NULL,
  `dob` varchar(40) DEFAULT NULL,
  `address` varchar(100) DEFAULT NULL,
  `phone` varchar(20) DEFAULT NULL,
  `email` varchar(40) DEFAULT NULL,
  `calss_x` varchar(20) DEFAULT NULL,
  `class_xii` varchar(20) DEFAULT NULL,
  `aadhar` varchar(40) DEFAULT NULL,
  `course` varchar(40) DEFAULT NULL,
  `branch` varchar(40) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `student`
--

LOCK TABLES `student` WRITE;
/*!40000 ALTER TABLE `student` DISABLE KEYS */;
INSERT INTO `student` VALUES ('vandna ','pnpandey ','15332585 ','07-Mar-2024 ','suncity  ','7867565674    ','van@ ','55 ','77 ','6454535 ','MSC    ','computer science    '),('heena ','saini ','15334096 ','05-Mar-2032 ','dhankoat ','7867565674  ','h@  ','55 ','44 ','99999 ','MSC  ','computer science  '),('anjana ',' xyz ','15331008 ','06-Mar-1997 ','dhankoat ','7867565674  ','h@  ','66 ','88 ','1111111 ','MSC  ','computer science  '),('yukti ','c.k.singh ','15332676 ','06-Mar-2024 ','mp ','6453543 ','yukto@ ','77 ','88 ','32324 ','MSC ','computer science '),('heena ','saini ','15332153 ','04-Mar-2024 ','dhankot ','988899 ','henna@ ','88 ','67 ','44544554 ','MCA ','computer science ');
/*!40000 ALTER TABLE `student` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `studentleave`
--

DROP TABLE IF EXISTS `studentleave`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `studentleave` (
  `rollno` varchar(20) DEFAULT NULL,
  `date` varchar(50) DEFAULT NULL,
  `duration` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `studentleave`
--

LOCK TABLES `studentleave` WRITE;
/*!40000 ALTER TABLE `studentleave` DISABLE KEYS */;
INSERT INTO `studentleave` VALUES ('15331508 ','06-Mar-2024','full day'),('15332585 ','08-Mar-2024','full day'),('15332676 ','05-Mar-2024','half day');
/*!40000 ALTER TABLE `studentleave` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `subject`
--

DROP TABLE IF EXISTS `subject`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `subject` (
  `rollno` varchar(20) DEFAULT NULL,
  `semester` varchar(20) DEFAULT NULL,
  `sub1` varchar(50) DEFAULT NULL,
  `sub2` varchar(50) DEFAULT NULL,
  `sub3` varchar(50) DEFAULT NULL,
  `sub4` varchar(50) DEFAULT NULL,
  `sub5` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `subject`
--

LOCK TABLES `subject` WRITE;
/*!40000 ALTER TABLE `subject` DISABLE KEYS */;
INSERT INTO `subject` VALUES ('15332585 ','1st','hindi','english','maths','evs','sst'),('15331508 ','1st','hindi','english','maths','evs','sst'),('15334096 ','1st','hindi','english','maths','evs','sst'),('15331008 ','1st','hindi','engilsh','maths','evs','sst'),('15332676 ','1st','hindi','english','maths','evs','sst'),('15332153 ','1st','gg','gg','gg','gg66',''),('15332153 ','1st','gg','gg','gg','gg66',''),('15332153 ','1st','gg','gg','gg','gg66','rr');
/*!40000 ALTER TABLE `subject` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `teacher`
--

DROP TABLE IF EXISTS `teacher`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `teacher` (
  `name` varchar(40) DEFAULT NULL,
  `fname` varchar(40) DEFAULT NULL,
  `empid` varchar(20) DEFAULT NULL,
  `dob` varchar(40) DEFAULT NULL,
  `address` varchar(100) DEFAULT NULL,
  `phone` varchar(20) DEFAULT NULL,
  `email` varchar(40) DEFAULT NULL,
  `calss_x` varchar(20) DEFAULT NULL,
  `class_xii` varchar(20) DEFAULT NULL,
  `aadhar` varchar(40) DEFAULT NULL,
  `highest_edu` varchar(40) DEFAULT NULL,
  `department` varchar(40) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `teacher`
--

LOCK TABLES `teacher` WRITE;
/*!40000 ALTER TABLE `teacher` DISABLE KEYS */;
INSERT INTO `teacher` VALUES ('sarita ','papa ','1011682 ','07-Mar-2024 ','vatika  ','6454  ',' sarita@ ','66','88','888777866','MSC  ','computer science  '),('seema ','mexyz ','1015420 ','05-Mar-2024 ','ggn ','767565678  ','seema@  ','66 ','88 ','99898989 ','MSC  ','computer science  '),('moona ','ksingh ','1011654 ','06-Mar-2024 ','acx ','9877 ','moona@ ','77 ','89 ','454675464 ','MSC ','computer science '),('kiran ','mrabc ','1011935 ','21-Mar-2024 ','mp ','98103344 ','kiran@ ','67 ','78 ','778767678 ','MCA ','computer science '),('sangeeta ','mrxyz ','1015983 ','22-Mar-2023 ','gfgfdgh ','434545 ','gfdfgdgf@ ','88 ','66 ','777777777 ','MSC ','computer science ');
/*!40000 ALTER TABLE `teacher` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `teacherleave`
--

DROP TABLE IF EXISTS `teacherleave`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `teacherleave` (
  `empid` varchar(20) DEFAULT NULL,
  `date` varchar(50) DEFAULT NULL,
  `duration` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `teacherleave`
--

LOCK TABLES `teacherleave` WRITE;
/*!40000 ALTER TABLE `teacherleave` DISABLE KEYS */;
INSERT INTO `teacherleave` VALUES ('1015420 ','06-Mar-2024','half day'),('1015983 ','14-Mar-2024','half day'),('1015983 ','11-Apr-2024','full day');
/*!40000 ALTER TABLE `teacherleave` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-04-20 16:47:57
