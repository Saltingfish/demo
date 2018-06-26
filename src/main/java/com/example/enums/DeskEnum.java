package com.example.enums;

import java.util.HashMap;
import java.util.Map;

/**
 * Created  by kzp on 2018/6/26
 */
public enum DeskEnum {
    WHITE("白色", 1), BLACK("黑色", 2),SIZE_1("160cm",3),SIZE_2("120com",4),ENABLE("已分配", 5),
    NOT_ENABLE("未分配", 6),FAILURE("报修",7);

    private String content;

    private int num;

    DeskEnum() {
    }

    DeskEnum(String content, int num) {
        this.content = content;
        this.num = num;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public static DeskEnum getEnum(int value) {
        DeskEnum deskEnum = null;
        DeskEnum[] deskEnums = DeskEnum.values();
        for (int i = 0; i < deskEnums.length; i++) {
            if (deskEnums[i].getNum() == value) {
                deskEnum = deskEnums[i];
                break;
            }
        }
        return deskEnum;
    }

    public static Map<String, Map<String, Object>> toMap() {
        DeskEnum[] deskEnums = DeskEnum.values();
        Map<String, Map<String, Object>> stringMapHashMap = new HashMap<String, Map<String, Object>>();
        for (int num = 0; num < deskEnums.length; num++) {
            Map<String, Object> map = new HashMap<String, Object>();
            String key = String.valueOf(getEnum(deskEnums[num].getNum()));
            map.put("num", String.valueOf(deskEnums[num].getNum()));
            map.put("content", deskEnums[num].getContent());
            stringMapHashMap.put(key, map);
        }
        return stringMapHashMap;
    }
}
