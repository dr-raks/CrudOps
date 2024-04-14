package com.crudOperation.crudOperation.service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.crudOperation.crudOperation.entity.Students;
import com.crudOperation.crudOperation.repo.Repo;

@Service
public class Services {

	@Autowired
	Repo repos;
	
	public Students addStud(Students students)
	{
		
		return repos.save(students); 
	}
	
	public List<Students> readDet(Students students)
	{
		
		return repos.findAll(); 
	}
	
	public Optional<Students> findStudById(@RequestParam int stid)
	{
		
		return repos.findById(stid);
	}
	
	public String updateName(@RequestBody int stid, String stname)
	{
		
		repos.updateName(stid, stname);
		return "Name Updated Successfully";
	}
	
	public String updateAllAttrib(@RequestBody int stid, String stname, Date dob, Date doa, int cid, int cfee)
	{
		
		repos.updateAll(stid, stname, dob, doa, cid, cfee);
		return "All Attributes Updated Successfully";
	}
	
	public String deleteRecById(@RequestParam int stid)
	{
		
		repos.deleteById(stid);
		return "Record Deleted Successfully !!!";
	}
}
