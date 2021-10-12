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
    public Ville updateVille(Ville ville) {
        return null;
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
