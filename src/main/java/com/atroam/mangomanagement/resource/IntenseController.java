package com.atroam.mangomanagement.resource;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.atroam.mangomanagement.model.Intense;
import com.atroam.mangomanagement.repository.IntenseRepository;

@RestController
public class IntenseController {
	
	@Autowired
	IntenseRepository intenseRepository;
	
	@PostMapping("/addIntense")
	public ResponseEntity<?> addIntense(@RequestBody Intense intense) {
		intenseRepository.save(intense);
		//return "Added Intense with id "+ intense.getId();
		 return new ResponseEntity<String>("Added Intense with id "+ intense.getId(), HttpStatus.CREATED);
	}
	
	@GetMapping("/intense")
	public List<Intense> findAllIntense(){
		return intenseRepository.findAll();
	}
	
	@GetMapping("/intense/{id}")
	public Optional<Intense> findIntenseById(@PathVariable int id){
		return intenseRepository.findById(id);
	}
	
	@DeleteMapping("/intense/{id}")
	public ResponseEntity<?> deleteIntenseById(@PathVariable int id){
		 intenseRepository.deleteById(id); 
		 return ResponseEntity.ok("Intense deleted with id: "+ id);
	}
	

}
