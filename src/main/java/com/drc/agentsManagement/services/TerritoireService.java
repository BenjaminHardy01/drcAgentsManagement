package com.drc.agentsManagement.services;

import com.drc.agentsManagement.entities.Territoire;

import java.util.List;

public interface TerritoireService {
    public Territoire saveTerre(Territoire territoire);
    public List<Territoire> getAllTerre();
}
