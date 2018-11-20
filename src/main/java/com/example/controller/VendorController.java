package com.jacket.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.jacket.model.Vendor;
import com.jacket.service.VendorService;

@Controller
@RequestMapping("/vendors")
public class VendorController {

	@Autowired
	private VendorService vendorService;
	
	@RequestMapping("/all")
	public ModelAndView Vendors() {
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("vendors",vendorService.findAll());
		modelAndView.addObject("mode", "MODE_ALL");
		modelAndView.setViewName("vendor");

		return modelAndView;
		
	}
	
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public ModelAndView saveVendor(@Valid Vendor vendor, BindingResult bindingResult) {
		ModelAndView modelAndView = new ModelAndView("redirect:/vendors/all");
		vendorService.save(vendor);
		return modelAndView;
	}
	
	@RequestMapping(value = "/update", method = RequestMethod.GET)
	public ModelAndView updateVendor(@RequestParam int id) {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("rule", new Vendor());
		modelAndView.addObject("vendor", vendorService.findVendor(id));
		modelAndView.addObject("mode", "MODE_UPDATE");
		modelAndView.setViewName("vendor");
		return modelAndView;
	}
	
	@RequestMapping(value = "/delete", method = RequestMethod.GET)
	public ModelAndView deleteVendor(@RequestParam int id) {
		ModelAndView modelAndView = new ModelAndView("redirect:/vendors/all");
		modelAndView.addObject("rule", new Vendor());
		vendorService.delete(id);
		return modelAndView;
	}

}
