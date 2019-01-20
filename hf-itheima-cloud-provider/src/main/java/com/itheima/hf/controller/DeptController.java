package com.itheima.hf.controller;

import com.itheima.hf.domain.Dept;
import com.itheima.hf.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
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
    public Dept get(@PathVariable("id") Long id){
        return deptService.findById(id);
    }

    @PostMapping(value = "dept/add")
    public boolean add(Dept dept){
        return deptService.addDept(dept);
    }
}
