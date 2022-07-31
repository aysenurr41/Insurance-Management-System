package com.anadolubankproject.insurancemanagement.repo;

import com.anadolubankproject.insurancemanagement.entity.Policy;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PolicyRepository extends JpaRepository<Policy, Long> {
}
