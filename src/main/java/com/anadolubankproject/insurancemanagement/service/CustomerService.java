package com.anadolubankproject.insurancemanagement.service;

import com.anadolubankproject.insurancemanagement.entity.Customer;
import com.anadolubankproject.insurancemanagement.repo.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class CustomerService implements ICustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public List<Customer> findAll() {return this.customerRepository.findAll();}
}
