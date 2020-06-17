package cn.ngdw.gatewaydemo.controller;/**
 * @author liusa
 * @description
 * @date 2020/6/17
 * @version 1.0.0
 */

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *@ClassName GatewayDemoController
 *@Description TODO
 *@Author liusa
 *@Date 2020/6/17
 *@Version 1.0
 */
@RestController
@RequestMapping("/gatewaydemo")
public class GatewayDemoController {

    @Value("${spring.application.name}")
    private String applicationName;


    @GetMapping("/getName")
    public String gatewayDemo(){
        return  applicationName + " || " +Thread.currentThread().getName();
    }
}
