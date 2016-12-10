package com.cn.queue;

import com.cn.queue.createQueue.CustomerQueue;
import com.cn.queue.createQueue.ProducerQueue;

/**
 * Describe:初始化队列
 * User:tangjing
 * Date:16/12/3
 * Time:下午5:24
 */

public class InitQueue {

    public static void main(String[] args) {
        CustomerQueue customerQueue = new CustomerQueue();
        customerQueue.createCustomerQueue();

        ProducerQueue producerQueue = new ProducerQueue();
        producerQueue.createProducerQueue();

    }

    public void initQueue() {
        CustomerQueue customerQueue = new CustomerQueue();
        customerQueue.createCustomerQueue();

        ProducerQueue producerQueue = new ProducerQueue();
        producerQueue.createProducerQueue();

    }

}
