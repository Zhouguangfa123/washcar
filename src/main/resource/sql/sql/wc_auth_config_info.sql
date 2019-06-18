/*
Navicat MySQL Data Transfer

Source Server         : root
Source Server Version : 80016
Source Host           : localhost:3307
Source Database       : mysql

Target Server Type    : MYSQL
Target Server Version : 80016
File Encoding         : 65001

Date: 2019-06-18 22:32:22
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for wc_auth_config_info
-- ----------------------------
DROP TABLE IF EXISTS `wc_auth_config_info`;
CREATE TABLE `wc_auth_config_info` (
  `MENU_ID` int(10) NOT NULL,
  `USER_system` char(2) NOT NULL,
  `SHOW_FLAG` char(1) DEFAULT NULL,
  `CREATE_TIME` date DEFAULT NULL,
  `UPDATE_TIME` date DEFAULT NULL,
  PRIMARY KEY (`MENU_ID`,`USER_system`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
