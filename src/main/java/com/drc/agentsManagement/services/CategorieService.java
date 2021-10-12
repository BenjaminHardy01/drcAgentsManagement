package com.drc.agentsManagement.services;

import com.drc.agentsManagement.entities.Categorie;

import java.util.List;

public interface CategorieService {
    public Categorie saveCat(Categorie cat);
    public List<Categorie> getAllCat();
    public Categorie getCat(String id);
    public Categorie updateCat(Categorie cat);
    public boolean deleteCat(String id);
}
