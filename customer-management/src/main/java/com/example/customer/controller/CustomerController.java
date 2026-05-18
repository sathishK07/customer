package com.example.customer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.customer.model.Customer;
import com.example.customer.service.CustomerService;

@RestController
@RequestMapping("/customer")
public class CustomerController {
	@GetMapping("/welcome")
	public String welcome() {
		return "welcome to new customer";
	}
	
	@Autowired
	private CustomerService service;
	//http://localhost:8080/customer
	
	@PostMapping()
	public Customer saveCustomer(@RequestBody Customer customer){
		return service.saveCustomer(customer);
		
	}
	
	//http://localhost:8080/customer/1
	@GetMapping("/{id}")
	public Customer getCustomer(@PathVariable int id) {
		return service.getCustomer(id);
	}
	

}
