package cn.ngdw.eurekaclientdemo.controller;/**
 * @author liusa
 * @description
 * @date 2020/6/12
 * @version 1.0.0
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *@ClassName DemoCOntroller
 *@Description TODO
 *@Author liusa
 *@Date 2020/6/12
 *@Version 1.0
 */
@RestController
@RequestMapping("/eurekaclientdemo")
public class DemoController {

    @Value("${spring.application.name}")
    private String appName;

    @GetMapping("/name")
    public Object demo(){
        return appName;
    }
}
