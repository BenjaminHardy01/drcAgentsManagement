package com.drc.agentsManagement.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
public class Territoire implements Serializable {
    @Id
    private String terreId = UUID.randomUUID().toString();
    private String terreName;
    @ManyToOne
    @JoinColumn(name = "dist_id")
    private District district;

    @ManyToOne
    @JoinColumn(name = "prov_id")
    private Province province;

    @OneToMany(mappedBy = "territoire")
    private List<Cite> cites;
    @OneToMany(mappedBy = "territoire")
    private List<Secteur> secteurs;

    @JsonIgnore
    public List<Cite> getCites() {
        return cites;
    }

    @JsonIgnore
    public List<Secteur> getSecteurs() {
        return secteurs;
    }
}
