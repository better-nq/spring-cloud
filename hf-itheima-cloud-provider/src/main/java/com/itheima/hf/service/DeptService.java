package com.itheima.hf.service;

import com.itheima.hf.domain.Dept;

import java.util.List;

/**
 * @author wuliqiang@itcast.cn
 * @date 2019/1/20
 */
public interface DeptService {
    public boolean addDept(Dept dept);

    public Dept findById(Long id);

    public List<Dept> findAll();
}
