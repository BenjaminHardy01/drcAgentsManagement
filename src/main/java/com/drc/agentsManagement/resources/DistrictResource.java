package com.drc.agentsManagement.resources;

import com.drc.agentsManagement.entities.District;
import com.drc.agentsManagement.services.DistrictService;
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

    @PutMapping("/districts")
    public int updateDist(@RequestBody District district) {
        return districtService.updateDist(district);
    }

    @PutMapping("/districts/update-prov")
    public int updateDistrictProvince(@RequestBody District district) {
        return districtService.updateDistrictProvince(district);
    }
    @GetMapping("/districts/get-by-name/{keyword}")
    public List<District> getDistrictsByName(@PathVariable String keyword) {
        return districtService.getDistrictsByName(keyword);
    }

    @DeleteMapping("/districts/{id}")
    public boolean deleteDist(@PathVariable String id) {
        return districtService.deleteDist(id);
    }
}
