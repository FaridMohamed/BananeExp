package com.bananeexp.servicebananeexp.entities;

import jakarta.persistence.Entity;
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

    @Col
    private String nom;
    private String prenom;
    private String adresse;
    private String codePoste;
    private String ville;
    private String pays;

}
