package com.bananeexp.servicebananeexp.controller.inter;

import org.apache.hc.core5.reactor.Command;
import org.springframework.http.ResponseEntity;

import io.swagger.annotations.Api;

@Api("commandesclients")
public interface CommandeClientInter {

    ResponseEntity<Command> save(@);

}
