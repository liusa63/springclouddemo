package cn.ngdw.feigndemo.controller;/**
 * @author liusa
 * @description
 * @date 2020/6/12
 * @version 1.0.0
 */

import cn.ngdw.feigndemo.service.FeignDemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *@ClassName FeignDemoController
 *@Description TODO
 *@Author liusa
 *@Date 2020/6/12
 *@Version 1.0
 */
@RequestMapping("feigndemo")
@RestController
public class FeignDemoController {

    @Autowired
    private FeignDemoService feignDemoService;

    @Value("${spring.application.name}")
    private String applicationName;

    @GetMapping("getName")
    public Object feignDemo(){
        return applicationName + " || "+ feignDemoService.getRibbonFunc();
    }
}
