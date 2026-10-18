package com.example.pos.service.employee;

import com.example.pos.constant.MessageConstants;
import com.example.pos.dto.EmployeeRequest;
import com.example.pos.dto.EmployeeResponse;
import com.example.pos.network.ResponseData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService implements IEmployeeService {


    @Autowired
    private EmployeeServiceImpl employeeServiceImpl;


    @Override
    public ResponseData<EmployeeResponse> createEmployee(EmployeeRequest request) {
        try {
            return employeeServiceImpl.createEmployee(request);
        } catch (Exception exception) {
            return ResponseData.error(HttpStatus.INTERNAL_SERVER_ERROR, MessageConstants.UNABLE_TO_CREATE_TEST);
        }
    }
}
