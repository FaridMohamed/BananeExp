package com.bananeexp.servicebananeexp.validator;

import java.util.ArrayList;
import java.util.List;

import com.bananeexp.servicebananeexp.entities.Client;

import io.micrometer.common.util.StringUtils;

public class CommandeValidator {

    public static List<String> validate(Commande commande) {
        List<String> errors = new ArrayList<>();

        if ( == null || StringUtils.isEmpty(.getNom()) ||
                StringUtils.isEmpty(.getPrenom())) {
            errors.add("Veuillez renseigner votre nom et/ou prenom");
        }

        if  == null || StringUtils.isEmpty(client.getAdresse())) {
            errors.add("Veuillez renseigner adresse postal");
        }
        return errors;

    }
    
}
