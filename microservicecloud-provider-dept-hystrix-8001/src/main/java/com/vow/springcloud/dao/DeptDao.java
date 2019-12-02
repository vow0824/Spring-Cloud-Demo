package com.vow.springcloud.dao;

import com.vow.springcloud.entities.Dept;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DeptDao {
    public boolean addDept(Dept dept);

    public Dept findById(Long deptId);

    public List<Dept> findAll();
}
