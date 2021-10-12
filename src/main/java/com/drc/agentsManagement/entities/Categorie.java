package com.drc.agentsManagement.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.io.Serializable;
import java.util.List;
import java.util.UUID;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Categorie implements Serializable {
    @Id
    private String catId = UUID.randomUUID().toString();
    private String catName;
    private String catDescription;
    @OneToMany(mappedBy = "categorie")
    private List<Agent> agents;

    @JsonIgnore
    public List<Agent> getAgents() {
        return agents;
    }
}
