package com.drc.agentsManagement.services;

import com.drc.agentsManagement.entities.Village;

import java.util.List;

public interface VillageService {
    public Village saveVillage(Village village);
    public List<Village> getAllVillage();
    public Village getVillage(String id);
    public Village updateVillage(Village village);
    public boolean deleteVillage(String id);
}
