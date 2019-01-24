package com.itheima.hf.api;

import com.itheima.hf.domain.Dept;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author wuliqiang@itcast.cn
 * @date 2019/1/24
 */
@Component //一定要配
public class DeptClientServiceFallbackFactory implements FallbackFactory<DeptClientServiceApi> {


    @Override
    public DeptClientServiceApi create(Throwable throwable) {
        return new DeptClientServiceApi() {
            @Override
            public List<Dept> findAll() {
                return null;
            }

            @Override
            public Dept get(Long id) {
                return new Dept().setDeptno(id).setDname("暂停服务").setDb_source("no this db in mysql");
            }

            @Override
            public boolean add(Dept dept) {
                return false;
            }
        };
    }
}
