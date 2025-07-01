package com.carrental.services;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.carrental.daos.CarRepository;
import com.carrental.entities.Car;
import com.carrental.models.CarDTO;

@Service
public class CarService {

	@Autowired private CarRepository brepo;
	@Autowired private VariantService vsrv;
	
	public void saveCar(CarDTO dto) {
		Car bike=new Car();
		if(brepo.existsById(dto.getId())) {			
			bike=brepo.getById(dto.getId());
		}		
		BeanUtils.copyProperties(dto, bike);
		bike.setVariant(vsrv.findById(dto.getVarid()));
		brepo.save(bike);
	}
	
	public void updateBike(Car bk) {
		brepo.save(bk);
	}
	
	public List<Car> listAll(){
		return brepo.findAll(Sort.by(Direction.DESC, "createdon"));
	}
	
	public Car findById(String id) {
		return brepo.getById(id);
	}
	
	public List<Car> filterCars(int id){
		System.out.println("Filter id "+id);
		if(id==1)
			return brepo.findByStatus("Available");
		else
			return brepo.findByStatus("Not Available");
	}
	
	public List<Car> listVariantBikes(int varid){
		return brepo.findByVariantAndStatus(vsrv.findById(varid),"Available");
	}
	
	public void deleteCar(String id) {
		if(brepo.existsById(id)) {
			brepo.delete(brepo.getById(id));
		}
	}	
}
