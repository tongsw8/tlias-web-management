package com.tsw.service.impl;

import com.tsw.mapper.DeptMapper;
import com.tsw.pojo.Dept;
import com.tsw.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeptServiceImpl implements DeptService {
    @Autowired
    private DeptMapper deptMapper;
    @Override
    public List<Dept> findAllDepts() {
        return deptMapper.findAllDepts();
    }
}
