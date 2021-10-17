package com.drc.agentsManagement.services;

import com.drc.agentsManagement.entities.Province;

import java.util.List;

public interface ProvinceService {
    public Province saveProv(Province province);
    public List<Province> getAllProv();
    public Province getProvince(String id);
    public int updateProv(Province province);
    public List<Province> getProvinceByName(String keyword);
    public boolean deleteProv(String id);
}
