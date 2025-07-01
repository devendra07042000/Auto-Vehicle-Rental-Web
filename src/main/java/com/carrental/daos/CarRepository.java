package com.carrental.daos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.carrental.entities.Car;
import com.carrental.entities.Variant;

@Repository
public interface CarRepository extends JpaRepository<Car, String> {

	List<Car> findByVariantAndStatus(Variant variant,String status);
	List<Car> findByStatus(String status);
}
