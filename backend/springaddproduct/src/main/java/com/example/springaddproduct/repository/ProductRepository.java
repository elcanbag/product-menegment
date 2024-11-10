package com.example.springaddproduct.repository;

import com.example.springaddproduct.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin(origins = "*")
public interface ProductRepository extends JpaRepository<Product, Long> {
}
