package com.bananeexp.servicebananeexp.services.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.bananeexp.servicebananeexp.entities.Commande;
import com.bananeexp.servicebananeexp.exception.ErrorCodes;
import com.bananeexp.servicebananeexp.exception.InvalidEntityException;
import com.bananeexp.servicebananeexp.services.CommandeService;
import com.bananeexp.servicebananeexp.validator.ClientValidator;

@Service
public class CommandeServiceImpl implements CommandeService {

    @Override
    public Commande save(Commande cmd) {

          List<String> erreurs = ClientValidator.validate(clt);
        if(!erreurs.isEmpty()){
            log.error("Client est invalide", clt);
            throw new InvalidEntityException("Client est invalide", ErrorCodes.CLIENT_INV)
        }

       return clientRepository.save(clt);
    }

    @Override
    public void delete(Commande cmd) {

    }

    @Override
    public List<Commande> findAll() {

    }

}
