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
    public int updateDist(District district) {
        return districtRepository.updateDistrict(district.getDistId(),district.getDistName());
    }

    @Override
    public int updateDistrictProvince(District district) {
        return districtRepository.updateDistrictProvince(district.getDistId(),district.getProvince().getProvinceId());
    }

    @Override
    public List<District> getDistrictsByName(String keyword) {
        return districtRepository.getDistrictsByName(keyword);
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
