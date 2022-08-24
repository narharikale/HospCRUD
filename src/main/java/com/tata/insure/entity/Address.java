package com.tata.insure.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="address")
public class Address {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="Id")
	private int id;
	//@Column(name="area")
	private String area;
	//@Column(name="city")
	private String city;
	//@Column(name="pin")
	private String pin;
	//@Column(name="contact_number")
	private String contactNumber;
	//@Column(name="email")
	private String email;
	
	public int getId() {
		return id;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getPin() {
		return pin;
	}
	public void setPin(String pin) {
		this.pin = pin;
	}
	public String getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "Address [id=" + id + ", area=" + area + ", city=" + city + ", pin=" + pin + ", contactNumber="
				+ contactNumber + ", email=" + email + "]";
	}
	
}
