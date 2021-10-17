package com.drc.agentsManagement.repositories;

import com.drc.agentsManagement.entities.Avenue;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface AvenueRepository extends JpaRepository<Avenue,String> {
    @Transactional
    @Modifying
    @Query("update Avenue av set av.avenueName = :name where av.avenueId = :id")
    int updateAvenue(@Param("id") String id, @Param("name")String name);

    @Transactional
    @Modifying
    @Query("update Avenue av set av.quartier.quartId = :quartId where av.avenueId = :id")
    int updateAvenueQuartier(@Param("id") String avenueId, @Param("quartId") String quartId
    );

    @Query("select av from Avenue av where av.quartier.quartId = :quartId")
    List<Avenue> getAvenuesByQuartier(@Param("quartId") String quartId);

    @Query("select av from Avenue av where av.avenueName like :keyword")
    List<Avenue> getAvenuesByName(@Param("keyword") String keyword);
}
