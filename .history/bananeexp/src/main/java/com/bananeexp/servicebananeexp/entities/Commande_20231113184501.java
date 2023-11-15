package com.bananeexp.servicebananeexp.entities;

import java.math.BigDecimal;
import java.util.Date;

import jakarta.persistence.Column;
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

    @Column(name="dateliv")
    private Date dateLivraison;
    private BigDecimal prix;
    private BigDecimal prixUnitair;
    private Integer quantite;

}
