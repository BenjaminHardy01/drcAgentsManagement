package com.drc.agentsManagement.services;

import com.drc.agentsManagement.entities.Groupement;
import com.drc.agentsManagement.repositories.GroupementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GroupementServiceImpl implements GroupementService{
    @Autowired
    private GroupementRepository groupementRepository;
    @Override
    public Groupement saveGroupe(Groupement groupement) {
        return groupementRepository.save(groupement);
    }

    @Override
    public List<Groupement> getAllGroupe() {
        return groupementRepository.findAll();
    }

    @Override
    public Groupement getGroupe(String id) {
        return groupementRepository.findById(id).get();
    }

    @Override
    public int updateGroupe(Groupement groupement) {
        return groupementRepository.updateGroupement(groupement.getGroupeId(),groupement.getGroupeName());
    }

    @Override
    public int updateGroupementSecteur(Groupement groupement) {
        return groupementRepository.updateGroupementSecteur(groupement.getGroupeId(),groupement.getSecteur().getSecteurId());
    }

    @Override
    public List<Groupement> getGroupementsBySecteur(String sectId) {
        return groupementRepository.getGroupementsBySecteur(sectId);
    }

    @Override
    public List<Groupement> getGroupementsByName(String keyword) {
        return groupementRepository.getGroupementsByName(keyword);
    }

    @Override
    public boolean deleteGroupe(String id) {
        try {
            groupementRepository.deleteById(id);
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
        return true;
    }
}
