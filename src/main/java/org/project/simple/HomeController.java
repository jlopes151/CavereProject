package org.project.simple;

import java.text.DateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import org.project.simple.db.repository.impl.CustomerListRepositoryImpl;
import org.project.simple.domain.Customer_List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	private CustomerListRepositoryImpl customerListRepositoryImpl;

	@Autowired
	public HomeController(CustomerListRepositoryImpl customerListRepositoryImpl){
		this.customerListRepositoryImpl = customerListRepositoryImpl;
	}

	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home";
	}
	
	@RequestMapping(value = "/GetCustomerList", method = RequestMethod.GET)
	public List<Customer_List> getCustomerList() {
		logger.info("Getting the customer list");;
		return customerListRepositoryImpl.getCustomerList();
	}

	@RequestMapping(value = "/ShowBackBone", method = RequestMethod.GET)
	public String showBackbone() {
		logger.info("Activate the Backbone main page");
		return "Backbonejs/backBone";
	}

	@RequestMapping(value = "/ShowAngularJS", method = RequestMethod.GET)
	public String showAngularJS() {
		logger.info("Activate the Angular main page");
		return "Angularjs/angularjs";
	}

}
