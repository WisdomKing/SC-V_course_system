/*----test 测试---------------------------------------------------*/
drop table if exists `test`;
create table `test`(
   `id` int(4) not null comment 'id',
   `name` varchar(50) comment '名称',
   primary key (`id`)
)engine=innodb default charset=utf8mb4 comment ='测试';
insert into `test` (`id`,`name`)value (1001,'测试');
insert into `test` (`id`,`name`)value (2,'测试2');

/*----announcement 公告---------------------------------------------------*/

DROP TABLE IF EXISTS `announcement`;
CREATE TABLE `announcement`  (
    `ID` varchar(8) NOT NULL COMMENT 'ID',
    `AnnouncementTitle` varchar(20)  NOT NULL COMMENT '公告标题',
    `AnnouncementType` char(3) NOT NULL COMMENT '公告类型',
    `BeginTime` varchar(10) NOT NULL COMMENT '开始时间',
    `EndingTime` varchar(10) NOT NULL COMMENT '结束时间',
    `Details` varchar(100) NOT NULL COMMENT '详情',
    primary key (`ID`)
) ENGINE = InnoDB DEFAULT CHARSET =utf8mb4 COMMENT ='公告';

INSERT INTO `announcement` VALUES ('10012333', '2333', 'ALL', '2021-02-01', '2021-02-11', '红红火火恍恍惚惚');
INSERT INTO `announcement` VALUES ('10012337', '报工开放时间延长结束通知', 'ALL', '2021-02-08', '2021-02-10', '大家好！因本月情况特殊，报工系统开放时间延长至一个月，将于本月28号恢复正常，望大家周知！！！');
INSERT INTO `announcement` VALUES ('9Ce7MH01', '报工开放时间延长结束通知', 'ALL', '2021-02-08', '2021-02-18', '关于做好节后复工复产的安排');
INSERT INTO `announcement` VALUES ('9Ce7MH03','00010002','ALL','2021-02-18','2021-03-03','test02');
INSERT INTO `announcement` VALUES ('9Ce7MH04','00010003','ALL','2021-02-18','2021-03-03','test03');
INSERT INTO `announcement` VALUES ('9Ce7MH05','00010004','ALL','2021-02-18','2021-03-03','test04');
INSERT INTO `announcement` VALUES ('9Ce7MH06','00010005','ALL','2021-02-18','2021-03-03','test05');
INSERT INTO `announcement` VALUES ('9Ce7MH07','00010006','ALL','2021-02-18','2021-03-03','test06');
INSERT INTO `announcement` VALUES ('9Ce7MH08','00010007','ALL','2021-02-18','2021-03-03','test07');
INSERT INTO `announcement` VALUES ('9Ce7MH09','00010008','ALL','2021-02-18','2021-03-03','test08');

/*----clockin 报工---------------------------------------------------*/

DROP TABLE IF EXISTS `clockin`;
CREATE TABLE `clockin` (
    `ID` varchar(8)  NOT NULL COMMENT 'ID',
    `ProjectName` varchar(50)  NOT NULL COMMENT '项目名称',
    `Manhour_Type` char(1)  NOT NULL COMMENT '工时类型|Delivery("D","交付项目"),Presale("P","售前项目"),Research("R","研发项目"),Inside("I","内部项目"),',
    `Manhour` varchar(20)  NOT NULL COMMENT '工时',
    `Delayed` varchar(20)  COMMENT '延时',
    `WorkLog` varchar(100)  NOT NULL COMMENT '工作日志',
    `Status` char(1) COMMENT '状态|Approved("A","已审批"),Rejected("R","已拒绝"),Commit("C","已提交"),Saved("S","已保存"),Other("O","未报工")',
    `ClockIn_time` DATETIME(0) NOT NULL COMMENT '报工时间',
    primary key (`ID`)

) ENGINE = InnoDB DEFAULT CHARSET =utf8mb4 COMMENT ='报工';

INSERT INTO `clockin` VALUES ('9Ce7MH02','F-20-1569_2020富邦华一银行外籍薪资购汇项目', 'D', '8', '2', 'U享存补签', 'A', '2021-02-08 14:45:39');

/*----employeeinfo 员工信息---------------------------------------------------*/

DROP TABLE IF EXISTS `employeeinfo`;
CREATE TABLE `employeeinfo`  (
    `id` int NOT NULL AUTO_INCREMENT COMMENT 'ID',
#     `id` varchar(8)  NOT NULL COMMENT 'ID',
    `name` varchar(20) NOT NULL COMMENT '姓名',
    `job_num` varchar(5) NOT NULL COMMENT '工号',
    `base` char(2) NOT NULL COMMENT '归属公司|Beijing("BJ","北京"),Shanghai("SH","上海"),Guangzhou("GZ","广州"),Shenzhen("SZ","深圳"),Hangzhou("HZ","杭州"),Chengdu("CD","成都"),Wuhan("WH","武汉"),Xian("XA","西安"),Nanjing("NJ","南京"),Changsha("CS","长沙"),Nanchang("NC","南昌"),Xiamen("XM","厦门")  ,Dalian("DL","大连")',
    `companyEmail` varchar(50) NOT NULL COMMENT '企业邮箱',
    `dependence_Dep` varchar(20) NOT NULL COMMENT '所属部门',
    `superiorDep` varchar(20)  COMMENT '上级部门',
    `position` varchar(20) NOT NULL COMMENT '职位',
    `dep_Director` varchar(20) COMMENT '部门总监',
    `entry_Time` DATETIME(0) NOT NULL COMMENT '入职时间',
    `entry_Type` char(1) COMMENT '入职方式|Xiaozhao("X","校招"),Shezhao("S","社招")',
    `entry_Address` char(2) NOT NULL COMMENT '入职地点|Beijing("BJ","北京"),Shanghai("SH","上海"),Guangzhou("GZ","广州"),Shenzhen("SZ","深圳"),Hangzhou("HZ","杭州"),Chengdu("CD","成都"),Wuhan("WH","武汉"),Xian("XA","西安"),Nanjing("NJ","南京"),Changsha("CS","长沙"),Nanchang("NC","南昌"),Xiamen("XM","厦门")  ,Dalian("DL","大连")',
    `internshipBegin` DATETIME(0) COMMENT '实习起始日',
    `internshipEnding` DATETIME(0) COMMENT '实习到期日',
    `conversionReg_Time` DATETIME(0) COMMENT '转正日期',
    `contractSigning` DATETIME(0) COMMENT '合同签订日',
    `contractEnding` DATETIME(0) COMMENT '合同截止日',
    `probationExp_date` DATETIME(0) COMMENT '试用到期日',
    `employeeStatus` char(3) COMMENT '人员状态',
    `contractRenew` varchar(20) COMMENT '合同续签',
    `welfareArea` varchar(20) COMMENT '福利地区|Beijing("BJ","北京"),Shanghai("SH","上海"),Guangzhou("GZ","广州"),Shenzhen("SZ","深圳"),Hangzhou("HZ","杭州"),Chengdu("CD","成都"),Wuhan("WH","武汉"),Xian("XA","西安"),Nanjing("NJ","南京"),Changsha("CS","长沙"),Nanchang("NC","南昌"),Xiamen("XM","厦门")  ,Dalian("DL","大连")',
    `myRole` char(3) COMMENT '我的角色',
    `employeeCCC` varchar(20) COMMENT '员工CCC',
    `comment` varchar(50) COMMENT '备注',
    primary key (`id`)
) ENGINE = InnoDB DEFAULT CHARSET =utf8mb4 COMMENT ='员工信息';

INSERT INTO `employeeinfo` VALUES ('00010001','秦风', '13901', 'SH', 'qinfeng@xxxx.com.cn', '蚂蚁', '蚂蚁事业部', '实习JAVA开发工程师', '向川', '2020-11-30 00:00:00', 'X', 'SH', '2020-11-30 00:00:00', '2021-06-30 00:00:00', NULL, NULL, NULL, NULL, '实习', NULL, 'SH', 'ALL', '5010208018', NULL);
INSERT INTO `employeeinfo` VALUES ('00010002','张珊', '13902', 'SH', 'zhangshan@xxxx.com.cn', '蚂蚁', '蚂蚁事业部', '实习JAVA开发工程师', '向川', '2020-11-30 00:00:00', 'X', 'SH', '2020-11-30 00:00:00', '2021-06-30 00:00:00', NULL, NULL, NULL, NULL, '实习', NULL, 'SH', 'ALL', '5010208018', NULL);
INSERT INTO `employeeinfo` VALUES ('00010003','丽思', '13903', 'SH', 'lisi@xxxx.com.cn', '蚂蚁', '蚂蚁事业部', '实习JAVA开发工程师', '向川', '2020-11-30 00:00:00', 'X', 'SH', '2020-11-30 00:00:00', '2021-06-30 00:00:00', NULL, NULL, NULL, NULL, '实习', NULL, 'SH', 'ALL', '5010208018', NULL);
INSERT INTO `employeeinfo` VALUES ('00010004','王武', '13904', 'SH', 'wangwu@xxxx.com.cn', '蚂蚁', '蚂蚁事业部', '实习JAVA开发工程师', '向川', '2020-11-30 00:00:00', 'X', 'SH', '2020-11-30 00:00:00', '2021-06-30 00:00:00', NULL, NULL, NULL, NULL, '实习', NULL, 'SH', 'ALL', '5010208018', NULL);
INSERT INTO `employeeinfo` VALUES ('00010005','赵柳', '13905', 'SH', 'zhaoliu@xxxx.com.cn', '蚂蚁', '蚂蚁事业部', '实习JAVA开发工程师', '向川', '2020-11-30 00:00:00', 'X', 'SH', '2020-11-30 00:00:00', '2021-06-30 00:00:00', NULL, NULL, NULL, NULL, '实习', NULL, 'SH', 'ALL', '5010208018', NULL);
INSERT INTO `employeeinfo` VALUES ('00010006','周琦', '13906', 'SH', 'zhouqi@xxxx.com.cn', '蚂蚁', '蚂蚁事业部', '实习JAVA开发工程师', '向川', '2020-11-30 00:00:00', 'X', 'SH', '2020-11-30 00:00:00', '2021-06-30 00:00:00', NULL, NULL, NULL, NULL, '实习', NULL, 'SH', 'ALL', '5010208018', NULL);
INSERT INTO `employeeinfo` VALUES ('00010007','奇葩', '13907', 'SH', 'qipa_hr@xxxx.com.cn', '蚂蚁', '蚂蚁事业部', '实习JAVA开发工程师', '向川', '2020-11-30 00:00:00', 'X', 'SH', '2020-11-30 00:00:00', '2021-06-30 00:00:00', NULL, NULL, NULL, NULL, '实习', NULL, 'SH', 'ALL', '5010208018', NULL);
INSERT INTO `employeeinfo` VALUES ('00010008','孙悟空', '13908', 'SH', 'sunwukong@xxxx.com.cn', '蚂蚁', '蚂蚁事业部', '实习JAVA开发工程师', '向川', '2020-11-30 00:00:00', 'X', 'SH', '2020-11-30 00:00:00', '2021-06-30 00:00:00', NULL, NULL, NULL, NULL, '实习', NULL, 'SH', 'ALL', '5010208018', NULL);
INSERT INTO `employeeinfo` VALUES ('00010009','迪丽热巴', '13909', 'SH', 'dilireba@xxxx.com.cn', '蚂蚁', '蚂蚁事业部', '实习JAVA开发工程师', '向川', '2020-11-30 00:00:00', 'X', 'SH', '2020-11-30 00:00:00', '2021-06-30 00:00:00', NULL, NULL, NULL, NULL, '实习', NULL, 'SH', 'ALL', '5010208018', NULL);
INSERT INTO `employeeinfo` VALUES ('00010010','刘昊然', '13910', 'SH', 'liuhaoran@xxxx.com.cn', '蚂蚁', '蚂蚁事业部', '实习JAVA开发工程师', '向川', '2020-11-30 00:00:00', 'X', 'SH', '2020-11-30 00:00:00', '2021-06-30 00:00:00', NULL, NULL, NULL, NULL, '实习', NULL, 'SH', 'ALL', '5010208018', NULL);

/*----headline 头条---------------------------------------------------*/

DROP TABLE IF EXISTS `headline`;
CREATE TABLE `headline`  (
    `ID` varchar(8) NOT NULL COMMENT 'ID',
    `CreatedTime` DATETIME(0) COMMENT '上传时间',
    `UpdatedTime` DATETIME(0) COMMENT '修改时间',
    `Details` varchar(50) COMMENT '详情',
    primary key (`ID`)
) ENGINE = InnoDB DEFAULT CHARSET =utf8mb4 COMMENT ='头条';

INSERT INTO `headline`(ID,CreatedTime,UpdatedTime,Details)
VALUES ('12345678',now(), now(),'[这里应该放表扬信图片]');

/*----leave 请假---------------------------------------------------*/

DROP TABLE IF EXISTS `askforleave`;
CREATE TABLE `askforleave`  (
    `id` varchar(8) NOT NULL COMMENT 'ID',
    `job_num` varchar(5) NOT NULL COMMENT '工号',
    `leaveType` char(1) NOT NULL COMMENT '请假类型|Annual("N","年假"),Personal("S","事假"),Sick("B","病假"),Marriage("H","婚假"),Maternity("C","产假"),Paternity("P","陪产假"),Condole("W","慰唁假"),Antenatal("J","产检假")',
    `leaveTimeBengin` DATETIME(0) NOT NULL COMMENT '请假时间开始',
    `leaveTimeEnding` DATETIME(0) NOT NULL COMMENT '请假时间结束',
    `leaveStatus` char(1) COMMENT '请假审批状态|Approved("A","已审批"),Rejected("R","已拒绝"),Commit("C","已提交"),Saved("S","已保存"),Process("P","流程中")',
    `cancellationLeave` char(1) COMMENT '是否销假|Yes("Y","是"),No("N","否")',
    `details` varchar(100) NOT NULL COMMENT '请假说明',
    primary key (`ID`)
) ENGINE = InnoDB DEFAULT CHARSET =utf8mb4 COMMENT ='请假';

INSERT INTO `askforleave` VALUES ('9Ce7MH09', '13914','S','2021-02-08 14:37:22', '2021-02-10 14:37:27', 'A', 'N','啊哈哈哈哈');

/*----personalinfo 个人信息---------------------------------------------------*/
DROP TABLE IF EXISTS `personalinfo`;
CREATE TABLE `personalinfo`  (
    `id` varchar(8) NOT NULL COMMENT 'ID',
    `name` varchar(20) NOT NULL COMMENT '姓名',
    `sex` char(1) NOT NULL COMMENT '性别|Man("M","男"),Woman("W","女")',
    `ethnicity` char(3) NOT NULL COMMENT '民族',
    `idnum` varchar(18) NOT NULL COMMENT '身份证号',
    `politicalOutlook` char(1) COMMENT '政治面貌|Masses("Q","群众"),League("T","团员"),Probationary("Y","预备党员"),Party("D","党员")',
    `dateOfBirth` varchar(20) COMMENT '出生日期',
    `personalEmail` varchar(50) NOT NULL COMMENT '个人邮箱',
    `regis_Type` varchar(20) COMMENT '户口性质',
    `regis_Residence` varchar(50)  COMMENT '户口所在地',
    `maritalStatus` char(1)  COMMENT '婚否|Yes("Y","是"),No("N","否")',
    `grad_Unversity` varchar(20)  COMMENT '毕业院校',
    `grad_Time` varchar(20)  COMMENT '毕业时间',
    `speciality` varchar(20)  COMMENT '专业',
    `degree` char(1)  COMMENT '学历|Primary("P","小学学历"),Junior("J","初中学历"),Highschool("H","高中学历"),College("C","专科学历"),Bachelor("B","本科学历"),Master("M","硕士学历"),Doctoral("D","博士学历"),Noeducation("N","无学历")',
    `nativePlace` char(2)  COMMENT '籍贯|Anhui("AH","安徽"),Beijing("BJ","北京"),Fujian("FJ","福建"),Gansu("GS","甘肃"),Guangdong("GD","广东"),Guangxi("GX","广西"),Guizhou("GZ","贵州"),Hainan("HI","海南"),Hebei("HE","河北"),Henan("HA","河南"),Heilongjiang("HL","黑龙江"),Hubei("HB","湖北"),Hunan("HN","湖南"),Jilin("JL","吉林"),Jiangsu("JS","江苏"),Jiangxi("JX","江西"),Liaoning("LN","辽宁"),InnerMongoria("IM","内蒙古自治区"),Ningxia("NX","宁夏"),Qinghai("QH","青海"),Shandong("SD","山东"),Shanxi("SX","山西"),Shaanxi("SN","陕西"),Shanghai("SH","上海"),Sichuan("SC","四川"),Tianjing("TJ","天津"),Tibet("XZ","西藏"),Xinjiang("XJ","新疆"),Yunnan("YN","云南"),Zhejiang("ZJ","浙江"),Chongqing("CQ","重庆"),Macao("MO","澳门"),HongKong("HK","香港"),Taiwan("TW","台湾")',
    `presentAddress` varchar(50)  COMMENT '现住址',
    `telephone` varchar(18) NOT NULL COMMENT '手机号',
    `qqNum` varchar(20)  COMMENT 'qq号',
    `wechat` varchar(20)  COMMENT '微信',
    `emergencyContactRel` char(1)  COMMENT '紧急联系人关系|Father("F","父母"),Spouse("S","伴侣"),Children("C","子女"),Otherrelatives("O","其他亲戚"),Friend("F","朋友")',
    `emergencyContactName` varchar(20)  COMMENT '紧急联系人姓名',
    `emergencyContactTel` varchar(18)  COMMENT '紧急联系人电话',
    primary key (`id`)
) ENGINE = InnoDB DEFAULT CHARSET =utf8mb4 COMMENT ='个人信息';

INSERT INTO `personalinfo` VALUES ('9Ce7MH01','秦风', 'M', 'N01', '96000119990101001X', 'T', '19990101', 'qinfeng@xxxx.com.cn', '外阜城镇', 'BJ市', 'N', 'BJ大学', '2021-07-01', '国际贸易', 'B', 'BJ', '魔都经开区XX镇', '17620212021', '5201314', 'coco1016254', 'O', '唐仁', '13320212021');
INSERT INTO `personalinfo` VALUES ('9Ce7MH02','秦风', 'M', 'N01', '96000119990101002X', 'T', '19990101', 'qinfeng@xxxx.com.cn', '外阜城镇', 'BJ市', 'N', 'BJ大学', '2021-07-01', '国际贸易', 'B', 'BJ', '魔都经开区XX镇', '17620212021', '5201314', 'coco1016254', 'O', '唐仁', '13320212021');
INSERT INTO `personalinfo` VALUES ('9Ce7MH03','秦风', 'M', 'N01', '96000119990101003X', 'T', '19990101', 'qinfeng@xxxx.com.cn', '外阜城镇', 'BJ市', 'N', 'BJ大学', '2021-07-01', '国际贸易', 'B', 'BJ', '魔都经开区XX镇', '17620212021', '5201314', 'coco1016254', 'O', '唐仁', '13320212021');
INSERT INTO `personalinfo` VALUES ('9Ce7MH04','秦风', 'M', 'N01', '96000119990101004X', 'T', '19990101', 'qinfeng@xxxx.com.cn', '外阜城镇', 'BJ市', 'N', 'BJ大学', '2021-07-01', '国际贸易', 'B', 'BJ', '魔都经开区XX镇', '17620212021', '5201314', 'coco1016254', 'O', '唐仁', '13320212021');
INSERT INTO `personalinfo` VALUES ('9Ce7MH09','秦风', 'M', 'N01', '96000119990101005X', 'T', '19990101', 'qinfeng@xxxx.com.cn', '外阜城镇', 'BJ市', 'N', 'BJ大学', '2021-07-01', '国际贸易', 'B', 'BJ', '魔都经开区XX镇', '17620212021', '5201314', 'coco1016254', 'O', '唐仁', '13320212021');

/*----department 部门---------------------------------------------------*/
drop table if exists `department`;
create table `department` (
    `depid` char(5) not null comment '部门id',
    `depname` varchar(20) not null comment '部门名称',
    `depDirector` varchar(20) COMMENT '部门总监',
    primary key (`depid`)
)engine=innodb default charset=utf8mb4 comment='部门';

insert into `department` (depid, depname, depDirector) values ('d1001', '开发', '向川');
insert into `department` (depid, depname, depDirector) values ('d1002', '开发测试', '忘川');
insert into `department` (depid, depname, depDirector) values ('d2001', '人事', '浅川');

/*----project 项目---------------------------------------------------*/
drop table if exists `project`;
create table `project` (
    `proid` char(5) not null comment '项目id',
    `proname` varchar(20) not null comment '项目名称',
    `depid` varchar(20) COMMENT '部门id',
    primary key (`proid`)
)engine=innodb default charset=utf8mb4 comment='项目';

insert into `project` (proid, proname, depid) values ('p1001', '阿里云', 'd1001');
insert into `project` (proid, proname, depid) values ('p1002', '阿里海', 'd1002');
insert into `project` (proid, proname, depid) values ('p2001', '阿里山', 'd2001');

/*----user 用户---------------------------------------------------*/
drop table if exists `user`;
create table `user` (
    `job_num` char(5) not null comment '工号',
    `companyEmail` varchar(50) not null comment '登陆名',
    `name` varchar(50) comment '昵称',
    `password` char(32) not null comment '密码',
    primary key (`job_num`),
    unique key `companyEmail_unique` (`companyEmail`)
) engine=innodb default charset=utf8mb4 comment='用户';

insert into `user` (job_num, companyEmail, name, password) values ('13901', 'qinfeng@xxxx.com.cn', '秦风', '202cb962ac59075b964b07152d234b70');
insert into `user` (job_num, companyEmail, name, password) values ('13902', 'zhangshan@xxxx.com.cn', '张珊', '202cb962ac59075b964b07152d234b70');
insert into `user` (job_num, companyEmail, name, password) values ('13903', 'lisi@xxxx.com.cn', '丽思', '202cb962ac59075b964b07152d234b70');
insert into `user` (job_num, companyEmail, name, password) values ('13904', 'wangwu@xxxx.com.cn', '王武', '202cb962ac59075b964b07152d234b70');
insert into `user` (job_num, companyEmail, name, password) values ('13911', '12345', 'cc', '4db71c791e6a5f87027698565abc76c8');


/*----resource 资源---------------------------------------------------*/
drop table if exists `resource`;
create table `resource` (
     `id` char(6) not null default '' comment 'id',
     `name` varchar(100) not null comment '名称|菜单或按钮',
     `page` varchar(50) null comment '页面|路由',
     `request` varchar(200) null comment '请求|接口',
     `parent` char(6) comment '父id',
     primary key (`id`)
) engine=innodb default charset=utf8 comment='资源';

insert into `resource` values ('01', '系统管理', null, null, null);
insert into `resource` values ('0101', '用户管理', '/system/user', null, '01');
insert into `resource` values ('010101', '保存', null, '["/system/admin/user/list", "/system/admin/user/save"]', '0101');
insert into `resource` values ('010102', '删除', null, '["/system/admin/user/delete"]', '0101');
insert into `resource` values ('010103', '重置密码', null, '["/system/admin/user/save-password"]', '0101');
insert into `resource` values ('0102', '资源管理', '/system/resource', null, '01');
insert into `resource` values ('010201', '保存/显示', null, '["/system/admin/resource"]', '0102');
insert into `resource` values ('0103', '角色管理', '/system/role', null, '01');
insert into `resource` values ('010301', '角色/权限管理', null, '["/system/admin/role"]', '0103');


/*----role 角色---------------------------------------------------*/

drop table if exists `role`;
create table `role` (
     `id` char(8) not null default '' comment 'id',
     `name` varchar(50) not null comment '角色',
     `desc` varchar(100) not null comment '描述',
     primary key (`id`)
) engine=innodb default charset=utf8mb4 comment='角色';

insert into `role` values ('00000000', '系统管理员', '管理用户、角色权限');
insert into `role` values ('00000001', '开发', '维护资源');
insert into `role` values ('00000002', '业务管理员', '负责业务管理');

/*----role_resource 角色_资源---------------------------------------------------*/

drop table if exists `role_resource`;
create table `role_resource` (
     `id` char(8) not null default '' comment 'id',
     `role_id` char(8) not null comment '角色|id',
     `resource_id` char(6) not null comment '资源|id',
     primary key (`id`)
) engine=innodb default charset=utf8mb4 comment='角色资源关联';

insert into `role_resource` values ('00000000', '00000000', '01');
insert into `role_resource` values ('00000001', '00000000', '0101');
insert into `role_resource` values ('00000002', '00000000', '010101');
insert into `role_resource` values ('00000003', '00000000', '010102');
insert into `role_resource` values ('00000004', '00000000', '010103');
insert into `role_resource` values ('00000005', '00000000', '0102');
insert into `role_resource` values ('00000006', '00000000', '010201');
insert into `role_resource` values ('00000007', '00000000', '0103');
insert into `role_resource` values ('00000008', '00000000', '010301');

/*----role_resource 角色_用户---------------------------------------------------*/

drop table if exists `role_user`;
create table `role_user` (
     `id` char(8) not null default '' comment 'id',
     `role_id` char(8) not null comment '角色|id',
     `user_id` char(8) not null comment '用户|id',
     primary key (`id`)
) engine=innodb default charset=utf8mb4 comment='角色用户关联';

insert into `role_user` values ('00000000', '00000000', '10000000');

-- 文件
drop table if exists `file`;
create table `file` (
    `id` char(8) not null default '' comment 'id',
    `path` varchar(100) not null comment '相对路径',
    `name` varchar(100) comment '文件名',
    `suffix` varchar(10) comment '后缀',
    `size` int comment '大小|字节B',
#     `use` char(1) comment '用途|枚举[FileUseEnum]：COURSE("C", "讲师"), TEACHER("T", "课程")',
    `created_at` datetime(3) comment '创建时间',
#     `updated_at` datetime(3) comment '修改时间',
    primary key (`id`),
    unique key `path_unique` (`path`)
) engine=innodb default charset=utf8mb4 comment='文件';