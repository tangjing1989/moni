package com.cn.service;

import com.alibaba.fastjson.JSONObject;
import com.cn.dao.MainMapper;
import com.cn.dao.pojo.MenuPojo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Describe:
 * User:tangjing
 * Date:16/12/20
 * Time:下午4:24
 */
@Service
public class MainServices implements  IMainServices{

    @Autowired
    MainMapper mainMapper;

    @Override
    public String queryMenu()
    {
        List<MenuPojo> menuPojos=mainMapper.queryMenu();
        return new JSONObject().toJSONString(menuPojos);
    }
}
