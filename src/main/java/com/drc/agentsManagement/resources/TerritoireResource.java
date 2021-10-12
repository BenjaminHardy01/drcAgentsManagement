package com.drc.agentsManagement.resources;

import com.drc.agentsManagement.entities.Territoire;
import com.drc.agentsManagement.services.TerritoireService;
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

    public Territoire updateTerre(Territoire territoire) {
        return territoireService.updateTerre(territoire);
    }
    @DeleteMapping("/territoires/{id}")
    public boolean deleteTerre(@PathVariable String id) {
        return territoireService.deleteTerre(id);
    }
}
