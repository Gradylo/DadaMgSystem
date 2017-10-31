/*
Navicat MySQL Data Transfer

Source Server         : mysql
Source Server Version : 50718
Source Host           : localhost:3306
Source Database       : dadamgsystem

Target Server Type    : MYSQL
Target Server Version : 50718
File Encoding         : 65001

Date: 2017-10-24 00:02:31
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for cadet
-- ----------------------------
DROP TABLE IF EXISTS `cadet`;
CREATE TABLE `cadet` (
  `id` int(11) NOT NULL,
  `name` varchar(255) DEFAULT NULL,
  `educational` varchar(255) DEFAULT NULL,
  `profession` varchar(255) DEFAULT NULL,
  `isbasics` int(1) DEFAULT NULL,
  `source` varchar(255) DEFAULT NULL,
  `info` varchar(255) DEFAULT NULL,
  `learningTime` datetime DEFAULT NULL,
  `stage` varchar(255) DEFAULT NULL,
  `createdUser` varchar(255) DEFAULT NULL,
  `modifiyUser` varchar(255) DEFAULT NULL,
  `createdTime` datetime DEFAULT NULL,
  `modifiyTime` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of cadet
-- ----------------------------
