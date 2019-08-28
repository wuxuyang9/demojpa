/*
Navicat MySQL Data Transfer

Source Server         : centos7
Source Server Version : 50725
Source Host           : 192.168.70.130:3307
Source Database       : solr

Target Server Type    : MYSQL
Target Server Version : 50725
File Encoding         : 65001

Date: 2019-08-28 17:40:53
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for car_upkeep
-- ----------------------------
DROP TABLE IF EXISTS `car_upkeep`;
CREATE TABLE `car_upkeep` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `customer_name` varchar(10) CHARACTER SET utf8mb4 NOT NULL DEFAULT '' COMMENT '客户名称',
  `customer_phone` varchar(11) NOT NULL,
  `vehicle_model_id` int(11) NOT NULL COMMENT '车型',
  `upkeep_operation` varchar(255) CHARACTER SET utf8mb4 DEFAULT NULL COMMENT '保养业务',
  `cost` bigint(11) NOT NULL COMMENT '费用',
  `date` datetime NOT NULL COMMENT '日期',
  `createtime` datetime DEFAULT NULL COMMENT '创建时间',
  `updatetime` datetime DEFAULT NULL COMMENT '更新时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=25 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of car_upkeep
-- ----------------------------
INSERT INTO `car_upkeep` VALUES ('1', 'test', '1234', '6', '普通洗车,抛光', '123', '2019-08-28 00:00:00', '2019-08-28 14:10:19', '2019-08-28 14:10:19');
INSERT INTO `car_upkeep` VALUES ('2', 'test123', '1234', '2', '普通洗车,抛光', '123', '2019-08-28 00:00:00', '2019-08-28 14:11:48', '2019-08-28 14:11:48');
INSERT INTO `car_upkeep` VALUES ('3', 'test123', '1234', '2', '普通洗车,抛光', '123', '2019-08-28 00:00:00', '2019-08-28 14:11:48', '2019-08-28 14:11:48');
INSERT INTO `car_upkeep` VALUES ('4', 'test123', '1234', '2', '普通洗车,抛光', '123', '2019-08-28 00:00:00', '2019-08-28 14:11:49', '2019-08-28 14:11:49');
INSERT INTO `car_upkeep` VALUES ('5', 'test123', '1234', '2', '普通洗车,抛光', '123', '2019-08-28 00:00:00', '2019-08-28 14:11:49', '2019-08-28 14:11:49');
INSERT INTO `car_upkeep` VALUES ('6', 'test123', '1234', '2', '普通洗车,抛光', '123', '2019-08-28 00:00:00', '2019-08-28 14:11:49', '2019-08-28 14:11:49');
INSERT INTO `car_upkeep` VALUES ('7', 'test123', '1234', '2', '普通洗车,抛光', '123', '2019-08-28 00:00:00', '2019-08-28 14:11:49', '2019-08-28 14:11:49');
INSERT INTO `car_upkeep` VALUES ('8', 'test123', '1234', '2', '普通洗车,抛光', '123', '2019-08-28 00:00:00', '2019-08-28 14:11:49', '2019-08-28 14:11:49');
INSERT INTO `car_upkeep` VALUES ('9', 'test1235', '1234', '2', '普通洗车,抛光', '123', '2019-08-28 00:00:00', '2019-08-28 14:12:08', '2019-08-28 14:12:08');
INSERT INTO `car_upkeep` VALUES ('10', 'test1235', '1234', '2', '普通洗车,抛光', '123', '2019-08-28 00:00:00', '2019-08-28 14:12:08', '2019-08-28 14:12:08');
INSERT INTO `car_upkeep` VALUES ('11', 'test1235', '1234', '2', '普通洗车,抛光', '123', '2019-08-28 00:00:00', '2019-08-28 14:12:09', '2019-08-28 14:12:09');
INSERT INTO `car_upkeep` VALUES ('12', 'test1235', '1234', '2', '普通洗车,抛光', '123', '2019-08-28 00:00:00', '2019-08-28 14:12:09', '2019-08-28 14:12:09');
INSERT INTO `car_upkeep` VALUES ('13', 'dase', '1234', '6', '普通洗车,抛光', '123', '2019-08-28 00:00:00', '2019-08-28 14:13:09', '2019-08-28 14:13:09');
INSERT INTO `car_upkeep` VALUES ('14', 'dase', '1234', '6', '普通洗车,抛光,打蜡', '123', '2019-08-28 00:00:00', '2019-08-28 14:13:19', '2019-08-28 14:13:19');
INSERT INTO `car_upkeep` VALUES ('15', '123312', '123545778', '6', '普通洗车,清洗内饰', '234', '2019-08-29 00:00:00', '2019-08-28 15:26:19', '2019-08-28 15:26:19');
INSERT INTO `car_upkeep` VALUES ('16', '5fggf', '365546546', '2', '普通洗车,清洗内饰', '123', '2019-08-30 00:00:00', '2019-08-28 15:27:53', '2019-08-28 15:27:53');
INSERT INTO `car_upkeep` VALUES ('17', '324', '3245', '2', '抛光,打蜡,清洗内饰', '324', '2019-08-30 00:00:00', '2019-08-28 15:28:32', '2019-08-28 15:28:32');
INSERT INTO `car_upkeep` VALUES ('18', '王宝强', '12356789', '6', '普通洗车', '123', '2019-08-28 00:00:00', '2019-08-28 15:29:00', '2019-08-28 15:29:00');
INSERT INTO `car_upkeep` VALUES ('19', '13134', '14234', '3', '普通洗车,清洗内饰', '124', '2019-08-28 00:00:00', '2019-08-28 15:35:13', '2019-08-28 15:35:13');
INSERT INTO `car_upkeep` VALUES ('20', 'edddd', '124123412', '3', '普通洗车,抛光', '123', '2019-08-28 00:00:00', '2019-08-28 16:55:40', '2019-08-28 16:55:40');
INSERT INTO `car_upkeep` VALUES ('21', '123321', '1234567', '5', '普通洗车,抛光', '234', '2019-08-28 00:00:00', '2019-08-28 17:09:33', '2019-08-28 17:09:33');
INSERT INTO `car_upkeep` VALUES ('22', '234', '324', '3', '普通洗车', '345', '2019-08-28 00:00:00', '2019-08-28 17:10:25', '2019-08-28 17:10:25');
INSERT INTO `car_upkeep` VALUES ('23', '9898xs', '12366', '6', '打蜡,普通洗车', '234356', '2019-08-28 00:00:00', '2019-08-28 17:18:06', '2019-08-28 17:18:06');
INSERT INTO `car_upkeep` VALUES ('24', '456765', '234234', '3', '普通洗车', '234', '2019-08-29 00:00:00', '2019-08-28 17:35:45', '2019-08-28 17:35:45');

-- ----------------------------
-- Table structure for person
-- ----------------------------
DROP TABLE IF EXISTS `person`;
CREATE TABLE `person` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `passward` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of person
-- ----------------------------
INSERT INTO `person` VALUES ('1', 'lrving', 'setest');

-- ----------------------------
-- Table structure for vehicle_model
-- ----------------------------
DROP TABLE IF EXISTS `vehicle_model`;
CREATE TABLE `vehicle_model` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `vehicle_model_name` varchar(255) CHARACTER SET utf8mb4 NOT NULL DEFAULT '' COMMENT '车型',
  `parent_id` int(11) DEFAULT '0' COMMENT 'id',
  `createtime` datetime DEFAULT NULL,
  `updatetime` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of vehicle_model
-- ----------------------------
INSERT INTO `vehicle_model` VALUES ('1', '宝马', '0', '2019-08-28 12:29:12', '2019-08-28 12:29:14');
INSERT INTO `vehicle_model` VALUES ('2', '宝马x1', '1', '2019-08-28 12:29:33', '2019-08-28 12:29:35');
INSERT INTO `vehicle_model` VALUES ('3', '宝马x2', '1', '2019-08-28 12:29:47', '2019-08-28 12:29:49');
INSERT INTO `vehicle_model` VALUES ('4', '奔驰', '0', '2019-08-28 12:29:59', '2019-08-28 12:30:02');
INSERT INTO `vehicle_model` VALUES ('5', '奔驰一系', '4', '2019-08-28 12:30:19', '2019-08-28 12:30:21');
INSERT INTO `vehicle_model` VALUES ('6', '奔驰二系', '4', '2019-08-28 12:30:40', '2019-08-28 12:30:42');

-- ----------------------------
-- Table structure for zui_dai_ma
-- ----------------------------
DROP TABLE IF EXISTS `zui_dai_ma`;
CREATE TABLE `zui_dai_ma` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `title` varchar(255) NOT NULL DEFAULT '' COMMENT '标题',
  `url` varchar(255) NOT NULL,
  `createtime` datetime DEFAULT NULL,
  `updatetime` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=235 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of zui_dai_ma
-- ----------------------------
INSERT INTO `zui_dai_ma` VALUES ('1', 'fdgfd', '234', '2019-06-25 07:02:58', '2019-06-25 07:02:58');
INSERT INTO `zui_dai_ma` VALUES ('2', '基于SSM框架简单的商城购物车项目实例', 'http://www.zuidaima.com//share/4464821640743936.htm', '2019-06-25 12:47:30', null);
INSERT INTO `zui_dai_ma` VALUES ('3', 'bootstrap网站后台管理模板subproadminUI', 'http://www.zuidaima.com//share/4459136748768256.htm', '2019-06-25 12:47:30', null);
INSERT INTO `zui_dai_ma` VALUES ('4', 'bootstrap网站后台html管理模板-dadmin', 'http://www.zuidaima.com//share/4459134332619776.htm', '2019-06-25 12:47:30', null);
INSERT INTO `zui_dai_ma` VALUES ('5', 'ssm开发网站人事后台管理系统', 'http://www.zuidaima.com//share/4458439069305856.htm', '2019-06-25 12:47:30', null);
INSERT INTO `zui_dai_ma` VALUES ('6', '基于Javaweb jsp servlet mysql bootstrap layui jQuery的图书管理系统', 'http://www.zuidaima.com//share/4458412263771136.htm', '2019-06-25 12:47:30', null);
INSERT INTO `zui_dai_ma` VALUES ('7', 'ssm开发简单网上电子书城项目', 'http://www.zuidaima.com//share/4457769255881728.htm', '2019-06-25 12:47:30', null);
INSERT INTO `zui_dai_ma` VALUES ('8', 'Python实现抓取豆瓣评分最好的250部电影', 'http://www.zuidaima.com//share/4456568629611520.htm', '2019-06-25 12:47:30', null);
INSERT INTO `zui_dai_ma` VALUES ('9', 'SpringBoot整合Swagger基本实现', 'http://www.zuidaima.com//share/4456479856724992.htm', '2019-06-25 12:47:30', null);
INSERT INTO `zui_dai_ma` VALUES ('10', '基于ssm(spring+springmvc+mybatis)的餐厅员工管理系统', 'http://www.zuidaima.com//share/4452308320095232.htm', '2019-06-25 12:47:30', null);
INSERT INTO `zui_dai_ma` VALUES ('11', '基于ssh的会议室管理系统', 'http://www.zuidaima.com//share/4450634463316992.htm', '2019-06-25 12:47:30', null);
INSERT INTO `zui_dai_ma` VALUES ('12', 'java web支付宝实现对接支付实例', 'http://www.zuidaima.com//share/4448572599847936.htm', '2019-06-25 12:47:30', null);
INSERT INTO `zui_dai_ma` VALUES ('13', 'java web简单学生信息管理系统', 'http://www.zuidaima.com//share/4446877379857408.htm', '2019-06-25 12:47:30', null);
INSERT INTO `zui_dai_ma` VALUES ('14', '壁纸微信小程序', 'http://www.zuidaima.com//share/4437942426504192.htm', '2019-06-25 12:47:30', null);
INSERT INTO `zui_dai_ma` VALUES ('15', 'SpringBoot+SpringCloud+eureka模拟生产者/消费者实现分布式应用', 'http://www.zuidaima.com//share/4435300160588800.htm', '2019-06-25 12:47:30', null);
INSERT INTO `zui_dai_ma` VALUES ('16', '高仿京东首页', 'http://www.zuidaima.com//share/4430794822405120.htm', '2019-06-25 12:47:30', null);
INSERT INTO `zui_dai_ma` VALUES ('17', 'Java Swing界面优化JComboBox教程', 'http://www.zuidaima.com//share/4429906746903552.htm', '2019-06-25 12:47:30', null);
INSERT INTO `zui_dai_ma` VALUES ('18', 'spring+spring mvc+mybatis开发java医院HR人事管理系统（加强版本+ shiro）', 'http://www.zuidaima.com//share/4428592255880192.htm', '2019-06-25 12:47:30', null);
INSERT INTO `zui_dai_ma` VALUES ('19', 'JavaScript开发单机网页版马里奥小游戏', 'http://www.zuidaima.com//share/4426883118058496.htm', '2019-06-25 12:47:30', null);
INSERT INTO `zui_dai_ma` VALUES ('20', 'java web简单购物车实现', 'http://www.zuidaima.com//share/4426854241192960.htm', '2019-06-25 12:47:30', null);
INSERT INTO `zui_dai_ma` VALUES ('21', 'SpringCloud微服务的项目架构搭建及Springboot应用实例', 'http://www.zuidaima.com//share/4425335793945600.htm', '2019-06-25 12:47:30', null);
INSERT INTO `zui_dai_ma` VALUES ('22', '纯JS开发3D图片旋转相册特效', 'http://www.zuidaima.com//share/4422746866551808.htm', '2019-06-26 09:21:46', null);
INSERT INTO `zui_dai_ma` VALUES ('23', 'bootstrap3开发的健身网站网页模板', 'http://www.zuidaima.com//share/4421382463015936.htm', '2019-06-26 09:21:46', null);
INSERT INTO `zui_dai_ma` VALUES ('24', 'java swing客户端贪吃蛇小游戏', 'http://www.zuidaima.com//share/4421291243817984.htm', '2019-06-26 09:21:46', null);
INSERT INTO `zui_dai_ma` VALUES ('25', 'java servlet+jsp+dbutils开发的简单在线书店小项目，有后台管理系统', 'http://www.zuidaima.com//share/4421218548403200.htm', '2019-06-26 09:21:46', null);
INSERT INTO `zui_dai_ma` VALUES ('26', 'bootstrap实现移动能效酷炫网站管理后台模板', 'http://www.zuidaima.com//share/4419378163518464.htm', '2019-06-26 09:21:46', null);
INSERT INTO `zui_dai_ma` VALUES ('27', 'Java awt实现的类似弹弹堂的小游戏', 'http://www.zuidaima.com//share/4413152156781568.htm', '2019-06-26 09:21:46', null);
INSERT INTO `zui_dai_ma` VALUES ('28', 'springboot2.0+lucene简单demo，实现高亮，全文索引。', 'http://www.zuidaima.com//share/4408806436129792.htm', '2019-06-26 09:21:46', null);
INSERT INTO `zui_dai_ma` VALUES ('29', 'html5实现3D机房效果', 'http://www.zuidaima.com//share/4408175727725568.htm', '2019-06-26 09:21:46', null);
INSERT INTO `zui_dai_ma` VALUES ('30', 'spring boot课程评价系统', 'http://www.zuidaima.com//share/4407000243080192.htm', '2019-06-26 09:21:46', null);
INSERT INTO `zui_dai_ma` VALUES ('31', '分享一个很漂亮的jquery图片滚动预览插件', 'http://www.zuidaima.com//share/4403091171445760.htm', '2019-06-26 09:21:46', null);
INSERT INTO `zui_dai_ma` VALUES ('32', '用于学习的HTML5音乐播放器项目', 'http://www.zuidaima.com//share/4401388727176192.htm', '2019-06-26 09:21:46', null);
INSERT INTO `zui_dai_ma` VALUES ('33', '联动css-tab切换页', 'http://www.zuidaima.com//share/4401255028018176.htm', '2019-06-26 09:21:46', null);
INSERT INTO `zui_dai_ma` VALUES ('34', '基于SpringBoot1.5 + MyBatis + Thymeleaf 开发的个人博客源码分享', 'http://www.zuidaima.com//share/4400420767583232.htm', '2019-06-26 09:21:46', null);
INSERT INTO `zui_dai_ma` VALUES ('35', 'springboot2.0+mybaits-plus+redis+mysql+vue实现用户数据的增删改查简单实例', 'http://www.zuidaima.com//share/4400293622270976.htm', '2019-06-26 09:21:46', null);
INSERT INTO `zui_dai_ma` VALUES ('36', 'JQuery实现搜索数据过滤', 'http://www.zuidaima.com//share/4397392198536192.htm', '2019-06-26 09:21:46', null);
INSERT INTO `zui_dai_ma` VALUES ('37', 'JQuery实现二级菜单特效', 'http://www.zuidaima.com//share/4397383167200256.htm', '2019-06-26 09:21:46', null);
INSERT INTO `zui_dai_ma` VALUES ('38', 'java简单自定义图片爬虫实例', 'http://www.zuidaima.com//share/4396759259909120.htm', '2019-06-26 09:21:46', null);
INSERT INTO `zui_dai_ma` VALUES ('39', '完整的微信小程序商城，包含java web后端管理系统代码，前端代码，小程序代码', 'http://www.zuidaima.com//share/4395641152310272.htm', '2019-06-26 09:21:46', null);
INSERT INTO `zui_dai_ma` VALUES ('40', 'Python2.7+Flask框架实现简单的用户登录注册', 'http://www.zuidaima.com//share/4395472797420544.htm', '2019-06-26 09:21:46', null);
INSERT INTO `zui_dai_ma` VALUES ('41', '纯js+css实现图片轮播效果', 'http://www.zuidaima.com//share/4394469164387328.htm', '2019-06-26 09:21:46', null);
INSERT INTO `zui_dai_ma` VALUES ('42', 'CSMA-CD协议模拟实验（C#）', 'http://www.zuidaima.com//share/4391863420570624.htm', '2019-06-26 11:23:01', null);
INSERT INTO `zui_dai_ma` VALUES ('43', 'android利用SQLite数据库制作简单新增查询小程序', 'http://www.zuidaima.com//share/4388759283584000.htm', '2019-06-26 11:23:01', null);
INSERT INTO `zui_dai_ma` VALUES ('44', 'spring boot+spring mvc+spring整合开发QQ音乐微信小程序（含简单服务端）', 'http://www.zuidaima.com//share/4387580327611392.htm', '2019-06-26 11:23:01', null);
INSERT INTO `zui_dai_ma` VALUES ('45', '基于Java AWT语言的一款精致写字板（功能齐全）', 'http://www.zuidaima.com//share/4386199137127424.htm', '2019-06-26 11:23:01', null);
INSERT INTO `zui_dai_ma` VALUES ('46', 'SpringBoot2.1整合Spring security、jjwt、redis、mybatis-plus基本http请求登录demo', 'http://www.zuidaima.com//share/4385509225958400.htm', '2019-06-26 11:23:01', null);
INSERT INTO `zui_dai_ma` VALUES ('47', 'ssm开发boot客户管理系统（源码+数据库）', 'http://www.zuidaima.com//share/4384525312117760.htm', '2019-06-26 11:23:01', null);
INSERT INTO `zui_dai_ma` VALUES ('48', 'springboot+jpa+bootstrap+mysql用户登录+增删改查 运行环境为IDEA', 'http://www.zuidaima.com//share/4384511242718208.htm', '2019-06-26 11:23:01', null);
INSERT INTO `zui_dai_ma` VALUES ('49', '基于ssm框架开发简单的婚恋相亲网站，包括前台和后台管理系统', 'http://www.zuidaima.com//share/4383383732800512.htm', '2019-06-26 11:23:01', null);
INSERT INTO `zui_dai_ma` VALUES ('50', 'Bootstrap制作简单响应式图书管理系统界面模板', 'http://www.zuidaima.com//share/4382069681196032.htm', '2019-06-26 11:23:01', null);
INSERT INTO `zui_dai_ma` VALUES ('51', '基于Spring+SpringMvc+Mybatis+ Oracle的个人微博发布管理系统', 'http://www.zuidaima.com//share/4379185006545920.htm', '2019-06-26 11:23:01', null);
INSERT INTO `zui_dai_ma` VALUES ('52', 'SSM网上购物商城系统', 'http://www.zuidaima.com//share/4376178347478016.htm', '2019-06-26 11:23:01', null);
INSERT INTO `zui_dai_ma` VALUES ('53', '基于SpringBoot2的java开源个人博客系统', 'http://www.zuidaima.com//share/4373396437158912.htm', '2019-06-26 11:23:01', null);
INSERT INTO `zui_dai_ma` VALUES ('54', 'js实现最酷炫的登录界面', 'http://www.zuidaima.com//share/4371702922644480.htm', '2019-06-26 11:23:01', null);
INSERT INTO `zui_dai_ma` VALUES ('55', 'bootstrap3.7响应式公司网站首页', 'http://www.zuidaima.com//share/4368777201945600.htm', '2019-06-26 11:23:01', null);
INSERT INTO `zui_dai_ma` VALUES ('56', 'java servlet+jsp+jdbc+jstl开发java web简单学生信息管理系统（含模糊查找，分页）', 'http://www.zuidaima.com//share/4366463496588288.htm', '2019-06-26 11:23:01', null);
INSERT INTO `zui_dai_ma` VALUES ('57', 'SpringBoot+Mybatis+SpringSecurity+Bootstrap+Layui开发java web轻量级小巧视频网站系统', 'http://www.zuidaima.com//share/4364636212399104.htm', '2019-06-26 11:23:01', null);
INSERT INTO `zui_dai_ma` VALUES ('58', 'spring mvc maven，websocket在线简单聊天室系统，ace master，extjs', 'http://www.zuidaima.com//share/4363078084381696.htm', '2019-06-26 11:23:01', null);
INSERT INTO `zui_dai_ma` VALUES ('59', 'java实现html网页转excel文件', 'http://www.zuidaima.com//share/4361453447711744.htm', '2019-06-26 11:23:01', null);
INSERT INTO `zui_dai_ma` VALUES ('60', 'java使用JDBC连接数据库的三种方式(JDBC+properties+C3P0)', 'http://www.zuidaima.com//share/4360543235804160.htm', '2019-06-26 11:23:01', null);
INSERT INTO `zui_dai_ma` VALUES ('61', 'bootstrap+jquery后台管理系统模板（不到3m)', 'http://www.zuidaima.com//share/4359074431044608.htm', '2019-06-26 11:23:01', null);
INSERT INTO `zui_dai_ma` VALUES ('82', 'layui企业网站后台管理通用模板', 'http://www.zuidaima.com//share/4193595736165376.htm', '2019-07-03 14:31:34', null);
INSERT INTO `zui_dai_ma` VALUES ('83', '三分钟搭建一个springboot2.0+dubbo多实例分布式项目', 'http://www.zuidaima.com//share/4193319521192960.htm', '2019-07-03 14:31:34', null);
INSERT INTO `zui_dai_ma` VALUES ('84', 'ssm+maven框架简单用户登录跳转页面实例', 'http://www.zuidaima.com//share/4193294789102592.htm', '2019-07-03 14:31:34', null);
INSERT INTO `zui_dai_ma` VALUES ('85', 'bootstrap3开发今日头条网站模板(首页，注册，登录，详情)', 'http://www.zuidaima.com//share/4193214208150528.htm', '2019-07-03 14:31:34', null);
INSERT INTO `zui_dai_ma` VALUES ('86', 'Python 3.6 Tensorflow 1.12.0 Pandas 0.23.4 numpy 1.15.4 scikit-learn 0.20.1 virtualenv16.1.0 Jupyter notebook 5.7.2机器学习分辨三种不同花朵程式', 'http://www.zuidaima.com//share/4191286444067840.htm', '2019-07-03 14:31:34', null);
INSERT INTO `zui_dai_ma` VALUES ('87', '基于layui框架基础上开发的一套轻量级美观个人博客网站模板', 'http://www.zuidaima.com//share/4190771277925376.htm', '2019-07-03 14:31:34', null);
INSERT INTO `zui_dai_ma` VALUES ('88', 'bootstrap炫酷的个人博客网站后台模板', 'http://www.zuidaima.com//share/4190764651547648.htm', '2019-07-03 14:31:34', null);
INSERT INTO `zui_dai_ma` VALUES ('89', '基于Springboot+Mybatis+ SpringMvc+springsecrity+Redis完整网站后台管理系统', 'http://www.zuidaima.com//share/4190712769055744.htm', '2019-07-03 14:31:34', null);
INSERT INTO `zui_dai_ma` VALUES ('90', 'Springboot+Mybatis-plus+ SpringMvc+Shiro+Redis企业级报表后台管理系统', 'http://www.zuidaima.com//share/4190698029845504.htm', '2019-07-03 14:31:34', null);
INSERT INTO `zui_dai_ma` VALUES ('91', 'js实现3D酷炫魔方图片展示', 'http://www.zuidaima.com//share/4189460770327552.htm', '2019-07-03 14:31:34', null);
INSERT INTO `zui_dai_ma` VALUES ('92', 'SMB协议、FTP协议方式下载及删除远程服务器文件', 'http://www.zuidaima.com//share/4187601638919168.htm', '2019-07-03 14:31:34', null);
INSERT INTO `zui_dai_ma` VALUES ('93', 'java爬虫实现之httpClient4.5.2 抓取时时彩历史数据然后实现自动出号功能', 'http://www.zuidaima.com//share/4187376981265408.htm', '2019-07-03 14:31:34', null);
INSERT INTO `zui_dai_ma` VALUES ('94', 'c#语言实现MES设备对接（解析LOG方式）', 'http://www.zuidaima.com//share/4186453734607872.htm', '2019-07-03 14:31:34', null);
INSERT INTO `zui_dai_ma` VALUES ('95', '基于java servlet+jsp+javascript实现的简易聊天系统', 'http://www.zuidaima.com//share/4186027613572096.htm', '2019-07-03 14:31:34', null);
INSERT INTO `zui_dai_ma` VALUES ('96', '使用aop进行多数据源切换 springMVC+spring+mybatis增删改查的使用', 'http://www.zuidaima.com//share/4185244523072512.htm', '2019-07-03 14:31:34', null);
INSERT INTO `zui_dai_ma` VALUES ('97', '大型游戏网站模板+bootstrap响应式布局', 'http://www.zuidaima.com//share/4184819965266944.htm', '2019-07-03 14:31:34', null);
INSERT INTO `zui_dai_ma` VALUES ('98', 'JSP+servlet实现简单的java web物流后台管理系统', 'http://www.zuidaima.com//share/4183072829623296.htm', '2019-07-03 14:31:34', null);
INSERT INTO `zui_dai_ma` VALUES ('99', 'java servlet +jsp+mysql Ajax +easyui+jQuery整合开发学生成绩管理系统', 'http://www.zuidaima.com//share/4182051991292928.htm', '2019-07-03 14:31:34', null);
INSERT INTO `zui_dai_ma` VALUES ('100', '运用NoSQL数据库的学生成绩管理系统，采用Java Swing', 'http://www.zuidaima.com//share/4180533414005760.htm', '2019-07-03 14:31:34', null);
INSERT INTO `zui_dai_ma` VALUES ('101', 'SSM开发网站考试平台管理系统，SSM+MAVEN初学者必备', 'http://www.zuidaima.com//share/4179467800038400.htm', '2019-07-03 14:31:34', null);
INSERT INTO `zui_dai_ma` VALUES ('102', 'python利用第三方库turtle绘制蟒蛇动图', 'http://www.zuidaima.com//share/4226927049395200.htm', '2019-07-03 14:58:48', null);
INSERT INTO `zui_dai_ma` VALUES ('103', 'python温度转换实例-华氏度转换摄氏度，摄氏度转换华氏度', 'http://www.zuidaima.com//share/4225526828731392.htm', '2019-07-03 14:58:48', null);
INSERT INTO `zui_dai_ma` VALUES ('104', 'java swing图书馆管理系统-管理员操作和学生借还书', 'http://www.zuidaima.com//share/4222699961633792.htm', '2019-07-03 14:58:48', null);
INSERT INTO `zui_dai_ma` VALUES ('105', 'jsp+servlet+easyUI+jquery+echarts开发高速公路事故后台信息管理系统', 'http://www.zuidaima.com//share/4222653537913856.htm', '2019-07-03 14:58:48', null);
INSERT INTO `zui_dai_ma` VALUES ('106', 'SSM+Lucene+logback+Druid开发的Java开源博客系统源码', 'http://www.zuidaima.com//share/4221813439712256.htm', '2019-07-03 14:58:48', null);
INSERT INTO `zui_dai_ma` VALUES ('107', 'springboot-rabbitmq整合(rabbitmq的四种交换器演示、延时队列演示)', 'http://www.zuidaima.com//share/4221712384297984.htm', '2019-07-03 14:58:48', null);
INSERT INTO `zui_dai_ma` VALUES ('108', 'jquery+layui+bootstrap+dhtmlxgantt开发任务进度处理的gantt图示例', 'http://www.zuidaima.com//share/4221442490403840.htm', '2019-07-03 14:58:48', null);
INSERT INTO `zui_dai_ma` VALUES ('109', 'spring boot+apache shiro+mybatis+bootstrap+jquery开发文件上传下载后台管理系统,支持视频在线播放', 'http://www.zuidaima.com//share/4221280555830272.htm', '2019-07-03 14:58:48', null);
INSERT INTO `zui_dai_ma` VALUES ('110', 'kafka模拟生产者消费者(集群模式)实例', 'http://www.zuidaima.com//share/4218728927267840.htm', '2019-07-03 14:58:48', null);
INSERT INTO `zui_dai_ma` VALUES ('111', 'java swing实现小商店超市进销存客户端', 'http://www.zuidaima.com//share/4210337336986624.htm', '2019-07-03 14:58:48', null);
INSERT INTO `zui_dai_ma` VALUES ('112', 'SSM+bootstrap+jquery+maven编写的进存销后台管理系统', 'http://www.zuidaima.com//share/4208858087345152.htm', '2019-07-03 14:58:48', null);
INSERT INTO `zui_dai_ma` VALUES ('113', 'jQuery网页验证码插件', 'http://www.zuidaima.com//share/4208508438023168.htm', '2019-07-03 14:58:48', null);
INSERT INTO `zui_dai_ma` VALUES ('114', '分享一个font-awesome css开发的万能网页手机模板，自己删除区域，可以做文章，博客', 'http://www.zuidaima.com//share/4207724936563712.htm', '2019-07-03 14:58:48', null);
INSERT INTO `zui_dai_ma` VALUES ('115', 'SSM开发客户关系管理系统', 'http://www.zuidaima.com//share/4205718851767296.htm', '2019-07-03 14:58:48', null);
INSERT INTO `zui_dai_ma` VALUES ('116', '基于java swing的局域网五子棋对战游戏', 'http://www.zuidaima.com//share/4204659936922624.htm', '2019-07-03 14:58:48', null);
INSERT INTO `zui_dai_ma` VALUES ('117', 'java swing编写的俄罗斯方块简单游戏', 'http://www.zuidaima.com//share/4203485234695168.htm', '2019-07-03 14:58:48', null);
INSERT INTO `zui_dai_ma` VALUES ('118', 'java调用C程序转换spe录音文件为可播放的wav格式以及XML文件', 'http://www.zuidaima.com//share/4202944350751744.htm', '2019-07-03 14:58:48', null);
INSERT INTO `zui_dai_ma` VALUES ('119', 'python语言编写，使用scrapy框架实现淘宝商品信息爬虫程序', 'http://www.zuidaima.com//share/4198981131029504.htm', '2019-07-03 14:58:48', null);
INSERT INTO `zui_dai_ma` VALUES ('120', '基于Spring Boot、Spring Cloud、Spring Oauth2 和 Spring Cloud Netflix 等框架构建的微服务项目', 'http://www.zuidaima.com//share/4196565265304576.htm', '2019-07-03 14:58:48', null);
INSERT INTO `zui_dai_ma` VALUES ('121', '基于php开发昆山即魅化妆品公司网上商城系统，包括后台管理', 'http://www.zuidaima.com//share/4196259202911232.htm', '2019-07-03 14:58:48', null);
INSERT INTO `zui_dai_ma` VALUES ('122', 'Nodejs图片偷盗者--简易版爬虫系统', 'http://www.zuidaima.com//share/4251340393909248.htm', '2019-07-03 15:03:56', null);
INSERT INTO `zui_dai_ma` VALUES ('123', 'JFinal-layui极速开发企业应用系统', 'http://www.zuidaima.com//share/4248138201795584.htm', '2019-07-03 15:03:56', null);
INSERT INTO `zui_dai_ma` VALUES ('124', 'spring mvc+hibernate+jsp开发图书馆后台管理系统', 'http://www.zuidaima.com//share/4247503098170368.htm', '2019-07-03 15:03:56', null);
INSERT INTO `zui_dai_ma` VALUES ('125', 'html5,css3,jquery响应式的图文资讯博客网站模板', 'http://www.zuidaima.com//share/4244768150686720.htm', '2019-07-03 15:03:56', null);
INSERT INTO `zui_dai_ma` VALUES ('126', 'servlet+jdbc实现的java web图书馆借阅管理平台', 'http://www.zuidaima.com//share/4242440545029120.htm', '2019-07-03 15:03:56', null);
INSERT INTO `zui_dai_ma` VALUES ('127', 'java控制台图书馆管理系统', 'http://www.zuidaima.com//share/4239703311535104.htm', '2019-07-03 15:03:56', null);
INSERT INTO `zui_dai_ma` VALUES ('128', 'python圆周率的计算', 'http://www.zuidaima.com//share/4238519776644096.htm', '2019-07-03 15:03:56', null);
INSERT INTO `zui_dai_ma` VALUES ('129', 'spring+spring mvc+hibernate开发工程财务管理辅助系统', 'http://www.zuidaima.com//share/4238345894398976.htm', '2019-07-03 15:03:56', null);
INSERT INTO `zui_dai_ma` VALUES ('130', '纯html+css+jquery制作唯美自动轮播图特效', 'http://www.zuidaima.com//share/4238275664825344.htm', '2019-07-03 15:03:56', null);
INSERT INTO `zui_dai_ma` VALUES ('131', '基于JSP+Bootstrap+Jquery开发的图书管理系统,可做java web毕设或实训作业', 'http://www.zuidaima.com//share/4238267419364352.htm', '2019-07-03 15:03:56', null);
INSERT INTO `zui_dai_ma` VALUES ('132', 'SpringBoot+Security实现sso单点登录项目实例', 'http://www.zuidaima.com//share/4237186845789184.htm', '2019-07-03 15:03:56', null);
INSERT INTO `zui_dai_ma` VALUES ('133', 'ssm+shiro+maven带权限人力资源管理系统', 'http://www.zuidaima.com//share/4237134647659520.htm', '2019-07-03 15:03:56', null);
INSERT INTO `zui_dai_ma` VALUES ('134', 'Spring Boot中Cache缓存的使用', 'http://www.zuidaima.com//share/4231567892990976.htm', '2019-07-03 15:03:56', null);
INSERT INTO `zui_dai_ma` VALUES ('135', 'JSP聊天室2.0版', 'http://www.zuidaima.com//share/4231553635486720.htm', '2019-07-03 15:03:56', null);
INSERT INTO `zui_dai_ma` VALUES ('136', '纯html+css+jquery制作模拟书架图册特效', 'http://www.zuidaima.com//share/4230017716210688.htm', '2019-07-03 15:03:56', null);
INSERT INTO `zui_dai_ma` VALUES ('137', 'React 全栈项目:招聘网站（react+react-router-dom+redux+react-redux+redux-thunk+axios ）', 'http://www.zuidaima.com//share/4229180651211776.htm', '2019-07-03 15:03:56', null);
INSERT INTO `zui_dai_ma` VALUES ('138', '最新架构（KotLin+Retrofit2+RxJava2+MVP）基础框架搭建实例，直接可以使用', 'http://www.zuidaima.com//share/4229156773694464.htm', '2019-07-03 15:03:56', null);
INSERT INTO `zui_dai_ma` VALUES ('139', 'pythonBMI身体质量指数', 'http://www.zuidaima.com//share/4228794802162688.htm', '2019-07-03 15:03:56', null);
INSERT INTO `zui_dai_ma` VALUES ('140', '纯html+css+jquery制作浪漫雪花动态纷飞特效', 'http://www.zuidaima.com//share/4228739479260160.htm', '2019-07-03 15:03:56', null);
INSERT INTO `zui_dai_ma` VALUES ('141', 'python天天向上的力量', 'http://www.zuidaima.com//share/4227109908974592.htm', '2019-07-03 15:03:56', null);
INSERT INTO `zui_dai_ma` VALUES ('142', 'Nodejs图片偷盗者--简易版爬虫系统', 'http://www.zuidaima.com//share/4251340393909248.htm', '2019-07-03 15:44:55', null);
INSERT INTO `zui_dai_ma` VALUES ('143', 'JFinal-layui极速开发企业应用系统', 'http://www.zuidaima.com//share/4248138201795584.htm', '2019-07-03 15:44:55', null);
INSERT INTO `zui_dai_ma` VALUES ('144', 'spring mvc+hibernate+jsp开发图书馆后台管理系统', 'http://www.zuidaima.com//share/4247503098170368.htm', '2019-07-03 15:44:55', null);
INSERT INTO `zui_dai_ma` VALUES ('145', 'html5,css3,jquery响应式的图文资讯博客网站模板', 'http://www.zuidaima.com//share/4244768150686720.htm', '2019-07-03 15:44:55', null);
INSERT INTO `zui_dai_ma` VALUES ('146', 'servlet+jdbc实现的java web图书馆借阅管理平台', 'http://www.zuidaima.com//share/4242440545029120.htm', '2019-07-03 15:44:55', null);
INSERT INTO `zui_dai_ma` VALUES ('147', 'java控制台图书馆管理系统', 'http://www.zuidaima.com//share/4239703311535104.htm', '2019-07-03 15:44:55', null);
INSERT INTO `zui_dai_ma` VALUES ('148', 'python圆周率的计算', 'http://www.zuidaima.com//share/4238519776644096.htm', '2019-07-03 15:44:55', null);
INSERT INTO `zui_dai_ma` VALUES ('149', 'spring+spring mvc+hibernate开发工程财务管理辅助系统', 'http://www.zuidaima.com//share/4238345894398976.htm', '2019-07-03 15:44:55', null);
INSERT INTO `zui_dai_ma` VALUES ('150', '纯html+css+jquery制作唯美自动轮播图特效', 'http://www.zuidaima.com//share/4238275664825344.htm', '2019-07-03 15:44:55', null);
INSERT INTO `zui_dai_ma` VALUES ('151', '基于JSP+Bootstrap+Jquery开发的图书管理系统,可做java web毕设或实训作业', 'http://www.zuidaima.com//share/4238267419364352.htm', '2019-07-03 15:44:55', null);
INSERT INTO `zui_dai_ma` VALUES ('152', 'SpringBoot+Security实现sso单点登录项目实例', 'http://www.zuidaima.com//share/4237186845789184.htm', '2019-07-03 15:44:55', null);
INSERT INTO `zui_dai_ma` VALUES ('153', 'ssm+shiro+maven带权限人力资源管理系统', 'http://www.zuidaima.com//share/4237134647659520.htm', '2019-07-03 15:44:55', null);
INSERT INTO `zui_dai_ma` VALUES ('154', 'Spring Boot中Cache缓存的使用', 'http://www.zuidaima.com//share/4231567892990976.htm', '2019-07-03 15:44:55', null);
INSERT INTO `zui_dai_ma` VALUES ('155', 'JSP聊天室2.0版', 'http://www.zuidaima.com//share/4231553635486720.htm', '2019-07-03 15:44:55', null);
INSERT INTO `zui_dai_ma` VALUES ('156', '纯html+css+jquery制作模拟书架图册特效', 'http://www.zuidaima.com//share/4230017716210688.htm', '2019-07-03 15:44:55', null);
INSERT INTO `zui_dai_ma` VALUES ('157', 'React 全栈项目:招聘网站（react+react-router-dom+redux+react-redux+redux-thunk+axios ）', 'http://www.zuidaima.com//share/4229180651211776.htm', '2019-07-03 15:44:55', null);
INSERT INTO `zui_dai_ma` VALUES ('158', '最新架构（KotLin+Retrofit2+RxJava2+MVP）基础框架搭建实例，直接可以使用', 'http://www.zuidaima.com//share/4229156773694464.htm', '2019-07-03 15:44:55', null);
INSERT INTO `zui_dai_ma` VALUES ('159', 'pythonBMI身体质量指数', 'http://www.zuidaima.com//share/4228794802162688.htm', '2019-07-03 15:44:55', null);
INSERT INTO `zui_dai_ma` VALUES ('160', '纯html+css+jquery制作浪漫雪花动态纷飞特效', 'http://www.zuidaima.com//share/4228739479260160.htm', '2019-07-03 15:44:55', null);
INSERT INTO `zui_dai_ma` VALUES ('161', 'python天天向上的力量', 'http://www.zuidaima.com//share/4227109908974592.htm', '2019-07-03 15:44:55', null);
INSERT INTO `zui_dai_ma` VALUES ('162', 'ssh实现用户管理系统的增删改查', 'http://www.zuidaima.com//share/4292085977926656.htm', '2019-07-03 16:14:33', null);
INSERT INTO `zui_dai_ma` VALUES ('163', 'ssm高仿beatport.com在线音乐网网站', 'http://www.zuidaima.com//share/4291064155851776.htm', '2019-07-03 16:14:33', null);
INSERT INTO `zui_dai_ma` VALUES ('164', 'springBoot+mybatis+vue+html5+apacheFTP+element-ui+layui实现页面多附件上传FTP服务器、下载及文件预览', 'http://www.zuidaima.com//share/4289587451481088.htm', '2019-07-03 16:14:33', null);
INSERT INTO `zui_dai_ma` VALUES ('165', 'Java代码在线编译运行项目实例', 'http://www.zuidaima.com//share/4289301240056832.htm', '2019-07-03 16:14:33', null);
INSERT INTO `zui_dai_ma` VALUES ('166', 'C#监控服务器上软件', 'http://www.zuidaima.com//share/4288214556068864.htm', '2019-07-03 16:14:33', null);
INSERT INTO `zui_dai_ma` VALUES ('167', '微信计算器小程序项目实例', 'http://www.zuidaima.com//share/4286702876855296.htm', '2019-07-03 16:14:33', null);
INSERT INTO `zui_dai_ma` VALUES ('168', 'python地图化展示实例-政府工作报告', 'http://www.zuidaima.com//share/4283995953155072.htm', '2019-07-03 16:14:33', null);
INSERT INTO `zui_dai_ma` VALUES ('169', 'python实现贪吃蛇小游戏', 'http://www.zuidaima.com//share/4283809809796096.htm', '2019-07-03 16:14:33', null);
INSERT INTO `zui_dai_ma` VALUES ('170', 'python画笑脸图案', 'http://www.zuidaima.com//share/4282471728450560.htm', '2019-07-03 16:14:33', null);
INSERT INTO `zui_dai_ma` VALUES ('171', '适合前端小白练手的布局页面html+css+js', 'http://www.zuidaima.com//share/4282150010948608.htm', '2019-07-03 16:14:33', null);
INSERT INTO `zui_dai_ma` VALUES ('172', 'ssm+shiro+layui+easyui实现的后台权限管理系统', 'http://www.zuidaima.com//share/4281061660298240.htm', '2019-07-03 16:14:33', null);
INSERT INTO `zui_dai_ma` VALUES ('173', 'jquery图片百叶窗跳转网页特效', 'http://www.zuidaima.com//share/4280804625419264.htm', '2019-07-03 16:14:33', null);
INSERT INTO `zui_dai_ma` VALUES ('174', 'ssm+easyui实现学生信息增删改查及分页查询,搜索简单实例', 'http://www.zuidaima.com//share/4279607742548992.htm', '2019-07-03 16:14:33', null);
INSERT INTO `zui_dai_ma` VALUES ('175', '教你怎么通过java脚本下载QQ付费音乐', 'http://www.zuidaima.com//share/4278161428040704.htm', '2019-07-03 16:14:33', null);
INSERT INTO `zui_dai_ma` VALUES ('176', '基于Java Web的图书销售管理系统', 'http://www.zuidaima.com//share/4276988476623872.htm', '2019-07-03 16:14:33', null);
INSERT INTO `zui_dai_ma` VALUES ('177', '基于SSM框架开发的CRM系统', 'http://www.zuidaima.com//share/4274203982826496.htm', '2019-07-03 16:14:33', null);
INSERT INTO `zui_dai_ma` VALUES ('178', 'java使用JDBC连接MySQL数据库操作电子图书增删改查项目实例', 'http://www.zuidaima.com//share/4263935074520064.htm', '2019-07-03 16:14:33', null);
INSERT INTO `zui_dai_ma` VALUES ('179', '一套Bootstrap简洁、直观的CMS后台管理系统模板', 'http://www.zuidaima.com//share/4263801373936640.htm', '2019-07-03 16:14:33', null);
INSERT INTO `zui_dai_ma` VALUES ('180', 'python七段数码管绘制时间', 'http://www.zuidaima.com//share/4262723260910592.htm', '2019-07-03 16:14:33', null);
INSERT INTO `zui_dai_ma` VALUES ('181', 'Jfinal开发农副产品电子商城系统，完整前后台系统', 'http://www.zuidaima.com//share/4256722733435904.htm', '2019-07-03 16:14:33', null);
INSERT INTO `zui_dai_ma` VALUES ('182', 'ssh实现用户管理系统的增删改查', 'http://www.zuidaima.com//share/4292085977926656.htm', '2019-07-03 16:22:44', null);
INSERT INTO `zui_dai_ma` VALUES ('183', 'ssm高仿beatport.com在线音乐网网站', 'http://www.zuidaima.com//share/4291064155851776.htm', '2019-07-03 16:22:44', null);
INSERT INTO `zui_dai_ma` VALUES ('184', 'springBoot+mybatis+vue+html5+apacheFTP+element-ui+layui实现页面多附件上传FTP服务器、下载及文件预览1', 'http://www.zuidaima.com//share/4289587451481088.htm', '2019-08-28 02:19:53', '2019-08-28 10:19:54');
INSERT INTO `zui_dai_ma` VALUES ('185', 'Java代码在线编译运行项目实例', 'http://www.zuidaima.com//share/4289301240056832.htm', '2019-07-03 16:22:44', null);
INSERT INTO `zui_dai_ma` VALUES ('186', 'C#监控服务器上软件', 'http://www.zuidaima.com//share/4288214556068864.htm', '2019-07-03 16:22:44', null);
INSERT INTO `zui_dai_ma` VALUES ('187', '微信计算器小程序项目实例', 'http://www.zuidaima.com//share/4286702876855296.htm', '2019-07-03 16:22:44', null);
INSERT INTO `zui_dai_ma` VALUES ('188', 'python地图化展示实例-政府工作报告', 'http://www.zuidaima.com//share/4283995953155072.htm', '2019-07-03 16:22:44', null);
INSERT INTO `zui_dai_ma` VALUES ('189', 'python实现贪吃蛇小游戏', 'http://www.zuidaima.com//share/4283809809796096.htm', '2019-07-03 16:22:44', null);
INSERT INTO `zui_dai_ma` VALUES ('190', 'python画笑脸图案', 'http://www.zuidaima.com//share/4282471728450560.htm', '2019-07-03 16:22:44', null);
INSERT INTO `zui_dai_ma` VALUES ('191', '适合前端小白练手的布局页面html+css+js', 'http://www.zuidaima.com//share/4282150010948608.htm', '2019-07-03 16:22:44', null);
INSERT INTO `zui_dai_ma` VALUES ('192', 'ssm+shiro+layui+easyui实现的后台权限管理系统', 'http://www.zuidaima.com//share/4281061660298240.htm', '2019-07-03 16:22:44', null);
INSERT INTO `zui_dai_ma` VALUES ('193', 'jquery图片百叶窗跳转网页特效', 'http://www.zuidaima.com//share/4280804625419264.htm', '2019-07-03 16:22:44', null);
INSERT INTO `zui_dai_ma` VALUES ('194', 'ssm+easyui实现学生信息增删改查及分页查询,搜索简单实例', 'http://www.zuidaima.com//share/4279607742548992.htm', '2019-07-03 16:22:44', null);
INSERT INTO `zui_dai_ma` VALUES ('195', '教你怎么通过java脚本下载QQ付费音乐', 'http://www.zuidaima.com//share/4278161428040704.htm', '2019-07-03 16:22:44', null);
INSERT INTO `zui_dai_ma` VALUES ('196', '基于Java Web的图书销售管理系统', 'http://www.zuidaima.com//share/4276988476623872.htm', '2019-07-03 16:22:44', null);
INSERT INTO `zui_dai_ma` VALUES ('197', '基于SSM框架开发的CRM系统', 'http://www.zuidaima.com//share/4274203982826496.htm', '2019-07-03 16:22:44', null);
INSERT INTO `zui_dai_ma` VALUES ('198', 'java使用JDBC连接MySQL数据库操作电子图书增删改查项目实例', 'http://www.zuidaima.com//share/4263935074520064.htm', '2019-07-03 16:22:44', null);
INSERT INTO `zui_dai_ma` VALUES ('199', '一套Bootstrap简洁、直观的CMS后台管理系统模板', 'http://www.zuidaima.com//share/4263801373936640.htm', '2019-07-03 16:22:44', null);
INSERT INTO `zui_dai_ma` VALUES ('200', 'python七段数码管绘制时间', 'http://www.zuidaima.com//share/4262723260910592.htm', '2019-07-03 16:22:44', null);
INSERT INTO `zui_dai_ma` VALUES ('201', 'Jfinal开发农副产品电子商城系统，完整前后台系统', 'http://www.zuidaima.com//share/4256722733435904.htm', '2019-07-03 16:22:44', null);
INSERT INTO `zui_dai_ma` VALUES ('207', 'Java后端管理系统(Spring+SpringMVC+SpringDataJPA+EasyUI+H-ui.admin+layui+Maven)', 'http://www.zuidaima.com//share/4325426473749504.htm', '2019-07-03 16:53:48', null);
INSERT INTO `zui_dai_ma` VALUES ('208', 'Java Swing实现电影购票系统项目', 'http://www.zuidaima.com//share/4324685148654592.htm', '2019-07-03 16:53:48', null);
INSERT INTO `zui_dai_ma` VALUES ('209', 'spring+springmvc+mybatis案例实现用户登录注册功能', 'http://www.zuidaima.com//share/4322194079861760.htm', '2019-07-03 16:53:48', null);
INSERT INTO `zui_dai_ma` VALUES ('210', '基于（SpringMVC + Spring + Mybatis + Shiro + Bootstrap）开发的ssm教务后台管理系统123', 'http://www.zuidaima.com//share/4322092547017728.htm', null, '2019-08-28 10:05:05');
INSERT INTO `zui_dai_ma` VALUES ('211', 'spring boot整合spring mvc+mybatis实现用户注册功能', 'http://www.zuidaima.com//share/4321928243973120.htm', '2019-07-03 16:53:48', null);
INSERT INTO `zui_dai_ma` VALUES ('212', '微博动漫微信小程序实例', 'http://www.zuidaima.com//share/4320800790694912.htm', '2019-07-03 16:53:48', null);
INSERT INTO `zui_dai_ma` VALUES ('213', 'struts2+jsp开发java web简易在线聊天室系统(不链接数据库)', 'http://www.zuidaima.com//share/4320643610676224.htm', '2019-07-03 16:53:48', null);
INSERT INTO `zui_dai_ma` VALUES ('214', 'jquery自动播放心形图片特效123', 'http://www.zuidaima.com//share/4320566474574848.htm', '2019-08-28 02:20:10', '2019-08-28 10:20:11');
INSERT INTO `zui_dai_ma` VALUES ('215', 'ThinkPHP TP5最新框架MVC结构图书馆管理系统', 'http://www.zuidaima.com//share/4316892950334464.htm', '2019-07-03 16:53:48', null);
INSERT INTO `zui_dai_ma` VALUES ('216', 'python实现微信自动回复', 'http://www.zuidaima.com//share/4314858691283968.htm', '2019-07-03 16:53:48', null);
INSERT INTO `zui_dai_ma` VALUES ('217', 'SpringBoot+Mybatis+Vue+Element-ui+layui+layer+axios搭建的成熟后台管理模板框架实现简单的页面增删改查，适合初学者积累学习', 'http://www.zuidaima.com//share/4311749468621824.htm', '2019-07-03 16:53:48', null);
INSERT INTO `zui_dai_ma` VALUES ('218', 'php+mysql开发医疗患者挂号系统', 'http://www.zuidaima.com//share/4308977430563840.htm', '2019-07-03 16:53:48', null);
INSERT INTO `zui_dai_ma` VALUES ('219', 'Javascript实现疯狂坦克大战网页版游戏源代码下载', 'http://www.zuidaima.com//share/4305604174810112.htm', '2019-07-03 16:53:48', null);
INSERT INTO `zui_dai_ma` VALUES ('220', 'python爬取前程无忧招聘网站数据及可视化分析', 'http://www.zuidaima.com//share/4304141939805184.htm', '2019-07-03 16:53:48', null);
INSERT INTO `zui_dai_ma` VALUES ('221', '简单的HTML+CSS运用（三国百科）', 'http://www.zuidaima.com//share/4301147242859520.htm', '2019-07-03 16:53:48', null);
INSERT INTO `zui_dai_ma` VALUES ('226', '234', '324', '2019-08-27 16:05:30', '2019-08-27 16:05:30');
INSERT INTO `zui_dai_ma` VALUES ('230', '莫哦哦123', '123213aa', null, '2019-08-28 10:04:06');
INSERT INTO `zui_dai_ma` VALUES ('232', '科比', '11', '2019-08-28 02:11:17', '2019-08-28 10:11:19');
INSERT INTO `zui_dai_ma` VALUES ('233', '欧文', '11', '2019-08-28 02:13:31', '2019-08-28 10:13:32');
SET FOREIGN_KEY_CHECKS=1;
