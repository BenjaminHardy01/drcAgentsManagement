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
public class Province implements Serializable {
    @Id
    private String provinceId = UUID.randomUUID().toString();
    private String provinceName;
    @OneToMany(mappedBy = "province")
    private List<Ville> villes;
    @OneToMany(mappedBy = "province")
    private List<District> districts;
    @OneToMany(mappedBy = "province")
    private List<Agent> agents;

    @JsonIgnore
    public List<Ville> getVilles() {
        return villes;
    }

    @JsonIgnore
    public List<District> getDistricts() {
        return districts;
    }

    @JsonIgnore
    public List<Agent> getAgents() {
        return agents;
    }
}
