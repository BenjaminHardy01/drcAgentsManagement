package com.drc.agentsManagement.services;

import com.drc.agentsManagement.entities.Quartier;

import java.util.List;

public interface QuartierService {
    public Quartier saveQuart(Quartier quartier);
    public List<Quartier> getAllQuart();
    public Quartier getQuart(String id);
    public int updateQuart(Quartier quartier);
    public int updateQuartierCite(Quartier quartier);
    public int updateQuartierCommune(Quartier quartier);
    public List<Quartier> getQuartiersByCite(String citeId);
    public List<Quartier> getQuartiersByCommune(String comId);
    public List<Quartier> getQuartiersByName(String keyword);
    public boolean deleteQuart(String id);
}
