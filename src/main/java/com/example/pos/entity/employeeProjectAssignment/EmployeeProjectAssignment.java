package com.example.pos.entity.employeeProjectAssignment;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Table(name = "employee_project_assignment")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeProjectAssignment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column( name = "assignment_id")
    private Long id;

    @Column(
            name = "employee_id",
            nullable = false)
    private Long employeeId;

    @Column(
            name = "project_id",
            nullable = false)
    private Long projectId;

    @Column(
            name = "allocation_percentage",
            nullable = false)
    private double allocationPercentage;

    @Column(
            name = "assigned_date",
            nullable = false)
    private LocalDateTime assignedDate;

}
