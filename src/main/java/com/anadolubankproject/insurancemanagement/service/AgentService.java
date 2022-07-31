package com.anadolubankproject.insurancemanagement.service;

import com.anadolubankproject.insurancemanagement.entity.Agent;
import com.anadolubankproject.insurancemanagement.repo.AgentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AgentService implements IAgentService {

    @Autowired
    private AgentRepository agentRepository;

    public List<Agent> findAll() {return this.agentRepository.findAll();}
}
