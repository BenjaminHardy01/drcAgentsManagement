package com.drc.agentsManagement.services;

import com.drc.agentsManagement.entities.Agent;

import java.util.List;

public interface AgentService {
    public Agent saveAgent(Agent agent);
    public List<Agent> getAgentsList();
    public Agent getAgent(String id);
    public void deleteAgent(String id);
}