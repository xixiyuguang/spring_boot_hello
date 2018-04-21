package com.yg;

import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.support.config.FastJsonConfig;
import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.HttpMessageConverters;
import org.springframework.context.annotation.Bean;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import java.nio.charset.Charset;
import java.util.List;

@SpringBootApplication
public class spring_boot_helloApplication  {
//extends WebMvcConfigurerAdapter
//    @Override
//    public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
//        super.configureMessageConverters(converters);
//        /**
//         * 1. 需要先定义一个 convert 转换消息的对象;
//         *  2.添加fastJson 的配置信息，比如：是否要格式化返回的json数据;
//         *  3.在convert中添加配置信息.
//         *  4.将convert添加到converters当中.
//         */
//        //1.定义一个 convert 转换消息的对象
//        FastJsonHttpMessageConverter fastConverter = new FastJsonHttpMessageConverter();
//        //2.添加fastJson 的配置信息
//        FastJsonConfig fastJsonConfig = new FastJsonConfig();
//        fastJsonConfig.setSerializerFeatures(SerializerFeature.PrettyFormat);
//        //设置编码格式
//        fastJsonConfig.setCharset(Charset.forName("utf-8"));
//        //3.convert 添加配置信息
//        fastConverter.setFastJsonConfig(fastJsonConfig);
//        //4.将定义的convert 添加到  converters 就是这个方法里面的参数
//        System.out.println("使用了 自定义的json解析器");
//        converters.add(fastConverter);
//    }

    @Bean
    public StringHttpMessageConverter stringHttpMessageConverter(){
        StringHttpMessageConverter converter  = new
                StringHttpMessageConverter(Charset.forName("utf-8"));//ISO-8859-1
        return converter;
    }

     @Bean
     public HttpMessageConverters fastJsonHttpMessageConverters() {

         FastJsonHttpMessageConverter fastConverter = new FastJsonHttpMessageConverter();

         FastJsonConfig fastJsonConfig = new FastJsonConfig();
         fastJsonConfig.setSerializerFeatures(SerializerFeature.PrettyFormat);
         fastJsonConfig.setCharset(Charset.forName("gbk"));

         fastConverter.setFastJsonConfig(fastJsonConfig);

         HttpMessageConverter<?> converter = fastConverter;  //属性是 HttpMessageConverter
         //在converters 里面加入converter
         return new HttpMessageConverters(converter);  //返回的是HttpMessageConverters 有s
         //将converter 加入到 converters里面去
     }



    public static void main(String args[]){

        SpringApplication.run(spring_boot_helloApplication.class,args);

//        SpringApplication springApplication = new SpringApplication(spring_boot_helloApplication.class);
//        springApplication.run(args);

    }
}
