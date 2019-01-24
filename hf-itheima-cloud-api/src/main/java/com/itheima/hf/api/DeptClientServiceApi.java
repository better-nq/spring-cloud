package com.itheima.hf.api;

import com.itheima.hf.domain.Dept;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

/**
 * @author wuliqiang@itcast.cn
 * @date 2019/1/21
 */
@FeignClient(value="HF-ITHEIMA-CLOUD-PROVIDER",fallbackFactory = DeptClientServiceFallbackFactory.class)

public interface DeptClientServiceApi {
    @GetMapping(value = "/dept/list")
    public List<Dept> findAll();

    @GetMapping(value = "dept/get/{id}")
    public Dept get(@PathVariable("id") Long id);

    @PostMapping(value = "dept/add")
    public boolean add(Dept dept);
}
