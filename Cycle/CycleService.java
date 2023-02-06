package com.example.Cycle;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class CycleService {
	@Autowired
	CycleDao cd;

	public String add(List<Cycle> cy) {
		// TODO Auto-generated method stub
		return cd.add(cy);
	}

	public List<Cycle> get() {
		// TODO Auto-generated method stub
		return cd.get();
	}

	public Cycle getById(int a) {
		// TODO Auto-generated method stub
		return cd.getById(a);
	}

	
	public List<Cycle> getByName(String n){
		
		// TODO Auto-generated method stub
		return cd.getByName(n);
	}

	
	public List<Cycle> getByTwo(String a, String b) {
		// TODO Auto-generated method stub
		return cd.getByTwo(a,b);
	}

}
