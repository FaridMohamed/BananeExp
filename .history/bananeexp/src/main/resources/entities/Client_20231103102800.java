package entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity

public class Client {
    @Id
    
    private Long id;
    private String nom;
    private String prenom;
    private String adresse;
    private String codePoste;
    private String ville;
    private String pays;

}
