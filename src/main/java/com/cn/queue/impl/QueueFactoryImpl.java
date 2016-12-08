package com.cn.queue.impl;

import com.cn.queue.IQueueFactoryImpl;
import com.cn.queue.pojo.BaseQueuePojo;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/**
 * Describe:队列工厂实现类
 * User:tangjing
 * Date:16/12/2
 * Time:上午10:51
 */

public class QueueFactoryImpl implements IQueueFactoryImpl {

    public static QueueFactoryImpl queueFactoryImpl = null;
    private static Map<String, ArrayBlockingQueue<BaseQueuePojo>> QMap = new HashMap<String, ArrayBlockingQueue<BaseQueuePojo>>();

    /**
     * 单例
     *
     * @return
     */
    public static  QueueFactoryImpl getInstance() {
        if (queueFactoryImpl == null) {
            queueFactoryImpl = new QueueFactoryImpl();
            return  queueFactoryImpl;
        }
            else
            return queueFactoryImpl;
    }

    /**
     * 创建队列
     */
    public boolean createQueue(String queueName) {
        if (!isExist(queueName)) {
            ArrayBlockingQueue<BaseQueuePojo> arrayBlockingQueue = new ArrayBlockingQueue<BaseQueuePojo>(100);
            QMap.put(queueName, arrayBlockingQueue);
            return true;
        }
        else
            return false;
    }

    /**
     * 通过名称获取Queue
     * @param queueName
     * @return
     */
    public BlockingQueue<BaseQueuePojo> getQueueByName(String queueName){
        return QMap.get(queueName);
    }

    /**
     * 指定队列插入末尾元素
     */
    public boolean offer(String queueName, BaseQueuePojo pojo) {
        if (!isExist(queueName)) {
            queueFactoryImpl.createQueue(queueName);
        }

        try {
            queueFactoryImpl.getQueueByName(queueName).put(pojo);
        } catch (InterruptedException e) {
            return false;
        }
        return true;


    }

    /**
     * 指定队列移除首位元素
     */
    public BaseQueuePojo take(String queueName) throws InterruptedException {
        return getQueueByName(queueName).take();
    }

    /**
     * 销毁队列
     */
    public void destroy() {
        for (ArrayBlockingQueue<BaseQueuePojo> queue : QMap.values()) {
            queue.clear();
        }
        QMap.clear();
    }

    /**
     * 判断队列是否存在
     */

    public boolean isExist(String queueName) {
        if (null == QMap.get(queueName))
            return false;
        else
            return true;
    }

    /**
     * 指定队列待处理元素个数
     */
    public int getQueueSizeByQueueName(String queueName) {
        if (isExist(queueName) == true) {
            return QMap.get(queueName).size();
        } else
            return 0;

    }

    /**
     * 当前队列中待处理元素总个数
     */
    public int getQueueSize() {
        return QMap.size();
    }

}
