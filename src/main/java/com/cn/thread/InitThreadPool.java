package com.cn.thread;

import com.espertech.esper.client.EPRuntime;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Describe:初始化线程池
 * User:tangjing
 * Date:16/12/3
 * Time:下午5:08
 */

public class InitThreadPool {
    public static InitThreadPool initThreadPool = null;
    public static int poolSize = 100;

    public InitThreadPool() {
    }

    public static InitThreadPool getInstances() {
        if (initThreadPool == null)
            return new InitThreadPool();
        else
            return initThreadPool;
    }


    public void init(EPRuntime espRunTime) {
        ExecutorService FixedThreadPool = Executors.newFixedThreadPool(poolSize);
        InitThreadPool threadPool = InitThreadPool.getInstances();
        //初始化生产者线程
        FixedThreadPool.execute(new ProducersRunnable("生产线程1"));
        System.out.println("生产者线程加载完成");
        //初始化消费者线程
        FixedThreadPool.execute(new CustomerRunnable(espRunTime, "消费线程1"));
        FixedThreadPool.execute(new CustomerRunnable(espRunTime, "消费线程2"));
        System.out.println("消费者线程加载完成");

    }

}
