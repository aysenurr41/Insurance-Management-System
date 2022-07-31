package com.anadolubankproject.insurancemanagement.service;

import com.anadolubankproject.insurancemanagement.entity.Policy;

import java.util.List;
import java.util.Optional;

public interface IPolicyService {
    public List<Policy> findAll();
    Optional<Policy> getPolicyById(Integer id);
}
