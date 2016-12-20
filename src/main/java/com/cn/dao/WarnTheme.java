package com.cn.dao;

import com.cn.esper.event.BaseEvent;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.sql.SQLException;

/**
 * Created by tangjing on 16/12/19.
 */
@Repository
public interface WarnTheme {

    void add(@Param(value = "pojo") BaseEvent pojo) throws SQLException;
}
