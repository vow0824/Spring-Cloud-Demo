package com.vow.springcloud.service.impl;

import com.vow.springcloud.dao.DeptDao;
import com.vow.springcloud.entities.Dept;
import com.vow.springcloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeptServiceImpl implements DeptService{

    @Autowired
    private DeptDao deptDao;

    @Override
    public boolean add(Dept dept) {
        return deptDao.addDept(dept);
    }

    @Override
    public Dept find(Long deptId) {
        return deptDao.findById(deptId);
    }

    @Override
    public List<Dept> list() {
        return deptDao.findAll();
    }
}
