package com.zhang.cloud.mapper;

import com.zhang.cloud.bean.Department;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author:zhang
 * @since:2021/2/10
 */
@Mapper
public interface DepartmentMapper {

    Department queryDepartment(@Param("id") Integer id);
}
