package com.itheima.hf.domain;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @author wuliqiang@itcast.cn
 * @date 2019/1/20
 */
@Data
@NoArgsConstructor
@Accessors(chain = true)
public class Dept implements Serializable {
    private Long deptno; //主键
    private String dname;//部门名称
    private String db_source;//数据库名称

    public Dept(String dname) {
        super();
        this.dname = dname;
    }
}
