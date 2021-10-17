package com.drc.agentsManagement.services;

import com.drc.agentsManagement.entities.Ville;

import java.util.List;

public interface VilleService {
    public Ville saveVille(Ville ville);
    public List<Ville> getAllVille();
    public Ville getVille(String id);
    public int updateVille(Ville ville);
    public int updateVilleProvince(Ville ville);
    public List<Ville> getVillesByProvince(String provId);
    public List<Ville> getVillesByName(String keyword);
    public boolean deleteVille(String id);

}
