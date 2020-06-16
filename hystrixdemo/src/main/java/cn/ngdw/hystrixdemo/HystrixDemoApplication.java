package cn.ngdw.hystrixdemo;/**
 * @author liusa
 * @description
 * @date 2020/6/16
 * @version 1.0.0
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;

/**
 *@ClassName HystrixDemoApplication
 *@Description TODO
 *@Author liusa
 *@Date 2020/6/16
 *@Version 1.0
 */
@EnableCircuitBreaker
@SpringBootApplication
public class HystrixDemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(HystrixDemoApplication.class, args);
    }
}
