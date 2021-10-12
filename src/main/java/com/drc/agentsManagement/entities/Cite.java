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
public class Cite implements Serializable {
    @Id
    private String citeId = UUID.randomUUID().toString();
    private String citeName;
    @ManyToOne
    @JoinColumn(name = "territoire_id")
    private Territoire territoire;
    @OneToMany(mappedBy = "cite")
    private List<Quartier> quartiers;

    @JsonIgnore
    public List<Quartier> getQuartiers() {
        return quartiers;
    }
}
