package com.drc.agentsManagement.repositories;

import com.drc.agentsManagement.entities.Agent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.util.List;

public interface AgentRepository extends JpaRepository<Agent,String> {
    @Transactional
    @Modifying
    @Query("update Agent ag set ag.agentFirstName = :first,ag.agentMiddleName = :middle, ag.agentLastName = :last," +
            "ag.placeOfBirth = :place, ag.dateOfBirth = :date, ag.fatherFullName = :fath, ag.motherFullName = :morth," +
            "ag.maritalStatus = :status, ag.numberOfChildren = :child where ag.agentId = :id")
    int updateAgent(@Param("id") String id, @Param("first") String firstname, @Param("middle") String middlename,
                    @Param("last") String lastname, @Param("place") String placeBirth,@Param("date") LocalDate dateBirth,
                    @Param("fath") String fatherName, @Param("morth") String motherName, @Param("status") String maritalStatus,
                    @Param("child") int childrenNumber);

    @Transactional
    @Modifying
    @Query("update Agent ag set ag.categorie.catId = :catId where ag.agentId = :id")
    int updateAgentCategorie(@Param("id") String agentId, @Param("catId") String catId
    );

    @Transactional
    @Modifying
    @Query("update Agent ag set ag.province.provinceId = :provId where ag.agentId = :id")
    int updateAgentProvince(@Param("id") String agentId, @Param("provId") String provinceId
    );

    @Query("select p from Agent p where p.categorie.catId = :catId")
    List<Agent> getAgentsByCategorie(@Param("catId") String catId);

    @Query("select p from Agent p where p.province.provinceId = :provId")
    List<Agent> getAgentsByProvince(@Param("provId") String provId);

    @Query("select p from Agent p where p.agentLastName like :keyword")
    List<Agent> getAgentByLastName(@Param("keyword") String keyword);
}
