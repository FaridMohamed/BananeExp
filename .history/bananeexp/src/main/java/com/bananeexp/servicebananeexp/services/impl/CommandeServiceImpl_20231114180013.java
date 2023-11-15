package com.bananeexp.servicebananeexp.services.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bananeexp.servicebananeexp.dao.CommandeRepository;
import com.bananeexp.servicebananeexp.entities.Commande;
import com.bananeexp.servicebananeexp.exception.ErrorCodes;
import com.bananeexp.servicebananeexp.exception.InvalidEntityException;
import com.bananeexp.servicebananeexp.services.CommandeService;
import com.bananeexp.servicebananeexp.validator.ClientValidator;
import com.bananeexp.servicebananeexp.validator.CommandeValidator;

import lombok.extern.slf4j.Slf4j;

@Service
// pour les log
@Slf4j
public class CommandeServiceImpl implements CommandeService {

    private CommandeRepository commandeRepository;

    @Autowired
    public CommandeServiceImpl(CommandeRepository commandeRepository) {

        this.commandeRepository = commandeRepository;
    }

    @Override
    public Commande save(Commande cmd) {

        List<String> erreurs = CommandeValidator.validate(cmd);
        if (!erreurs.isEmpty()) {
            log.error("Commande est invalide", cmd);
            throw new InvalidEntityException("Commande est invalide", ErrorCodes.COMM_INV);
        }

        return commandeRepository.save(cmd);
    }

    @Override
    public void delete(Commande cmd) {

        if (cmd == null || cmd.getId() == null) {
            log.error(("La commande est null"));
            return;
        }
        commandeRepository.delete(cmd);
    }

    @Override
    public List<Commande> findAll() {

        return commandeRepository.findAll().stream().collect(Collectors.toList());

    }

    @Override
    public Commande upDateCommande(Commande cmd) {

        if(cmd ==null )
       
    }

}
