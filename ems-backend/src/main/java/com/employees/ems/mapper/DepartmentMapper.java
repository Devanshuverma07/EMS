package com.employees.ems.mapper;

import com.employees.ems.dto.DepartmentDto;
import com.employees.ems.entity.Department;

public class DepartmentMapper {

    //Convert department jpa entity into department dto
    public static DepartmentDto maptoDepartmentDto(Department department){
        return new DepartmentDto(
                department.getId(),
                department.getDepartmentName(),
                department.getDepartmentDescription()
        );
    }

    //Convert department dto into department jpa entity into department dto
    public static Department mapToDepartment(DepartmentDto departmentDto){
        return new Department(
                departmentDto.getId(),
                departmentDto.getDepartmentName(),
                departmentDto.getDepartmentDescription()
        );
    }
}
