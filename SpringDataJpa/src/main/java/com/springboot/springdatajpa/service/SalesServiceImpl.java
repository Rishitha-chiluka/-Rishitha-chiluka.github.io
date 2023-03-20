package com.springboot.springdatajpa.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.springboot.springdatajpa.data.entity.Sales;
import com.springboot.springdatajpa.repository.SalesRepository;


@Service
public class SalesServiceImpl implements SalesService {
	
private final SalesRepository salesRepository;

	public SalesServiceImpl(SalesRepository salesRepository) {
		this.salesRepository = salesRepository;
	}

	@Override
	public Sales getSale(int id) {
		// TODO Auto-generated method stub
		Optional<Sales> sale = salesRepository.findById((long) id);
		return sale.orElse(null);
	}

}
