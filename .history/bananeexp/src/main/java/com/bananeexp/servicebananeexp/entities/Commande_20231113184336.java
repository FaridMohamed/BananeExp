package com.bananeexp.servicebananeexp.entities;

import java.util.Date;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Table(name = "commande")
public class Commande extends AbstraitEntiti {

    private Date dateLivraison;
    private Double prix;
    private Big
    private Integer quantite;

}
