package com.yg.demo.repository;

import com.yg.demo.bean.Cat;
import org.springframework.data.repository.CrudRepository;

public interface CatRepository extends CrudRepository<Cat,Integer> {

}
