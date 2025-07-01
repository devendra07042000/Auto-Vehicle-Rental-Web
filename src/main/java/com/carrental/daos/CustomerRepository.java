package com.carrental.daos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.carrental.entities.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, String> {

}
