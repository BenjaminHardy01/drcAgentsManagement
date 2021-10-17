package com.drc.agentsManagement.services;

import com.drc.agentsManagement.entities.Chefferie;
import com.drc.agentsManagement.repositories.ChefferieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChefferieServiceImpl implements ChefferieService{
    @Autowired
    private ChefferieRepository chefferieRepository;

    @Override
    public Chefferie saveCheff(Chefferie chefferie) {
        return chefferieRepository.save(chefferie);
    }

    @Override
    public List<Chefferie> getAllCheff() {
        return chefferieRepository.findAll();
    }

    @Override
    public Chefferie getCheff(String id) {
        return chefferieRepository.findById(id).get();
    }

    @Override
    public int updateChefferie(Chefferie chefferie) {
        return chefferieRepository.updateChefferie(chefferie.getCheffId(),chefferie.getCheffName(),chefferie.getSuperficie());
    }

    @Override
    public int updateChefferieTerritoire(Chefferie chefferie) {
        return chefferieRepository.updateChefferieTerritoire(chefferie.getCheffId(),chefferie.getTerritoire().getTerreId());
    }

    @Override
    public List<Chefferie> getChefferiesByTerritoire(String terreId) {
        return chefferieRepository.getChefferieByTerritoire(terreId);
    }

    @Override
    public List<Chefferie> getChefferiesByName(String keyword) {
        return chefferieRepository.getChefferiesByName(keyword);
    }

    @Override
    public boolean deleteCheff(String id) {
        try {
            chefferieRepository.deleteById(id);
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
        return true;
    }
}
