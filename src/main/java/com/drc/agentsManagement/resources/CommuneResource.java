package com.drc.agentsManagement.resources;

import com.drc.agentsManagement.entities.Commune;
import com.drc.agentsManagement.services.CommuneService;
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
public class CommuneResource {
    @Autowired
    private CommuneService communeService;

    @PostMapping("/communes")
    public Commune saveCom(@RequestBody Commune commune) {
        return communeService.saveCom(commune);
    }

    @GetMapping("/communes")
    public List<Commune> getAllCom() {
        return communeService.getAllCom();
    }

    @GetMapping("/communes/{id}")
    public Commune getCommune(@PathVariable String id) {
        return communeService.getCommune(id);
    }

    @PutMapping("/communes")
    public int updateCom(@RequestBody Commune commune) {
        return communeService.updateCom(commune);
    }

    @GetMapping("/communes/get-by-name/{keyword}")
    public List<Commune> getCommunesByName(String keyword) {
        return communeService.getCommunesByName(keyword);
    }

    @PutMapping("/communes/update-ville")
    public int updateCommuneVille(Commune commune) {
        return communeService.updateCommuneVille(commune);
    }

    @DeleteMapping("/communes/{id}")
    public boolean deleteCom(@PathVariable String id) {
        return communeService.deleteCom(id);
    }
}
