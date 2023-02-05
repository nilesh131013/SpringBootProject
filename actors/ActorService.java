package com.example.Celebrity;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class ActorService {
    @Autowired
    ActorDao ad;
    
	public String setStore(Actor b) {
	
		return ad.getStore(b);
	}
	
	public String setBulkStore(List<Actor> b) {
		return ad.getBulkStore(b);
	}
	
    public List<Actor> putBulkStore(){
    	return ad.putBulkStore();
    }
	public String deleteActor(int id) {
		return ad.deleteActor(id);
	}
	public Actor getActor(int id) {
		return ad.getActor(id);
	}
	public String putAge(Actor a,int id) {
		return ad.putAge(a,id);
	}

 
}
