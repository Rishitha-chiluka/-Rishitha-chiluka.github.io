package com.springboot.springdatajpa.repository;

import org.springframework.data.repository.CrudRepository;

import com.springboot.springdatajpa.data.entity.Sales;

public interface SalesRepository extends CrudRepository<Sales, Long> {

}
