package com.drc.agentsManagement.repositories;

import com.drc.agentsManagement.entities.Chefferie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface ChefferieRepository extends JpaRepository<Chefferie,String> {
    @Transactional
    @Modifying
    @Query("update Chefferie cheff set cheff.cheffName = :name, cheff.Superficie = :superf where cheff.cheffId = :id")
    int updateChefferie(@Param("id") String id, @Param("name")String name, @Param("superf")Long superf);

    @Transactional
    @Modifying
    @Query("update Chefferie cheff set cheff.territoire.terreId = :terreId where cheff.cheffId = :id")
    int updateChefferieTerritoire(@Param("id") String cheffId, @Param("terreId") String terreId
    );

    @Query("select cheff from Chefferie cheff where cheff.territoire.terreId = :terreId")
    List<Chefferie> getChefferieByTerritoire(@Param("terreId") String terreId);

    @Query("select cheff from Chefferie cheff where cheff.cheffName like :keyword")
    List<Chefferie> getChefferiesByName(@Param("keyword") String keyword);
}
