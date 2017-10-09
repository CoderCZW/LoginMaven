/*
Navicat MySQL Data Transfer

Source Server         : czw
Source Server Version : 50087
Source Host           : localhost:3306
Source Database       : login

Target Server Type    : MYSQL
Target Server Version : 50087
File Encoding         : 65001

Date: 2017-10-09 14:21:16
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for login
-- ----------------------------
DROP TABLE IF EXISTS `login`;
CREATE TABLE `login` (
  `loginname` varchar(15) NOT NULL,
  `password` varchar(15) NOT NULL,
  PRIMARY KEY  (`loginname`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of login
-- ----------------------------
INSERT INTO `login` VALUES ('czw', '1234');
INSERT INTO `login` VALUES ('jack', '123');
INSERT INTO `login` VALUES ('jbk', '123');
INSERT INTO `login` VALUES ('mike', '123');
INSERT INTO `login` VALUES ('rose', '123');
