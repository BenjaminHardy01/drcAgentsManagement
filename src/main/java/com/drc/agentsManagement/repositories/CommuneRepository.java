package com.drc.agentsManagement.repositories;

import com.drc.agentsManagement.entities.Commune;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface CommuneRepository extends JpaRepository<Commune,String> {
    @Transactional
    @Modifying
    @Query("update Commune com set com.commName = :name where com.commId = :id")
    int updateCommune(@Param("id") String id, @Param("name") String name);

    @Transactional
    @Modifying
    @Query("update Commune com set com.ville.villeId = :villeId where com.commId = :id")
    int updateCommuneVille(@Param("id") String commId, @Param("villeId") String villeId);

    @Query("select com from Commune com where com.commName like :keyword")
    List<Commune> getCommunesByName(@Param("keyword") String keyword);

}
