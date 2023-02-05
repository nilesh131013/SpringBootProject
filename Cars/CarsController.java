package com.example.Cars;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CarsController {

	
	@Autowired
	CarsService cs;
	
	
	@PostMapping(value="/show")
	public String show(@RequestBody List<Cars>c) {
		return cs.show(c);
	}
	
	
	@GetMapping(value="/get")
	public List<Cars> get() {
		return cs.get();
	}
	
	
	@GetMapping(value="/getById/{a}")
	public Cars getById(@PathVariable int a) {
		return cs.getById(a);
	}
	
	@GetMapping(value="/getByBrand/{b}")
	public Cars getByBrand(@PathVariable String b) {
		return cs.getByBrand(b);
		
	}
	
	@GetMapping(value="getBrand")
	public List<String> getBrand() {
		return cs.getBrand();
	}
	
	@GetMapping(value="/maxPrice")
	public Cars maxPrice() {
		return cs.maxPrice();
	}
	
	@GetMapping(value="/minPrice")
	
	public Cars minPrice() {
		return cs.minPrice();
	}
	
	@GetMapping(value="/secondMax")
	public Cars secondMAx() {
		return cs.secondMax();
	}
	
	@GetMapping(value="/secondMin")
	public Cars secondMin() {
	
		return cs.secondMin();
	}
}
