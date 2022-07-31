package com.anadolubankproject.insurancemanagement.service;

import com.anadolubankproject.insurancemanagement.entity.Agent;
import com.anadolubankproject.insurancemanagement.entity.Policy;

import java.util.List;

public interface IAgentService {
    public List<Agent> findAll();
}
