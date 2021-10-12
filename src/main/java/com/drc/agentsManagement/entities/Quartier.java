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
public class Quartier implements Serializable {
    @Id
    private String quartId = UUID.randomUUID().toString();
    private String quartName;
    @ManyToOne
    @JoinColumn(name = "commune_id")
    private Commune commune;
    @ManyToOne
    @JoinColumn(name = "cite_id")
    private Cite cite;
    @OneToMany(mappedBy = "quartier")
    private List<Avenue> avenues;

    @JsonIgnore
    public List<Avenue> getAvenues() {
        return avenues;
    }
}
