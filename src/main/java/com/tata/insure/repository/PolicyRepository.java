package com.tata.insure.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tata.insure.entity.PolicyQuotation;

public interface PolicyRepository extends JpaRepository<PolicyQuotation,Integer> {

	PolicyQuotation findBypolicyName(String name);
	
}
