package com.drc.agentsManagement.services;

import com.drc.agentsManagement.entities.Territoire;

import java.util.List;

public interface TerritoireService {
    public Territoire saveTerre(Territoire territoire);
    public List<Territoire> getAllTerre();
    public Territoire getTerre(String id);
    public Territoire updateTerre(Territoire territoire);
    public boolean deleteTerre(String id);
}
