package com.example.Bike;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BikeController {
	
@Autowired
	BikeService bs;
	
@PostMapping(value="/post")
public String post(@RequestBody List<Bike> b) {
	return bs.post(b);
}

@GetMapping(value="/get") 
public List<Bike> get() {
	return bs.get();
}
}
