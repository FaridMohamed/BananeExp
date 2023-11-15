package com.bananeexp.servicebananeexp.controller;

import java.time.Instant;

import org.apache.hc.core5.reactor.Command;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.bananeexp.servicebananeexp.controller.inter.CommandeClientInter;
import com.bananeexp.servicebananeexp.entities.Commande;
import com.bananeexp.servicebananeexp.services.CommandeService;

@RestController
public class CommandeController implements CommandeClientInter {

    private CommandeService commandeService;

    @Autowired
    public CommandeController(CommandeService commandeService) {
        this.commandeService = commandeService;
    }

    @Override
    public ResponseEntity<Commande> save(Commande cmd) {
    
        return ResponseEntity.ok(commandeService.save(cmd));
    }

    @Override
    public ResponseEntity<Commande> updateCommande(Integer idCommande, Instant dateLivraison) {
       
    }

    @Override
    public ResponseEntity<Command> findByClientId(Integer id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findByClientId'");
    }

}
