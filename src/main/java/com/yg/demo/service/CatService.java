package com.yg.demo.service;

import com.yg.demo.bean.Cat;
import com.yg.demo.dao.CatDao;
import com.yg.demo.repository.Cat2Repository;
import com.yg.demo.repository.CatRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.transaction.Transactional;
import java.util.Iterator;

@Service
public class CatService {

    @Resource
    private CatRepository catRepository;

    @Resource
    private Cat2Repository cat2Repository;

    @Resource
    private CatDao catDao;

    /**
     * save,update ,delete 方法需要绑定事务.
     *
     * 使用@Transactional进行事务的绑定.
     *
     * @param cat
     */

    //保存
    @Transactional
    public void save(Cat cat){
        catRepository.save(cat);
    }


    @Transactional
    public void delete(Cat cat){
        catRepository.delete(cat.getId());
    }

    @Transactional
    public Cat findByCatName(String catName){
        return cat2Repository.findByCatName(catName);

    }
    @Transactional
    public Cat findMycatName(String catName){
        System.out.println("this is findMycatName");
        return cat2Repository.findMycatName(catName);

    }

    @Transactional
    public Cat selectByCageName(String catName,int catAge){

        return catDao.selectByCageName(catName,catAge);

    }


    //获取所有
    public Iterable<Cat> getAll(){
        return catRepository.findAll();
    }


}
