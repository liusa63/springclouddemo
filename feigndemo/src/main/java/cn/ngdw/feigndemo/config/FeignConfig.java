package cn.ngdw.feigndemo.config;/**
 * @author liusa
 * @description
 * @date 2020/6/12
 * @version 1.0.0
 */

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *@ClassName FeignConfig
 *@Description TODO
 *@Author liusa
 *@Date 2020/6/12
 *@Version 1.0
 */
@Configuration
public class FeignConfig {

    @Bean
    Logger.Level feignLoggerLevel() {
        return Logger.Level.FULL;
    }
}
