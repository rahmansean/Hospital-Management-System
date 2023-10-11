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
-- Table structure for table `healthqueries`
--

CREATE TABLE `healthqueries` (
  `Id` int(11) NOT NULL,
  `DiseasesName` varchar(300) NOT NULL,
  `Symptoms` varchar(500) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `healthqueries`
--

INSERT INTO `healthqueries` (`Id`, `DiseasesName`, `Symptoms`) VALUES
(1, 'Corona', 'Infectious diseases are \r\ncaused by pathogens (\"germs\") including\r\nviruses, bacteria, fungi and parasites'),
(2, 'Diabetes\r\n', 'Type 1 diabetes (T1D) is \r\nan autoimmune disease in which the \r\nbody’s immune system attacks and \r\ndestroys the beta cells in the pancreas \r\nthat make insulin.'),
(3, 'Multiple Sclerosis\r\n', 'Multiple sclerosis (MS) is an autoimmune \r\ndisease in which the body\'s immune system \r\nmistakenly attacks myelin, the fatty substance \r\nthat surrounds and protects the \r\nnerve fibers in the central nervous system.'),
(4, 'Rheumatoid \r\nArthritis', 'Rheumatoid arthritis (RA) is an autoimmune \r\ndisease in which the body\'s immune system\r\nmistakenly attacks its own tissues, \r\nprimarily the synovium, \r\nthe membrane that lines the joints.\r\n\r\n'),
(5, 'Allergies & \r\nAsthma', 'Allergies and asthma are immune mediated \r\ndiseases that occur when the body\'s immune \r\nsystem overreacts to a foreign substance (an allergen), \r\nsuch as pollen or animal dander, \r\nthat in most people is generally harmless.'),
(6, 'Liver Disease', 'There are many diseases and disorders \r\nthat can cause the liver to stop functioning properly. \r\nSome of the different causes of liver disease include viral infection, \r\nalcohol or other environmental toxins, \r\nautoimmune disease and genetics.\r\n\r\n'),
(7, 'Cancer', 'Cancer represents more than 200 different \r\ntypes of malignancies—diseases caused by the \r\nuncontrolled and destructive growth of cells. \r\nWhen cancer cells grow unregulated, \r\nthey can develop into tumors, \r\ninvade nearby parts of the body \r\nand spread throughout the body.'),
(8, 'Heart Disease', 'Heart disease encompasses many diseases \r\nof the heart and blood vessels, \r\nsuch as high blood pressure, heart attacks, \r\nangina pectoris,stroke and heart failure.\r\n\r\n'),
(9, 'Crohn\'s & Colitis', 'Crohn\'s disease and ulcerative colitis (UC), \r\nboth also known as inflammatory bowel diseases (IBD), \r\nare autoimmune diseases in which \r\nthe body\'s immune system attacks the intestines.'),
(10, 'Lupus', 'Systemic lupus erythematosus (lupus) is a chronic, \r\nsystemic autoimmune disease which can damage any part \r\nof the body, including the heart, \r\njoints, skin, lungs, blood vessels, liver, \r\nkidneys and nervous system.');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `healthqueries`
--
ALTER TABLE `healthqueries`
  ADD PRIMARY KEY (`Id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `healthqueries`
--
ALTER TABLE `healthqueries`
  MODIFY `Id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
