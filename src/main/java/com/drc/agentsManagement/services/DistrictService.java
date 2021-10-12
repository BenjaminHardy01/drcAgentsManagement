package com.drc.agentsManagement.services;

import com.drc.agentsManagement.entities.District;

import java.util.List;

public interface DistrictService {
    public District saveDist(District district);
    public List<District> getAllDist();
    public District getDist(String id);
    public District updateDist(District district);
    public boolean deleteDist(String id);
}
