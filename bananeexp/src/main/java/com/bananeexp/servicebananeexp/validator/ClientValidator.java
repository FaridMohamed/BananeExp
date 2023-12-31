package com.bananeexp.servicebananeexp.validator;

import java.util.ArrayList;
import java.util.List;

import com.bananeexp.servicebananeexp.entities.Client;

import io.micrometer.common.util.StringUtils;
import io.netty.util.internal.StringUtil;

public class ClientValidator {

    public static List<String> validate(Client client) {
        List<String> errors = new ArrayList<>();

        if (client == null || StringUtils.isEmpty(client.getNom()) ||
                StringUtils.isEmpty(client.getPrenom())) {
            errors.add("Veuillez renseigner votre nom et/ou prenom");
        }

        if (client == null || StringUtils.isEmpty(client.getAdresse())) {
            errors.add("Veuillez renseigner adresse postal");
        }
        return errors;

    }
}
