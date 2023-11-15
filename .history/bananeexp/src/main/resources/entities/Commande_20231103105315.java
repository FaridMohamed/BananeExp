package entities;

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
public class Commande {
    @
    private Long idCommande;
    private Date dateCommande;
    private Date dateLivraison;
    private Double prix;
    private Integer quantite;

}
