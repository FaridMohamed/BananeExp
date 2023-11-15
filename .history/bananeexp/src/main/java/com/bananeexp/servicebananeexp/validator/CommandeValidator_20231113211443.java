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
        if (commande == null || commande.getDateLivraison() == null) {
            errors.add("la date de livraison doit être rempli");
        }

        if (dateDeLivraison.isBefore(dateLivraisonT.atZone(ZoneId.systemDefault()).toLocalDate())) {
            errors.add(
                    "la date de livraison doit être au minimum, une semaine dans le futur par rapport à la date du jour ");
        }
        return errors;

    }

}
