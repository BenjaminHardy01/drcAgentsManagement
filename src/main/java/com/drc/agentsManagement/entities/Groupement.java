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
public class Groupement implements Serializable {
    @Id
    private String groupeId = UUID.randomUUID().toString();
    private String groupeName;
    @ManyToOne
    @JoinColumn(name = "secteur_id")
    private Secteur secteur;

    @ManyToOne
    @JoinColumn(name = "chefferie_id")
    private Chefferie chefferie;

    @OneToMany(mappedBy = "groupement")
    private List<Village> villages;

    @JsonIgnore
    public List<Village> getVillages() {
        return villages;
    }
}
