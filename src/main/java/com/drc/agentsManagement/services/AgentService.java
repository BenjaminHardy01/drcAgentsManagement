package com.drc.agentsManagement.services;

import com.drc.agentsManagement.entities.Agent;

import java.util.List;

public interface AgentService {
    public Agent saveAgent(Agent agent);
    public List<Agent> getAgentsList();
    public Agent getAgent(String id);
    public int updateAgent(Agent agent);
    public int updateAgentCategorie(Agent agent);
    public int updateAgentProvince(Agent agent);
    public List<Agent> getAgentsByCategorie(String catId);
    public List<Agent> getAgentsByProvince(String provId);
    public List<Agent> getAgentByLastName(String keyword);
    public boolean deleteAgent(String id);
}
