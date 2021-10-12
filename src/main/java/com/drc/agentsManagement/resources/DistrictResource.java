package com.drc.agentsManagement.resources;

import com.drc.agentsManagement.entities.District;
import com.drc.agentsManagement.services.DistrictService;
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
public class DistrictResource {
    @Autowired
    private DistrictService districtService;

    @PostMapping("/districts")
    public District saveDist(@RequestBody District district) {
        return districtService.saveDist(district);
    }

    @GetMapping("/districts")
    public List<District> getAllDist() {
        return districtService.getAllDist();
    }

    @GetMapping("/districts/{id}")
    public District getDist(@PathVariable String id) {
        return districtService.getDist(id);
    }

    public District updateDist(District district) {
        return districtService.updateDist(district);
    }

    @DeleteMapping("/districts/{id}")
    public boolean deleteDist(@PathVariable String id) {
        return districtService.deleteDist(id);
    }
}
