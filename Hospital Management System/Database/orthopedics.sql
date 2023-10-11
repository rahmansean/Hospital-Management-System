-- phpMyAdmin SQL Dump
-- version 5.0.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Apr 16, 2021 at 04:33 PM
-- Server version: 10.4.17-MariaDB
-- PHP Version: 8.0.2

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `database01`
--

-- --------------------------------------------------------

--
-- Table structure for table `orthopedics`
--

CREATE TABLE `orthopedics` (
  `Id` int(11) NOT NULL,
  `Name` varchar(50) NOT NULL,
  `Qualification` varchar(100) NOT NULL,
  `ConsultationFees` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `orthopedics`
--

INSERT INTO `orthopedics` (`Id`, `Name`, `Qualification`, `ConsultationFees`) VALUES
(1, 'Dr.Md.O.F.G Kibria', 'MBBS,MS(Orthopedic) ', 500),
(2, 'Dr. Fazlul Hoque', 'MBBS,FA(Ortho),FAMA Trained in Orthopedic and Spinal Surgery(UK & USA) ', 500),
(3, 'Dr. Mesbah Uddin Ahmed', 'MBBS,D.(Ortho),MS(Ortho) ', 600),
(4, 'Dr. Erfanul Haque Siddiqu', 'MBBS (DMC),MS(ORTHO),FRSH(LONDON),Orthopedics', 700),
(5, 'DR. MD. ZIA UDDIN', 'MBBS,D-Ortho,MS(Ortho Surgery)', 500);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `orthopedics`
--
ALTER TABLE `orthopedics`
  ADD PRIMARY KEY (`Id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `orthopedics`
--
ALTER TABLE `orthopedics`
  MODIFY `Id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
