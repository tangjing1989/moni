package com.cn.esper.config;

/**
 * Created by tangjing on 16/12/12.
 */
public enum AlarmEnum {

    warnTheme1("warnTheme1", 1);


    private String warnTheme;
    private int flage;

    private AlarmEnum(String warnTheme, int flage) {
        this.warnTheme = warnTheme;
        this.flage = flage;
    }

    public String getWarnTheme() {
        return warnTheme;
    }

    public void setWarnTheme(String warmTheme) {
        this.warnTheme = warnTheme;
    }

    public int getFlage() {
        return flage;
    }

    public void setFlage(int flage) {
        this.flage = flage;
    }
}
