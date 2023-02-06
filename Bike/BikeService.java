package com.example.Bike;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BikeService {
@Autowired
	BikeDao bd;

public String post(List<Bike>b) {
	return bd.post(b);
}

public List<Bike> get() {
	return bd.get();
	
}



}
