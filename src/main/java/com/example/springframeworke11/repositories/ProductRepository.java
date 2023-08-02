package com.example.springframeworke11.repositories;

import com.example.springframeworke11.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ProductRepository extends JpaRepository<Product, Integer> {


    @Query("SELECT p FROM Product p WHERE p.name=:name")
    public Product findProductByName(String name);

}
