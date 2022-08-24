package com.tata.insure.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name="hospitals")
public class Hospital {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id")
	private int id;
	//@Column(name="hospital_name")
	private String hospitalName;
	//@Column(name="hospital_type")
	private String type;
	
	//@OneToOne(cascade = CascadeType.ALL)
	//@JoinColumn(name="fk_address_id")
	//private Address address;
	
	public int getId() {
		return id;
	}
	public String getHospitalName() {
		return hospitalName;
	}
	public void setHospitalName(String hospitalName) {
		this.hospitalName = hospitalName;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return "Hospital [id=" + id + ", hospitalName=" + hospitalName + ", type=" + type + "]";
	}
	
}
