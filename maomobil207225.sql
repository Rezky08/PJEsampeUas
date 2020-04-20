# SQL-Front 5.1  (Build 4.16)

/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE */;
/*!40101 SET SQL_MODE='NO_ZERO_IN_DATE,NO_ZERO_DATE,NO_ENGINE_SUBSTITUTION' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES */;
/*!40103 SET SQL_NOTES='ON' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS */;
/*!40014 SET FOREIGN_KEY_CHECKS=0 */;


# Host: localhost    Database: maomobil207225
# ------------------------------------------------------
# Server version 5.5.5-10.4.11-MariaDB

USE `maomobil207225`;

#
# Source for table beli_cash207225
#

DROP TABLE IF EXISTS `beli_cash207225`;
CREATE TABLE `beli_cash207225` (
  `Id` int(11) NOT NULL AUTO_INCREMENT,
  `kode_cash` varchar(255) DEFAULT NULL,
  `kode_mobil` varchar(255) DEFAULT NULL,
  `cash_tgl` datetime DEFAULT NULL,
  `cash_bayar` tinyint(3) DEFAULT NULL,
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

#
# Dumping data for table beli_cash207225
#

LOCK TABLES `beli_cash207225` WRITE;
/*!40000 ALTER TABLE `beli_cash207225` DISABLE KEYS */;
/*!40000 ALTER TABLE `beli_cash207225` ENABLE KEYS */;
UNLOCK TABLES;

#
# Source for table mobil207225
#

DROP TABLE IF EXISTS `mobil207225`;
CREATE TABLE `mobil207225` (
  `Id` int(11) NOT NULL AUTO_INCREMENT,
  `kode_mobil` varchar(255) DEFAULT NULL,
  `merk` varchar(255) DEFAULT NULL,
  `type` varchar(255) DEFAULT NULL,
  `warna` varchar(255) DEFAULT NULL,
  `harga` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

#
# Dumping data for table mobil207225
#

LOCK TABLES `mobil207225` WRITE;
/*!40000 ALTER TABLE `mobil207225` DISABLE KEYS */;
/*!40000 ALTER TABLE `mobil207225` ENABLE KEYS */;
UNLOCK TABLES;

#
# Source for table pegawai207225
#

DROP TABLE IF EXISTS `pegawai207225`;
CREATE TABLE `pegawai207225` (
  `Id` int(11) NOT NULL AUTO_INCREMENT,
  `kode_pegawai` varchar(255) DEFAULT NULL,
  `nama_pegawai` varchar(255) DEFAULT NULL,
  `alamat_pegawai` text DEFAULT NULL,
  `telp_pegawai` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

#
# Dumping data for table pegawai207225
#

LOCK TABLES `pegawai207225` WRITE;
/*!40000 ALTER TABLE `pegawai207225` DISABLE KEYS */;
/*!40000 ALTER TABLE `pegawai207225` ENABLE KEYS */;
UNLOCK TABLES;

#
# Source for table pembeli207225
#

DROP TABLE IF EXISTS `pembeli207225`;
CREATE TABLE `pembeli207225` (
  `Id` int(11) NOT NULL AUTO_INCREMENT,
  `kode_pembeli` varchar(255) DEFAULT NULL,
  `nama_pembeli` varchar(255) DEFAULT NULL,
  `alamat_pembeli` text DEFAULT NULL,
  `telp_pembeli` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

#
# Dumping data for table pembeli207225
#

LOCK TABLES `pembeli207225` WRITE;
/*!40000 ALTER TABLE `pembeli207225` DISABLE KEYS */;
/*!40000 ALTER TABLE `pembeli207225` ENABLE KEYS */;
UNLOCK TABLES;

/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
