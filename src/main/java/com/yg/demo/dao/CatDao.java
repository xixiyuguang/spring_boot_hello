package com.yg.demo.dao;

import com.yg.demo.bean.Cat;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;


@Repository
public class CatDao {

    @Resource
    private JdbcTemplate jdbcTemplate;


    /**
     * 1.sql语句
     * 2.RowMapper
     * @param catName
     * @return
     */
    public Cat selectByCageName(String catName,int cat_age){
        String sql = "select * from cat where cat_name=? and cat_age=?";
        RowMapper<Cat> rowMapper = new BeanPropertyRowMapper<>(Cat.class);
        Cat cat =  jdbcTemplate.queryForObject(sql, new Object[]{catName,cat_age},rowMapper);
        return cat;
    }
}
