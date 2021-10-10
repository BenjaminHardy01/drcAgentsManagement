package com.drc.agentsManagement.services;

import com.drc.agentsManagement.entities.Secteur;
import java.util.List;

public interface SecteurService {
    public Secteur saveSect(Secteur secteur);
    public List<Secteur> getAllSect();
}
