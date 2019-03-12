package com.techelevator;

import com.techelevator.dao.CustomerDao;
import com.techelevator.dao.model.Customer;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CustomerSearchController {

    @Autowired
    private CustomerDao customerDao;
    
    @RequestMapping("/customerList")
    public String showCustomerSearchForm() {
    	return "customerList";
    }
    
    @RequestMapping(path="/customerList", method=RequestMethod.POST)
    public String searchCustomer(HttpServletRequest request) {
    	Customer customer = new Customer();
    	String isActive = convertBooleanToYesOrNo(customer.isActive());
    	
    	String sort = request.getParameter("sort");
    	String search = request.getParameter("search");
    	
    	List<Customer> customers = customerDao.searchAndSortCustomers(search, sort);
    	
    	request.setAttribute("customers", customers);
		return "customerList";
    	
    }
    
    
    private String convertBooleanToYesOrNo(boolean argument) {
		String yesOrNo = "";
		
		if (argument) {
			yesOrNo = "Yes";
		} else {
			yesOrNo = "No";
		}
		
		return yesOrNo;
	}
    
    
    

}