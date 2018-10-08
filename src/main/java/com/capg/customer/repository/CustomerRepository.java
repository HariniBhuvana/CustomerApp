package com.capg.customer.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capg.customer.entities.Customer;



public interface CustomerRepository extends JpaRepository<Customer, Integer> {

}