package com.example.pos.controller;

import com.example.pos.dto.EmployeeRequest;
import com.example.pos.dto.EmployeeResponse;
import com.example.pos.network.ApiResponseWrapper;
import com.example.pos.network.NetworkUtils;
import com.example.pos.service.employee.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController implements IEmployeeController {

    @Autowired
    private IEmployeeService employeeService;

    @Override
    public ResponseEntity<ApiResponseWrapper<EmployeeResponse>> createEmployee(EmployeeRequest request) {
        return NetworkUtils.wrap(employeeService.createEmployee(request));
    }
}
