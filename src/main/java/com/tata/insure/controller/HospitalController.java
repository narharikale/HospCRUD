package com.tata.insure.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tata.insure.entity.Hospital;
import com.tata.insure.serviceImpl.Hospitalimpl;

@RestController
//@RequestMapping("/hospital")
public class HospitalController {
	
	@Autowired
	private Hospitalimpl service;
	
	@PostMapping("/addHospital")
	public Hospital addHospital(@RequestBody Hospital hospital) {
		System.out.println("data adding");
		return service.saveHospital(hospital);
		}
	
	@PostMapping("/saveAll")
		public List<Hospital> addHospital(@RequestBody List<Hospital> hospital){
			return service.saveHospital(hospital);
		}
	
	@GetMapping("/getHospital/{name}")
	public List<Hospital> getHospital(@PathVariable String name) {
		return service.getHospital(name);
	}
	
	@GetMapping("/allHospitalList")
	public List<Hospital> getHospitalList(){
		return service.getHospitalList();
	}
	
	@DeleteMapping("/deletebyid/{id}")
	public String deleteHospital(@PathVariable int id) {
		return service.deleteHospital(id);
	}
	
	@PutMapping("/updateHospital")
	public Hospital updateHospital(@RequestBody Hospital hospital) {
		return service.updateHospital(hospital);
	}
	}
