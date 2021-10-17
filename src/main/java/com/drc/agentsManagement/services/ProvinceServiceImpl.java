package com.drc.agentsManagement.services;

import com.drc.agentsManagement.entities.Province;
import com.drc.agentsManagement.repositories.ProvinceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ProvinceServiceImpl implements ProvinceService{
    @Autowired
    private ProvinceRepository provinceRepository;
    @Override
    public Province saveProv(Province province) {
        return provinceRepository.save(province);
    }

    @Override
    public List<Province> getAllProv() {
        return provinceRepository.findAll();
    }

    @Override
    public Province getProvince(String id) {
        return provinceRepository.findById(id).get();
    }

    @Override
    public int updateProv(Province province) {
        return provinceRepository.updateProvince(province.getProvinceId(),province.getProvinceName(),province.getSuperficie(),province.getPopulation(),province.getChefLieu());
    }

    @Override
    public List<Province> getProvinceByName(String keyword) {
        return provinceRepository.getProvinceByName(keyword);
    }

    @Override
    public boolean deleteProv(String id) {
        try {
            provinceRepository.deleteById(id);
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
        return true;
    }
}
