package com.bananeexp.servicebananeexp.entities;


import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Commande extends AbstraitEntiti {

    private Date dateCommande;
    private Date dateLivraison;
    private Double prix;
    private Integer quantite;

}
