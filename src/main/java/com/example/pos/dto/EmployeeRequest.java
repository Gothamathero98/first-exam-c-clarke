package com.example.pos.dto;


import com.example.pos.entity.employee.DestinationStatus;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Setter
@Getter
public class EmployeeRequest {

    String fullName;
    String code;
    String email;
    String phoneNumber;
    LocalDate joiningDate;
    Long departmentId;
    DestinationStatus designation;
    Long supervisorId;
    Double basicSalary;
    List<Long> projects;

}
