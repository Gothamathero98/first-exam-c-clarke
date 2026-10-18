package com.example.pos.entity.employee;

import com.example.pos.entity.Status;
import com.example.pos.entity.department.Department;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Date;

@Entity
@Table(name = "employee")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false,unique = true, length = 100)
    private String code;

    @Column(
            name = "full_name",
            nullable = false, length = 100)
    private String fullName;

    @Column(nullable = false, length = 100)
    private String email;

    @Column(
            name = "phone_number",
            nullable = false)
    private String phoneNumber;

    @JoinColumn(name = "department_id", nullable = false)
    @ManyToOne(fetch = FetchType.LAZY)
    private Department department;

    @Column(length = 100)
    @Enumerated(EnumType.STRING)
    private DestinationStatus destination;

    @Column(
            name = "supervisor_id",
            nullable = true)
    private Long supervisorId;

    @Column(
            name = "basic_salary",
            nullable = false)
    private double basicSalary;

    @Column(
            name = "initial_basic_salary",
            nullable = false)
    private double initialBasicSalary;

    @Column(
            name = "joined_date",
            nullable = false)
    private Date joinedDate;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Status status;
}
