package com.drc.agentsManagement.resources;

import com.drc.agentsManagement.entities.Agent;
import com.drc.agentsManagement.services.AgentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class AgentResource {
    @Autowired
    private AgentService agentService;
    @PostMapping("/agents")
    public Agent saveAgent(@RequestBody Agent agent) {
        return agentService.saveAgent(agent);
    }

    @GetMapping("/agents")
    public List<Agent> getAgentsList() {
        return agentService.getAgentsList();
    }

    @GetMapping("/agents/{id}")
    public Agent getAgent(@PathVariable String id) {
        return agentService.getAgent(id);
    }

    @DeleteMapping("/agents/{id}")
    public void deleteAgent(@PathVariable String id) {
        agentService.deleteAgent(id);
    }
}
