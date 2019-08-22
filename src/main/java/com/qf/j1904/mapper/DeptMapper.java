package com.qf.j1904.mapper;


import com.qf.j1904.pojo.Dept;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface DeptMapper {
    List<Dept> findAll();
}
