package com.example.pos.controller;


import com.example.pos.constant.EndpointConstants;
import com.example.pos.dto.EmployeeRequest;
import com.example.pos.dto.EmployeeResponse;
import com.example.pos.network.ApiResponseWrapper;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(EndpointConstants.V1 + EndpointConstants.EMPLOYEE)
public interface IEmployeeController {

    @PostMapping
    ResponseEntity<ApiResponseWrapper<EmployeeResponse>> createEmployee(@Valid @RequestBody EmployeeRequest request);
}
