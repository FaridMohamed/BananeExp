package com.bananeexp.servicebananeexp.controller.inter;

import java.time.Instant;

import org.apache.hc.core5.reactor.Command;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.bananeexp.servicebananeexp.entities.Commande;

import io.swagger.annotations.Api;

@Api("commandesclients")
public interface CommandeClientInter {

    @PostMapping("exportBanane/Commandeclient/create")
    ResponseEntity<Commande> save(@RequestBody Commande cmd);

    @PatchMapping("exportBanane/Commandeclient/update/{idCommande}/{dateLivraison}")
    ResponseEntity<Commande> updateCommande(@PathVariable("idCommande") Integer idCommande,
            @PathVariable("dateLivraison") Instant dateLivraison);

    @GetMapping("exportBanane/Commandeclient/{idClient}")
    ResponseEntity<Commande> findByClientId(@PathVariable("idClient") Integer id);

}
