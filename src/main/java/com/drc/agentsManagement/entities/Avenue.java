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
import java.io.Serializable;
import java.util.UUID;


@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Avenue implements Serializable {
    @Id
    private String avenueId = UUID.randomUUID().toString();
    private String avenueName;
    @ManyToOne
    @JoinColumn(name = "quartier_id")
    private Quartier quartier;


}
