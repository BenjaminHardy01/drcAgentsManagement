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
public class Commune implements Serializable {
    @Id
    private String commId = UUID.randomUUID().toString();
    private String commName;
    @ManyToOne
    @JoinColumn(name = "ville_id")
    private Ville ville;
    @OneToMany(mappedBy = "commune")
    private List<Quartier> quartiers;

}
