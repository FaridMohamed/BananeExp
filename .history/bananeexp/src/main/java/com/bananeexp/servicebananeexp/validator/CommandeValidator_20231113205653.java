package com.bananeexp.servicebananeexp.validator;

import java.util.ArrayList;
import java.util.List;

import com.bananeexp.servicebananeexp.entities.Client;
import com.bananeexp.servicebananeexp.entities.Commande;

import io.micrometer.common.util.StringUtils;

public class CommandeValidator {

    public static List<String> validate(Commande commande) {
        List<String> errors = new ArrayList<>();

        if ( commande == null || commande.getDateLivraison()==null ) {
            errors.add("la date de livraison doit être rempli");
        }

        if  == null || StringUtils.isEmpty(.getAdresse())) {
            errors.add("");
        }
        return errors;

    }
    
}
