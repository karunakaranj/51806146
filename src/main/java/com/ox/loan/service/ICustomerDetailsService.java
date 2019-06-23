package com.ox.loan.service;

import java.util.List;

import com.ox.loan.model.CustomerDetails;


public interface ICustomerDetailsService {
	public CustomerDetails loanApply(CustomerDetails CustomerDetails);
	public List<CustomerDetails> getRecords();
	public CustomerDetails managerAprove(CustomerDetails CustomerDetails);


}
