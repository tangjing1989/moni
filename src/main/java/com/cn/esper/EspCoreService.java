package com.cn.esper;


import com.espertech.esper.client.*;

/**
 * Describe:esper简单案例
 * User:tangjing
 * Date:16/11/4
 * Time:上午9:01
 */

public class EspCoreService {

    public static EspCoreService ep = new EspCoreService();
    public static EPServiceProvider epServiceProvider;

    public static EspCoreService getInstance() {
        if (null == ep) {
            return new EspCoreService();
        } else {
            return ep;
        }
    }


    public static void handlerEpser() {
        Configuration config = new Configuration();
        config.addEventTypeAutoName("com.cn.esper.event");
        epServiceProvider = EPServiceProviderManager.getDefaultProvider(config);
        EsperStatement.createEsperStatement(epServiceProvider);

    }


}