package com.tata.insure.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tata.insure.entity.PolicyQuotation;
import com.tata.insure.serviceImpl.PolicyQuotationServiceImpl;

@RestController
@RequestMapping("/quotation")
public class QuotationController {

	@Autowired
	PolicyQuotationServiceImpl quotationServiceImpl;
	
	//api for get quotation by name
	@GetMapping("/getQuotation/{name}")
	public PolicyQuotation getQuotation(@PathVariable String name) {
		return quotationServiceImpl.getQuotation(name);
	}
	
	//api for get quotation by id
	@GetMapping("/quotaid/{id}")
	public PolicyQuotation getQuota(@PathVariable int id) {
		return quotationServiceImpl.getQuota(id);
	}
	
	//api for saving quotation details
	@PostMapping("/addQuotation")
	public PolicyQuotation addQuotation(@RequestBody PolicyQuotation policyQuotation) {
		return quotationServiceImpl.saveQuotation(policyQuotation);
	}
}
