package com.drc.agentsManagement.services;

import com.drc.agentsManagement.entities.Quartier;

import java.util.List;

public interface QuartierService {
    public Quartier saveQuart(Quartier quartier);
    public List<Quartier> getAllQuart();
}
