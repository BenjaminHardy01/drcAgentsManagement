package com.drc.agentsManagement.services;

import com.drc.agentsManagement.entities.Commune;

import java.util.List;

public interface CommuneService {
    public Commune saveCom(Commune commune);
    public List<Commune> getAllCom();
    public Commune getCommune(String id);
    public int updateCom(Commune commune);
    public List<Commune> getCommunesByName(String keyword);
    public int updateCommuneVille(Commune commune);
    public boolean deleteCom(String id);
}
