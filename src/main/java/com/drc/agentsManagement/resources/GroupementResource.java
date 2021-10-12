package com.drc.agentsManagement.resources;

import com.drc.agentsManagement.entities.Groupement;
import com.drc.agentsManagement.services.GroupementService;
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
public class GroupementResource {
    @Autowired
    private GroupementService groupementService;

    @PostMapping("/groupements")
    public Groupement saveGroupe(@RequestBody Groupement groupement) {
        return groupementService.saveGroupe(groupement);
    }
    @GetMapping("/groupements")
    public List<Groupement> getAllGroupe() {
        return groupementService.getAllGroupe();
    }
    @GetMapping("/groupements/{id}")
    public Groupement getGroupe(@PathVariable String id) {
        return groupementService.getGroupe(id);
    }

    public Groupement updateGroupe(Groupement groupement) {
        return groupementService.updateGroupe(groupement);
    }
    @DeleteMapping("/groupements/{id}")
    public boolean deleteGroupe(@PathVariable String id) {
        return groupementService.deleteGroupe(id);
    }
}
