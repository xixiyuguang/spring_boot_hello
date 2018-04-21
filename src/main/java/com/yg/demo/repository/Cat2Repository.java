package com.yg.demo.repository;

import com.yg.demo.bean.Cat;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;
import org.springframework.data.repository.query.Param;

//两个属性分别是实体和实体的主键类型
public interface Cat2Repository extends Repository<Cat,Integer> {

    //通过catname查找
//    4. 查询方法以find | read | get开头；
//    5. 涉及查询条件时，条件的属性用条件关键字连接，要注意的是条件属性以首字母大写

    public Cat findByCatName(String catName);

//    使用@Query注解可以自定义JPQL语句实现更灵活的查询。

    @Query("from Cat where catName=:cn")
    public Cat findMycatName(@Param("cn") String catName);

}
