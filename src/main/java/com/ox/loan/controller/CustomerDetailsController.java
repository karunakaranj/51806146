package com.ox.loan.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ox.loan.model.CustomerDetails;
import com.ox.loan.service.ICustomerDetailsService;

@RestController
@RequestMapping("/loan")
public class CustomerDetailsController {
	
	@Autowired ICustomerDetailsService iCustomerDetailsService;
	
//	@PostMapping("/apply")
//	public CustomerDetails loanApply(@RequestBody CustomerDetails customerDetails) {
//		return iCustomerDetailsService.loanApply(customerDetails);
//		
//	}

	
	@PostMapping("/apply")
	public CustomerDetails loanApply(@RequestBody CustomerDetails customerDetails) {
		
		
		return iCustomerDetailsService.loanApply(customerDetails);
		
	}
	@GetMapping("/getApplications")
	public List<CustomerDetails> loanapplications() {
		
			return iCustomerDetailsService.getRecords();
		
	}
	
	@PostMapping("/mangerApprove")
	public CustomerDetails approve(@RequestBody CustomerDetails customerDetails) {
		return iCustomerDetailsService.managerAprove(customerDetails);

	}
		
}
