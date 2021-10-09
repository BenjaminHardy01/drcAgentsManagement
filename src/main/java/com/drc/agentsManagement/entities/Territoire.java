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
public class Territoire implements Serializable {
    @Id
    private String terreId;
    private String terreName;
    @ManyToOne
    @JoinColumn(name = "dist_id")
    private District district;
    @OneToMany(mappedBy = "territoire")
    private List<Cite> cites;
    @OneToMany(mappedBy = "territoire")
    private List<Secteur> secteurs;
}
