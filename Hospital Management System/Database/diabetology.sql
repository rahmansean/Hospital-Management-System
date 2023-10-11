-- phpMyAdmin SQL Dump
-- version 5.0.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Apr 16, 2021 at 04:29 PM
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
-- Table structure for table `diabetology`
--

CREATE TABLE `diabetology` (
  `Id` int(11) NOT NULL,
  `Name` varchar(50) NOT NULL,
  `Qualification` varchar(100) NOT NULL,
  `ConsultationFees` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `diabetology`
--

INSERT INTO `diabetology` (`Id`, `Name`, `Qualification`, `ConsultationFees`) VALUES
(1, 'DR.M SAIFUDDIN', 'MBBS(DMC),BCS(Health),FCPS(Medicine),MD(Endocrinology)BIRDEM', 300),
(2, 'DR. INDRAJIT PRASHAD ', 'MBBS,FCPS(Med),MD(Endocrinology),MACE(USA)', 400),
(3, 'Dr. Feroz Amin', 'MD(Endocrinology,BIRDM)', 500),
(4, 'Prof. Dr. Khaja Nazim Uddin', 'MBBS,FCPS(Med),FRCP(Glasgow),FACP(USA)', 500);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `diabetology`
--
ALTER TABLE `diabetology`
  ADD PRIMARY KEY (`Id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `diabetology`
--
ALTER TABLE `diabetology`
  MODIFY `Id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
