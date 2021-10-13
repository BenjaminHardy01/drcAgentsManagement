package com.drc.agentsManagement.services;

import com.drc.agentsManagement.entities.Agent;
import com.drc.agentsManagement.repositories.AgentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class AgentServiceImpl implements AgentService{
    @Autowired
    private AgentRepository agentRepository;

    @Override
    public Agent saveAgent(Agent agent) {
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
    public int updateAgent(Agent agent) {
        return agentRepository.updateAgent(agent.getAgentId(),agent.getAgentFirstName(),agent.getAgentMiddleName(),
                agent.getAgentLastName(),agent.getPlaceOfBirth(),agent.getDateOfBirth(),agent.getFatherFullName(),
                agent.getMotherFullName(),agent.getMaritalStatus(),agent.getNumberOfChildren());
    }

    @Override
    public int updateAgentCategorie(Agent agent) {
        return agentRepository.updateAgentCategorie(agent.getAgentId(),agent.getCategorie().getCatId());
    }

    @Override
    public int updateAgentProvince(Agent agent) {
        return agentRepository.updateAgentProvince(agent.getAgentId(),agent.getProvince().getProvinceId());
    }

    @Override
    public List<Agent> getAgentsByCategorie(String catId) {
        return agentRepository.getAgentsByCategorie(catId);
    }

    @Override
    public List<Agent> getAgentsByProvince(String provId) {
        return agentRepository.getAgentsByProvince(provId);
    }

    @Override
    public List<Agent> getAgentByLastName(String keyword) {
        return agentRepository.getAgentByLastName(keyword);
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
