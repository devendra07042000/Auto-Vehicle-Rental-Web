package com.carrental.daos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.carrental.entities.Company;

@Repository
public interface CompanyRepository extends JpaRepository<Company, Integer> {

}
