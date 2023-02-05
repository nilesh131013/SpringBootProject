package com.example.Cars;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class CarsDao {

	@Autowired
	CarsRepository cr;
	
	
	public String show(List<Cars >c) {
		 cr.saveAll(c);
		 return "Updated";
	}
	
	
	public List<Cars> get() {
		return cr.findAll();
	}
	
	public Cars getById(int a) {
		return cr.findById(a).get();
	}
	
	public Cars getByBrand(String b) {
		return cr.getByBrand(b);
	}
	
	public List<String> getBrand() {
		return cr.getBrand();
	}
	
	public Cars maxPrice() {
		return cr.maxPrice();
	}
	
	public Cars minPrice() {
		return cr.minPrice();
	}
	
	public Cars secondMax() {
		return cr.secondMax();
	}
	
	public Cars secondMin() {
		return cr.secondMin();
	}
	
	
}
