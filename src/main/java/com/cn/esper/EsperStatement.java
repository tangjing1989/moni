package com.cn.esper;

import com.espertech.esper.client.*;

/**
 * Created by tangj on 2016/12/11.
 */
public class EsperStatement {

    public static void  createEsperStatement(EPServiceProvider epServiceProvider) {
        String[] expressions = new String[2];
        expressions[0] = "select warnTheme ,warnRule, warnNum, author, executiver From BaseEvent where warnNum >0";
        for (String expression : expressions) {
            if(expression!=null){
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
        }}
    }}
