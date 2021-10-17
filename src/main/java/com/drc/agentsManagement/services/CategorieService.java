package com.drc.agentsManagement.services;

import com.drc.agentsManagement.entities.Categorie;

import java.util.List;

public interface CategorieService {
    public Categorie saveCat(Categorie cat);
    public List<Categorie> getAllCat();
    public Categorie getCat(String id);
    public int updateCat(Categorie cat);
    public List<Categorie> getCategorieByName(String keyword);
    public boolean deleteCat(String id);
}
