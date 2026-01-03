package com.tsw.mapper;

import com.tsw.pojo.Dept;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface DeptMapper {
    @Select("select * from dept order by update_time desc")
    List<Dept> findAllDepts();
}
