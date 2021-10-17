package com.drc.agentsManagement.services;

import com.drc.agentsManagement.entities.Village;
import com.drc.agentsManagement.repositories.VillageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VillageServiceImpl implements VillageService{
    @Autowired
    private VillageRepository villageRepository;
    @Override
    public Village saveVillage(Village village) {
        return villageRepository.save(village);
    }

    @Override
    public List<Village> getAllVillage() {
        return villageRepository.findAll();
    }

    @Override
    public Village getVillage(String id) {
        return villageRepository.findById(id).get();
    }

    @Override
    public int updateVillage(Village village) {
        return villageRepository.updateVillage(village.getVillageId(),village.getVillageName(),village.getPopulation());
    }

    @Override
    public int updateVillageGroupement(Village village) {
        return villageRepository.updateVillageGroupement(village.getVillageId(),village.getGroupement().getGroupeId());
    }

    @Override
    public List<Village> getVillagesByGroupement(String groupeId) {
        return villageRepository.getVillagesByGroupement(groupeId);
    }

    @Override
    public List<Village> getVillagesByName(String keyword) {
        return villageRepository.getVillagesByName(keyword);
    }

    @Override
    public boolean deleteVillage(String id) {
        try {
            villageRepository.deleteById(id);
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
        return true;
    }
}
