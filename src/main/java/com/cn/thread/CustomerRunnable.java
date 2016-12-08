package com.cn.thread;

import com.espertech.esper.client.EPRuntime;
import com.cn.queue.impl.QueueFactoryImpl;
import com.cn.queue.pojo.BaseQueuePojo;
import com.cn.queue.pojo.ProducersQueuePojo;

/**
 * Describe:消费者线程
 * User:tangjing
 * Date:16/12/3
 * Time:下午5:03
 */

public class CustomerRunnable implements Runnable{

    QueueFactoryImpl queues=QueueFactoryImpl.getInstance();

    private static  EPRuntime epRuntime=null;

    public CustomerRunnable(EPRuntime epRuntime )
    {
        this.epRuntime=epRuntime;
    }

    public  void run() {
        while (true)
        {
            BaseQueuePojo baseQueuePojo = null;
            try {
                baseQueuePojo = queues.take("生产者队列");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if(baseQueuePojo instanceof ProducersQueuePojo)
            {
                ProducersQueuePojo producersQueuePojo=(ProducersQueuePojo)baseQueuePojo;
                epRuntime.sendEvent(baseQueuePojo);
            }

        }
    }
}
