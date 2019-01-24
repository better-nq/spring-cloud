package com.itheima.hf.mapper;

import com.itheima.hf.domain.Dept;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author wuliqiang@itcast.cn
 * @date 2019/1/20
 */
@Mapper
public interface DeptMapper {
    public boolean addDept(Dept dept);

    public Dept findById(Long id);

    public List<Dept> findAll();
}
