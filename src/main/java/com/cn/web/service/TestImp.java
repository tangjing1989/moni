package com.cn.web.service;

import com.cn.dao.TestMapper;
import com.cn.web.imp.ITestImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Describe:
 * User:tangjing
 * Date:16/12/16
 * Time:下午1:31
 */
@Service
public class TestImp implements ITestImp {

    @Autowired
    private TestMapper testMapper;
    @Override
    public int sum()
    {
        return  testMapper.sum();
    }
}
