package com.vow.springcloud.service;

import com.vow.springcloud.entities.Dept;

import java.util.List;

public interface DeptService {
    public boolean add(Dept dept);

    public Dept find(Long deptId);

    public List<Dept> list();
}
