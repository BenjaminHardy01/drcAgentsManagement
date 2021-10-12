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
public class Secteur implements Serializable {
    @Id
    private String secteurId = UUID.randomUUID().toString();
    private String secteurName;
    @ManyToOne
    @JoinColumn(name = "terre_id")
    private Territoire territoire;
    @OneToMany(mappedBy = "secteur")
    private List<Groupement> groupements;

    @JsonIgnore
    public List<Groupement> getGroupements() {
        return groupements;
    }
}
