package com.controllerPackage;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.customerInfo.CustomerInfo;

import servicesPackage.AutoService;

@Controller
@RequestMapping("autozone")
public class AutoController {

	private AutoService at;

	@RequestMapping(value = "", method = RequestMethod.GET)

	public ModelAndView showAutoCustomer() {

		ModelAndView mv = new ModelAndView();
		mv.setViewName("autoparts-context");

		CustomerInfo ci = new CustomerInfo();
		mv.addObject("info", ci);
		return mv;
	}

	@RequestMapping(value = "", method = RequestMethod.POST)
	public String loginCustomer(CustomerInfo c) throws Exception {
		at.saveCustomerInfo(c);
		return "Information";

	}

	public AutoService getAt() {
		return at;
	}

	public void setAt(AutoService at) {
		this.at = at;
	}
}
