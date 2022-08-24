package com.tata.insure.serviceImpl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tata.insure.entity.Hospital;
import com.tata.insure.repository.HospitalRepository;
import com.tata.insure.service.HospitalService;

@Service
public class Hospitalimpl implements HospitalService{
	
	@Autowired
	private HospitalRepository repo;

	@Override
	public Hospital saveHospital(Hospital hospital) {
		return repo.save(hospital);
	}

	@Override
	public List<Hospital> saveHospital(List<Hospital> hospital) {
		return repo.saveAll(hospital);
	}
	
	@Override
	public List<Hospital> getHospital(String name) {
		return repo.findByHospitalName(name);
	}
	
	@Override
	public String deleteHospital(int id) {
		repo.deleteById(id);
		return "deleted record for id "+id;
	}

	@Override
	public List<Hospital> getHospitalList() {
		return repo.findAll();
	}

	@Override
	public Hospital updateHospital(Hospital hospital) {
		Hospital hosp = repo.getById(hospital.getId());
		hosp.setHospitalName(hospital.getHospitalName());
		hosp.setType(hospital.getType());
		return repo.save(hosp);
	}
}
