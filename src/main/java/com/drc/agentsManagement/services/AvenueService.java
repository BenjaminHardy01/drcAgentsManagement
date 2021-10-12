package com.drc.agentsManagement.services;

import com.drc.agentsManagement.entities.Avenue;

import java.util.List;

public interface AvenueService {
    public Avenue saveAvenue(Avenue avenue);
    public List<Avenue> getAllAvenues();
    public Avenue getAvenue(String id);
    public Avenue updateAvenue(Avenue avenue);
    public boolean deleteAvenue(String id);
}
