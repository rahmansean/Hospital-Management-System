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
-- Table structure for table `gastroenterology`
--

CREATE TABLE `gastroenterology` (
  `Id` int(11) NOT NULL,
  `Name` varchar(50) NOT NULL,
  `Qualification` varchar(100) NOT NULL,
  `ConsultationFees` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `gastroenterology`
--

INSERT INTO `gastroenterology` (`Id`, `Name`, `Qualification`, `ConsultationFees`) VALUES
(1, 'Prof. Sk. Md. Bahar Hussain', 'MBBS,FCPS(Medicine),FACP(USA),FRCP(Edin),F.Gastro,FRCP(Glasgow) ', 300),
(2, 'Prof. Dr. Md. Hasan Masud', 'MBBS,MD(Gastroenterology) ', 200),
(3, 'Dr. Fowaz Hussain Shuvo', 'MBBS,MD(Hepatology) ', 400);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `gastroenterology`
--
ALTER TABLE `gastroenterology`
  ADD PRIMARY KEY (`Id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `gastroenterology`
--
ALTER TABLE `gastroenterology`
  MODIFY `Id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
