/*
 Navicat Premium Data Transfer

 Source Server         : mysql5.7
 Source Server Type    : MySQL
 Source Server Version : 50733
 Source Host           : localhost:3306
 Source Schema         : houseleasems

 Target Server Type    : MySQL
 Target Server Version : 50733
 File Encoding         : 65001

 Date: 26/09/2021 19:15:20
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for admin
-- ----------------------------
DROP TABLE IF EXISTS `admin`;
CREATE TABLE `admin`  (
  `Uid` int(11) NOT NULL,
  `Username` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `Password` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `Phone` varchar(21) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `Email` varchar(51) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  PRIMARY KEY (`Uid`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of admin
-- ----------------------------
INSERT INTO `admin` VALUES (1, 'admin', '123123', '17711717321', '820082008820@qq.com');

-- ----------------------------
-- Table structure for house
-- ----------------------------
DROP TABLE IF EXISTS `house`;
CREATE TABLE `house`  (
  `Hid` int(11) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `Address` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '地址',
  `Phone` varchar(21) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '联系方式-手机',
  `Size` double NOT NULL COMMENT '面积',
  `Rent` double NOT NULL COMMENT '租金',
  `Leased` tinyint(1) NOT NULL COMMENT '是否已出租',
  PRIMARY KEY (`Hid`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 10 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of house
-- ----------------------------
INSERT INTO `house` VALUES (2, '北23 309', '13123457759', 114, 900, 1);
INSERT INTO `house` VALUES (3, '北23 310', '13124567759', 108, 920, 0);
INSERT INTO `house` VALUES (4, '北23 202', '123435678998', 89, 770, 0);
INSERT INTO `house` VALUES (5, '北23 208', '12365478989', 76, 640, 0);
INSERT INTO `house` VALUES (6, '北23 212', '12876548989', 74, 1050, 0);
INSERT INTO `house` VALUES (7, '北23 221', '12871234569', 114, 1150, 0);
INSERT INTO `house` VALUES (8, '北23 211', '1376474569', 105, 996, 0);
INSERT INTO `house` VALUES (9, '北23 308', '13515479916', 64, 510, 0);

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`  (
  `Uid` int(11) NOT NULL AUTO_INCREMENT,
  `Username` varchar(16) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `Password` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `Phone` varchar(21) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `Email` varchar(51) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  PRIMARY KEY (`Uid`, `Username`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 5 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES (1, 'lisa', '123456', '17562251628', '332362174@qq.com');
INSERT INTO `user` VALUES (2, 'lada', '123456', '17562251632', '1234567@qq.com');
INSERT INTO `user` VALUES (3, 'root', '123123', '17562251627', '332362173@QQ.COM');
INSERT INTO `user` VALUES (4, 'howxcheng', '123456', '17878918814', 'jbc332362173@outlook.com');

SET FOREIGN_KEY_CHECKS = 1;
