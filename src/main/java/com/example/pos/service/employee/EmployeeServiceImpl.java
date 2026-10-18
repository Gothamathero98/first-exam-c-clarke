package com.example.pos.service.employee;

import com.example.pos.constant.MessageConstants;
import com.example.pos.dto.EmployeeRequest;
import com.example.pos.dto.EmployeeResponse;
import com.example.pos.dto.TestResponse;
import com.example.pos.entity.Test;
import com.example.pos.entity.department.Department;
import com.example.pos.entity.employee.Employee;
import com.example.pos.mapper.EmployeeMapper;
import com.example.pos.network.ResponseData;
import com.example.pos.repository.IDepartmentRepository;
import com.example.pos.repository.IEmployeeRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@Transactional
public class EmployeeServiceImpl {


    @Autowired
    private IEmployeeRepository employeeRepository;

    @Autowired
    private IDepartmentRepository departmentRepository;

    @Autowired
    private EmployeeMapper employeeMapper;

    public ResponseData<EmployeeResponse> createEmployee(EmployeeRequest request) {


        Optional<Department> department = departmentRepository.findById( request.getDepartmentId() );
        if( department.isEmpty()) {
            return ResponseData.error( HttpStatus.INTERNAL_SERVER_ERROR, "Department Not Found" );
        }
        Employee employee = employeeMapper.toDao(request);
        employee.setDepartment( department.get() );
        return ResponseData.created( employeeMapper.toDto( employeeRepository.save( employee ) ), MessageConstants.EMPLOYEE_CREATED_SUCCESSFULLY);
    }
}
