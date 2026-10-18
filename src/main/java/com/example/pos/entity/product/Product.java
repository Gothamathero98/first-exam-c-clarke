package com.example.pos.entity.product;

import com.example.pos.entity.Status;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "product")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true, length = 100)
    private String code;

    @Column(nullable = false, length = 100)
    private String name;

    @Column(length = 100)
    private String description;

    @Column(
            name = "default_selling_price",
            nullable = false)
    private double defaultSellingPrice;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Status status;
}
