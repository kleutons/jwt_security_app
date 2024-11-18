package com.kleuton.jwt_security_app.repository;

import com.kleuton.jwt_security_app.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {

}
