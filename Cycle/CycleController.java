package com.example.Cycle;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import jakarta.websocket.server.PathParam;


@RestController
@RequestMapping(value="/org")
public class CycleController {
	@Autowired
	CycleService cs;
	
	//@Value("${app.version}")
	@Value("${app.version: Default CL 1.01.05}")
	public String appVersion;     // @value annotation doest work in pojo class(entity) apart ser,dao,restcon 
								//  its working
	
	
	@GetMapping(value="/getAppVersion")
	public String getAppVersion() {
		return appVersion;
	}
	
	@PostMapping(value="/add")
	public String add(@RequestBody List<Cycle> cy) {
		return cs.add(cy);
	}
	@GetMapping(value="/get")
	public List<Cycle> get(){
		return cs.get();
	}
	
	@GetMapping(value="/getById/{a}")
	public Cycle getById(@PathVariable int a) {
		return cs.getById(a);
	}
	
	
	@RequestMapping(value="/getByTwo")
	public List<Cycle> getByTwo(@PathParam ("c_model")String a,@PathParam ("color") String b)
	{
		return cs.getByTwo(a,b);
	}
	
	
	@GetMapping(value="/getByName")
	public List<Cycle> getByName(@RequestParam("c_model") String n) {
		
		return cs.getByName(n);
		
	}
	
	
	
	@Autowired
	@Qualifier("dealerEmail") // must be use camel conversion while write that class inside qualifier
	Email email;					// dont write @Qualifier("DealerEmail")
	
	@GetMapping(value="/getEmail")
	public String getEmail() {
		return email.emailId();
	}
	
	/*@Autowired
	Email carrierEmail;
	@GetMapping(value="/getEmail")
	public String getEmail() {
		return carrierEmail.emailId();
	}
	*/

}
