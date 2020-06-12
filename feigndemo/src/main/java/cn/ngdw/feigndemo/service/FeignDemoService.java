package cn.ngdw.feigndemo.service;/**
 * @author liusa
 * @description
 * @date 2020/6/12
 * @version 1.0.0
 */

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *@ClassName FeignDemoService
 *@Description TODO
 *@Author liusa
 *@Date 2020/6/12
 *@Version 1.0
 */
@FeignClient(value = "ribbon-demo")
public interface FeignDemoService {

    @GetMapping("/ribbondemo/getName")
    String getRibbonFunc();

    /**
     * 有参数时传参数
     * getRibbonFunc(@RequestBody T t);
     *
     * getRibbonFunc(@PathVariable T id);
     *
     */


}


