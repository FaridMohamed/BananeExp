package com.bananeexp.servicebananeexp.entities;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@tab l
public class Client extends AbstraitEntiti {

    private String nom;
    private String prenom;
    private String adresse;
    private String codePoste;
    private String ville;
    private String pays;

}
