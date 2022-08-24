package com.tata.insure.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tata.insure.entity.Address;

public interface AddressRepository extends JpaRepository<Address, Integer> {

}
