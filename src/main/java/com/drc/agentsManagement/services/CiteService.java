package com.drc.agentsManagement.services;

import com.drc.agentsManagement.entities.Cite;

import java.util.List;

public interface CiteService {
    public Cite saveCite(Cite cite);
    public List<Cite> getAllCities();
    public Cite getCite(String id);
    public int updateCite(Cite cite);
    public List<Cite> getCiteByName(String keyword);
    public int updateCiteTerritoire(Cite cite);
    public boolean deleteCite(String id);
}
