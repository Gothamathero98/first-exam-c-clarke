package com.example.pos.entity.salartHistory;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "salaryhistory")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class SalaryHistory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private Long employee_id;

    @Column(nullable = false)
    private double previous_salary;

    @Column(nullable = false)
    private double new_salary;

    @Column(nullable = false)
    private String effective_date;

    @Column(nullable = false, length = 255)
    private String reason;
}
