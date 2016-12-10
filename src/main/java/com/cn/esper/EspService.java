package com.cn.esper;


import com.espertech.esper.client.*;

/**
 * Describe:esper简单案例
 * User:tangjing
 * Date:16/11/4
 * Time:上午9:01
 */

public class EspService {

    public static EspService ep = new EspService();
    public static EPServiceProvider epServiceProvider;

    public static EspService getInstance() {
        if (null == ep) {
            return new EspService();
        } else {
            return ep;
        }
    }

    public static void handlerEpser() {
        Configuration config = new Configuration();
        config.addEventTypeAutoName("com.cn.esper.event");
        epServiceProvider = EPServiceProviderManager.getDefaultProvider(config);
        String expression = "select warnTheme ,warnRule, warnNum, author, executiver From BaseEvent where warnNum >0";
        EPStatement epStatement = epServiceProvider.getEPAdministrator().createEPL(expression);
        epStatement.addListener(new UpdateListener() {
            public void update(EventBean[] arg0, EventBean[] arg1) {
                System.out.println("esper 处理结果: warnTheme:" + arg0[0].get("warnTheme")
                        + "|warnRule:" + arg0[0].get("warnRule")
                        + "|warnNum:" + arg0[0].get("warnNum")
                        + "|author:" + arg0[0].get("author")
                        + "|executiver:" + arg0[0].get("executiver")

                );
            }
        });
    }


}