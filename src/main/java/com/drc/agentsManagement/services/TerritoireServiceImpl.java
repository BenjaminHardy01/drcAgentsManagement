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
    public int updateTerre(Territoire territoire) {
        return territoireRepository.updateTerritoire(territoire.getTerreId(),territoire.getTerreName());
    }

    @Override
    public int updateTerritoireDistrict(Territoire territoire) {
        return territoireRepository.updateTerritoireDistrict(territoire.getTerreId(),territoire.getDistrict().getDistId());
    }

    @Override
    public int updateTerritoireProvince(Territoire territoire) {
        return territoireRepository.updateTerritoireProvince(territoire.getTerreId(),territoire.getProvince().getProvinceId());
    }

    @Override
    public List<Territoire> getTerritoiresByProvince(String provId) {
        return territoireRepository.getTerritoiresByProvince(provId);
    }

    @Override
    public List<Territoire> getTerritoiresByDistrict(String distId) {
        return territoireRepository.getTerritoiresByDistrict(distId);
    }

    @Override
    public List<Territoire> getTerritoiresByName(String keyword) {
        return territoireRepository.getTerritoiresByName(keyword);
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
