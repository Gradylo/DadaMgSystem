/*
Navicat MySQL Data Transfer

Source Server         : mysql
Source Server Version : 50718
Source Host           : localhost:3306
Source Database       : dadamgsystem

Target Server Type    : MYSQL
Target Server Version : 50718
File Encoding         : 65001

Date: 2017-10-24 00:02:52
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for seat
-- ----------------------------
DROP TABLE IF EXISTS `seat`;
CREATE TABLE `seat` (
  `id` int(11) NOT NULL,
  `TrainingCampId` int(11) DEFAULT NULL,
  `seatNumber` int(11) DEFAULT NULL,
  `createdTeacher` varchar(255) DEFAULT NULL,
  `modifiyTeacher` varchar(255) DEFAULT NULL,
  `cadetId` int(11) DEFAULT NULL,
  `createdTime` datetime DEFAULT NULL,
  `modifiyTime` datetime DEFAULT NULL,
  `seatState` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of seat
-- ----------------------------
