package com.zigmunds.rieksts.ecommercedemo.dao;

import com.zigmunds.rieksts.ecommercedemo.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
    Customer findByEmail(String theEmail);
}
