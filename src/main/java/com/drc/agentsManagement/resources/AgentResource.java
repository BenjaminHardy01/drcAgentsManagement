package com.drc.agentsManagement.resources;

import com.drc.agentsManagement.entities.Agent;
import com.drc.agentsManagement.services.AgentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class AgentResource {

    @Autowired
    private AgentService agentService;

    @GetMapping("/agents/get-by-prov/{provId}")
    public List<Agent> getAgentsByProvince(@PathVariable String provId) {
        return agentService.getAgentsByProvince(provId);
    }
    @GetMapping("/agents/get-by-name/{keyword}")
    public List<Agent> getAgentByLastName(@PathVariable String keyword) {
        return agentService.getAgentByLastName(keyword);
    }


    @GetMapping("/agents/get-by-cat/{catId}")
    public List<Agent> getAgentsByCategorie(@PathVariable String catId) {
        return agentService.getAgentsByCategorie(catId);
    }

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

    @PutMapping("/agents")
    public int updateAgent(@RequestBody Agent agent) {
        return agentService.updateAgent(agent);
    }

    @PutMapping("/agents/updateCat")
    public int updateAgentCategorie(@RequestBody Agent agent) {
        return agentService.updateAgentCategorie(agent);
    }
    @PutMapping("/agents/update-prov")
    public int updateAgentProvince(@RequestBody Agent agent) {
        return agentService.updateAgentProvince(agent);
    }

    @DeleteMapping("/agents/{id}")
    public boolean deleteAgent(@PathVariable String id) {
       return agentService.deleteAgent(id);
    }
}
