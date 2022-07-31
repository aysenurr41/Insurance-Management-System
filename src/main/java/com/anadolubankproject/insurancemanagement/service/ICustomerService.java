package com.anadolubankproject.insurancemanagement.service;

import com.anadolubankproject.insurancemanagement.entity.Customer;

import java.util.List;

public interface ICustomerService {
    public List<Customer> findAll();
}
