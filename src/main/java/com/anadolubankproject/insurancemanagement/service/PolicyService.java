package com.anadolubankproject.insurancemanagement.service;

import com.anadolubankproject.insurancemanagement.entity.Policy;
import com.anadolubankproject.insurancemanagement.repo.PolicyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PolicyService implements IPolicyService {

	private PolicyRepository policyRepository;

	@Autowired
	public PolicyService(PolicyRepository policyRepository) {
		super();
		this.policyRepository = policyRepository;
	}

	@Override
	public List<Policy> findAll() {
		return this.policyRepository.findAll();

	}

	@Override
	public Optional<Policy> getPolicyById(Integer id) {
		return policyRepository.findById(1L);
	}
}
