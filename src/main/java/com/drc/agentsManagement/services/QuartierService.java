package com.drc.agentsManagement.services;

import com.drc.agentsManagement.entities.Quartier;

import java.util.List;

public interface QuartierService {
    public Quartier saveQuart(Quartier quartier);
    public List<Quartier> getAllQuart();
    public Quartier getQuart(String id);
    public Quartier updateQuart(Quartier quartier);
    public boolean deleteQuart(String id);
}
