package com.drc.agentsManagement.repositories;

import com.drc.agentsManagement.entities.Ville;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface VilleRepository extends JpaRepository<Ville,String> {
    @Transactional
    @Modifying
    @Query("update Ville v set v.villeName = :name, v.population = :pop where v.villeId = :id")
    int updateVille(@Param("id") String id, @Param("name")String name, @Param("pop")Long pop);

    @Transactional
    @Modifying
    @Query("update Ville v set v.province.provinceId = :provId where v.villeId = :id")
    int updateVilleProvince(@Param("id") String villeId, @Param("provId") String provId);

    @Query("select v from Ville v where v.province.provinceId = :provId")
    List<Ville> getVillesByProvince(@Param("provId") String provId);

    @Query("select v from Ville v where v.villeName like :keyword")
    List<Ville> getVillesByName(@Param("keyword") String keyword);

}
