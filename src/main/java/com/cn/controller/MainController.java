package com.cn.controller;

import com.cn.dao.TestMapper;
import com.cn.web.imp.ITestImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Describe:主函数
 * User:tangjing
 * Date:16/12/12
 * Time:下午3:58
 */

@Controller
public class MainController {

    @Autowired
    private TestMapper testMapper;

    //@RequestMapping(value = "/", method = RequestMethod.GET)
    //public String login() {
       // return "login";
    //}
    @RequestMapping(value = "/index.htm", method = RequestMethod.GET)
    public String index() {
        return "index";
    }

    @RequestMapping("/")
    public void sum()
    {
        System.out.println(testMapper.sum().toString());
    }
}
