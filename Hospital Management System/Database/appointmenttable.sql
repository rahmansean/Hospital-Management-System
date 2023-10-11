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
-- Table structure for table `appointmenttable`
--

CREATE TABLE `appointmenttable` (
  `Id` int(11) NOT NULL,
  `UserName` varchar(100) NOT NULL,
  `Gender` varchar(50) NOT NULL,
  `Email` varchar(100) NOT NULL,
  `Birth` varchar(50) NOT NULL,
  `Slot` varchar(50) NOT NULL,
  `AptDate` varchar(50) NOT NULL,
  `DoctorName` varchar(100) NOT NULL,
  `Department` varchar(100) NOT NULL,
  `Fees` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `appointmenttable`
--

INSERT INTO `appointmenttable` (`Id`, `UserName`, `Gender`, `Email`, `Birth`, `Slot`, `AptDate`, `DoctorName`, `Department`, `Fees`) VALUES
(1, 'Sean Rahman', 'Male', 'sean@gmail.com', '2021-03-01', '10:30 AM - 10:45 AM', '2021-03-31', '', '', 0),
(2, 'Sean Rahman', 'Male', 'sean@gmail.com', '2021-03-02', '11:15 AM - 11:30 AM', '2021-03-30', '', '', 0),
(3, 'Sean Rahman', 'Male', 'sean@gmail.com', '2021-03-03', '3:30 PM - 03:45 PM', '2021-03-29', '', '', 0),
(4, 'Sean Rahman', 'Male', 'sean@gmail.com', '2021-03-04', '04:45 PM - 05:00 PM', '2021-03-27', '', '', 0),
(5, 'Saber Ahmed', 'Male', 'saber@gmail.com', '2021-03-18', '11:00 AM - 11:15 AM', '2021-03-19', '', '', 0),
(6, 'Sean Rahman', 'Male', 'sean@gmail.com', '2021-03-28', '11:15 AM - 11:30 AM', '2021-03-31', '', '', 0),
(7, 'Saber Ahmed', 'Male', 'saber@gmail.com', '2021-03-06', '04:45 PM - 05:00 PM', '2021-03-12', '', '', 0),
(9, 'Sean Rahman', 'Male', 'sean@gmail.com', '2021-03-12', '04:45 PM - 05:00 PM', '2021-03-19', '', '', 0),
(10, 'Saber Ahmed', 'Male', 'saber@gmail.com', '2021-03-01', '03:45 PM - 04:00 PM', '2021-03-31', '', '', 0),
(11, 'Saber Ahmed', 'Male', 'saber@gmail.com', '2021-03-24', '3:30 PM - 03:45 PM', '2021-03-13', '', '', 0),
(15, 'Sean Rahman', 'Male', 'sean@gmail.com', '2021-03-04', '10:30 AM - 10:45 AM', '2021-03-20', 'Dr. Farhana Ahmed', 'Heart', 0),
(16, 'Sean Rahman', 'Male', 'sean@gmail.com', '2021-03-19', '03:45 PM - 04:00 PM', '2021-03-19', 'DR. M BAHADUR ALI MIAH', 'Liver and Kidney', 0),
(17, 'Sean Rahman', 'Male', 'sean@gmail.com', '2021-03-19', '04:45 PM - 05:00 PM', '2021-03-13', 'PROF. DR. MA HASNAT', 'Diabetese', 0),
(18, 'Sean Rahman', 'Male', 'sean@gmail.com', '2021-03-04', '03:45 PM - 04:00 PM', '2021-03-20', 'Dr. Fowaz Hussain Shuvo', 'Gastric', 25),
(19, 'Sean Rahman', 'Male', 'sean@gmail.com', '2021-03-18', '04:15 PM - 04:30 PM', '2021-12-22', 'BRIG. GEN. (DR.) NURUN NAHAR FATEMA', 'Heart', 500),
(20, 'Sean Rahman', 'Male', 'sean@gmail.com', '2021-03-09', '04:15 PM - 04:30 PM', '2021-03-31', 'Dr. Fowaz Hussain Shuvo', 'Gastric', 400),
(23, 'Sean Rahman', 'Male', 'sean@gmail.com', '2021-03-18', '04:45 PM - 05:00 PM', '2021-07-23', 'Dr. Fazlul Hoque', 'Arthritis', 500),
(24, 'Sean Rahman', 'Male', 'sean@gmail.com', '2021-03-02', '04:15 PM - 04:30 PM', '2021-03-30', 'DR. MD. ZIA UDDIN', 'Arthritis', 400),
(25, 'Sean Rahman', 'Male', 'sean@gmail.com', '2021-03-11', '10:30 AM - 10:45 AM', '2021-08-19', 'DR. MD. ZIA UDDIN', 'Arthritis', 400);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `appointmenttable`
--
ALTER TABLE `appointmenttable`
  ADD PRIMARY KEY (`Id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `appointmenttable`
--
ALTER TABLE `appointmenttable`
  MODIFY `Id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=27;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
