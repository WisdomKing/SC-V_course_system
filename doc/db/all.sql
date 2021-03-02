/*----test---------------------------------------------------*/
drop table if exists `test`;
create table `test`(
    `id` varchar(8) not null default '' comment 'id',
    `name` varchar(50) comment '名称',
    primary key (`id`)
)engine=innodb default charset=utf8mb4 comment ='测试';
insert into `test` (`id`,`name`)value (1,'测试');
insert into `test` (`id`,`name`)value (2,'测试2');

/*----announcement公告---------------------------------------------------*/

DROP TABLE IF EXISTS `announcement`;
CREATE TABLE `announcement`  (
    `ID` varchar(8) NOT NULL COMMENT 'ID',
    `AnnouncementTitle` varchar(20)  NOT NULL COMMENT '公告标题',
    `AnnouncementType` varchar(20) NOT NULL COMMENT '公告类型',
    `BeginTime` varchar(10) NOT NULL COMMENT '开始时间',
    `EndingTime` varchar(10) NOT NULL COMMENT '结束时间',
    `Details` varchar(100) NOT NULL COMMENT '详情',
    primary key (`ID`)
) ENGINE = InnoDB DEFAULT CHARSET =utf8mb4 COMMENT ='公告';

INSERT INTO `announcement` VALUES ('10012333', '2333', '2333', '2021-02-01', '2021-02-11', '红红火火恍恍惚惚');
INSERT INTO `announcement` VALUES ('10012337', '报工开放时间延长结束通知', '公共公告', '2021-02-08', '2021-02-10', '大家好！因本月情况特殊，报工系统开放时间延长至一个月，将于本月28号恢复正常，望大家周知！！！');
INSERT INTO `announcement` VALUES ('9Ce7MH01', '报工开放时间延长结束通知', '公共公告', '2021-02-08', '2021-02-18', '关于做好节后复工复产的安排');
INSERT INTO `announcement` VALUES ('9Ce7MH02','公告标题','公告类型','开始时间','结束时间','详情');
INSERT INTO `announcement` VALUES ('9Ce7MH03','00010002','00010002','2021-02-18','2021-02-22','test02');
INSERT INTO `announcement` VALUES ('9Ce7MH04','00010003','00010003','2021-02-18','2021-02-22','test03');
INSERT INTO `announcement` VALUES ('9Ce7MH05','00010004','00010004','2021-02-18','2021-02-22','test04');
INSERT INTO `announcement` VALUES ('9Ce7MH06','00010005','00010005','2021-02-18','2021-02-22','test05');
INSERT INTO `announcement` VALUES ('9Ce7MH07','00010006','00010006','2021-02-18','2021-02-22','test06');
INSERT INTO `announcement` VALUES ('9Ce7MH08','00010007','00010007','2021-02-18','2021-02-22','test07');
INSERT INTO `announcement` VALUES ('9Ce7MH09','00010008','00010008','2021-02-18','2021-02-22','test08');


/*----clockin报工---------------------------------------------------*/

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

/*----employeeinfo员工信息---------------------------------------------------*/

DROP TABLE IF EXISTS `employeeinfo`;
CREATE TABLE `employeeinfo`  (
    `name` varchar(20) NOT NULL COMMENT '姓名',
    `job_num` varchar(5) NOT NULL COMMENT '工号',
    `affiliated_company` varchar(20) NOT NULL COMMENT '归属公司',
    `companyEmail` varchar(50) NOT NULL COMMENT '企业邮箱',
    `dependence_Dep` varchar(20) NOT NULL COMMENT '所属部门',
    `superiorDep` varchar(20)  COMMENT '上级部门',
    `position` varchar(20) NOT NULL COMMENT '职位',
    `dep_Director` varchar(20) COMMENT '部门总监',
    `entry_Time` timestamp(0) NOT NULL COMMENT '入职时间',
    `entry_Type` varchar(20) COMMENT '入职方式',
    `entry_Address` varchar(20) NOT NULL COMMENT '入职地点',
    `internshipBegin` timestamp(0) COMMENT '实习起始日',
    `internshipEnding` timestamp(0) COMMENT '实习到期日',
    `conversionReg_Time` timestamp(0) COMMENT '转正日期',
    `contractSigning` timestamp(0) COMMENT '合同签订日',
    `contractEnding` timestamp(0) COMMENT '合同截止日',
    `probationExp_date` timestamp(0) COMMENT '试用到期日',
    `employeeStatus` varchar(20) COMMENT '人员状态',
    `contractRenew` varchar(20) COMMENT '合同续签',
    `welfareArea` varchar(20) COMMENT '福利地区',
    `myRole` varchar(20) COMMENT '我的角色',
    `employeeCCC` varchar(20) COMMENT '员工CCC',
    `comment` varchar(50) COMMENT '备注',
    primary key (`Job_num`)
) ENGINE = InnoDB DEFAULT CHARSET =utf8mb4 COMMENT ='员工信息';

INSERT INTO `employeeinfo` VALUES ('秦风', '13914', '上海', 'qinfeng@xxxx.com.cn', '蚂蚁', '蚂蚁事业部', '实习JAVA开发工程师', '向川', '2020-11-30 00:00:00', '校园招聘', '上海', '2020-11-30 00:00:00', '2021-06-30 00:00:00', NULL, NULL, NULL, NULL, '实习', NULL, '上海', 'ALL(普通用户)', '5010208018', NULL);

/*----headline头条---------------------------------------------------*/

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

/*----leave请假---------------------------------------------------*/

DROP TABLE IF EXISTS `leave`;
CREATE TABLE `leave`  (
#     `ID` varchar(8) NOT NULL COMMENT 'ID',
    `LeaveType` char(1)  NOT NULL COMMENT '请假类型|("",""),',
    `LeaveTimeBengin` DATETIME(0) NOT NULL COMMENT '请假时间开始',
    `LeaveTimeEnding` DATETIME(0) NOT NULL COMMENT '请假时间结束',
    `LeaveStatus` char(1)   COMMENT '请假审批状态Approved("A","已审批"),Rejected("R","已拒绝"),Commit("C","已提交"),Saved("S","已保存")',
    `CancellationLeave` varchar(20)   COMMENT '是否销假|("","")'
) ENGINE = InnoDB DEFAULT CHARSET =utf8mb4 COMMENT ='请假';

INSERT INTO `leave` VALUES ('事假', '2021-02-08 14:37:22', '2021-02-10 14:37:27', '审批中', '未销假');

/*----personalinfo个人信息---------------------------------------------------*/
DROP TABLE IF EXISTS `personalinfo`;
CREATE TABLE `personalinfo`  (
    `Name` varchar(20)  NOT NULL COMMENT '姓名',
    `Sex` varchar(20)  NOT NULL COMMENT '性别',
    `Ethnicity` varchar(20)  NOT NULL COMMENT '民族',
    `IDNumber` varchar(18)  NOT NULL COMMENT '身份证号',
    `PoliticalOutlook` varchar(20)   COMMENT '政治面貌',
    `DateOfBirth` varchar(20)   COMMENT '出生日期',
    `PersonalEmail` varchar(50)  NOT NULL COMMENT '个人邮箱',
    `Regis_Type` varchar(20)   COMMENT '户口性质',
    `Regis_Residence` varchar(50)   COMMENT '户口所在地',
    `MaritalStatus` varchar(20)   COMMENT '婚否',
    `Grad_Unversity` varchar(20)   COMMENT '毕业院校',
    `Grad_Time` varchar(20)   COMMENT '毕业时间',
    `Speciality` varchar(20)   COMMENT '专业',
    `Edu_Backgrond` varchar(20)   COMMENT '学历',
    `NativePlace` varchar(50)   COMMENT '籍贯',
    `PresentAddress` varchar(50)   COMMENT '现住址',
    `Telephone` varchar(18)  NOT NULL COMMENT '手机号',
    `QQNumber` varchar(20)   COMMENT 'qq号',
    `WeChat` varchar(20)   COMMENT '微信',
    `EmergencyContactRel` varchar(20)   COMMENT '紧急联系人关系',
    `EmergencyContactName` varchar(20)   COMMENT '紧急联系人姓名',
    `EmergencyContactTel` varchar(18)   COMMENT '紧急联系人电话'
) ENGINE = InnoDB DEFAULT CHARSET =utf8mb4 COMMENT ='个人信息';

INSERT INTO `personalinfo` VALUES ('秦风', '男', '汉', '46000119990101001X', '团员', '19990101', 'qinfeng@xxxx.com.cn', '外阜城镇', '海南省万宁市', '否', '长春大学', '2021-07-01', '计算机科学与技术', '本科', '海南', '上海市浦东新区川沙镇', '17620212021', '5201314', 'coco1016254', '亲戚', '唐仁', '13320212021');

/*-------------------------------------------------------*/
