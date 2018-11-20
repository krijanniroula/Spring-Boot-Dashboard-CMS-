package com.jacket.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jacket.model.Vendor;
import com.jacket.repository.VendorRepository;

@Service("vendorService")
public class VendorService {
	
	@Autowired
	private VendorRepository vendorRepository;

	 public VendorService(VendorRepository vendorRepository) {
	        this.vendorRepository = vendorRepository;
	    }

	    public List<Vendor> findAll() {
	        List<Vendor> vendors = new ArrayList<>();
	        vendors = vendorRepository.findAll();
	        return vendors;
	    }

	    public Vendor findVendor(int id) {
	        return vendorRepository.findOne(id);
	    }

	    public void delete(int id) {
	        vendorRepository.delete(id);

	    }

	    public void save(Vendor vendor) {
	        vendorRepository.save(vendor);
	    }

}
