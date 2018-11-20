package com.jacket.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.jacket.model.Vendor;
import com.jacket.service.VendorService;

@Controller
public class LoginController {
	
//	@Autowired
//	private UserService userService;

	@Autowired
	private VendorService vendorService;

	@RequestMapping(value={"/", "/login"}, method = RequestMethod.GET)
	public ModelAndView login(){
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("login");
		return modelAndView;
	}

	@RequestMapping(value={"/index"}, method = RequestMethod.GET)
	public ModelAndView index(){
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("index");
		return modelAndView;
	}
	
	@RequestMapping(value="/home", method = RequestMethod.GET)
	public ModelAndView home(){
		ModelAndView modelAndView = new ModelAndView();

		List<Vendor> vendors = new ArrayList<>();
	
		vendors = vendorService.findAll();

		int vendorCount = vendors.size();
		modelAndView.addObject("vendorCount", vendorCount);
		//-----------------------------------------
//		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
//		User loginUser = userService.findUserByEmail(auth.getName());
//		modelAndView.addObject("control", loginUser.getRole().getRole());//Authentication for NavBar
//		modelAndView.addObject("auth", loginUser);

		modelAndView.setViewName("home");
		return modelAndView;
	}
}
