package com.drc.agentsManagement.repositories;

import com.drc.agentsManagement.entities.Categorie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface CategorieRepository extends JpaRepository<Categorie,String> {
    @Transactional
    @Modifying
    @Query("update Categorie cat set cat.catName = :name,cat.catDescription = :desc where cat.catId = :id")
    int updateCategorie(@Param("id") String id, @Param("name") String name, @Param("desc") String description);

    @Query("select cat from Categorie cat where cat.catName like :keyword")
    List<Categorie> getCategorieByName(@Param("keyword") String keyword);

}
