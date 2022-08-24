package com.tata.insure.service;

import java.util.List;

import com.tata.insure.entity.Hospital;

public interface HospitalService {

	public Hospital saveHospital(Hospital hospital);
	public List<Hospital> saveHospital(List<Hospital> hospital);
	public List<Hospital> getHospital(String name);
	public List<Hospital> getHospitalList();
	public String deleteHospital(int id);
	public Hospital updateHospital(Hospital hospital);
	
}
