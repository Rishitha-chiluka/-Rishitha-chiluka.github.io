package com.springboot.springdatajpa.repository;

import org.springframework.data.repository.CrudRepository;

import com.springboot.springdatajpa.data.entity.Products;

public interface ProductsRepository extends CrudRepository<Products, Long> {

}
