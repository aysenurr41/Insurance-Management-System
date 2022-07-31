package com.anadolubankproject.insurancemanagement.repo;

import com.anadolubankproject.insurancemanagement.entity.InsuranceManager;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InsuranceManagerRepository extends JpaRepository<InsuranceManager, Long> {
}
