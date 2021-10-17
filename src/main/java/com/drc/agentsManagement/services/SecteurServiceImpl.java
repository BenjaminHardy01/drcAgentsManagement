package com.drc.agentsManagement.services;

import com.drc.agentsManagement.entities.Secteur;
import com.drc.agentsManagement.repositories.SecteurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SecteurServiceImpl implements SecteurService{
    @Autowired
    private SecteurRepository secteurRepository;
    @Override
    public Secteur saveSect(Secteur secteur) {
        return secteurRepository.save(secteur);
    }

    @Override
    public List<Secteur> getAllSect() {
        return secteurRepository.findAll();
    }

    @Override
    public Secteur getSect(String id) {
        return secteurRepository.findById(id).get();
    }

    @Override
    public int updateSect(Secteur secteur) {
        return secteurRepository.updateSecteur(secteur.getSecteurId(),secteur.getSecteurName());
    }

    @Override
    public int updateSecteurTerritoire(Secteur secteur) {
        return secteurRepository.updateSecteurTerritoire(secteur.getSecteurId(),secteur.getTerritoire().getTerreId());
    }

    @Override
    public List<Secteur> getSecteursByTerritoire(String terreId) {
        return secteurRepository.getSecteursByTerritoire(terreId);
    }

    @Override
    public List<Secteur> getSecteursByName(String keyword) {
        return secteurRepository.getSecteursByName(keyword);
    }

    @Override
    public boolean deleteSect(String id) {
        try {
            secteurRepository.deleteById(id);
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
        return true;
    }
}
