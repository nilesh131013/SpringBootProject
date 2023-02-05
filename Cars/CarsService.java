package com.example.Cars;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CarsService {

	
	@Autowired
	
	CarsDao cs;
	
	
	public String show(List<Cars>c) {
		return cs.show(c);
	}
	
	public List<Cars> get() {
		return cs.get();
	}
	
	public Cars getById(int a) {
		return cs.getById(a);
		
	}
	
	
	public Cars getByBrand(String b) {
		return cs.getByBrand(b);
	}
	
	public List<String> getBrand() {
		return cs.getBrand();
	}
	
	public Cars maxPrice() {
	return cs.maxPrice();
	
}
	
public Cars minPrice() {
	return cs.minPrice();
}
	
public Cars secondMax() {
	return cs.secondMax();
}
	
public Cars secondMin() {
	return cs.secondMin();
}
	
	
	
	
}
