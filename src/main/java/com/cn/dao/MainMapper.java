package com.cn.dao;

import com.cn.dao.pojo.MenuPojo;
import org.springframework.stereotype.Repository;

import java.util.List;


/**
 * Describe:
 * User:tangjing
 * Date:16/12/20
 * Time:下午4:25
 */
@Repository
public interface MainMapper {

    List<MenuPojo> queryMenu();
}
