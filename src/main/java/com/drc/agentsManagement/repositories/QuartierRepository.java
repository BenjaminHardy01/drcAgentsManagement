package com.drc.agentsManagement.repositories;

import com.drc.agentsManagement.entities.Quartier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface QuartierRepository extends JpaRepository<Quartier,String> {
    @Transactional
    @Modifying
    @Query("update Quartier quart set quart.quartName = :name where quart.quartId = :id")
    int updateQuartier(@Param("id") String id, @Param("name")String name);

    @Transactional
    @Modifying
    @Query("update Quartier quart set quart.cite.citeId = :citeId where quart.quartId = :id")
    int updateQuartierCite(@Param("id") String quartId, @Param("citeId") String citeId);

    @Transactional
    @Modifying
    @Query("update Quartier quart set quart.commune.commId = :commId where quart.quartId = :id")
    int updateQuartierCommune(@Param("id") String quartId, @Param("commId") String commId);

    @Query("select quart from Quartier quart where quart.cite.citeId = :citeId")
    List<Quartier> getQuartiersByCite(@Param("citeId") String citeId);

    @Query("select quart from Quartier quart where quart.commune.commId = :comId")
    List<Quartier> getQuartiersByCommune(@Param("comId") String comId);

    @Query("select quart from Quartier quart where quart.quartName like :keyword")
    List<Quartier> getQuartiersByName(@Param("keyword") String keyword);

}
