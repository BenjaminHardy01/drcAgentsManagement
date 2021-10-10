package com.drc.agentsManagement.services;

import com.drc.agentsManagement.entities.Village;

import java.util.List;

public interface VillageService {
    public Village saveVillage(Village village);
    public List<Village> getAllVillage();
}
