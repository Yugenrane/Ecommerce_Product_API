package com.example.Ecommerce_product.repositories;

import com.example.Ecommerce_product.entities.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface ProductRepo extends JpaRepository<Product, Long> {
    Page<Product> findByCategory_CategoryId(@Param("id")Long id, Pageable pageable);

    Page<Product> findByProductNameContaining(@Param("name")String name, Pageable pageable);
}
