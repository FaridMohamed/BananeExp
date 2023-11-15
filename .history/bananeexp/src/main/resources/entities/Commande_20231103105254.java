package entities;

import jakarta.persistence.Entity;
import lombok.Data;

@Entity
@Data
@al
public class Commande {
    private Long idCommande;
    private Date dateCommande;
    private Date dateLivraison;
    private Double prix;
    private Integer quantite;

}
