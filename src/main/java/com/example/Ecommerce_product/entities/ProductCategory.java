package com.example.Ecommerce_product.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Set;

@Entity
@Data
public class ProductCategory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long categoryId;

    private String categoryName;
    @OneToMany(mappedBy = "category", cascade = CascadeType.ALL)
    private Set<Product> products;
}
