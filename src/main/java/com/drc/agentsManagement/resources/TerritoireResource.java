package com.drc.agentsManagement.resources;

import com.drc.agentsManagement.entities.Territoire;
import com.drc.agentsManagement.services.TerritoireService;
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
public class TerritoireResource {

    @Autowired
    private TerritoireService territoireService;

    @PostMapping("/territoires")
    public Territoire saveTerre(@RequestBody Territoire territoire) {
        return territoireService.saveTerre(territoire);
    }

    @GetMapping("/territoires")
    public List<Territoire> getAllTerre() {
        return territoireService.getAllTerre();
    }

    @GetMapping("/territoires/{id}")
    public Territoire getTerre(@PathVariable String id) {
        return territoireService.getTerre(id);
    }

    @PutMapping("/territoires")
    public int updateTerre(@RequestBody Territoire territoire) {
        return territoireService.updateTerre(territoire);
    }

    @PutMapping("/territoires/update-district")
    public int updateTerritoireDistrict(@RequestBody Territoire territoire) {
        return territoireService.updateTerritoireDistrict(territoire);
    }

    @PutMapping("/territoires/update-province")
    public int updateTerritoireProvince(Territoire territoire) {
        return territoireService.updateTerritoireProvince(territoire);
    }

    @GetMapping("/territoires/get-by-district/{distId}")
    public List<Territoire> getTerritoiresByDistrict(@PathVariable String distId) {
        return territoireService.getTerritoiresByDistrict(distId);
    }

    @GetMapping("/territoires/get-by-province/{provId}")
    public List<Territoire> getTerritoiresByProvince(String provId) {
        return territoireService.getTerritoiresByProvince(provId);
    }

    @GetMapping("/territoires/get-by-name/{keyword}")
    public List<Territoire> getTerritoiresByName(@PathVariable String keyword) {
        return territoireService.getTerritoiresByName(keyword);
    }

    @DeleteMapping("/territoires/{id}")
    public boolean deleteTerre(@PathVariable String id) {
        return territoireService.deleteTerre(id);
    }
}
