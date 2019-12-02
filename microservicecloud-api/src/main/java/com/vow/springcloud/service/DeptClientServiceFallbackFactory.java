package com.vow.springcloud.service;

import com.vow.springcloud.entities.Dept;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DeptClientServiceFallbackFactory implements FallbackFactory<DeptClientService> {
    @Override
    public DeptClientService create(Throwable throwable) {
        return new DeptClientService() {
            @Override
            public Dept get(Long id) {
                return new Dept().setDeptNo(id).setDeptName("The server is down").setDbSource("No this database in MySql");
            }

            @Override
            public List<Dept> list() {
                return null;
            }

            @Override
            public Boolean add(Dept dept) {
                return null;
            }
        };
    }
}
