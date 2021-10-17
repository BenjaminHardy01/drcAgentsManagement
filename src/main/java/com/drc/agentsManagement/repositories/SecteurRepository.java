package com.drc.agentsManagement.repositories;

import com.drc.agentsManagement.entities.Secteur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface SecteurRepository extends JpaRepository<Secteur,String> {
    @Transactional
    @Modifying
    @Query("update Secteur sect set sect.secteurName = :name where sect.secteurId = :id")
    int updateSecteur(@Param("id") String id, @Param("name")String name);

    @Transactional
    @Modifying
    @Query("update Secteur sect set sect.territoire.terreId = :terreId where sect.secteurId = :id")
    int updateSecteurTerritoire(@Param("id") String secteurId, @Param("terreId") String terreId
    );

    @Query("select sect from Secteur sect where sect.territoire.terreId = :terreId")
    List<Secteur> getSecteursByTerritoire(@Param("terreId") String terreId);

    @Query("select sect from Secteur sect where sect.secteurName like :keyword")
    List<Secteur> getSecteursByName(@Param("keyword") String keyword);
}
