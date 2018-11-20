package com.jacket.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jacket.model.Vendor;

@Repository("vendorRepository")

public interface VendorRepository extends JpaRepository<Vendor, Integer>{
	 
}
