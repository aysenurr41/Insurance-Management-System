package com.anadolubankproject.insurancemanagement.service;

import com.anadolubankproject.insurancemanagement.entity.InsuranceManager;
import com.anadolubankproject.insurancemanagement.entity.Policy;
import com.anadolubankproject.insurancemanagement.repo.InsuranceManagerRepository;
import com.anadolubankproject.insurancemanagement.repo.PolicyRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class InsuranceManagerService implements IInsuranceManagerService {
    @Autowired
    private InsuranceManagerRepository insuranceManagerRepository;

    @Override
    public List<InsuranceManager> findAll() {
        return this.insuranceManagerRepository.findAll();
    }

}
