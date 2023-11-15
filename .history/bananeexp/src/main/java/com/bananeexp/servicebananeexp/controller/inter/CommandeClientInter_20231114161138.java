package com.bananeexp.servicebananeexp.controller.inter;

import org.apache.hc.core5.reactor.Command;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.bananeexp.servicebananeexp.entities.Commande;

import io.swagger.annotations.Api;

@Api("commandesclients")
public interface CommandeClientInter {

    @PostMapping("exportBanane/Commandeclient/create")
    ResponseEntity<Command> save(@RequestBody Commande cmd);

    @PatchMapping("exportBanane/Commandeclient/update/{id}")
    ResponseEntity<Command> updateCommande(@RequestBody Commande cmd);


}
