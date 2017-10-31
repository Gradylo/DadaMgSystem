/*
Navicat MySQL Data Transfer

Source Server         : mysql
Source Server Version : 50718
Source Host           : localhost:3306
Source Database       : dadamgsystem

Target Server Type    : MYSQL
Target Server Version : 50718
File Encoding         : 65001

Date: 2017-10-24 00:03:11
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for userpermission
-- ----------------------------
DROP TABLE IF EXISTS `userpermission`;
CREATE TABLE `userpermission` (
  `id` int(11) NOT NULL,
  `userId` int(11) NOT NULL,
  `permissionId` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of userpermission
-- ----------------------------
