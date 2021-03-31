package com.csii.ants.management.server.enums;

/**
 * @author ZxM
 * @date 2021/3/30
 * @Description:
 */
public enum NationalityEnum {

    Han("N01","汉族"),
    Zhuang("N02","壮族"),
    Manchu("N03","满族"),
    Hui("N04","回族"),
    Miao("N05","苗族"),
    Uyghur("N06","维吾尔族"),
    Yi("N07","彝族"),
    Tujia("N08","土家族"),
    Mongol("N09","蒙古族"),
    Tibetan("N10","藏族"),

    Buyei("N11","布依族"),
    Dong("N12","侗族"),
    YAO("N13","瑶族"),
    KOREAN("N14","朝鲜族"),
    BAI("N15","白族"),
    HANI("N16","哈尼族"),
    LI("N17","黎族"),
    KAZAK("N18","哈萨克族"),
    DAI("N19","傣族"),
    SHE("N20","畲族"),

    LISU("N21","僳僳族"),
    GELAO("N22","仡佬族"),
    LAHU("N23","拉祜族"),
    DONGXIANG("N24","东乡族"),
    VA("N25","佤族"),
    SUI("N26","水族"),
    NAXI("N27","纳西族"),
    QIANG("N28","羌族"),
    TU("N29","土族"),
    XIBE("N30","锡伯族"),

    MULAO("N31","仫佬族"),
    KIRGIZ("N32","柯尔克孜族"),
    DAUR("N33","达斡尔族"),
    JINGPO("N34","景颇族"),
    SALAR("N35","撒拉族"),
    BLANG("N36","布朗族"),
    MAONAN("N37","毛南族"),
    TAJIK("N38","塔吉克族"),
    PUMI("N39","普米族"),
    ACHANG("N40","阿昌族"),

    NU("N41","怒族"),
    EWENKI("N42","鄂温克族"),
    GIN("N43","京族"),
    JINO("N44","基诺族"),
    DEANG("N45","德昂族"),
    UZBEK("N46","乌孜别克族"),
    RUSSIANS("N47","俄罗斯族"),
    YUGUR("N48","裕固族"),
    BONAN("N49","保安族"),
    MONBA("N50","门巴族"),

    OROQEN("N51","鄂伦春族"),
    DERUNG("N52","独龙族"),
    TATAR("N53","塔塔尔族"),
    HEZHEN("N54","赫哲族"),
    LHOBA("N55","珞巴族"),
    GAOSHAN("N56","高山族");

    private String code;

    private String desc;

    NationalityEnum(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getDesc() {
        return desc;
    }
}
