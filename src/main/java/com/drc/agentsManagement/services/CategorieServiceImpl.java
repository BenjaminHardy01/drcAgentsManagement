package com.drc.agentsManagement.services;

import com.drc.agentsManagement.entities.Categorie;
import com.drc.agentsManagement.repositories.CategorieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategorieServiceImpl implements CategorieService {
    @Autowired
    private CategorieRepository categorieRepository;

    @Override
    public Categorie saveCat(Categorie cat) {
        return categorieRepository.save(cat);
    }

    @Override
    public List<Categorie> getAllCat() {
        return categorieRepository.findAll();
    }

    @Override
    public Categorie getCat(String id) {
        return categorieRepository.findById(id).get();
    }

    @Override
    public int updateCat(Categorie cat) {
        return categorieRepository.updateCategorie(cat.getCatId(),cat.getCatName(),cat.getCatDescription());
    }

    @Override
    public List<Categorie> getCategorieByName(String keyword) {
        return categorieRepository.getCategorieByName(keyword);
    }

    @Override
    public boolean deleteCat(String id) {

        try {
            categorieRepository.deleteById(id);
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
        return true;
    }
}
