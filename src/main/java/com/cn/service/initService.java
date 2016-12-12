package com.cn.service;

import com.cn.esper.EspCoreService;
import com.cn.queue.InitQueue;
import com.cn.thread.InitThreadPool;
import com.espertech.esper.client.EPRuntime;

/**
 * Describe:服务初始化
 * User:tangjing
 * Date:16/12/3
 * Time:下午12:02
 */

public class initService {

    public static void main(String[] args) {
        //初始化esper引擎
        EspCoreService esp = EspCoreService.getInstance();
        esp.handlerEpser();
        EPRuntime espRunTime = esp.epServiceProvider.getEPRuntime();
        //初始化消费者队列
        //初始化生产者队列
        InitQueue initQueue = new InitQueue();
        initQueue.initQueue();
        //初始化消费者线程
        //初始化生产者线程
        InitThreadPool initThreadPool = InitThreadPool.getInstances();
        initThreadPool.init(espRunTime);

    }
}
