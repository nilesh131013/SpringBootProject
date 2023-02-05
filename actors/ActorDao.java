package com.example.Celebrity;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
@Repository
public class ActorDao {
	
    @Autowired
    ActorRepocitory ar;
    
	public String getStore(Actor c) {
		ar.save(c);
		return "Success";
	}
	
    
	public String getBulkStore(List<Actor> c) {
		ar.saveAll(c);
		return "success";
	}
	
    public List<Actor> putBulkStore(){
    	return ar.findAll();
    }
	public Actor getActor(int id) {
		return ar.findById(id).get();
	}
	public String deleteActor(int id) {
		ar.deleteById(id);
		return "Deleted";
	}
	public String putAge(Actor a,int id) {
		Actor a1=ar.findById(id).get();
		a1.setAge(a.getAge());
		ar.save(a1);
		return "updatated";
	}
	
	}
