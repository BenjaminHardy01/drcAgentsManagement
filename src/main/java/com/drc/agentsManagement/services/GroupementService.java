package com.drc.agentsManagement.services;

import com.drc.agentsManagement.entities.Groupement;

import java.util.List;

public interface GroupementService {
    public Groupement saveGroupe(Groupement groupement);
    public List<Groupement> getAllGroupe();
    public Groupement getGroupe(String id);
    public Groupement updateGroupe(Groupement groupement);
    public boolean deleteGroupe(String id);
}
