package com.drc.agentsManagement.resources;

import com.drc.agentsManagement.entities.Quartier;
import com.drc.agentsManagement.services.QuartierService;
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
public class QuartierResource {
    @Autowired
    private QuartierService quartierService;

    @PostMapping("/quartiers")
    public Quartier saveQuart(@RequestBody Quartier quartier) {
        return quartierService.saveQuart(quartier);
    }
    @GetMapping("/quartiers")
    public List<Quartier> getAllQuart() {
        return quartierService.getAllQuart();
    }
    @GetMapping("/quartiers/{id}")
    public Quartier getQuart(@PathVariable String id) {
        return quartierService.getQuart(id);
    }

    public Quartier updateQuart(Quartier quartier) {
        return quartierService.updateQuart(quartier);
    }
    @DeleteMapping("/quartiers/{id}")
    public boolean deleteQuart(@PathVariable String id) {
        return quartierService.deleteQuart(id);
    }
}
