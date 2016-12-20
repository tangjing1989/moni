package com.cn.controller;

import com.cn.service.IInitService;
import com.cn.service.IMainServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * Describe:主函数
 * User:tangjing
 * Date:16/12/12
 * Time:下午3:58
 */

@Controller
public class MainController {


    @Autowired
    private IInitService iInitService;
    @Autowired
    private IMainServices iMainServices;


    @RequestMapping("/")
    public String sum() {
        return "index";
    }


    @RequestMapping(value = "init.json")
    public void init() {
        iInitService.init();
    }

    @RequestMapping("index.htm")
    public String toIndex( Model model) {
       String  text= iMainServices.queryMenu();
        model.addAttribute("text","[{id: '1',menu: [{text: '系统管理',items:"+text+"}]}]");
        return "index";
    }

}
