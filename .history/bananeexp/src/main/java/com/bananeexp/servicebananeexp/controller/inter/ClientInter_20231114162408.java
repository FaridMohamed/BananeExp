package com.bananeexp.servicebananeexp.controller.inter;

import com.bananeexp.servicebananeexp.entities.Client;

import io.swagger.annotations.Api;

@Api("clients")
public interface ClientInter {

    Client save(Cleint clt);

}
