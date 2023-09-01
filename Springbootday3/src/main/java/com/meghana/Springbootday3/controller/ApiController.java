package com.meghana.Springbootday3.controller;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.meghana.Springbootday3.model.*;
import com.meghana.Springbootday3.service.*;

@RestController
public class ApiController {
	@Autowired
	ApiService eser;
	
	@PostMapping("/set")
	public Employee add(@RequestBody Employee e) {
		return eser.setValues(e);
	}
	
	@GetMapping("/show1")
	public List<Employee> show(){
		return eser.showValues();
	}
	
	@GetMapping("/show2/{id}")
	public Optional<Employee> showEmployee(@PathVariable(value = "id") int id) {
		return eser.showEmployee(id);
	}

}
