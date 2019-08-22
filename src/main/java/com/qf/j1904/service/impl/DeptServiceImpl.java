package com.qf.j1904.service.impl;

import com.qf.j1904.mapper.DeptMapper;
import com.qf.j1904.pojo.Dept;
import com.qf.j1904.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DeptServiceImpl implements DeptService {
    @Autowired
    private DeptMapper deptMapper;
    @Override
    public List<Dept> findAll() {
        List<Dept> depts=deptMapper.findAll();
        return depts;
    }
}
