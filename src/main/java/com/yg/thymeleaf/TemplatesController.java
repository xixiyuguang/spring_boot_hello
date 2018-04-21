package com.yg.thymeleaf;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

//@RestController
@Controller
@RequestMapping("/templates")
public class TemplatesController {
    /**
     * 映射地址是 /templates/hello
     * @return
     * 必须是
     */
    @RequestMapping("/hello")
    public ModelAndView hello(){
        ModelAndView mv = new ModelAndView("test");
        return mv;
    }

    @RequestMapping("/hello1")
    public String hello1(Map<String,Object> map){
        map.put("name","于光");
        map.put("id","25");

       return "hello";  //ctrl + 鼠标左键  显示 路径
    }
    @RequestMapping("/helloFtl")
    public String helloFtl(Map<String,Object> map){
        map.put("message","this is freemarker");


        return "helloFtl";  //ctrl + 鼠标左键  显示 路径
    }

}
