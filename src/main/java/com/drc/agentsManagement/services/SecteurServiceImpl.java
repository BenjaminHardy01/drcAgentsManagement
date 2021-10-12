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
    public Secteur updateSect(Secteur secteur) {
        return null;
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
