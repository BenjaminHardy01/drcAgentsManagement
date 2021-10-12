package com.drc.agentsManagement.services;

import com.drc.agentsManagement.entities.Quartier;
import com.drc.agentsManagement.repositories.QuartierRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuartierServiceImpl implements QuartierService{
    @Autowired
    private QuartierRepository quartierRepository;
    @Override
    public Quartier saveQuart(Quartier quartier) {
        return quartierRepository.save(quartier);
    }

    @Override
    public List<Quartier> getAllQuart() {
        return quartierRepository.findAll();
    }

    @Override
    public Quartier getQuart(String id) {
        return quartierRepository.findById(id).get();
    }

    @Override
    public Quartier updateQuart(Quartier quartier) {
        return null;
    }

    @Override
    public boolean deleteQuart(String id) {
        try {
            quartierRepository.deleteById(id);
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
        return true;
    }
}
