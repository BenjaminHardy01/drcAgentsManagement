package com.drc.agentsManagement.services;

import com.drc.agentsManagement.entities.Agent;
import com.drc.agentsManagement.repositories.AgentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.time.LocalDate;
import java.util.List;

@Service
public class AgentServiceImpl implements AgentService{
    @Autowired
    private AgentRepository agentRepository;

    @Override
    public Agent saveAgent(Agent agent) {
        agent.setDateOfBirth(LocalDate.of(1991,7,1));
        return agentRepository.save(agent);
    }

    @Override
    public List<Agent> getAgentsList() {
        return agentRepository.findAll();
    }

    @Override
    public Agent getAgent(String id) {

        return agentRepository.findById(id).get();
    }

    @Override
    public Agent updateAgent(Agent agent) {
        return null;
    }

    @Override
    public boolean deleteAgent(String id) {
        try {
            agentRepository.deleteById(id);
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
        return true;
    }
}
