package entities;

import jakarta.persistence.Entity;

@Entity
public class Client {
    @I
    private Long id;
    private String nom;
    private String prenom;
    private String adresse;
    private String codePoste;
    private String ville;
    private String pays;

}
