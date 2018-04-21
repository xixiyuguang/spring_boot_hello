package com.yg.demo.bean;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Cat {

    //设置主键 同时设置自动增长
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private int id; //主键
    private String catName;  //生成字段 cat_name
    private int  catAge; ////生成字段 cat_name

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCatName() {
        return catName;
    }

    public void setCatName(String catName) {
        this.catName = catName;
    }

    public int getCatAge() {
        return catAge;
    }

    public void setCatAge(int catAge) {
        this.catAge = catAge;
    }
}
