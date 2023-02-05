package com.example.Celebrity;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ActorController {
	@Autowired
	ActorService as;
	
	@PostMapping(value = "/posting")
	public String store1(@RequestBody Actor a) {
		return as.setStore(a);
	}
	
	
    @PostMapping(value="/bulkPosting")
    public String store(@RequestBody List<Actor>a) {
    	return as.setBulkStore(a);
    }
    
    @GetMapping(value="/bulkgetting")
    public List<Actor> putBulkStore1(){
    	return as.putBulkStore();
    }
    @GetMapping(value="/getActor/{id}")
    public Actor getActor(@PathVariable int id) {
    	return as.getActor(id);
    }
    @PutMapping(value="/updateAge/{id}")
    public String putAge(@RequestBody Actor a,@PathVariable int id) {
    	return as.putAge(a,id);	
    }
    @DeleteMapping(value="/deleteActor/{id}")
    public String deleteActor(@PathVariable int id) {
    	return as.deleteActor(id);
    }
    
    
}
