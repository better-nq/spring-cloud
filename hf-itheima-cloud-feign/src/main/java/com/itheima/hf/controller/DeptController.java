package com.itheima.hf.controller;

import com.itheima.hf.api.DeptClientServiceApi;
import com.itheima.hf.domain.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author wuliqiang@itcast.cn
 * @date 2019/1/21
 */
@RestController
@RequestMapping("feign")
public class DeptController {
    @Autowired
    private DeptClientServiceApi serviceApi;
    @GetMapping(value = "/dept/list")
    public List<Dept> findAll(){
        return serviceApi.findAll();
    }

    @GetMapping(value = "dept/get/{id}")
    public Dept get(@PathVariable("id") Long id){
        return serviceApi.get(id);
    }

    @PostMapping(value = "dept/add")
    public boolean add(Dept dept){
        return serviceApi.add(dept);
    }
}
