package com.fallying.crmapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fallying.crmapi.model.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
