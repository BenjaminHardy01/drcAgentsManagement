package com.drc.agentsManagement.repositories;

import com.drc.agentsManagement.entities.Cite;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface CiteRepository extends JpaRepository<Cite,String> {
    @Transactional
    @Modifying
    @Query("update Cite cite set cite.citeName = :name where cite.citeId = :id")
    int updateCite(@Param("id") String id, @Param("name") String name);

    @Transactional
    @Modifying
    @Query("update Cite cite set cite.territoire.terreId = :terreId where cite.citeId = :id")
    int updateCiteTerritoire(@Param("id") String citeId, @Param("terreId") String terreId
    );

    @Query("select cite from Cite cite where cite.citeName like :keyword")
    List<Cite> getCiteByName(@Param("keyword") String keyword);

}
