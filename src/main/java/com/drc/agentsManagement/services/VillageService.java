package com.drc.agentsManagement.services;

import com.drc.agentsManagement.entities.Village;

import java.util.List;

public interface VillageService {
    public Village saveVillage(Village village);
    public List<Village> getAllVillage();
    public Village getVillage(String id);
    public int updateVillage(Village village);
    public int updateVillageGroupement(Village village);
    public List<Village> getVillagesByGroupement(String groupeId);
    public List<Village> getVillagesByName(String keyword);
    public boolean deleteVillage(String id);
}
