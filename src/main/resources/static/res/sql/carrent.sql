/*
Navicat MySQL Data Transfer

Source Server         : mysql5
Source Server Version : 50721
Source Host           : localhost:3306
Source Database       : carrent

Target Server Type    : MYSQL
Target Server Version : 50721
File Encoding         : 65001

Date: 2018-12-18 18:24:38
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for cars
-- ----------------------------
DROP TABLE IF EXISTS `cars`;
CREATE TABLE `cars` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `level` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `type` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `name` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `brand` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `information` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `price` int(11) DEFAULT NULL,
  `status` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `years` int(11) DEFAULT NULL,
  `pic` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=22 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Records of cars
-- ----------------------------
INSERT INTO `cars` VALUES ('1', '紧凑型', '轿车', '桑塔纳', '上汽大众', '大众桑塔纳<br>\r\n2017款 1.6 手动 基本版<br>\r\n紧凑型轿车<br>\r\n4275x1793x1582<br>\r\n座位数[个]5<br>\r\n手动变速箱  7档位<br>', '100', '1', '5', 'santana.jpg');
INSERT INTO `cars` VALUES ('2', '紧凑型', '轿车', '捷达', '一汽大众', '大众捷达<br>\r\n2017款 1.6 手动 基本版<br>\r\n紧凑型轿车<br>\r\n4275x1793x1582<br>\r\n座位数[个]5<br>\r\n手动变速箱  7档位<br>', '100', '1', '4', 'jetta.jpg');
INSERT INTO `cars` VALUES ('3', '紧凑型', '轿车', '卡罗拉', '丰田', '丰田卡罗拉<br>\r\n2017款 1.6 手动 基本版<br>\r\n紧凑型轿车<br>\r\n4275x1793x1582<br>\r\n座位数[个]5<br>\r\n手动变速箱  7档位<br>', '90', '1', '6', 'corola.jpg');
INSERT INTO `cars` VALUES ('4', '紧凑型', 'SUV', '哈佛', '哈佛', '哈佛H6<br>\r\n2017款 1.6 手动 基本版<br>\r\n紧凑型轿车<br>\r\n4275x1793x1582<br>\r\n座位数[个]5<br>\r\n6速手自一体变速箱  6档位<br>', '120', '1', '4', 'hover_h6.jpg');
INSERT INTO `cars` VALUES ('5', '微型', 'MPV', '五菱宏光', '五菱', '五菱宏光<br>\r\n2016款 1.2 手动 基本版<br>\r\n紧凑型轿车<br>\r\n4275x1793x1582<br>\r\n座位数[个]5<br>\r\n6速手自一体变速箱  6档位<br>', '60', '1', '5', 'wlhg.jpg');
INSERT INTO `cars` VALUES ('6', '紧凑型', 'MPV', '途安', '上汽大众', '大众途安<br>\r\n2016款 1.8 自动 舒适版<br>\r\n紧凑型轿车<br>\r\n4275x1793x1582<br>\r\n座位数[个]5<br>\r\n6速手自一体变速箱  6档位<br>', '120', '1', '2', 'turan.jpg');
INSERT INTO `cars` VALUES ('7', '中型', 'SUV', '途观', '上汽大众', '大众途观安<br>\r\n2016款 1.8 自动 舒适版<br>\r\n紧凑型轿车<br>\r\n4275x1793x1582<br>\r\n座位数[个]5<br>\r\n大众途观<br>\r\n2016款 1.8 自动 舒适版<br>\r\n紧凑型轿车<br>\r\n4275x1793x1582<br>\r\n座位数[个]5<br>\r\n6速手自一体变速箱  6档位<br>\r\n', '120', '1', '2', 'tuguan.jpg');
INSERT INTO `cars` VALUES ('8', '紧凑型', '轿车', '思域', '本田', '本田思域<br>\r\n2015款 1.6 自动 舒适版<br>\r\n紧凑型轿车<br>\r\n4275x1793x1582<br>\r\n座位数[个]5<br>\r\n6速手自一体变速箱  6档位<br>', '100', '1', '3', 'civic.jpg');
INSERT INTO `cars` VALUES ('9', '紧凑型', '轿车', '速腾', '一汽大众', '一汽大众速腾<br>6速手自一体变速箱  6档位<br>', '150', '1', '4', 'sagitar.jpg');
INSERT INTO `cars` VALUES ('10', '紧凑型', '轿车', '宝来', '一汽大众', '一汽大众宝来<br>2015款 1.6 自动 舒适版<br>\r\n紧凑型轿车<br>\r\n4275x1793x1582<br>\r\n座位数[个]5<br>\r\n6速手自一体变速箱  6档位<br>', '120', '1', '5', 'bora.jpg');
INSERT INTO `cars` VALUES ('11', '紧凑型', '轿车', 'C4', '东风雪铁龙', '雪铁龙C4<br>2014款 1.6 自动进取型', '110', '1', '3', 'c4.jpg');
INSERT INTO `cars` VALUES ('12', '中型', '轿车', '雅阁', '广汽本田', '本田雅阁<br>2013款 本田雅阁', '160', '1', '5', 'accord.jpg');
INSERT INTO `cars` VALUES ('13', '中型', '轿车', '帕萨特', '上汽大众', '上汽大众帕萨特<br>2012款帕萨特', '180', '1', '6', 'passat.jpg');
INSERT INTO `cars` VALUES ('14', '紧凑型', 'SUV', '探戈', '一汽大众', '大众探戈<br>', '180', '1', '1', 'tange.jpg');
INSERT INTO `cars` VALUES ('15', '紧凑型', '轿车', '朗逸', '上汽大众', '上汽大众朗逸<br>6速手自一体变速箱  6档位<br>', '110', '1', '4', 'lavida.jpg');
INSERT INTO `cars` VALUES ('16', '紧凑型', '轿车', '福克斯', '长安福特', '福克斯', '110', '1', '4', 'focus.jpg');
INSERT INTO `cars` VALUES ('17', '紧凑型', '轿车', '福睿斯', '长安福特', '福睿斯', '100', '1', '3', 'feast.jpg');
INSERT INTO `cars` VALUES ('18', '中型', '轿车', '索纳塔', '北京现代', '索纳塔', '150', '1', '4', 'sonata.jpg');
INSERT INTO `cars` VALUES ('19', '紧凑型', '轿车', '瑞纳', '北京现代', '瑞纳', '120', '1', '3', 'neina.jpg');
INSERT INTO `cars` VALUES ('20', '中型', '轿车', '阿特兹', '一汽马自达', '阿特兹', '150', '1', '4', 'atezi.jpg');
INSERT INTO `cars` VALUES ('21', '中型', 'SUV', 'CX5', '一汽马自达', 'CX5', '140', '1', '4', 'cx5.jpg');

-- ----------------------------
-- Table structure for users
-- ----------------------------
DROP TABLE IF EXISTS `users`;
CREATE TABLE `users` (
  `uid` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(20) COLLATE utf8_bin DEFAULT NULL,
  `password` varchar(20) COLLATE utf8_bin DEFAULT NULL,
  `email` varchar(200) COLLATE utf8_bin DEFAULT NULL,
  `birthday` date DEFAULT NULL,
  `regdate` datetime DEFAULT NULL,
  PRIMARY KEY (`uid`)
) ENGINE=InnoDB AUTO_INCREMENT=22 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Records of users
-- ----------------------------
INSERT INTO `users` VALUES ('1', 'admin', '123456', 'admin@car.com', '1998-08-15', '2018-07-05 08:55:30');
