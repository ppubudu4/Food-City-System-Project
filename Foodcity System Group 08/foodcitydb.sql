-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Dec 26, 2017 at 01:40 PM
-- Server version: 10.1.9-MariaDB
-- PHP Version: 5.5.30

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `foodcitydb`
--

-- --------------------------------------------------------

--
-- Table structure for table `advertising`
--

CREATE TABLE `advertising` (
  `Ad_Type_ID` int(11) NOT NULL,
  `Ad_Year` varchar(45) DEFAULT NULL,
  `Ad_Month` varchar(45) DEFAULT NULL,
  `Emp_ID` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `ad_type`
--

CREATE TABLE `ad_type` (
  `Ad_Type_ID` int(11) NOT NULL,
  `Ad_Type_Name` varchar(45) DEFAULT NULL,
  `Ad_Type_Discription` varchar(255) DEFAULT NULL,
  `Ad_Type_Status` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `bill_type`
--

CREATE TABLE `bill_type` (
  `Bill_Type_ID` int(11) NOT NULL,
  `Bill_Type_Name` varchar(45) DEFAULT NULL,
  `Bill_Type_Discription` varchar(255) DEFAULT NULL,
  `Bill_Type_Status` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `cat`
--

CREATE TABLE `cat` (
  `Cat_ID` int(11) NOT NULL,
  `Cat_Name` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `customer`
--

CREATE TABLE `customer` (
  `Cust_ID` int(11) NOT NULL,
  `Cust_FName` varchar(45) DEFAULT NULL,
  `Cust_LName` varchar(45) DEFAULT NULL,
  `Cust_Address_1` varchar(45) DEFAULT NULL,
  `Cust_Address_2` varchar(45) DEFAULT NULL,
  `Cust_DOB` varchar(45) DEFAULT NULL,
  `Cust_EMail` varchar(45) DEFAULT NULL,
  `Cust_Cont_No` varchar(45) DEFAULT NULL,
  `Cust_Join_Date` varchar(45) DEFAULT NULL,
  `Cust_Stg_No` varchar(45) DEFAULT NULL,
  `Cust_Status` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `cust_stages`
--

CREATE TABLE `cust_stages` (
  `Cust_Stg_ID` varchar(45) NOT NULL,
  `Cust_Stg_Name` varchar(45) DEFAULT NULL,
  `Cust_Stg_ActTimeFrom` varchar(45) DEFAULT NULL,
  `Cust_Stg_ActTimeTo` varchar(45) DEFAULT NULL,
  `Cust_Stg_Discount` varchar(45) DEFAULT NULL,
  `Cust_Stg_Discription` varchar(255) DEFAULT NULL,
  `Cust_Stg_Status` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `dispose`
--

CREATE TABLE `dispose` (
  `Disp_No` int(11) NOT NULL,
  `Disp_Date` varchar(45) NOT NULL,
  `Disp_Time` varchar(45) NOT NULL,
  `Emp_ID` int(11) DEFAULT NULL,
  `Disp_Total` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `dispose_2`
--

CREATE TABLE `dispose_2` (
  `Disp_No` int(11) NOT NULL,
  `I_ID` int(11) DEFAULT NULL,
  `Disp_Quant` varchar(45) DEFAULT NULL,
  `Disp_Reson` varchar(45) DEFAULT NULL,
  `Disp_Total` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `donations`
--

CREATE TABLE `donations` (
  `Donat_ID` int(11) NOT NULL,
  `Donat_Date` varchar(45) NOT NULL,
  `Donat_Time` varchar(45) NOT NULL,
  `Emp_ID` int(11) DEFAULT NULL,
  `Donat_Amount` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `employee`
--

CREATE TABLE `employee` (
  `Emp_ID` int(11) NOT NULL,
  `Emp_FName` varchar(45) DEFAULT NULL,
  `Emp_LName` varchar(45) DEFAULT NULL,
  `Emp_NIC_No` varchar(45) DEFAULT NULL,
  `Emp_Address_1` varchar(45) DEFAULT NULL,
  `Emp_Address_2` varchar(45) DEFAULT NULL,
  `Emp_DOB` varchar(45) DEFAULT NULL,
  `Emp_Con_No` varchar(45) DEFAULT NULL,
  `Emp_Email` varchar(45) DEFAULT NULL,
  `Emp_Gender` varchar(45) DEFAULT NULL,
  `Emp_Join_Date` varchar(45) DEFAULT NULL,
  `Emp_Leaved_Date` varchar(45) DEFAULT NULL,
  `Emp_Pos_De_ID` varchar(45) DEFAULT NULL,
  `Emp_AccL` varchar(45) DEFAULT NULL,
  `Emp_Staus` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `employee`
--

INSERT INTO `employee` (`Emp_ID`, `Emp_FName`, `Emp_LName`, `Emp_NIC_No`, `Emp_Address_1`, `Emp_Address_2`, `Emp_DOB`, `Emp_Con_No`, `Emp_Email`, `Emp_Gender`, `Emp_Join_Date`, `Emp_Leaved_Date`, `Emp_Pos_De_ID`, `Emp_AccL`, `Emp_Staus`) VALUES
(123, 'sankalpa', 'sudheera', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, 'Admin', NULL),
(124, 'sada', 'ada', '123453254', 'adsas', 'asfdasf', '06 December 2017', '1213124235', 'sanha@gmail.com', 'Male', '26 December 2017', '-----', '', '', '1');

-- --------------------------------------------------------

--
-- Table structure for table `emppassword`
--

CREATE TABLE `emppassword` (
  `Emp_ID` int(11) NOT NULL,
  `EmpPassword` varchar(45) DEFAULT NULL,
  `Sec_Que_1` varchar(100) DEFAULT NULL,
  `Answer_1` varchar(100) DEFAULT NULL,
  `Sec_Que_2` varchar(100) DEFAULT NULL,
  `Answer_2` varchar(100) DEFAULT NULL,
  `Sec_Que_3` varchar(100) DEFAULT NULL,
  `Answer_3` varchar(100) DEFAULT NULL,
  `Login_Status` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `emppassword`
--

INSERT INTO `emppassword` (`Emp_ID`, `EmpPassword`, `Sec_Que_1`, `Answer_1`, `Sec_Que_2`, `Answer_2`, `Sec_Que_3`, `Answer_3`, `Login_Status`) VALUES
(123, '1234', NULL, NULL, NULL, NULL, NULL, NULL, '1'),
(124, '123456', NULL, NULL, NULL, NULL, NULL, NULL, '1');

-- --------------------------------------------------------

--
-- Table structure for table `emp_accesslevel_detail`
--

CREATE TABLE `emp_accesslevel_detail` (
  `Emp_AccL_ID` int(11) NOT NULL,
  `Emp_AccL_Name` varchar(45) DEFAULT NULL,
  `Emp_AccL_Discription` varchar(45) DEFAULT NULL,
  `Emp_AccL_Statues` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `emp_accesslevel_detail`
--

INSERT INTO `emp_accesslevel_detail` (`Emp_AccL_ID`, `Emp_AccL_Name`, `Emp_AccL_Discription`, `Emp_AccL_Statues`) VALUES
(1, 'Admin', 'sana', '1'),
(123, 'Admin', NULL, NULL);

-- --------------------------------------------------------

--
-- Table structure for table `emp_attendent`
--

CREATE TABLE `emp_attendent` (
  `Emp_ID` varchar(45) NOT NULL,
  `Emp_Atten_Date` varchar(45) NOT NULL,
  `Emp_Atten_Start_Time` varchar(45) DEFAULT NULL,
  `Emp_Atten_End_Time` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `emp_epf`
--

CREATE TABLE `emp_epf` (
  `Emp_EPF_No` int(11) NOT NULL,
  `Emp_EPF_Year` varchar(45) NOT NULL,
  `Emp_EPF_Month` varchar(45) NOT NULL,
  `Emp_EPF_TotalAmountFromEmployer` varchar(45) DEFAULT NULL,
  `Emp_EPF_Approved_By` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `emp_epf_2`
--

CREATE TABLE `emp_epf_2` (
  `Emp_EPF_No` int(11) NOT NULL,
  `Emp_ID` int(11) NOT NULL,
  `Emp_Sal_Amount` varchar(45) DEFAULT NULL,
  `Emp_EPF_2_From_Employee` varchar(45) DEFAULT NULL,
  `Emp_EPF_2_From_Emploer` varchar(45) DEFAULT NULL,
  `Emp_EPF_2_Total` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `emp_etf`
--

CREATE TABLE `emp_etf` (
  `Emp_ETF_No` int(11) NOT NULL,
  `Emp_ETF_Year` varchar(45) NOT NULL,
  `Emp_ETF_Month` varchar(45) NOT NULL,
  `Emp_ETF_Total_Amount` varchar(45) DEFAULT NULL,
  `Emp_ETF_Approved_By` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `emp_etf_2`
--

CREATE TABLE `emp_etf_2` (
  `Emp_ETF_No` int(11) NOT NULL,
  `Emp_ID` int(11) NOT NULL,
  `Emp_Sal_Amount` varchar(45) DEFAULT NULL,
  `Emp_ETF_2_Amount` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `emp_ot`
--

CREATE TABLE `emp_ot` (
  `Emp_ID` int(11) NOT NULL,
  `Emp_Pro_De_ID` int(11) NOT NULL,
  `Emp_Ot_Date` varchar(45) NOT NULL,
  `Emp_Ot_Hours` varchar(45) DEFAULT NULL,
  `Emp_Ot_Total` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `emp_pos_detail`
--

CREATE TABLE `emp_pos_detail` (
  `Emp_Pos_De_ID` int(11) NOT NULL,
  `Emp_Pos_De_Name` varchar(45) DEFAULT NULL,
  `Emp_Pos_De_Salary` varchar(45) DEFAULT NULL,
  `Emp_Pos_De_Bonus` varchar(45) DEFAULT NULL,
  `Emp_Pos_De_Ot_for_hour` varchar(45) DEFAULT NULL,
  `Emp_Pos_De_Status` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `emp_pos_detail`
--

INSERT INTO `emp_pos_detail` (`Emp_Pos_De_ID`, `Emp_Pos_De_Name`, `Emp_Pos_De_Salary`, `Emp_Pos_De_Bonus`, `Emp_Pos_De_Ot_for_hour`, `Emp_Pos_De_Status`) VALUES
(1, 'manager', NULL, NULL, NULL, '1');

-- --------------------------------------------------------

--
-- Table structure for table `emp_pro`
--

CREATE TABLE `emp_pro` (
  `Emp_ID` int(11) NOT NULL,
  `Emp_Pro_De_ID` int(11) NOT NULL,
  `Emp_Join_Date` varchar(45) DEFAULT NULL,
  `Emp_LastWork_Date` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `emp_pro_detail`
--

CREATE TABLE `emp_pro_detail` (
  `Emp_Pro_De_ID` int(11) NOT NULL,
  `Emp_Pro_De_Name` varchar(45) DEFAULT NULL,
  `Emp_Pro_De_Salary` varchar(45) DEFAULT NULL,
  `Emp_Pro_De_Bonus` varchar(45) DEFAULT NULL,
  `Emp_Pro_De_Ot_for_hour` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `emp_salary`
--

CREATE TABLE `emp_salary` (
  `Emp_ID` int(11) NOT NULL,
  `Emp_Sal_Year` varchar(45) NOT NULL,
  `Emp_Sal_Month` varchar(45) NOT NULL,
  `Emp_Sal_Day` varchar(45) DEFAULT NULL,
  `Emp_Sal_Time` varchar(45) DEFAULT NULL,
  `Emp_Sal_Amount` varchar(45) DEFAULT NULL,
  `Emp_Sal_Last_Amount` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `emp_sal_lone`
--

CREATE TABLE `emp_sal_lone` (
  `Emp_ID` int(11) NOT NULL,
  `Emp_Sal_Lon_Year` varchar(45) NOT NULL,
  `Emp_Sal_Lon_Month` varchar(45) NOT NULL,
  `Emp_Sal_Lon_Day` varchar(45) DEFAULT NULL,
  `Emp_Sal_Lon_Time` varchar(45) DEFAULT NULL,
  `Emp_Sal_Lon_Reson` varchar(45) DEFAULT NULL,
  `Emp_Sal_Lon_Amount` varchar(45) DEFAULT NULL,
  `Emp_Sal_Lon_Approved_by` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `grn`
--

CREATE TABLE `grn` (
  `GRN_NO` int(11) NOT NULL,
  `Sup_ID` varchar(45) DEFAULT NULL,
  `GRN_Date` varchar(45) DEFAULT NULL,
  `GRN_Time` varchar(45) DEFAULT NULL,
  `GRN_Discount` varchar(45) DEFAULT NULL,
  `GRN_Total` varchar(45) DEFAULT NULL,
  `Emp_ID` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `grnr`
--

CREATE TABLE `grnr` (
  `GRNR_No` int(11) NOT NULL,
  `GRNR_Date` varchar(45) DEFAULT NULL,
  `GRNR_Time` varchar(45) DEFAULT NULL,
  `Sup_ID` int(11) DEFAULT NULL,
  `Emp_ID` int(11) DEFAULT NULL,
  `GRN_No` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `grnr_2`
--

CREATE TABLE `grnr_2` (
  `GRNR_No` int(11) NOT NULL,
  `I_ID` int(11) NOT NULL,
  `GRNR_2_Quant` varchar(45) DEFAULT NULL,
  `GRNR_2_Price` varchar(45) DEFAULT NULL,
  `GRNR_2_Reson` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `grn_2`
--

CREATE TABLE `grn_2` (
  `GRN_No` int(11) NOT NULL,
  `I_ID` int(11) NOT NULL,
  `GRN_2_Quant` varchar(45) DEFAULT NULL,
  `GRN_2_Price` varchar(45) DEFAULT NULL,
  `GRN_2_Discount` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `in`
--

CREATE TABLE `in` (
  `IN_No` int(11) NOT NULL,
  `Emp_ID` varchar(45) DEFAULT NULL,
  `IN_Date` varchar(45) DEFAULT NULL,
  `IN_Time` varchar(45) DEFAULT NULL,
  `Cust_ID` varchar(45) DEFAULT NULL,
  `Cust_Type` varchar(45) DEFAULT NULL COMMENT 'has Card_Cust/Other',
  `IN_Post_M_No` varchar(45) DEFAULT NULL,
  `IN_Discount` varchar(45) DEFAULT NULL,
  `IN_Total` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `inr`
--

CREATE TABLE `inr` (
  `INR_No` int(11) NOT NULL,
  `Emp_ID` varchar(45) DEFAULT NULL,
  `INR_Date` varchar(45) DEFAULT NULL,
  `INR_Time` varchar(45) DEFAULT NULL,
  `Cust_ID` varchar(45) DEFAULT NULL,
  `Cust_Type` varchar(45) DEFAULT NULL,
  `IN_No` int(11) DEFAULT NULL,
  `INR_Total` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `inr_2`
--

CREATE TABLE `inr_2` (
  `INR_No` int(11) NOT NULL,
  `I_ID` int(11) DEFAULT NULL,
  `INR_2_Quant` varchar(45) DEFAULT NULL,
  `INR_2_Reson` varchar(100) DEFAULT NULL,
  `INR_2_Price` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `invoice`
--

CREATE TABLE `invoice` (
  `IN_No` int(11) NOT NULL,
  `Emp_ID` varchar(45) DEFAULT NULL,
  `IN_Date` varchar(45) DEFAULT NULL,
  `IN_Time` varchar(45) DEFAULT NULL,
  `Cust_ID` varchar(45) DEFAULT NULL,
  `Cust_Type` varchar(45) DEFAULT NULL COMMENT 'has Card_Cust/Other',
  `Post_M_ID` int(11) DEFAULT NULL,
  `IN_Discount` varchar(45) DEFAULT NULL,
  `IN_Total` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `in_2`
--

CREATE TABLE `in_2` (
  `IN_No` int(11) NOT NULL,
  `I_ID` int(11) NOT NULL,
  `IN_2_Quant` varchar(45) DEFAULT NULL,
  `IN_2_Discount` varchar(45) DEFAULT NULL,
  `IN_2_Price` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `item`
--

CREATE TABLE `item` (
  `I_ID` int(11) NOT NULL,
  `I_Name` varchar(45) DEFAULT NULL,
  `I_Brand` varchar(45) DEFAULT NULL,
  `Cat_ID` int(11) DEFAULT NULL,
  `SubCat_ID` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `item_2`
--

CREATE TABLE `item_2` (
  `I_ID` int(11) NOT NULL,
  `Lot_ID` int(11) NOT NULL,
  `I2_Quant` varchar(45) DEFAULT NULL,
  `I2_Ex_Date` varchar(45) DEFAULT NULL,
  `I2_Sell_Price` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `mandatory_spendings`
--

CREATE TABLE `mandatory_spendings` (
  `Bill_Type_ID` int(11) NOT NULL,
  `Mand_Spend_Year` varchar(45) NOT NULL,
  `Mand_Spend_Month` varchar(45) NOT NULL,
  `Emp_ID` varchar(45) DEFAULT NULL,
  `Mand_Spend_Amount` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `miner_expenses`
--

CREATE TABLE `miner_expenses` (
  `Min_Exp_No` int(11) NOT NULL,
  `Min_Exp_Date` varchar(45) NOT NULL,
  `Min_Exp_Time` varchar(45) NOT NULL,
  `Emp_ID` int(11) DEFAULT NULL,
  `Min_Exp_Quant` varchar(45) DEFAULT NULL,
  `Min_Exp_Amount` varchar(45) DEFAULT NULL,
  `Min_Exp_Description` varchar(200) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `post_m_detail`
--

CREATE TABLE `post_m_detail` (
  `Post_M_ID` int(11) NOT NULL,
  `Post_M_serial_no` varchar(45) DEFAULT NULL,
  `Post_M_work_start_date` varchar(45) DEFAULT NULL,
  `Post_M_Details` varchar(1000) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `sub_cat`
--

CREATE TABLE `sub_cat` (
  `Sub_Cat_ID` int(11) NOT NULL,
  `Sub_Cat_Name` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `suplier`
--

CREATE TABLE `suplier` (
  `Sup_ID` int(11) NOT NULL,
  `Sup_Name` varchar(45) NOT NULL,
  `Sup_Address_1` varchar(45) DEFAULT NULL,
  `Sup_Address_2` varchar(45) DEFAULT NULL,
  `Sup_Contact_no` varchar(45) DEFAULT NULL,
  `Sup_E_Mail` varchar(45) DEFAULT NULL,
  `Sup_Reg_No` varchar(45) DEFAULT NULL,
  `Sup_Join_Date` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `sup_contact_person`
--

CREATE TABLE `sup_contact_person` (
  `Con_Pers_ID` int(11) NOT NULL,
  `Sup_ID` varchar(45) NOT NULL,
  `Con_Pers_FName` varchar(45) DEFAULT NULL,
  `Con_Pers_LName` varchar(45) DEFAULT NULL,
  `Con_Pers_E_Mail` varchar(45) DEFAULT NULL,
  `Con_Pers_Tel_No` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `sup_for_item`
--

CREATE TABLE `sup_for_item` (
  `Sup_ID` int(11) NOT NULL,
  `I_ID` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `advertising`
--
ALTER TABLE `advertising`
  ADD PRIMARY KEY (`Ad_Type_ID`);

--
-- Indexes for table `ad_type`
--
ALTER TABLE `ad_type`
  ADD PRIMARY KEY (`Ad_Type_ID`);

--
-- Indexes for table `bill_type`
--
ALTER TABLE `bill_type`
  ADD PRIMARY KEY (`Bill_Type_ID`);

--
-- Indexes for table `cat`
--
ALTER TABLE `cat`
  ADD PRIMARY KEY (`Cat_ID`);

--
-- Indexes for table `customer`
--
ALTER TABLE `customer`
  ADD PRIMARY KEY (`Cust_ID`);

--
-- Indexes for table `cust_stages`
--
ALTER TABLE `cust_stages`
  ADD PRIMARY KEY (`Cust_Stg_ID`);

--
-- Indexes for table `dispose`
--
ALTER TABLE `dispose`
  ADD PRIMARY KEY (`Disp_No`,`Disp_Date`,`Disp_Time`);

--
-- Indexes for table `dispose_2`
--
ALTER TABLE `dispose_2`
  ADD PRIMARY KEY (`Disp_No`);

--
-- Indexes for table `donations`
--
ALTER TABLE `donations`
  ADD PRIMARY KEY (`Donat_ID`,`Donat_Date`,`Donat_Time`);

--
-- Indexes for table `employee`
--
ALTER TABLE `employee`
  ADD PRIMARY KEY (`Emp_ID`);

--
-- Indexes for table `emppassword`
--
ALTER TABLE `emppassword`
  ADD PRIMARY KEY (`Emp_ID`);

--
-- Indexes for table `emp_accesslevel_detail`
--
ALTER TABLE `emp_accesslevel_detail`
  ADD PRIMARY KEY (`Emp_AccL_ID`);

--
-- Indexes for table `emp_attendent`
--
ALTER TABLE `emp_attendent`
  ADD PRIMARY KEY (`Emp_ID`,`Emp_Atten_Date`);

--
-- Indexes for table `emp_epf`
--
ALTER TABLE `emp_epf`
  ADD PRIMARY KEY (`Emp_EPF_No`,`Emp_EPF_Year`,`Emp_EPF_Month`);

--
-- Indexes for table `emp_epf_2`
--
ALTER TABLE `emp_epf_2`
  ADD PRIMARY KEY (`Emp_EPF_No`,`Emp_ID`);

--
-- Indexes for table `emp_etf`
--
ALTER TABLE `emp_etf`
  ADD PRIMARY KEY (`Emp_ETF_No`,`Emp_ETF_Year`,`Emp_ETF_Month`);

--
-- Indexes for table `emp_etf_2`
--
ALTER TABLE `emp_etf_2`
  ADD PRIMARY KEY (`Emp_ETF_No`,`Emp_ID`);

--
-- Indexes for table `emp_ot`
--
ALTER TABLE `emp_ot`
  ADD PRIMARY KEY (`Emp_ID`,`Emp_Pro_De_ID`,`Emp_Ot_Date`);

--
-- Indexes for table `emp_pos_detail`
--
ALTER TABLE `emp_pos_detail`
  ADD PRIMARY KEY (`Emp_Pos_De_ID`);

--
-- Indexes for table `emp_pro`
--
ALTER TABLE `emp_pro`
  ADD PRIMARY KEY (`Emp_ID`,`Emp_Pro_De_ID`);

--
-- Indexes for table `emp_pro_detail`
--
ALTER TABLE `emp_pro_detail`
  ADD PRIMARY KEY (`Emp_Pro_De_ID`);

--
-- Indexes for table `emp_salary`
--
ALTER TABLE `emp_salary`
  ADD PRIMARY KEY (`Emp_ID`,`Emp_Sal_Year`,`Emp_Sal_Month`);

--
-- Indexes for table `emp_sal_lone`
--
ALTER TABLE `emp_sal_lone`
  ADD PRIMARY KEY (`Emp_ID`,`Emp_Sal_Lon_Year`,`Emp_Sal_Lon_Month`);

--
-- Indexes for table `grn`
--
ALTER TABLE `grn`
  ADD PRIMARY KEY (`GRN_NO`);

--
-- Indexes for table `grnr`
--
ALTER TABLE `grnr`
  ADD PRIMARY KEY (`GRNR_No`);

--
-- Indexes for table `grnr_2`
--
ALTER TABLE `grnr_2`
  ADD PRIMARY KEY (`GRNR_No`,`I_ID`);

--
-- Indexes for table `grn_2`
--
ALTER TABLE `grn_2`
  ADD PRIMARY KEY (`GRN_No`,`I_ID`);

--
-- Indexes for table `in`
--
ALTER TABLE `in`
  ADD PRIMARY KEY (`IN_No`);

--
-- Indexes for table `inr`
--
ALTER TABLE `inr`
  ADD PRIMARY KEY (`INR_No`);

--
-- Indexes for table `inr_2`
--
ALTER TABLE `inr_2`
  ADD PRIMARY KEY (`INR_No`);

--
-- Indexes for table `invoice`
--
ALTER TABLE `invoice`
  ADD PRIMARY KEY (`IN_No`),
  ADD KEY `Post_M_ID_idx` (`Post_M_ID`);

--
-- Indexes for table `in_2`
--
ALTER TABLE `in_2`
  ADD PRIMARY KEY (`IN_No`,`I_ID`);

--
-- Indexes for table `item`
--
ALTER TABLE `item`
  ADD PRIMARY KEY (`I_ID`),
  ADD KEY `Cat_ID_idx` (`Cat_ID`),
  ADD KEY `Sub_Cat_ID_idx` (`SubCat_ID`);

--
-- Indexes for table `item_2`
--
ALTER TABLE `item_2`
  ADD PRIMARY KEY (`I_ID`,`Lot_ID`);

--
-- Indexes for table `mandatory_spendings`
--
ALTER TABLE `mandatory_spendings`
  ADD PRIMARY KEY (`Bill_Type_ID`,`Mand_Spend_Year`,`Mand_Spend_Month`);

--
-- Indexes for table `miner_expenses`
--
ALTER TABLE `miner_expenses`
  ADD PRIMARY KEY (`Min_Exp_No`,`Min_Exp_Date`,`Min_Exp_Time`);

--
-- Indexes for table `post_m_detail`
--
ALTER TABLE `post_m_detail`
  ADD PRIMARY KEY (`Post_M_ID`);

--
-- Indexes for table `sub_cat`
--
ALTER TABLE `sub_cat`
  ADD PRIMARY KEY (`Sub_Cat_ID`);

--
-- Indexes for table `suplier`
--
ALTER TABLE `suplier`
  ADD PRIMARY KEY (`Sup_ID`);

--
-- Indexes for table `sup_contact_person`
--
ALTER TABLE `sup_contact_person`
  ADD PRIMARY KEY (`Con_Pers_ID`,`Sup_ID`);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `invoice`
--
ALTER TABLE `invoice`
  ADD CONSTRAINT `Post_M_ID` FOREIGN KEY (`Post_M_ID`) REFERENCES `post_m_detail` (`Post_M_ID`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Constraints for table `item`
--
ALTER TABLE `item`
  ADD CONSTRAINT `Cat_ID` FOREIGN KEY (`Cat_ID`) REFERENCES `cat` (`Cat_ID`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `Sub_Cat_ID` FOREIGN KEY (`SubCat_ID`) REFERENCES `sub_cat` (`Sub_Cat_ID`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Constraints for table `item_2`
--
ALTER TABLE `item_2`
  ADD CONSTRAINT `I_ID` FOREIGN KEY (`I_ID`) REFERENCES `item` (`I_ID`) ON DELETE NO ACTION ON UPDATE NO ACTION;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
