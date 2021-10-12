package com.drc.agentsManagement.services;

import com.drc.agentsManagement.entities.District;
import com.drc.agentsManagement.repositories.DistrictRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DistrictServiceImpl implements DistrictService{
    @Autowired
    private DistrictRepository districtRepository;
    @Override
    public District saveDist(District district) {
        return districtRepository.save(district);
    }

    @Override
    public List<District> getAllDist() {
        return districtRepository.findAll();
    }

    @Override
    public District getDist(String id) {
        return districtRepository.findById(id).get();
    }

    @Override
    public District updateDist(District district) {
        return null;
    }

    @Override
    public boolean deleteDist(String id) {
        try {
            districtRepository.deleteById(id);
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
        return true;
    }
}
