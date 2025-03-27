package com.example.Ecommerce_product.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.sql.Date;

@Entity
@Data
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long product_id;
    private String productName;
    private String description;
    private String title;
    private BigDecimal unit_price;
    private String img_url;
    private Boolean active;
    private Integer unit_stocks;
    private Date date_created;
    private Date date_updated;
    @ManyToOne
    @JoinColumn(name="categoryId", nullable=false)
    private ProductCategory category;
}
