package com.ox.loan.service;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import com.ox.loan.controller.CreditScoreLessException;
import com.ox.loan.model.CustomerDetails;
import com.ox.loan.repository.CustomerDeatilsRepository;

@Service
public class CustomerDetailsService implements ICustomerDetailsService{

	@Autowired CustomerDeatilsRepository customerDeatilsRepository;
	@Override
	public CustomerDetails loanApply(CustomerDetails customerDetails) {
		
//	     return	customerDeatilsRepository.save(CustomerDetails);
		System.out.println(customerDetails.getDob());
		if(customerDetails.getCreditScore()<=900)
			throw new CreditScoreLessException("credit score less");
		else 
			return	customerDeatilsRepository.save(customerDetails);
		
		/*
		 * String s = "1994/06/23"; SimpleDateFormat sdf = new
		 * SimpleDateFormat("yyyy/MM/dd"); Date d = sdf.parse(s); Calendar c =
		 * Calendar.getInstance(); c.setTime(d); int year = c.get(Calendar.YEAR); int
		 * month = c.get(Calendar.MONTH) + 1; int date = c.get(Calendar.DATE); LocalDate
		 * l1 = LocalDate.of(year, month, date); LocalDate now1 = LocalDate.now();
		 * Period diff1 = Period.between(l1, now1); diff1.getMonths();
		 * System.out.println("age:" + diff1.getYears() + "years");
		 */
		
		
		
	}
	@Override
	public List<CustomerDetails> getRecords() {
		return customerDeatilsRepository.findAll();
	}
	
	
	@Override
	public CustomerDetails managerAprove(CustomerDetails CustomerDetails) {
		CustomerDetails customer2=new CustomerDetails();
		
//		customer2=customerDeatilsRepository.findById(CustomerDetails.getUserid());
		customer2.setApprovingmanagerid(CustomerDetails.getApprovingmanagerid());
		customer2.setMaritalStatus(CustomerDetails.getMaritalStatus());
		return customerDeatilsRepository.save(CustomerDetails);
		
	}
	
	
	
	

}
