package com.bananeexp.servicebananeexp.controller.inter;

import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.bananeexp.servicebananeexp.entities.Client;

import io.swagger.annotations.Api;

@Api("clients")
public interface ClientInter {

    @PostMapping(value = "exportBanane/client/create", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    Client save(@RequestBody Client clt);

    @GetMapping(value = "exportBanane/client/all", produces = MediaType.APPLICATION_JSON_VALUE)
    List<Client> findAll();

    @Dele
    void delete(@PathVariable("idClient") Integer id);

}
