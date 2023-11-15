package com.bananeexp.servicebananeexp.entities;

import java.math.BigDecimal;
import java.time.Instant;
import java.util.Date;

import org.hibernate.annotations.Comment;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
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

    @Column(name = "datelivraison", nullable = false)
    private Instant dateLivraison;

    @Column(name = "prix", nullable = false)
    private BigDecimal prix;

    @Column(name = "prixunitaire", nullable = false)
    private double prixUnitair;

    @Column(name = "quantite", nullable = false)
    private Integer quantite;

    @ManyToOne
    @JoinColumn(name = "idclient")
    private Client client;

}
