package com.drc.agentsManagement.resources;

import com.drc.agentsManagement.entities.Avenue;
import com.drc.agentsManagement.services.AvenueService;
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
public class AvenueResource {
    @Autowired
    private AvenueService avenueService;

    @PostMapping("/avenues")
    public Avenue saveAvenue(@RequestBody Avenue avenue) {
        return avenueService.saveAvenue(avenue);
    }

    @GetMapping("/avenues")
    public List<Avenue> getAllAvenues() {
        return avenueService.getAllAvenues();
    }

    @GetMapping("/avenues/{id}")
    public Avenue getAvenue(@PathVariable String id) {
        return avenueService.getAvenue(id);
    }

    public Avenue updateAvenue(Avenue avenue) {
        return avenueService.updateAvenue(avenue);
    }

    @DeleteMapping("/avenues/{id}")
    public boolean deleteAvenue(@PathVariable String id) {
        return avenueService.deleteAvenue(id);
    }
}
