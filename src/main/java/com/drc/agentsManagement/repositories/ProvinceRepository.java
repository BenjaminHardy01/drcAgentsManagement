package com.drc.agentsManagement.repositories;

import com.drc.agentsManagement.entities.Province;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface ProvinceRepository extends JpaRepository<Province,String> {
    @Transactional
    @Modifying
    @Query("update Province pr set pr.provinceName = :name, pr.superficie = :superf, pr.population = :pop," +
            "pr.chefLieu = :chefl where pr.provinceId = :id")
    int updateProvince(@Param("id") String id, @Param("name")String name, @Param("superf")Long superf
    ,@Param("pop")Long pop,@Param("chefl")String chefl);

    @Query("select pr from Province pr where pr.provinceName like :keyword")
    List<Province> getProvinceByName(@Param("keyword") String keyword);
}
