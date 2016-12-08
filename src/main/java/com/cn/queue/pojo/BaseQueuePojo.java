package com.cn.queue.pojo;

import com.cn.queue.esper.event.BaseEvent;

/**
 * Describe:队列中实体
 * User:tangjing
 * Date:16/12/2
 * Time:上午10:56
 */

public class BaseQueuePojo extends BaseEvent {

    private String queueTheme;
    private String queueAuthor;
    private String queueContext;
    private long queueCreateTime;
    private long queueUpdateTime;

    public String getQueueTheme() {
        return queueTheme;
    }

    public void setQueueTheme(String queueTheme) {
        this.queueTheme = queueTheme;
    }

    public String getQueueAuthor() {
        return queueAuthor;
    }

    public void setQueueAuthor(String queueAuthor) {
        this.queueAuthor = queueAuthor;
    }

    public String getQueueContext() {
        return queueContext;
    }

    public void setQueueContext(String queueContext) {
        this.queueContext = queueContext;
    }

    public long getQueueCreateTime() {
        return queueCreateTime;
    }

    public void setQueueCreateTime(long queueCreateTime) {
        this.queueCreateTime = queueCreateTime;
    }

    public long getQueueUpdateTime() {
        return queueUpdateTime;
    }

    public void setQueueUpdateTime(long queueUpdateTime) {
        this.queueUpdateTime = queueUpdateTime;
    }

    public String toString() {
        return "队列元素信息:" +
                "主题" + this.getQueueTheme() +
                "作者" + this.getQueueAuthor() +
                "内容" + this.getQueueContext() +
                "创建时间" + this.getQueueCreateTime() +
                "修改时间" + this.getQueueUpdateTime();
    }
}
