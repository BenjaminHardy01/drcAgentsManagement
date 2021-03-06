package com.drc.agentsManagement.resources;

import com.drc.agentsManagement.entities.Province;
import com.drc.agentsManagement.services.ProvinceService;
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
public class ProvinceResource {

    @Autowired
    private ProvinceService provinceService;

    @PostMapping("/provinces")
    public Province saveProv(@RequestBody Province province) {
        return provinceService.saveProv(province);
    }

    @GetMapping("/provinces")
    public List<Province> getAllProv() {
        return provinceService.getAllProv();
    }

    @GetMapping("/provinces/{id}")
    public Province getProvince(@PathVariable String id) {
        return provinceService.getProvince(id);
    }

    @GetMapping("/provinces/get-by-name/{keyword}")
    public List<Province> getProvinceByName(@PathVariable String keyword) {
        return provinceService.getProvinceByName(keyword);
    }

    @PutMapping("/provinces")
    public int updateProv(@RequestBody Province province) {
        return provinceService.updateProv(province);
    }

    @DeleteMapping("/provinces/{id}")
    public boolean deleteProv(@PathVariable String id) {
        return provinceService.deleteProv(id);
    }
}
