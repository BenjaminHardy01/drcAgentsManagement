package com.drc.agentsManagement.resources;

import com.drc.agentsManagement.entities.Quartier;
import com.drc.agentsManagement.services.QuartierService;
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

    @PutMapping("/quartiers")
    public int updateQuart(@RequestBody Quartier quartier) {
        return quartierService.updateQuart(quartier);
    }

    @PutMapping("/quartiers/update-cite")
    public int updateQuartierCite(@RequestBody Quartier quartier) {
        return quartierService.updateQuartierCite(quartier);
    }

    @PutMapping("/quartiers/update-commune")
    public int updateQuartierCommune(@RequestBody Quartier quartier) {
        return quartierService.updateQuartierCommune(quartier);
    }

    @GetMapping("/quartiers/get-by-cite/{citeId}")
    public List<Quartier> getQuartiersByCite(@PathVariable String citeId) {
        return quartierService.getQuartiersByCite(citeId);
    }

    @GetMapping("/quartiers/get-by-commune/{comId}")
    public List<Quartier> getQuartiersByCommune(@PathVariable String comId) {
        return quartierService.getQuartiersByCommune(comId);
    }

    @GetMapping("/quartiers/get-by-name/{keyword}")
    public List<Quartier> getQuartiersByName(String keyword) {
        return quartierService.getQuartiersByName(keyword);
    }

    @DeleteMapping("/quartiers/{id}")
    public boolean deleteQuart(@PathVariable String id) {
        return quartierService.deleteQuart(id);
    }
}
