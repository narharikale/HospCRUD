package com.tata.insure.service;


import com.tata.insure.entity.PolicyQuotation;

public interface PolicyQuotationService {

	public PolicyQuotation saveQuotation(PolicyQuotation policyQuotation);
	public PolicyQuotation getQuotation(String name);
}
