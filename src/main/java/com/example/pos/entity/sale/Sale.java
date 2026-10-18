package com.example.pos.entity.sale;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Table(name = "sale")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Sale {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private Long batch_id;

    @Column(nullable = false)
    private Long sale_employee_id;

    @Column(nullable = false)
    private LocalDateTime date;

    @Column(nullable = false)
    private double quantity_sold;

    @Column(nullable = false)
    private double unit_selling_price;

    @Column(nullable = false)
    private double total_revenue;

    @Column(nullable = false)
    private double cost_of_goods_sold;

    @Column(nullable = false)
    private double gross_profit;
}
