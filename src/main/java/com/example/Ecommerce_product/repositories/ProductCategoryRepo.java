package com.example.Ecommerce_product.repositories;

import com.example.Ecommerce_product.entities.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface ProductCategoryRepo extends JpaRepository<ProductCategory, Long> {
}
