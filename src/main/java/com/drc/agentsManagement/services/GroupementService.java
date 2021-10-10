package com.drc.agentsManagement.services;

import com.drc.agentsManagement.entities.Groupement;

import java.util.List;

public interface GroupementService {
    public Groupement saveGroupe(Groupement groupement);
    public List<Groupement> getAllGroupe();
}
