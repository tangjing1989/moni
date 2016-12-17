package com.cn.dao;


import org.mybatis.spring.annotation.MapperScan;

/**
 * Created by tangjing on 16/12/15.
 */
@MapperScan()
public interface TestMapper {
    Integer sum();
}
