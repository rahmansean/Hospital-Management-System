-- phpMyAdmin SQL Dump
-- version 5.0.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Apr 16, 2021 at 04:30 PM
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
-- Table structure for table `neurology`
--

CREATE TABLE `neurology` (
  `Id` int(11) NOT NULL,
  `Name` varchar(50) NOT NULL,
  `Qualification` varchar(100) NOT NULL,
  `ConsultationFees` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `neurology`
--

INSERT INTO `neurology` (`Id`, `Name`, `Qualification`, `ConsultationFees`) VALUES
(1, 'Assot. Prof. Dr. Moududul', 'MBBS, MD, PhD (MS), Nurosurgery', 700),
(2, 'DR. M BAHADUR ALI MIAH', 'MBBS, MD (Neuro)', 500),
(3, 'Dr. M. Bahadur Ali Miah', 'MBBS, MD (Neuro), Fellow-Interventional Neurology & Stroke Therapy', 600),
(4, 'Dr. M. S. Jahirul Hoque Chowdhury', 'MBBS, BCS (Health), CCD (Diabetics), MD (Neuro Medicine), MACP (Medicine,USA)', 500),
(5, 'Dr. Masud Anwar', 'MBBS, FCPS, MS (Neurosurgery)', 400),
(6, 'Dr. Md Nurul Amin Khan', 'MBBS, MD', 700),
(7, 'Dr. Md. Shahidullah', 'MBBS, FCPS (MEDICINE), MD (NEUROMEDICINE), Associate Prof. Of Neuro Medicine', 400);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `neurology`
--
ALTER TABLE `neurology`
  ADD PRIMARY KEY (`Id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `neurology`
--
ALTER TABLE `neurology`
  MODIFY `Id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
