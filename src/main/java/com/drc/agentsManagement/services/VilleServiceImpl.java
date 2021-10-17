package com.drc.agentsManagement.services;

import com.drc.agentsManagement.entities.Ville;
import com.drc.agentsManagement.repositories.VilleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VilleServiceImpl implements VilleService{
    @Autowired
    private VilleRepository villeRepository;

    @Override
    public Ville saveVille(Ville ville) {
        return villeRepository.save(ville);
    }

    @Override
    public List<Ville> getAllVille() {
        return villeRepository.findAll();
    }

    @Override
    public Ville getVille(String id) {
        return villeRepository.findById(id).get();
    }

    @Override
    public int updateVille(Ville ville) {
        return villeRepository.updateVille(ville.getVilleId(),ville.getVilleName(),ville.getPopulation());
    }

    @Override
    public int updateVilleProvince(Ville ville) {
        return villeRepository.updateVilleProvince(ville.getVilleId(),ville.getProvince().getProvinceId());
    }

    @Override
    public List<Ville> getVillesByProvince(String provId) {
        return villeRepository.getVillesByProvince(provId);
    }

    @Override
    public List<Ville> getVillesByName(String keyword) {
        return villeRepository.getVillesByName(keyword);
    }

    @Override
    public boolean deleteVille(String id) {
        try {
            villeRepository.deleteById(id);
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
        return true;
    }
}
