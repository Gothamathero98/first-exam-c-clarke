package com.example.pos.entity.productionBatch;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "production_batch")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class ProductionBatch {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false,unique = true, length = 100)
    private String code;

    @Column(nullable = false)
    private Long product_id;

    @Column(nullable = false)
    private String production_date;

    @Column(nullable = false)
    private double remaining_quantity;

    @Column(nullable = false)
    private double material_cost;

    @Column(nullable = false)
    private double labor_cost;

    @Column(nullable = false)
    private double other_cost;

    @Column(nullable = false)
    private double total_production_cost;

    @Column(nullable = false)
    private double unit_production_cost;

    @Column(nullable = false)
    private Long production_supervisor_id;

}
