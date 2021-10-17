package com.drc.agentsManagement.services;

import com.drc.agentsManagement.entities.Chefferie;

import java.util.List;

public interface ChefferieService {
    public Chefferie saveCheff(Chefferie chefferie);
    public List<Chefferie> getAllCheff();
    public Chefferie getCheff(String id);
    public int updateChefferie(Chefferie chefferie);
    public int updateChefferieTerritoire(Chefferie chefferie);
    public List<Chefferie> getChefferiesByTerritoire(String terreId);
    public List<Chefferie> getChefferiesByName(String keyword);
    public boolean deleteCheff(String id);

}
