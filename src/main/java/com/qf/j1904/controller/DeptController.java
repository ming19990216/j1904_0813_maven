package com.qf.j1904.controller;

import com.qf.j1904.pojo.Dept;
import com.qf.j1904.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DeptController {
    @Autowired
    private DeptService deptService;
    @RequestMapping(value = "/depts",method = RequestMethod.GET)
    public List<Dept> findDepts(){
        List<Dept> all=deptService.findAll();
        return all;
    }
}
