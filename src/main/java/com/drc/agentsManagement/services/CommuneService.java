package com.drc.agentsManagement.services;

import com.drc.agentsManagement.entities.Commune;

import java.util.List;

public interface CommuneService {
    public Commune saveCom(Commune commune);
    public List<Commune> getAllCom();
}
