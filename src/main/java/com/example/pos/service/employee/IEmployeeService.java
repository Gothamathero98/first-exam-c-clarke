package com.example.pos.service.employee;

import com.example.pos.dto.EmployeeRequest;
import com.example.pos.dto.EmployeeResponse;
import com.example.pos.dto.TestResponse;
import com.example.pos.network.ResponseData;
import org.springframework.stereotype.Service;

@Service
public interface IEmployeeService {

    ResponseData<EmployeeResponse> createEmployee(EmployeeRequest request);
}
