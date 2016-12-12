package com.cn.esper;

import com.cn.esper.config.AlarmEnum;
import com.espertech.esper.client.*;

import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

/**
 * Created by tangj on 2016/12/11.
 */
public class EsperStatement {

    public static void  createEsperStatement(EPServiceProvider epServiceProvider) {
        List<String> expressions = new ArrayList<String>();

        ResourceBundle configResouce = ResourceBundle.getBundle("epl_statement");

       AlarmEnum[] alarmEnas=AlarmEnum.values();

        for(AlarmEnum alarmEna :alarmEnas)
        {
            expressions.add(configResouce.getString(alarmEna.getWarnTheme()));
        }
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
