/*----test---------------------------------------------------*/
drop table if exists `test`;
create table `test`(
    `id` varchar(8) not null default '' comment 'id',
    `name` varchar(50) comment '名称',
    primary key (`id`)
)engine=innodb default charset=utf8mb4 comment ='测试';

insert into `test` (`id`,`name`)value (1,'测试');
insert into `test` (`id`,`name`)value (2,'测试2');

/*----companyinfo公司信息---------------------------------------------------*/

DROP TABLE IF EXISTS `companyinfo`;
CREATE TABLE `companyinfo`  (
    `TaxID` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '税号',
    `AccountID` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '账号',
    `AccountBank` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '开户行',
    `CompanyAddress` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '公司地址',
    `CompanyTel` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '公司电话'
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

INSERT INTO `companyinfo` VALUES ('52013147758258003Q', '520131410086', '中国银行北京xxxx大厦支行', '北京市第三经济技术开发区西环南路88号C座9011室', '010-85785785');
/*外键约束，好像公司信息不需要外键约束吧？？？*/
SET FOREIGN_KEY_CHECKS = 1;

/*----announcement公告---------------------------------------------------*/

DROP TABLE IF EXISTS `announcement`;
CREATE TABLE `announcement`  (
    `AnnouncementTitle` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '公告标题',
    `AnnouncementType` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '公告类型',
    `BeginTime` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '开始时间',
    `EndingTime` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '结束时间',
    `Details` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '详情'
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

INSERT INTO `announcement` VALUES ('报工开放时间延长结束通知', '公共公告', '2021-02-08', '2021-02-10', '大家好！因本月情况特殊，报工系统开放时间延长至一个月，将于本月28号恢复正常，望大家周知！！！');
INSERT INTO `announcement` VALUES ('关于做好节后复工复产的安排', '公共公告', '2021-02-18', '2021-02-22', '关于做好节后复工复产的安排！！所有项目组成员应当尽快复工复产');
INSERT INTO `announcement` VALUES ('00000001','00010010','2021-02-18','2021-02-22','test01');
INSERT INTO `announcement` VALUES ('00000002','00010010','2021-02-18','2021-02-22','test02');
INSERT INTO `announcement` VALUES ('00000003','00010010','2021-02-18','2021-02-22','test03');
INSERT INTO `announcement` VALUES ('00000004','00010010','2021-02-18','2021-02-22','test04');
INSERT INTO `announcement` VALUES ('00000005','00010010','2021-02-18','2021-02-22','test05');
INSERT INTO `announcement` VALUES ('00000006','00010010','2021-02-18','2021-02-22','test06');
INSERT INTO `announcement` VALUES ('00000007','00010010','2021-02-18','2021-02-22','test07');
INSERT INTO `announcement` VALUES ('00000008','00010010','2021-02-18','2021-02-22','test08');
INSERT INTO `announcement` VALUES ('00000009','00010010','2021-02-18','2021-02-22','test09');
INSERT INTO `announcement` VALUES ('00000010','00010010','2021-02-18','2021-02-22','test10');
INSERT INTO `announcement` VALUES ('00000011','00010010','2021-02-18','2021-02-22','test11');
INSERT INTO `announcement` VALUES ('00000012','00010010','2021-02-18','2021-02-22','test12');
INSERT INTO `announcement` VALUES ('00000013','00010010','2021-02-18','2021-02-22','test13');
INSERT INTO `announcement` VALUES ('00000014','00010010','2021-02-18','2021-02-22','test14');
/*----clockin报工---------------------------------------------------*/

DROP TABLE IF EXISTS `clockin`;
CREATE TABLE `clockin`  (
    `ProjectNmae` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '项目名称',
    `ManhourType` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '工时类型',
    `Manhour` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '工时',
    `Delayed` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '延时',
    `WorkLog` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '工作日志',
    `Status` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '状态',
    `ClockInTime` timestamp(0) NOT NULL COMMENT '报工时间'
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

INSERT INTO `clockin` VALUES ('F-20-1569_2020富邦华一银行外籍薪资购汇项目', '交付项目', '8', '2', 'U享存补签', '已审批', '2021-02-08 14:45:39');

/*----employeeinfo员工信息---------------------------------------------------*/

DROP TABLE IF EXISTS `employeeinfo`;
CREATE TABLE `employeeinfo`  (
    `Name` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '姓名',
    `JobNumber` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '工号',
    `SubsidiaryCorporation` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '归属公司',
    `CompanyEmail` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '企业邮箱',
    `DependenceDepartment` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '所属部门',
    `SuperiorDepartment` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '上级部门',
    `Position` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '职位',
    `DepartmentDirector` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '部门总监',
    `EntryTime` timestamp(0) NOT NULL COMMENT '入职时间',
    `EntryType` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '入职方式',
    `EntryAdress` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '入职地点',
    `InternshipBegin` timestamp(0) NULL DEFAULT NULL COMMENT '实习起始日',
    `InternshipEnding` timestamp(0) NULL DEFAULT NULL COMMENT '实习到期日',
    `ConversionRegularizationTime` timestamp(0) NULL DEFAULT NULL COMMENT '转正日期',
    `ContractSigning` timestamp(0) NULL DEFAULT NULL COMMENT '合同签订日',
    `ContractEnding` timestamp(0) NULL DEFAULT NULL COMMENT '合同截止日',
    `ProbationPeriodEnding` timestamp(0) NULL DEFAULT NULL COMMENT '试用到期日',
    `EmployeeStatus` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '人员状态',
    `ContractRenew` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '合同续签',
    `WelfareArea` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '福利地区',
    `MyRole` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '我的角色',
    `EmployeeCCC` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '员工CCC',
                                 `Comment` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '备注'
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

INSERT INTO `employeeinfo` VALUES ('秦风', '13914', '上海', 'qinfeng@xxxx.com.cn', '蚂蚁', '蚂蚁事业部', '实习JAVA开发工程师', '向川', '2020-11-30 00:00:00', '校园招聘', '上海', '2020-11-30 00:00:00', '2021-06-30 00:00:00', NULL, NULL, NULL, NULL, '实习', NULL, '上海', 'ALL(普通用户)', '5010208018', NULL);

/*----headline头条---------------------------------------------------*/

DROP TABLE IF EXISTS `headline`;
CREATE TABLE `headline`  (
    `UploadTime` timestamp(0) NOT NULL COMMENT '上传时间',
    `Details` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '详情'
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

INSERT INTO `headline` VALUES ('2021-02-08 14:38:46', '[这里应该放表扬信图片]');

/*----leave请假---------------------------------------------------*/

DROP TABLE IF EXISTS `leave`;
CREATE TABLE `leave`  (
    `LeaveType` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '请假类型',
    `LeaveTimeBengin` timestamp(0) NOT NULL COMMENT '请假时间开始',
    `LeaveTimeEnding` timestamp(0) NOT NULL COMMENT '请假时间结束',
    `LeaveStatus` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '请假审批状态',
    `CancellationLeave` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '是否销假'
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

INSERT INTO `leave` VALUES ('事假', '2021-02-08 14:37:22', '2021-02-10 14:37:27', '审批中', '未销假');

/*----personalinfo个人信息---------------------------------------------------*/
DROP TABLE IF EXISTS `personalinfo`;
CREATE TABLE `personalinfo`  (
    `Name` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '姓名',
    `Sex` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '性别',
    `Ethnicity` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '民族',
    `IDNumber` varchar(18) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '身份证号',
    `PoliticalOutlook` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '政治面貌',
    `DateOfBirth` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '出生日期',
    `PersonalEmail` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '个人邮箱',
    `RegisteredType` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '户口性质',
    `RegisteredResidence` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '户口所在地',
    `MaritalStatus` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '婚否',
    `GraduationUnversity` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '毕业院校',
    `GraduationTime` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '毕业时间',
    `Speciality` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '专业',
    `EducationBackgrond` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '学历',
    `NativePlace` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '籍贯',
    `PresentAddress` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '现住址',
    `Telephone` varchar(18) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '手机号',
    `QQNumber` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT 'qq号',
    `WeChat` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '微信',
    `EmergencyContactRel` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '紧急联系人关系',
    `EmergencyContactName` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '紧急联系人姓名',
    `EmergencyContactTel` varchar(18) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '紧急联系人电话'
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

INSERT INTO `personalinfo` VALUES ('秦风', '男', '汉', '46000119990101001X', '团员', '19990101', 'qinfeng@xxxx.com.cn', '外阜城镇', '海南省万宁市', '否', '长春大学', '2021-07-01', '计算机科学与技术', '本科', '海南', '上海市浦东新区川沙镇', '17620212021', '5201314', 'coco1016254', '亲戚', '唐仁', '13320212021');

/*-------------------------------------------------------*/







