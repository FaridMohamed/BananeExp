package com.bananeexp.servicebananeexp.controller;

import java.time.Instant;

import org.apache.hc.core5.reactor.Command;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.bananeexp.servicebananeexp.controller.inter.CommandeClientInter;
import com.bananeexp.servicebananeexp.entities.Commande;

@RestController
public class CommandeController implements CommandeClientInter {

    @Override
    public ResponseEntity<Command> save(Commande cmd) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'save'");
    }

    @Override
    public ResponseEntity<Command> updateCommande(Integer idCommande, Instant dateLivraison) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'updateCommande'");
    }

    @Override
    public ResponseEntity<Command> findByClientId(Integer id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findByClientId'");
    }

}
