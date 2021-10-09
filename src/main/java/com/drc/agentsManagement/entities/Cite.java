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

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Cite implements Serializable {
    @Id
    private String citeId;
    private String citeName;
    @ManyToOne
    @JoinColumn(name = "territoire_id")
    private Territoire territoire;
    @OneToMany(mappedBy = "cite")
    private List<Quartier> quartiers;
}
