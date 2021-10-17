package com.drc.agentsManagement.services;

import com.drc.agentsManagement.entities.Cite;
import com.drc.agentsManagement.repositories.CiteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CiteServiceImpl implements CiteService{
    @Autowired
    private CiteRepository citeRepository;
    @Override
    public Cite saveCite(Cite cite) {
        return citeRepository.save(cite);
    }

    @Override
    public List<Cite> getAllCities() {
        return citeRepository.findAll();
    }

    @Override
    public Cite getCite(String id) {
        return citeRepository.findById(id).get();
    }

    @Override
    public int updateCite(Cite cite) {
        return citeRepository.updateCite(cite.getCiteId(),cite.getCiteName());
    }

    @Override
    public List<Cite> getCiteByName(String keyword) {
        return citeRepository.getCiteByName(keyword);
    }

    @Override
    public int updateCiteTerritoire(Cite cite) {
        return citeRepository.updateCiteTerritoire(cite.getCiteId(),cite.getTerritoire().getTerreId());
    }

    @Override
    public boolean deleteCite(String id) {
        try {
            citeRepository.deleteById(id);
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
        return true;
    }
}
