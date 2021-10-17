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
public class Chefferie implements Serializable {
    @Id
    private String cheffId = UUID.randomUUID().toString();
    private String cheffName;
    private Long Superficie;
    @ManyToOne
    @JoinColumn(name = "terre_id")
    private Territoire territoire;
    @OneToMany(mappedBy = "chefferie")
    private List<Groupement> groupements;

    @JsonIgnore
    public List<Groupement> getGroupements() {
        return groupements;
    }
}
