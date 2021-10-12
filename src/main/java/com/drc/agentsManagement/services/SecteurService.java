package com.drc.agentsManagement.services;

import com.drc.agentsManagement.entities.Secteur;
import java.util.List;

public interface SecteurService {
    public Secteur saveSect(Secteur secteur);
    public List<Secteur> getAllSect();
    public Secteur getSect(String id);
    public Secteur updateSect(Secteur secteur);
    public boolean deleteSect(String id);
}
