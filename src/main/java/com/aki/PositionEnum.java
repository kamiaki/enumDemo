package com.aki;

public enum PositionEnum {
    SS("165", "省视察员"),
    ZB("166", "总部视察员"),
    DS("160", "地市视察员"),

    ZBSCS("200", "总部视察室经理"),
    SF("60", "省服务质量部经理"),
    DSFW("54", "地市服务质量部经理"),

    NJ("159", "南集处理中心视察员"),

    SC("157", "生产机构质检员"),
    LT("20", "揽投部经理"),
    CLZR("25", "处理中心主任"),
    CLJL("158", "处理中心经理"),

    DSFGFZ("56","地市分管副总"),
    SFGFZ("63","省分管副总");
    private String code;
    private String value;

    PositionEnum(String code, String value) {
        this.code = code;
        this.value = value;
    }

    public String getCode() {
        return code;
    }

    public String getValue() {
        return value;
    }

    public static String getValueByCode(String code) {
        if (code == null) {
            return null;
        }
        for (PositionEnum e : PositionEnum.values()) {
            if (e.getCode().equals(code)) {
                return e.getValue();
            }
        }
        return null;
    }

    public static boolean isExistByCode(String code) {
        if (code == null) {
            return false;
        }
        for (PositionEnum e : PositionEnum.values()) {
            if (e.getCode().equals(code)) {
                return true;
            }
        }
        return false;
    }
}
