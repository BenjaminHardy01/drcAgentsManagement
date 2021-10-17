package com.drc.agentsManagement.resources;

import com.drc.agentsManagement.entities.Village;
import com.drc.agentsManagement.services.VillageService;
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
public class VillageResource {
    @Autowired
    private VillageService villageService;

    @PostMapping("/villages")
    public Village saveVillage(@RequestBody Village village) {
        return villageService.saveVillage(village);
    }
    @GetMapping("/villages")
    public List<Village> getAllVillage() {
        return villageService.getAllVillage();
    }
    @GetMapping("/villages/{id}")
    public Village getVillage(@PathVariable String id) {
        return villageService.getVillage(id);
    }

    @PutMapping("/villages")
    public int updateVillage(@RequestBody Village village) {
        return villageService.updateVillage(village);
    }

    @PutMapping("/villages/update-groupement")
    public int updateVillageGroupement(@RequestBody Village village) {
        return villageService.updateVillageGroupement(village);
    }

    @GetMapping("/villages/get-by-groupement/{groupeId}")
    public List<Village> getVillagesByGroupement(@PathVariable String groupeId) {
        return villageService.getVillagesByGroupement(groupeId);
    }

    @GetMapping("/villages/get-by-name/{keyword}")
    public List<Village> getVillagesByName(@PathVariable String keyword) {
        return villageService.getVillagesByName(keyword);
    }

    @DeleteMapping("/villages/{id}")
    public boolean deleteVillage(@PathVariable String id) {
        return villageService.deleteVillage(id);
    }
}
