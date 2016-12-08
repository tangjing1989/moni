package com.cn.queue;


import com.cn.queue.pojo.BaseQueuePojo;

/**
 * Describe:队列工厂接口
 * User:tangjing
 * Date:16/12/2
 * Time:下午5:26
 */
public interface IQueueFactoryImpl  {

    boolean createQueue(String queueName);

    boolean offer(String queueName, BaseQueuePojo pojo);


    void destroy();

    boolean isExist(String queueName);

    int getQueueSizeByQueueName(String queueName);

    int getQueueSize();
}
