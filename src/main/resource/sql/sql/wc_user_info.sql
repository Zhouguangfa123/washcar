/*
Navicat MySQL Data Transfer

Source Server         : zhou
Source Server Version : 80016
Source Host           : localhost:3306
Source Database       : mysql

Target Server Type    : MYSQL
Target Server Version : 80016
File Encoding         : 65001

Date: 2019-06-11 16:50:00
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for wc_user_info
-- ----------------------------
DROP TABLE IF EXISTS `wc_user_info`;
CREATE TABLE `wc_user_info` (
  `user_id` int(10) NOT NULL,
  `user_name` varchar(255) NOT NULL,
  `user_password` varchar(255) NOT NULL,
  `user_phone` char(11) NOT NULL,
  `user_status` char(2) NOT NULL,
  `user_system` char(2) DEFAULT NULL,
  `spare1` varchar(255) DEFAULT NULL,
  `spare2` varchar(255) DEFAULT NULL,
  `spare3` varchar(255) DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  `update_time` datetime DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
//
alter table wc_user_info change user_system user_type char(2);
