package com.drc.agentsManagement.services;

import com.drc.agentsManagement.entities.Territoire;

import java.util.List;

public interface TerritoireService {
    public Territoire saveTerre(Territoire territoire);
    public List<Territoire> getAllTerre();
    public Territoire getTerre(String id);
    public int updateTerre(Territoire territoire);
    public int updateTerritoireDistrict(Territoire territoire);
    public int updateTerritoireProvince(Territoire territoire);
    public List<Territoire> getTerritoiresByProvince(String provId);
    public List<Territoire> getTerritoiresByDistrict(String distId);
    public List<Territoire> getTerritoiresByName(String keyword);
    public boolean deleteTerre(String id);
}
