package com.drc.agentsManagement.resources;

import com.drc.agentsManagement.entities.Cite;
import com.drc.agentsManagement.services.CiteService;
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
public class CiteResource {
    @Autowired
    private CiteService citeService;

    @PostMapping("/cites")
    public Cite saveCite(@RequestBody Cite cite) {
        return citeService.saveCite(cite);
    }

    @GetMapping("/cites")
    public List<Cite> getAllCities() {
        return citeService.getAllCities();
    }

    @GetMapping("/cites/{id}")
    public Cite getCite(@PathVariable String id) {
        return citeService.getCite(id);
    }

    public Cite updateCite(Cite cite) {
        return citeService.updateCite(cite);
    }

    @DeleteMapping("/cites/{id}")
    public boolean deleteCite(@PathVariable String id) {
        return citeService.deleteCite(id);
    }
}
