/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50717
Source Host           : localhost:3306
Source Database       : vote

Target Server Type    : MYSQL
Target Server Version : 50717
File Encoding         : 65001

Date: 2017-12-14 21:46:36
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for tb_vote_detail
-- ----------------------------
DROP TABLE IF EXISTS `tb_vote_detail`;
CREATE TABLE `tb_vote_detail` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `theme_id` int(11) NOT NULL,
  `v_name` varchar(255) DEFAULT NULL,
  `count` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of tb_vote_detail
-- ----------------------------

-- ----------------------------
-- Table structure for tb_vote_theme
-- ----------------------------
DROP TABLE IF EXISTS `tb_vote_theme`;
CREATE TABLE `tb_vote_theme` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `theme_name` varchar(255) DEFAULT NULL,
  `v_describe` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of tb_vote_theme
-- ----------------------------
INSERT INTO `tb_vote_theme` VALUES ('1', '电子竞技游戏', '你最喜欢的电子游戏是什么？');
INSERT INTO `tb_vote_theme` VALUES ('2', '足球明星', '你最喜欢的足球明星是谁？');
