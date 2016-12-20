package com.cn.esper;

import com.cn.esper.event.BaseEvent;

import java.sql.SQLException;

/**
 * Describe:esper处理
 * User:tangjing
 * Date:16/12/7
 * Time:下午4:34
 */

public interface IEspDealImpl {


    void add(BaseEvent pojo) throws SQLException;
}
