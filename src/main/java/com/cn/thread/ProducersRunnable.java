package com.cn.thread;

import com.cn.queue.impl.QueueFactoryImpl;
import com.cn.queue.pojo.ProducersQueuePojo;

import java.util.Date;

/**
 * Describe:生产者线程
 * User:tangjing
 * Date:16/12/3
 * Time:下午5:03
 */


class ProducersRunnable implements Runnable {
    private static String version;
    QueueFactoryImpl queues = QueueFactoryImpl.getInstance();

    public ProducersRunnable(String version) {
        this.version = version;
    }

    public void run() {
        int i = 0;
        while (true) {
            ProducersQueuePojo producersQueuePojo = new ProducersQueuePojo();
            producersQueuePojo.setQueueTheme("warmtheme1");
            producersQueuePojo.setQueueAuthor("tangjing");
            producersQueuePojo.setQueueContext("今天是" + new Date());
            producersQueuePojo.setQueueCreateTime((System.currentTimeMillis()));
            producersQueuePojo.setNum((int) (Math.random() * 100));
            producersQueuePojo.setWarnTheme("我是谁");
            producersQueuePojo.setWarnRule(Integer.toString(i++));
            producersQueuePojo.setWarnNum(producersQueuePojo.getNum());
            System.out.println("生产者队列新增:" + producersQueuePojo.getQueueTheme() + ",date:" + System.currentTimeMillis() + ",当前队列中元素数:" + queues.getQueueSizeByQueueName("生产者队列"));
            producersQueuePojo.setAuthor(version);
            queues.offer("生产者队列", producersQueuePojo);
        }
    }
}