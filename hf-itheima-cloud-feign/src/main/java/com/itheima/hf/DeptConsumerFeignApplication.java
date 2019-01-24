package com.itheima.hf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * @author wuliqiang@itcast.cn
 * @date 2019/1/20
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class DeptConsumerFeignApplication {
    public static void main(String[] args) {
        SpringApplication.run(DeptConsumerFeignApplication.class,args);
    }
}
