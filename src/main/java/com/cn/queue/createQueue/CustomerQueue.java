package com.cn.queue.createQueue;

import com.cn.queue.impl.QueueFactoryImpl;

/**
 * Describe:消费者队列
 * User:tangjing
 * Date:16/12/3
 * Time:下午4:56
 */

public class CustomerQueue {

    public void createCustomerQueue()
    {
        QueueFactoryImpl qf=QueueFactoryImpl.getInstance();
        System.out.println(qf.createQueue("生产者队列"));
        System.out.println("消费者队列加载完成");

    }
}
