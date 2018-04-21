package com.yg.demo.controller;


import com.yg.demo.bean.Cat;
import com.yg.demo.service.CatService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/cat")
public class CatController {

    @Resource
    private CatService catService;

    @RequestMapping("/save")
    public  String  save(){
        Cat cat = new Cat();
        cat.setCatAge(1);
        cat.setCatName("名字");
        catService.save(cat);
        return "save ok";

    }
    @RequestMapping("/delete")
    public  String  delete(){
        Cat cat = new Cat();
        cat.setId(1);
        catService.delete(cat);
        return "delete ok";
    }
    @RequestMapping("/getAll")
    public Iterable<Cat> getAll(){
        return catService.getAll();
    }

    //参数
    @RequestMapping("/findByCatName")
    public Cat findByCatName(String catName){
        return catService.findByCatName(catName);
    }
    //参数
    @RequestMapping("/findMycatName")
    public Cat findMycatName(String catName){
        return catService.findMycatName(catName);
    }

    @RequestMapping("/selectByCageName")
    public Cat selectByCageName(String catName,int catAge){
        return catService.selectByCageName(catName,catAge);
    }


}
