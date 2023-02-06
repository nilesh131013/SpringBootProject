package com.example.Bike;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class BikeDao {
@Autowired

	BikeRepository br;


public String post(List<Bike>b) {
	br.saveAll(b);
	return"Stored";
}

public List<Bike> get() {
	return br.findAll();
}
}
