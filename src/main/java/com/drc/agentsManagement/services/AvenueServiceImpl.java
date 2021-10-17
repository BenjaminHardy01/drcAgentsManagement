package com.drc.agentsManagement.services;

import com.drc.agentsManagement.entities.Avenue;
import com.drc.agentsManagement.repositories.AvenueRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class AvenueServiceImpl implements AvenueService{
    @Autowired
    private AvenueRepository avenueRepository;
    @Override
    public Avenue saveAvenue(Avenue avenue) {
        return avenueRepository.save(avenue);
    }

    @Override
    public List<Avenue> getAllAvenues() {
        return avenueRepository.findAll();
    }

    @Override
    public Avenue getAvenue(String id) {
        return avenueRepository.findById(id).get();
    }

    @Override
    public int updateAvenue(Avenue avenue) {
        return avenueRepository.updateAvenue(avenue.getAvenueId(),avenue.getAvenueName());
    }

    @Override
    public int updateAvenueQuartier(Avenue avenue) {
        return avenueRepository.updateAvenueQuartier(avenue.getAvenueId(),avenue.getQuartier().getQuartId());
    }

    @Override
    public List<Avenue> getAvenuesByQuartier(String qurtId) {
        return avenueRepository.getAvenuesByQuartier(qurtId);
    }

    @Override
    public List<Avenue> getAvenuesByName(String keyword) {
        return avenueRepository.getAvenuesByName(keyword);
    }

    @Override
    public boolean deleteAvenue(String id) {
        try {
            avenueRepository.deleteById(id);
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
        return true;
    }
}
