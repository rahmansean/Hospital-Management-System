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
-- Table structure for table `mdcnrmndr`
--

CREATE TABLE `mdcnrmndr` (
  `Id` int(11) NOT NULL,
  `Mname` varchar(100) NOT NULL,
  `Mpower` varchar(100) NOT NULL,
  `Msdate` varchar(100) NOT NULL,
  `Medate` varchar(100) NOT NULL,
  `Mtime` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `mdcnrmndr`
--

INSERT INTO `mdcnrmndr` (`Id`, `Mname`, `Mpower`, `Msdate`, `Medate`, `Mtime`) VALUES
(21, 'napa', '500', '2021-04-01', '2021-04-24', '16:02 PM');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `mdcnrmndr`
--
ALTER TABLE `mdcnrmndr`
  ADD PRIMARY KEY (`Id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `mdcnrmndr`
--
ALTER TABLE `mdcnrmndr`
  MODIFY `Id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=22;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
