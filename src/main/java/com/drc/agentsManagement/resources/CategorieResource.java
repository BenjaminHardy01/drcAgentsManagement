package com.drc.agentsManagement.resources;

import com.drc.agentsManagement.entities.Categorie;
import com.drc.agentsManagement.services.CategorieService;
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
public class CategorieResource {
    @Autowired
    private CategorieService categorieService;

    @PostMapping("/categories")
    public Categorie saveCat(@RequestBody Categorie cat) {
        return categorieService.saveCat(cat);
    }

    @GetMapping("/categories")
    public List<Categorie> getAllCat() {
        return categorieService.getAllCat();
    }

    @GetMapping("/categories/{id}")
    public Categorie getCat(@PathVariable String id) {
        return categorieService.getCat(id);
    }

    @PutMapping("/categories")
    public int updateCat(@RequestBody Categorie cat) {
        return categorieService.updateCat(cat);
    }

    @GetMapping("/categories/get-by-name/{keyword}")
    public List<Categorie> getCategorieByName(String keyword) {
        return categorieService.getCategorieByName(keyword);
    }

    @DeleteMapping("/categories/{id}")
    public void deleteCat(@PathVariable String id) {
        categorieService.deleteCat(id);
    }
}
