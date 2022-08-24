package com.tata.insure.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tata.insure.entity.PolicyQuotation;
import com.tata.insure.repository.PolicyRepository;
import com.tata.insure.service.PolicyQuotationService;

@Service
public class PolicyQuotationServiceImpl implements PolicyQuotationService{

	@Autowired
	private PolicyRepository policyRepository;
	
	@Override
	public PolicyQuotation getQuotation(String name) {
		
		return policyRepository.findBypolicyName(name);
	}
	
	public PolicyQuotation getQuota(int id) {
		return policyRepository.findById(id).orElse(null);
	}

	@Override
	public PolicyQuotation saveQuotation(PolicyQuotation policyQuotation) {
		
		return policyRepository.save(policyQuotation);
	}

}
