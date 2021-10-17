package com.drc.agentsManagement.services;

import com.drc.agentsManagement.entities.Avenue;

import java.util.List;

public interface AvenueService {
    public Avenue saveAvenue(Avenue avenue);
    public List<Avenue> getAllAvenues();
    public Avenue getAvenue(String id);
    public int updateAvenue(Avenue avenue);
    public int updateAvenueQuartier(Avenue avenue);
    public List<Avenue> getAvenuesByQuartier(String qurtId);
    public List<Avenue> getAvenuesByName(String keyword);
    public boolean deleteAvenue(String id);
}
