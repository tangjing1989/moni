package com.cn.dao.pojo;

/**
 * Describe:菜单实体
 * User:tangjing
 * Date:16/12/20
 * Time:下午4:26
 */

public class MenuPojo {

    private int id;
    private String text;
    private String href;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }
}
