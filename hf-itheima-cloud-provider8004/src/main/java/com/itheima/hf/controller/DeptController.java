package com.itheima.hf.controller;

import com.itheima.hf.domain.Dept;
import com.itheima.hf.service.DeptService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author wuliqiang@itcast.cn
 * @date 2019/1/20
 */
@RestController

public class DeptController {
    @Autowired
    private DeptService deptService;

    @GetMapping(value = "/dept/list")
    public List<Dept> findAll(){
        return deptService.findAll();
    }

    @GetMapping(value = "dept/get/{id}")
    @HystrixCommand(fallbackMethod = "nullDeptFallBack")
    public Dept get(@PathVariable("id") Long id){
        Dept dept = deptService.findById(id);
        if(dept == null){
            throw new RuntimeException("异常...");
        }
        return dept;
    }

    @PostMapping(value = "dept/add")
    public boolean add(Dept dept){
        return deptService.addDept(dept);
    }

    public Dept nullDeptFallBack(@PathVariable("id") Long id){
        System.out.println("熔断方法被调用");
        return new Dept().setDname("nullName").setDb_source("nullDb");
    }
}
