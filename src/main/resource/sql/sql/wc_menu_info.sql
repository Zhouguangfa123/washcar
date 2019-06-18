/*
Navicat MySQL Data Transfer

Source Server         : root
Source Server Version : 80016
Source Host           : localhost:3307
Source Database       : mysql

Target Server Type    : MYSQL
Target Server Version : 80016
File Encoding         : 65001

Date: 2019-06-18 22:28:32
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for wc_menu_info
-- ----------------------------
DROP TABLE IF EXISTS `wc_menu_info`;
CREATE TABLE `wc_menu_info` (
  `MENU_ID` int(10) NOT NULL AUTO_INCREMENT,
  `MENU_URL` varchar(255) DEFAULT NULL,
  `MENU_PID` int(10) DEFAULT NULL,
  `MENU_ORDER` int(4) DEFAULT NULL,
  `MENU_SHOW` char(1) NOT NULL,
  `CREATE_TIME` date DEFAULT NULL,
  `UPDATE_TIME` date DEFAULT NULL,
  PRIMARY KEY (`MENU_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
