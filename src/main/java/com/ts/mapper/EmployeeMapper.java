package com.ts.mapper;

import com.ts.pojo.Employee;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.List;
import java.util.Map;

@Repository
public interface EmployeeMapper {
    Collection<Employee> queryEmpList();

    int  EmpAdd(Employee employee);

    Employee queryById(@Param("id") Integer id);

    int EmpUpdate(Employee employee);

    List<Employee> dddd(Map map);

    int Empupper(Map map);
}
