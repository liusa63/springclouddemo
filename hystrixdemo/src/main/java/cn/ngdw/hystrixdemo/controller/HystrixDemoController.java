package cn.ngdw.hystrixdemo.controller;/**
 * @author liusa
 * @description
 * @date 2020/6/16
 * @version 1.0.0
 */

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCollapser;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *@ClassName HystrixDemoController
 *@Description TODO
 *@Author liusa
 *@Date 2020/6/16
 *@Version 1.0
 */
@RestController
@RequestMapping("/hystrixdemo")
public class HystrixDemoController {

    @Value("${spring.application.name}")
    private  String applicationName;

    /**
     * 通用的异常处理
     * @param num
     * @return
     * @throws Exception
     */
    @HystrixCommand(fallbackMethod = "demoFallback")
    @GetMapping("/getName/{num}")
    public String hystrixDemo(@PathVariable Integer num) throws Exception{
        if (num % 2 == 0 ){
            // 异常情况执行demoFallback（）方法
            throw new Exception("error");
        }
        return applicationName;
    }



    /**
     * private / public 修饰均可
     * @param num
     * @return
     */
    private String demoFallback(@PathVariable Integer num){
        return num + " fall back error";
    }
}
