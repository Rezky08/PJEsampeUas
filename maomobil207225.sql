-- phpMyAdmin SQL Dump
-- version 4.9.0.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Apr 22, 2020 at 09:14 AM
-- Server version: 10.4.6-MariaDB
-- PHP Version: 7.3.9

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `maomobil207225`
--

-- --------------------------------------------------------

--
-- Table structure for table `beli_cash207225`
--

CREATE TABLE `beli_cash207225` (
  `Id207225` int(11) NOT NULL,
  `cashTgl207225` datetime DEFAULT NULL,
  `cashBayar207225` varchar(20) DEFAULT NULL,
  `idPegawai207225` varchar(255) DEFAULT NULL,
  `idPembeli207225` varchar(255) DEFAULT NULL,
  `idMobil207225` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `beli_cash207225`
--

INSERT INTO `beli_cash207225` (`Id207225`, `cashTgl207225`, `cashBayar207225`, `idPegawai207225`, `idPembeli207225`, `idMobil207225`) VALUES
(1, '2020-04-22 03:00:00', '123', '1', '1', '1');

-- --------------------------------------------------------

--
-- Table structure for table `mobil207225`
--

CREATE TABLE `mobil207225` (
  `Id207225` int(11) NOT NULL,
  `namaMobil207225` varchar(255) DEFAULT NULL,
  `merk207225` varchar(255) DEFAULT NULL,
  `type207225` varchar(255) DEFAULT NULL,
  `warna207225` varchar(255) DEFAULT NULL,
  `harga207225` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `mobil207225`
--

INSERT INTO `mobil207225` (`Id207225`, `namaMobil207225`, `merk207225`, `type207225`, `warna207225`, `harga207225`) VALUES
(1, 'Terios', 'Daihatsu', 'SUV', 'Merah', 206800000);

-- --------------------------------------------------------

--
-- Table structure for table `pegawai207225`
--

CREATE TABLE `pegawai207225` (
  `Id207225` int(11) NOT NULL,
  `nik207225` varchar(20) NOT NULL,
  `namaPegawai207225` varchar(255) DEFAULT NULL,
  `alamatPegawai207225` text DEFAULT NULL,
  `telpPegawai207225` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `pegawai207225`
--

INSERT INTO `pegawai207225` (`Id207225`, `nik207225`, `namaPegawai207225`, `alamatPegawai207225`, `telpPegawai207225`) VALUES
(1, '3174102211990008', 'Rezky Setiawan', 'Jl.M.Saidi Raya RT 07/06 Petukangan Selatan Jakarta Selatan', '089629238997');

-- --------------------------------------------------------

--
-- Table structure for table `pembeli207225`
--

CREATE TABLE `pembeli207225` (
  `Id207225` int(11) NOT NULL,
  `nik207225` varchar(20) NOT NULL,
  `namaPembeli207225` varchar(255) DEFAULT NULL,
  `alamatPembeli207225` text DEFAULT NULL,
  `telpPembeli207225` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `pembeli207225`
--

INSERT INTO `pembeli207225` (`Id207225`, `nik207225`, `namaPembeli207225`, `alamatPembeli207225`, `telpPembeli207225`) VALUES
(1, '019248970124', 'Ravi Melan', 'Komplek Sarana Indah Permai. JL. pandan wangi II', '081299188617');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `beli_cash207225`
--
ALTER TABLE `beli_cash207225`
  ADD PRIMARY KEY (`Id207225`);

--
-- Indexes for table `mobil207225`
--
ALTER TABLE `mobil207225`
  ADD PRIMARY KEY (`Id207225`);

--
-- Indexes for table `pegawai207225`
--
ALTER TABLE `pegawai207225`
  ADD PRIMARY KEY (`Id207225`);

--
-- Indexes for table `pembeli207225`
--
ALTER TABLE `pembeli207225`
  ADD PRIMARY KEY (`Id207225`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `beli_cash207225`
--
ALTER TABLE `beli_cash207225`
  MODIFY `Id207225` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `mobil207225`
--
ALTER TABLE `mobil207225`
  MODIFY `Id207225` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT for table `pegawai207225`
--
ALTER TABLE `pegawai207225`
  MODIFY `Id207225` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `pembeli207225`
--
ALTER TABLE `pembeli207225`
  MODIFY `Id207225` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
