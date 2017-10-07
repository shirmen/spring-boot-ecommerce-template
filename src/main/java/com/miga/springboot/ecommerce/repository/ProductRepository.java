package com.miga.springboot.ecommerce.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.miga.springboot.ecommerce.model.Product;

@Repository
public interface ProductRepository extends CrudRepository<Product, Long> {

}
