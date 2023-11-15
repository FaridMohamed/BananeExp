package entities;

import jakarta.persistence.Entity;

@Entity
@da
public class Commande {
    private Long idCommande;
    private Date dateCommande;
    private Date dateLivraison;
    private Double prix;
    private Integer quantite;

}
