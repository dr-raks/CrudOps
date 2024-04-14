package com.crudOperation.crudOperation.controller;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.crudOperation.crudOperation.entity.Students;
import com.crudOperation.crudOperation.service.Services;

@RestController
public class Controllers {
	
	@Autowired
	Services services;
	
	@PostMapping("/api/addStud")
	@Validated
	public Students getAttributes(@RequestBody Students students)
	{
		
		return services.addStud(students);
	}
	
	@GetMapping("/api/getAllDet")
	@Validated
	public List<Students> readData(Students students)
	{
		
		return services.readDet(students);
	}
	
	@GetMapping("/api/detailsById")
	@Validated
	public Optional<Students> findRecById(@RequestParam int stid)
	{
		
		return services.findStudById(stid);
	}
	
	@PatchMapping("/api/modifyName")
	@Validated 
	public String updateStName(@RequestBody int stid, String stname)
	{
		
		return services.updateName(stid, stname);
	}
	
	@PutMapping("/api/modifyAllDet")
	@Validated
	public String updateAllDetails(@RequestBody int stid, String stname, Date dob, Date doa, int cid, int cfee)
	{
		
		return services.updateAllAttrib(stid, stname, dob, doa, cid, cfee);
	}
	
	@DeleteMapping("/api/deleteStudent")
	@Validated
	public String deleteRecordsById(@RequestParam int stid)
	{
		
		return services.deleteRecById(stid);
	}
}
