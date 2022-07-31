package com.anadolubankproject.insurancemanagement.repo;

import com.anadolubankproject.insurancemanagement.entity.Agent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AgentRepository extends JpaRepository<Agent, Long> {
}
