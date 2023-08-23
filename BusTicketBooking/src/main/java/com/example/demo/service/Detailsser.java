package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Details;
import com.example.demo.repository.Detailsrep;

@Service
public class Detailsser {
	@Autowired
	Detailsrep re;

//post
	public Details add(Details d) {
		return re.save(d);
	}
	
	public List<Details> addn(List<Details> bd){
		return (List<Details>)re.saveAll(bd);
	}

//get
	public List<Details> showdetails(Details d){
		return re.findAll();
	}
	
	public Optional<Details> printid(int id){
		return re.findById(id);
	}
//update
	public Details modify(Details d) {
		return re.saveAndFlush(d);
	}
	
	public String updateinfo(int id,Details d) {
		re.saveAndFlush(d);
		if(re.existsById(id)) {
			return "UPDATED";
		}else {
			return "Enter valid id";
		}
	}
//delete
	public void remove(Details d) {
		re.delete(d);
		
	}
	
	public void delid(int id) {
		re.deleteById(id);
	}

}

