package com.drc.agentsManagement.services;

import com.drc.agentsManagement.entities.Province;

import java.util.List;

public interface ProvinceService {
    public Province saveProv(Province province);
    public List<Province> getAllProv();
    public Province getProvince(String id);
    public Province updateProv(Province province);
    public boolean deleteProv(String id);
}
