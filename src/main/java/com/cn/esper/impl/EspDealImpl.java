package com.cn.esper.impl;

import com.cn.dao.WarnTheme;
import com.cn.esper.IEspDealImpl;
import com.cn.esper.event.BaseEvent;
import org.springframework.beans.factory.annotation.Autowired;

import java.sql.SQLException;

/**
 * Describe:esper处理实现类
 * User:tangjing
 * Date:16/12/9
 * Time:下午2:49
 */

public class EspDealImpl implements IEspDealImpl{

    @Autowired
    private WarnTheme warnTheme;

    @Override
    public void  add(BaseEvent pojo) throws SQLException
    {
            warnTheme.add(pojo) ;
    }


}
