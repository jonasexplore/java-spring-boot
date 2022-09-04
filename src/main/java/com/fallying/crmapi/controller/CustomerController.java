package com.fallying.crmapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.fallying.crmapi.model.Customer;
import com.fallying.crmapi.repository.CustomerRepository;

@RestController
@RequestMapping("/customers")
public class CustomerController {

  @Autowired
  private CustomerRepository customerRepository;

  @GetMapping
  public List<Customer> list() {
    return customerRepository.findAll();
  }

  @PostMapping
  @ResponseStatus(HttpStatus.CREATED)
  public Customer create(@RequestBody Customer customer) {
    return customerRepository.save(customer);
  }

}
