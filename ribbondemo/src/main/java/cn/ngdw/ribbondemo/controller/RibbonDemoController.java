package cn.ngdw.ribbondemo.controller;/**
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
import org.springframework.web.client.RestTemplate;

/**
 *@ClassName RibbonDemoController
 *@Description TODO
 *@Author liusa
 *@Date 2020/6/12
 *@Version 1.0
 */
@RestController
@RequestMapping("/ribbondemo")
public class RibbonDemoController {

    @Autowired
    private RestTemplate restTemplate;

    @Value("${service-url.demo-service}")
    private String userServiceUrl;

    @Value("${spring.application.name}")
    private String applicationName;

    @GetMapping("getName")
    public Object ribbonDemo(){
        return applicationName + " || "+restTemplate.getForObject(userServiceUrl+"/eurekaclientdemo/getName", String.class);
        /**
         * get请求，只返回结果
         * restTemplate.getForObject(utl, Result.class, param);
         *
         * post请求，只返回结果
         * restTemplate.potForObject(utl, Result.class, param);
         *
         * get请求，返回 ResponseEntity<T>  包含响应http code等
         * restTemplate.getForEntity(utl, Result.class, param);
         *
         * post请求，返回 ResponseEntity<T>  包含响应http code等
         * restTemplate.postForEntity(utl, Result.class, param);
         */
    }


}
