package com.drc.agentsManagement.services;

import com.drc.agentsManagement.entities.Ville;
import java.util.List;

public interface VilleService {
    public Ville saveVille(Ville ville);
    public List<Ville> getAllVille();
}
