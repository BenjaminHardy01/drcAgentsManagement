package com.drc.agentsManagement.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.UUID;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Agent implements Serializable {
    @Id
    private String agentId = UUID.randomUUID().toString();
    private String agentFirstName;
    private String agentMiddleName;
    private String agentLastName;
    private String placeOfBirth;
    private LocalDate dateOfBirth;
    private String fatherFullName;
    private String motherFullName;
    private String maritalStatus;
    private int numberOfChildren;
    @ManyToOne
    @JoinColumn(name = "cat_id")
    private Categorie categorie;
    @ManyToOne
    @JoinColumn(name = "province_id")
    private Province province;

}
