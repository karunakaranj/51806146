package com.ox.loan.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ox.loan.model.CustomerDetails;

@Repository
public interface CustomerDeatilsRepository  extends JpaRepository<CustomerDetails, Integer>{
//
}
