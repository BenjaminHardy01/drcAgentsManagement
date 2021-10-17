package com.drc.agentsManagement.repositories;

import com.drc.agentsManagement.entities.District;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface DistrictRepository extends JpaRepository<District,String> {
    @Transactional
    @Modifying
    @Query("update District dist set dist.distName = :name where dist.distId = :id")
    int updateDistrict(@Param("id") String id, @Param("name")String name);

    @Transactional
    @Modifying
    @Query("update District dist set dist.province.provinceId = :provId where dist.distId = :id")
    int updateDistrictProvince(@Param("id") String distId, @Param("provId") String provId
    );

    @Query("select dist from District dist where dist.distName like :keyword")
    List<District> getDistrictsByName(@Param("keyword") String keyword);
}
