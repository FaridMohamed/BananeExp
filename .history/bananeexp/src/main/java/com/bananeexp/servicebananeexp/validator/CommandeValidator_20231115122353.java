package com.bananeexp.servicebananeexp.validator;

import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.List;

import com.bananeexp.servicebananeexp.entities.Client;
import com.bananeexp.servicebananeexp.entities.Commande;

public class CommandeValidator {

    public static List<String> validate(Commande commande) {
        List<String> errors = new ArrayList<>();
        LocalDate dateDuJour = commande.getCreationDate().atZone(ZoneId.systemDefault()).toLocalDate();
        LocalDate dateDeLivraison = dateDuJour.plusWeeks(1);
        Instant dateLivraisonT = commande.getDateLivraison();
        
        double prixAuKilo = 2.50;
        if (commande == null || commande.getDateLivraison() == null) {
            errors.add("la date de livraison doit être rempli");
        }

        if (dateDeLivraison.isBefore(dateLivraisonT.atZone(ZoneId.systemDefault()).toLocalDate())) {
            errors.add(
                    "la date de livraison doit être au minimum, une semaine dans le futur par rapport à la date du jour ");
        }
        if (quantiteBananes < 0 || quantiteBananes > 10000 || quantiteBananes % 25 != 0) {
            errors.add("La quantité de bananes doit être entre 0 et 10 000 et être un multiple de 25");
        }
        return errors;

    }

    public double calculerPrix(Commande cmd) {
        Integer quantiteBananes = cmd.getQuantite();
        // Prix au kilo
        double prixAuKilo = 2.50;
        // Calcul du prix total
        return quantiteBananes * prixAuKilo;
    }

}
