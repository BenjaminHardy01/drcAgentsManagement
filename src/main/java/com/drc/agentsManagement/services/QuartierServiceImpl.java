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
    public int updateQuart(Quartier quartier) {
        return quartierRepository.updateQuartier(quartier.getQuartId(),quartier.getQuartName());
    }

    @Override
    public int updateQuartierCite(Quartier quartier) {
        return quartierRepository.updateQuartierCite(quartier.getQuartId(),quartier.getCite().getCiteId());
    }

    @Override
    public int updateQuartierCommune(Quartier quartier) {
        return quartierRepository.updateQuartierCommune(quartier.getQuartId(),quartier.getCommune().getCommId());
    }

    @Override
    public List<Quartier> getQuartiersByCite(String citeId) {
        return quartierRepository.getQuartiersByCite(citeId);
    }

    @Override
    public List<Quartier> getQuartiersByCommune(String comId) {
        return quartierRepository.getQuartiersByCommune(comId);
    }

    @Override
    public List<Quartier> getQuartiersByName(String keyword) {
        return quartierRepository.getQuartiersByName(keyword);
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
