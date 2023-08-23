package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.BusDetails;
import com.example.demo.service.Busdetailservice;

@RestController
public class BusDetailsController {

	@Autowired
	Busdetailservice bs;
	
	@PostMapping("addbus")
	public BusDetails addbus(@RequestBody BusDetails bd) {
		return bs.add(bd);
	}
	@PostMapping("addnbus")
	public List<BusDetails> addn(@RequestBody List<BusDetails> bd){
		return bs.addn(bd);
	}
	
	@GetMapping("dispbus")
	public List<BusDetails> show(BusDetails bd){
		return bs.print(bd);
	}
	@GetMapping("dispbusid/{id}")
	public Optional<BusDetails> showid(@PathVariable int id){
		return bs.printid(id);
	}
	
	@PutMapping("updatebus")
	public BusDetails update(@RequestBody BusDetails bd) {
		return bs.update(bd);
	}
	@PutMapping("updatebus/{id}")
	public String modifyinfo(@PathVariable int id,@RequestBody BusDetails bd) {
		return bs.updateinfo(id, bd);
	}
	@DeleteMapping("delbus/{id}")
	public String del(@PathVariable int id) {
		bs.delete(id);
		return "Deleted";
	}
	@DeleteMapping("deletebus")
	public String delete (@RequestBody  BusDetails bd) {
		bs.deleteinfo(bd);
		return "Deleted Successfully";
	}
}
