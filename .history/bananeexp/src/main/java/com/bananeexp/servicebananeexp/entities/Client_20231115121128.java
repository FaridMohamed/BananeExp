package com.bananeexp.servicebananeexp.entities;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode(callSuper = true)
@Table(name = "client")
public class Client extends AbstraitEntiti {

    @Column(name = "nom", nullable = false)
    private String nom;

    @Column(name = "prenom", nullable = false)
    private String prenom;

    @Column(name = "adresse", nullable = false)
    private String adresse;

    @Column(name = "codePoste")
    private String codePoste;

    @Column(name = "ville")
    private String ville;

    @Column(name = "pays")
    private String pays;

    @OneToMany(mappedBy = "client")
    private List<Commande> commandes;

}
