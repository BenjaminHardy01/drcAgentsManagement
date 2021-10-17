package com.drc.agentsManagement.repositories;

import com.drc.agentsManagement.entities.Groupement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface GroupementRepository extends JpaRepository<Groupement,String> {
    @Transactional
    @Modifying
    @Query("update Groupement gr set gr.groupeName = :name where gr.groupeId = :id")
    int updateGroupement(@Param("id") String id, @Param("name")String name);

    @Transactional
    @Modifying
    @Query("update Groupement gr set gr.secteur.secteurId = :sectId where gr.groupeId = :id")
    int updateGroupementSecteur(@Param("id") String groupeId, @Param("sectId") String sectId
    );

    @Query("select gr from Groupement gr where gr.secteur.secteurId = :sectId")
    List<Groupement> getGroupementsBySecteur(@Param("sectId") String sectId);

    @Query("select gr from Groupement gr where gr.groupeName like :keyword")
    List<Groupement> getGroupementsByName(@Param("keyword") String keyword);
}
