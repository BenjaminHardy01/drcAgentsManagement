package com.drc.agentsManagement.services;

import com.drc.agentsManagement.entities.Territoire;
import com.drc.agentsManagement.repositories.TerritoireRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TerritoireServiceImpl implements TerritoireService{
    @Autowired
    private TerritoireRepository territoireRepository;

    @Override
    public Territoire saveTerre(Territoire territoire) {
        return territoireRepository.save(territoire);
    }

    @Override
    public List<Territoire> getAllTerre() {
        return territoireRepository.findAll();
    }

    @Override
    public Territoire getTerre(String id) {
        return territoireRepository.findById(id).get();
    }

    @Override
    public Territoire updateTerre(Territoire territoire) {
        return null;
    }

    @Override
    public boolean deleteTerre(String id) {
        try {
            territoireRepository.deleteById(id);
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
        return true;
    }
}
