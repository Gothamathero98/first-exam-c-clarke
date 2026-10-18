package com.example.pos.dto;


import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class EmployeeResponse {

    Long id;
    String fullName;
    String email;
    String department;
    List<String> projects;
}
