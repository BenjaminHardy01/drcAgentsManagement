package com.drc.agentsManagement.resources;

import com.drc.agentsManagement.entities.Ville;
import com.drc.agentsManagement.services.VilleService;
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

    @PutMapping("/villes")
    public int updateVille(@RequestBody Ville ville) {
        return villeService.updateVille(ville);
    }

    @PutMapping("/villes/update-province")
    public int updateVilleProvince(@RequestBody Ville ville) {
        return villeService.updateVilleProvince(ville);
    }

    @GetMapping("/villes/get-by-province/{provId}")
    public List<Ville> getVillesByProvince(@PathVariable String provId) {
        return villeService.getVillesByProvince(provId);
    }

    @GetMapping("/villes/get-by-name/{keyword}")
    public List<Ville> getVillesByName(String keyword) {
        return villeService.getVillesByName(keyword);
    }

    @DeleteMapping("/villes/{id}")
    public boolean deleteVille(@PathVariable String id) {
        return villeService.deleteVille(id);
    }
}
