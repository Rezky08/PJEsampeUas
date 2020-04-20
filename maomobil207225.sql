-- phpMyAdmin SQL Dump
-- version 4.9.0.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Apr 20, 2020 at 03:31 AM
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
  `cash_tgl207225` datetime DEFAULT NULL,
  `cash_bayar207225` tinyint(3) DEFAULT NULL,
  `id_pegawai207225` varchar(255) DEFAULT NULL,
  `id_pembeli207225` varchar(255) DEFAULT NULL,
  `id_mobil207225` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `mobil207225`
--

CREATE TABLE `mobil207225` (
  `Id207225` int(11) NOT NULL,
  `merk207225` varchar(255) DEFAULT NULL,
  `type207225` varchar(255) DEFAULT NULL,
  `warna207225` varchar(255) DEFAULT NULL,
  `harga207225` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `pegawai207225`
--

CREATE TABLE `pegawai207225` (
  `Id207225` int(11) NOT NULL,
  `nik207225` varchar(20) NOT NULL,
  `nama_pegawai207225` varchar(255) DEFAULT NULL,
  `alamat_pegawai207225` text DEFAULT NULL,
  `telp_pegawai207225` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `pembeli207225`
--

CREATE TABLE `pembeli207225` (
  `Id207225` int(11) NOT NULL,
  `nik207225` varchar(20) NOT NULL,
  `nama_pembeli207225` varchar(255) DEFAULT NULL,
  `alamat_pembeli207225` text DEFAULT NULL,
  `telp_pembeli207225` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

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
  MODIFY `Id207225` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `mobil207225`
--
ALTER TABLE `mobil207225`
  MODIFY `Id207225` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `pegawai207225`
--
ALTER TABLE `pegawai207225`
  MODIFY `Id207225` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `pembeli207225`
--
ALTER TABLE `pembeli207225`
  MODIFY `Id207225` int(11) NOT NULL AUTO_INCREMENT;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
