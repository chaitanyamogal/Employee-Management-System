package com.empsystem.empsystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.empsystem.empsystem.entity.Employee;
import com.empsystem.empsystem.service.EmpService;

@Controller
public class EmpController {
	
	@Autowired
	private EmpService service;
	
	@GetMapping("")
	public String home()
	{
		return "index";
	}
	
	@GetMapping("/add-emp")
	public String addEmp() 
	{
		return "add_emp";
	}
	
	@PostMapping("/register")
	public String empRegister(@ModelAttribute Employee e)
	{
		System.out.println(e);
		service.addEmp(e);
		return "redirect:/";
	}
}
