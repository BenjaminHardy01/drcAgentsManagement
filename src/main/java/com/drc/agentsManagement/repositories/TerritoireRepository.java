package com.drc.agentsManagement.repositories;

import com.drc.agentsManagement.entities.Territoire;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface TerritoireRepository extends JpaRepository<Territoire,String> {
    @Transactional
    @Modifying
    @Query("update Territoire terre set terre.terreName = :name where terre.terreId = :id")
    int updateTerritoire(@Param("id") String id, @Param("name")String name);

    @Transactional
    @Modifying
    @Query("update Territoire terre set terre.district.distId = :distId where terre.terreId = :id")
    int updateTerritoireDistrict(@Param("id") String terreId, @Param("distId") String distId
    );

    @Transactional
    @Modifying
    @Query("update Territoire terre set terre.province.provinceId = :provId where terre.terreId = :id")
    int updateTerritoireProvince(@Param("id") String terreId, @Param("provId") String provId);

    @Query("select terre from Territoire terre where terre.province.provinceId = :provId")
    List<Territoire> getTerritoiresByProvince(@Param("provId") String provId);

    @Query("select terre from Territoire terre where terre.district.distId = :distId")
    List<Territoire> getTerritoiresByDistrict(@Param("distId") String distId);

    @Query("select terre from Territoire terre where terre.terreName like :keyword")
    List<Territoire> getTerritoiresByName(@Param("keyword") String keyword);

}
