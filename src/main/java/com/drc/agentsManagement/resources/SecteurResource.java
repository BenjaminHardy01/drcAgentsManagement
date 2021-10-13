package com.drc.agentsManagement.resources;

import com.drc.agentsManagement.entities.Secteur;
import com.drc.agentsManagement.services.SecteurService;
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
public class SecteurResource {
    @Autowired
    private SecteurService secteurService;

    @PostMapping("/secteurs")
    public Secteur saveSect(@RequestBody Secteur secteur) {
        return secteurService.saveSect(secteur);
    }
    @GetMapping("/secteurs")
    public List<Secteur> getAllSect() {
        return secteurService.getAllSect();
    }
    @GetMapping("/secteurs/{id}")
    public Secteur getSect(@PathVariable String id) {
        return secteurService.getSect(id);
    }

    public Secteur updateSect(Secteur secteur) {
        return secteurService.updateSect(secteur);
    }

    @DeleteMapping("/secteurs/{id}")
    public boolean deleteSect(@PathVariable String id) {
        return secteurService.deleteSect(id);
    }
}
