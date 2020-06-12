package cn.ngdw.ribbondemo.config;/**
 * @author liusa
 * @description
 * @date 2020/6/12
 * @version 1.0.0
 */

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 *@ClassName RibbonConfig
 *@Description TODO
 *@Author liusa
 *@Date 2020/6/12
 *@Version 1.0
 */
@Configuration
public class RibbonConfig {

    /**
     * 配置restTemplate
     * @return
     */
    @Bean
    @LoadBalanced
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
