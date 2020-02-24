package com.controllerPackage;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.customerInfo.CustomerInfo;

import servicesPackage.AutoService;
import servicesPackage.CustomerService;

@Controller

public class AutoController {

	private AutoService at;
	private CustomerService cs;

	@RequestMapping(value = "autozone", method = RequestMethod.GET)

	public ModelAndView showAutoCustomer() {

		ModelAndView mv = new ModelAndView();
		mv.setViewName("autoparts-context");

		CustomerInfo ci = new CustomerInfo();
		mv.addObject("info", ci);
		return mv;
	}

	@RequestMapping(value = "autozone", method = RequestMethod.POST)
	public String loginCustomer(CustomerInfo c) throws Exception {
		at.saveCustomerInfo(c);
		return "Information";

	}

	@RequestMapping(value = "/customer", method = RequestMethod.GET)

	public ModelAndView getAutoCustomer(@RequestParam String id) throws Exception {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("Customerinfo");

		CustomerInfo c = cs.getCustomerById(id);
		mv.addObject("Customerinfo", c);
		return mv;
	}

	
	
	public CustomerService getCs() {
		return cs;
	}

	public void setCs(CustomerService cs) {
		this.cs = cs;
	}

	public AutoService getAt() {
		return at;
	}

	public void setAt(AutoService at) {
		this.at = at;
	}
}
