package com.yg.bean;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.Date;

public class User {
    private  int  id;
    private String name ;

    @JSONField(format = "yyyy-MM-dd HH:mm")
    private Date createTime; //创建时间
    @JSONField(serialize = false)  //是否序列化  就是是否显示  默认是显示的
    private String remark;// 备注


    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
