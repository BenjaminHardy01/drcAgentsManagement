package com.drc.agentsManagement.resources;

import com.drc.agentsManagement.entities.Secteur;
import com.drc.agentsManagement.services.SecteurService;
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

    @PutMapping("/secteurs")
    public int updateSect(@RequestBody Secteur secteur) {
        return secteurService.updateSect(secteur);
    }

    @PutMapping("/secteurs/update-territoire")
    public int updateSecteurTerritoire(@RequestBody Secteur secteur) {
        return secteurService.updateSecteurTerritoire(secteur);
    }

    @GetMapping("/secteurs/get-by-territoire/{terreId}")
    public List<Secteur> getSecteursByTerritoire(@PathVariable String terreId) {
        return secteurService.getSecteursByTerritoire(terreId);
    }

    @GetMapping("/secteurs/get-by-name/{keyword}")
    public List<Secteur> getSecteursByName(@PathVariable String keyword) {
        return secteurService.getSecteursByName(keyword);
    }

    @DeleteMapping("/secteurs/{id}")
    public boolean deleteSect(@PathVariable String id) {
        return secteurService.deleteSect(id);
    }
}
