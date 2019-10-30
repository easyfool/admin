/*
Navicat MySQL Data Transfer

Source Server         : procurement-dev
Source Server Version : 50721
Source Host           : localhost:3306
Source Database       : procure

Target Server Type    : MYSQL
Target Server Version : 50721
File Encoding         : 65001

Date: 2019-10-30 11:19:18
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for sys_user
-- ----------------------------
DROP TABLE IF EXISTS `sys_user`;
CREATE TABLE `sys_user` (
  `user_id` bigint(64) unsigned NOT NULL AUTO_INCREMENT COMMENT '用户ID',
  `dept_id` bigint(64) DEFAULT NULL COMMENT '部门ID',
  `login_name` varchar(50) COLLATE utf8mb4_bin NOT NULL COMMENT '登录账号',
  `user_name` varchar(50) COLLATE utf8mb4_bin NOT NULL COMMENT '用户昵称',
  `user_type` varchar(2) COLLATE utf8mb4_bin DEFAULT '00' COMMENT '用户类型（00系统用户）',
  `email` varchar(50) COLLATE utf8mb4_bin DEFAULT '' COMMENT '用户邮箱',
  `mobile` varchar(11) COLLATE utf8mb4_bin DEFAULT '' COMMENT '手机号码',
  `sex` char(1) COLLATE utf8mb4_bin DEFAULT '0' COMMENT '用户性别（0男 1女 2未知）',
  `avatar` varchar(100) COLLATE utf8mb4_bin DEFAULT '' COMMENT '头像路径',
  `password` varchar(50) COLLATE utf8mb4_bin DEFAULT '' COMMENT '密码',
  `salt` varchar(20) COLLATE utf8mb4_bin DEFAULT '' COMMENT '盐加密',
  `login_ip` varchar(50) COLLATE utf8mb4_bin DEFAULT '' COMMENT '最后登陆IP',
  `login_date` datetime DEFAULT NULL COMMENT '最后登陆时间',
  `status` int(4) NOT NULL DEFAULT '0' COMMENT '数据状态',
  `create_date` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `create_by` varchar(255) COLLATE utf8mb4_bin DEFAULT NULL COMMENT '创建者',
  `update_date` datetime DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  `update_by` varchar(255) COLLATE utf8mb4_bin DEFAULT NULL COMMENT '更新者',
  `remark` varchar(500) COLLATE utf8mb4_bin DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin COMMENT='用户信息表';
