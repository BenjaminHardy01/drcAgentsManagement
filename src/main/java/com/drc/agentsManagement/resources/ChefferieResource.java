package com.drc.agentsManagement.resources;

import com.drc.agentsManagement.entities.Chefferie;
import com.drc.agentsManagement.services.ChefferieService;
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
public class ChefferieResource {
    @Autowired
    private ChefferieService chefferieService;

    @PostMapping("/chefferies")
    public Chefferie saveCheff(@RequestBody Chefferie chefferie) {
        return chefferieService.saveCheff(chefferie);
    }

    @GetMapping("/chefferies")
    public List<Chefferie> getAllCheff() {
        return chefferieService.getAllCheff();
    }

    @GetMapping("/chefferies/{id}")
    public Chefferie getCheff(@PathVariable String id) {
        return chefferieService.getCheff(id);
    }

    @PutMapping("/chefferies")
    public int updateChefferie(@RequestBody Chefferie chefferie) {
        return chefferieService.updateChefferie(chefferie);
    }

    @PutMapping("/chefferies/update-territoire")
    public int updateChefferieTerritoire(@RequestBody Chefferie chefferie) {
        return chefferieService.updateChefferieTerritoire(chefferie);
    }

    @GetMapping("/chefferies/get-by-territoire/{terreId}")
    public List<Chefferie> getChefferiesByTerritoire(String terreId) {
        return chefferieService.getChefferiesByTerritoire(terreId);
    }

    @GetMapping("/chefferies/get-by-name/{keyword}")
    public List<Chefferie> getChefferiesByName(String keyword) {
        return chefferieService.getChefferiesByName(keyword);
    }

    @DeleteMapping("/chefferies/{id}")
    public boolean deleteCheff(String id) {
        return chefferieService.deleteCheff(id);
    }
}
