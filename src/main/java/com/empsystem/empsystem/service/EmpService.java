package com.empsystem.empsystem.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.empsystem.empsystem.entity.Employee;
import com.empsystem.empsystem.repository.EmpRepository;

@Service
public class EmpService {
	
	@Autowired
	private EmpRepository repo;
	
	public void addEmp(Employee e) {
		repo.save(e);
	}

}
