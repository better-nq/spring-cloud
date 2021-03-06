package com.itheima.hf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author wuliqiang@itcast.cn
 * @date 2019/1/20
 */
@SpringBootApplication
@EnableEurekaClient
public class DeptConsumerApplication {
    public static void main(String[] args) {
        SpringApplication.run(DeptConsumerApplication.class,args);
    }
}
