package com.anadolubankproject.insurancemanagement.repo;

import com.anadolubankproject.insurancemanagement.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
