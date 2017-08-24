-- phpMyAdmin SQL Dump
-- version 4.6.5.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Aug 23, 2017 at 12:29 PM
-- Server version: 10.1.21-MariaDB
-- PHP Version: 7.0.15

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `p3_u`
--

-- --------------------------------------------------------

--
-- Table structure for table `t_cuaca`
--

CREATE TABLE `t_cuaca` (
  `idKota` int(11) NOT NULL,
  `Tanggal` date NOT NULL,
  `Suhu` double NOT NULL,
  `Suhu_maks` double NOT NULL,
  `Suhu_min` double NOT NULL,
  `kelembapan` double NOT NULL,
  `kec_angin` double NOT NULL,
  `tek_udara` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `t_cuaca`
--

INSERT INTO `t_cuaca` (`idKota`, `Tanggal`, `Suhu`, `Suhu_maks`, `Suhu_min`, `kelembapan`, `kec_angin`, `tek_udara`) VALUES
(3, '2017-08-16', 24, 32, 24, 200, 220.2, 200),
(4, '2017-08-07', 39, 46, 35, 200.2, 132.2, 200.2);

-- --------------------------------------------------------

--
-- Table structure for table `t_kota`
--

CREATE TABLE `t_kota` (
  `idKota` int(11) NOT NULL,
  `Kota` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `t_kota`
--

INSERT INTO `t_kota` (`idKota`, `Kota`) VALUES
(1, 'Ambon'),
(2, 'Balikpapan'),
(3, 'Bandung'),
(4, 'Jakarta');

-- --------------------------------------------------------

--
-- Table structure for table `t_user`
--

CREATE TABLE `t_user` (
  `id_user` int(11) NOT NULL,
  `su_user` int(11) NOT NULL,
  `Nama` varchar(20) NOT NULL,
  `pass` varchar(10) NOT NULL,
  `NamaPanjang` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `t_user`
--

INSERT INTO `t_user` (`id_user`, `su_user`, `Nama`, `pass`, `NamaPanjang`) VALUES
(3, 0, 'Anton', '1234', 'Anton Berlian'),
(4, 0, 'Amir', '1234', 'Amir Antana'),
(5, 1, 'Kanna', '1234', 'Kanna Nishiro'),
(8, 2, 'Rangga', '123456', 'Rangga Arif'),
(9, 2, 'anton', '123456', 'Anton Berlian');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `t_cuaca`
--
ALTER TABLE `t_cuaca`
  ADD PRIMARY KEY (`idKota`);

--
-- Indexes for table `t_kota`
--
ALTER TABLE `t_kota`
  ADD PRIMARY KEY (`idKota`);

--
-- Indexes for table `t_user`
--
ALTER TABLE `t_user`
  ADD PRIMARY KEY (`id_user`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `t_kota`
--
ALTER TABLE `t_kota`
  MODIFY `idKota` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;
--
-- AUTO_INCREMENT for table `t_user`
--
ALTER TABLE `t_user`
  MODIFY `id_user` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
