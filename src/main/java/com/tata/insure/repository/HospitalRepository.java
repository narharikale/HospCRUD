package com.tata.insure.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tata.insure.entity.Hospital;

public interface HospitalRepository extends JpaRepository<Hospital, Integer>{

	List<Hospital>findByHospitalName(String name);
}
