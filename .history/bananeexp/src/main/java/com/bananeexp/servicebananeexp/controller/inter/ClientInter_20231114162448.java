package com.bananeexp.servicebananeexp.controller.inter;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.bananeexp.servicebananeexp.entities.Client;

import io.swagger.annotations.Api;

@Api("clients")
public interface ClientInter {

    @PostMapping
    Client save(@RequestBodyClient clt);

}
