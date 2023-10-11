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
-- Table structure for table `cardiology`
--

CREATE TABLE `cardiology` (
  `Id` int(11) NOT NULL,
  `Name` varchar(50) NOT NULL,
  `Qualification` varchar(100) NOT NULL,
  `ConsultationFees` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `cardiology`
--

INSERT INTO `cardiology` (`Id`, `Name`, `Qualification`, `ConsultationFees`) VALUES
(1, 'Dr. Abdullah Shahriar', 'MBBS, MD (Paed)', 500),
(2, 'DR. A K S ZAHID MAHAMUD KHAN', 'MBBS (Dhaka), MD (Cardiology)\r\nAssistant Professor. Cordiology, Rheumatic Fever & Medicine', 700),
(3, 'BRIG. GEN. (DR.) NURUN NAHAR FATEMA', 'MBBS, FCPS (Paed), FRCP (Edin), FACC (USA), FACAI (USA)', 500),
(4, 'Col. (Dr.) Nurun Nahar Fatema', 'MBBS, FCPS (Pedi), FRCP (Edin), FACC (USA), FSCAI (USA)', 400),
(5, 'Dr. AKHTER HAMID PARVEZ', 'MBBS, MS( CV & TS)', 600),
(6, 'Dr. Farhana Ahmed', 'MBBS, FCPS (CARDIOLOGY & MEDICINE)', 500),
(7, 'Dr. Lutfor Rahman', 'MBBS, MS (CTS)\r\nChief. Cardiac Surgeon', 600),
(8, 'MD.RAZU RASTOOGI', 'MBBS, MS (CTS)\r\nChief. Cardiac Surgeon', 800),
(13, 'razu ', '112', 400);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `cardiology`
--
ALTER TABLE `cardiology`
  ADD PRIMARY KEY (`Id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `cardiology`
--
ALTER TABLE `cardiology`
  MODIFY `Id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=19;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
