package com.drc.agentsManagement.services;

import com.drc.agentsManagement.entities.Commune;
import com.drc.agentsManagement.repositories.CommuneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommuneServiceImpl implements CommuneService{
    @Autowired
    private CommuneRepository communeRepository;

    @Override
    public Commune saveCom(Commune commune) {
        return communeRepository.save(commune);
    }

    @Override
    public List<Commune> getAllCom() {
        return communeRepository.findAll();
    }

    @Override
    public Commune getCommune(String id) {
        return communeRepository.findById(id).get();
    }

    @Override
    public Commune updateCom(Commune commune) {
        return null;
    }

    @Override
    public boolean deleteCom(String id) {
        try {
            communeRepository.deleteById(id);
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
        return true;
    }
}
