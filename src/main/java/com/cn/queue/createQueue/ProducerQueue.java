package com.cn.queue.createQueue;

import com.cn.queue.impl.QueueFactoryImpl;

/**
 * Describe:生产者队列
 * User:tangjing
 * Date:16/12/3
 * Time:下午4:57
 */

public class ProducerQueue {

    public void createProducerQueue() {
        QueueFactoryImpl qf = QueueFactoryImpl.getInstance();
        qf.createQueue("消费者队列");
        System.out.println("生产者队列加载完成");
    }
}
