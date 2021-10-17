package com.drc.agentsManagement.repositories;

import com.drc.agentsManagement.entities.Village;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface VillageRepository extends JpaRepository<Village,String> {
    @Transactional
    @Modifying
    @Query("update Village v set v.villageName = :name, v.population = :pop where v.villageId = :id")
    int updateVillage(@Param("id") String id, @Param("name")String name, @Param("pop")Long pop);

    @Transactional
    @Modifying
    @Query("update Village v set v.groupement.groupeId = :groupeId where v.villageId = :id")
    int updateVillageGroupement(@Param("id") String villageId, @Param("groupeId") String groupeId);

    @Query("select v from Village v where v.groupement.groupeId = :groupeId")
    List<Village> getVillagesByGroupement(@Param("groupeId") String groupeId);

    @Query("select v from Village v where v.villageName like :keyword")
    List<Village> getVillagesByName(@Param("keyword") String keyword);

}
