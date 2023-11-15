package com.bananeexp.servicebananeexp.entities;

import java.math.BigDecimal;
import java.util.Date;

import org.hibernate.annotations.Comment;

import jakarta.persistence.Column;
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
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@ToString
@Table(name = "commande")
public class Commande extends AbstraitEntiti {

    @Column(name = "datelivraison")
    private Date dateLivraison;

    @Column(name = "prix")
    private BigDecimal prix;

    @Column(name = "prixunitaire")
    private BigDecimal prixUnitair;

    @Column(name = "quantite")
    private Integer quantite;

    private Client client;

}
