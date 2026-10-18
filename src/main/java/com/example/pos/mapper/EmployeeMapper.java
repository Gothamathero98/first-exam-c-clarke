package com.example.pos.mapper;

import com.example.pos.dto.EmployeeRequest;
import com.example.pos.dto.EmployeeResponse;
import com.example.pos.dto.TestResponse;
import com.example.pos.entity.Status;
import com.example.pos.entity.Test;
import com.example.pos.entity.department.Department;
import com.example.pos.entity.employee.Employee;
import org.springframework.stereotype.Component;

import java.sql.Date;

@Component
public class EmployeeMapper {


    public EmployeeResponse toDto(Employee entity) {
        if (entity == null) {
            return null;
        }


        EmployeeResponse dto = new EmployeeResponse();
        dto.setId(entity.getId());
        dto.setEmail(entity.getEmail());
        dto.setFullName(entity.getFullName());
        dto.setDepartment(entity.getDepartment().getName());
        return dto;
    }

    public Employee toDao(EmployeeRequest dto) {
        if (dto == null) {
            return null;
        }

        Employee entity = new Employee();
        entity.setCode(dto.getCode());
        entity.setFullName(dto.getFullName());
        entity.setEmail(dto.getEmail());
        entity.setPhoneNumber(dto.getPhoneNumber());

        Department department = new Department();
        department.setId( dto.getDepartmentId() );

        entity.setDepartment( department );

        entity.setSupervisorId(dto.getSupervisorId());
        entity.setJoinedDate( Date.valueOf(dto.getJoiningDate()));
        entity.setBasicSalary(dto.getBasicSalary());
        entity.setInitialBasicSalary(dto.getBasicSalary() );
        entity.setDestination(dto.getDesignation() );
        entity.setStatus( Status.ACTIVE );
        return entity;
    }
}
