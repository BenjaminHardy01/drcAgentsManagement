package com.drc.agentsManagement.services;

import com.drc.agentsManagement.entities.Secteur;

import java.util.List;

public interface SecteurService {
    public Secteur saveSect(Secteur secteur);
    public List<Secteur> getAllSect();
    public Secteur getSect(String id);
    public int updateSect(Secteur secteur);
    public int updateSecteurTerritoire(Secteur secteur);
    public List<Secteur> getSecteursByTerritoire(String terreId);
    public List<Secteur> getSecteursByName(String keyword);
    public boolean deleteSect(String id);
}
