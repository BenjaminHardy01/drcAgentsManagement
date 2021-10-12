package com.drc.agentsManagement.resources;

import com.drc.agentsManagement.entities.Ville;
import com.drc.agentsManagement.services.VilleService;
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
public class VilleResource {
    @Autowired
    private VilleService villeService;

    @PostMapping("/villes")
    public Ville saveVille(@RequestBody Ville ville) {
        return villeService.saveVille(ville);
    }
    @GetMapping("/villes")
    public List<Ville> getAllVille() {
        return villeService.getAllVille();
    }
    @GetMapping("/villes/{id}")
    public Ville getVille(@PathVariable String id) {
        return villeService.getVille(id);
    }

    public Ville updateVille(Ville ville) {
        return villeService.updateVille(ville);
    }
    @DeleteMapping("/villes/{id}")
    public boolean deleteVille(String id) {
        return villeService.deleteVille(id);
    }
}
