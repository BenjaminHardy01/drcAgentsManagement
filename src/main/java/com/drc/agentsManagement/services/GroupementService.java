package com.drc.agentsManagement.services;

import com.drc.agentsManagement.entities.Groupement;

import java.util.List;

public interface GroupementService {
    public Groupement saveGroupe(Groupement groupement);
    public List<Groupement> getAllGroupe();
    public Groupement getGroupe(String id);
    public int updateGroupe(Groupement groupement);
    public int updateGroupementSecteur(Groupement groupement);
    public List<Groupement> getGroupementsBySecteur(String sectId);
    public List<Groupement> getGroupementsByName(String keyword);
    public boolean deleteGroupe(String id);
}
