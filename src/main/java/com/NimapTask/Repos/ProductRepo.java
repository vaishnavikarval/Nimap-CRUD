package com.NimapTask.Repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.NimapTask.Entites.Product;

@Repository
public interface ProductRepo extends JpaRepository<Product, Long> {

}
