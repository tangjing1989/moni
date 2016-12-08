package com.cn.esper.event;

/**
 * Describe:esperEvent
 * User:tangjing
 * Date:16/12/6
 * Time:下午2:40
 */

public class BaseEvent {

    private String warnTheme;
    private String warnRule;
    private int warnNum;

    public String getWarnTheme() {
        return warnTheme;
    }

    public void setWarnTheme(String warnTheme) {
        this.warnTheme = warnTheme;
    }

    public String getWarnRule() {
        return warnRule;
    }

    public void setWarnRule(String warnRule) {
        this.warnRule = warnRule;
    }

    public int getWarnNum() {
        return warnNum;
    }

    public void setWarnNum(int warnNum) {
        this.warnNum = warnNum;
    }
}
