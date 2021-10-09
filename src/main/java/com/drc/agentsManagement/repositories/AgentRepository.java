package com.drc.agentsManagement.repositories;

import com.drc.agentsManagement.entities.Agent;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AgentRepository extends JpaRepository<Agent,String> {

}
