package com.bananeexp.servicebananeexp.controller.inter;

import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.bananeexp.servicebananeexp.entities.Client;

import io.swagger.annotations.Api;

@Api("exportBanane/client")
public interface ClientInter {

    @PostMapping(value = "exportBanane/client/create", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    @A
    Client save(@RequestBody Client clt);

    @GetMapping(value = "exportBanane/client/find/{idClient}", produces = MediaType.APPLICATION_JSON_VALUE)
    Client findById(@PathVariable("idClient") Integer id);

    @GetMapping(value = "exportBanane/client/all", produces = MediaType.APPLICATION_JSON_VALUE)
    List<Client> findAll();

    @DeleteMapping(value = "exportBanane/client/delete/{idClient}")
    void delete(@PathVariable("idClient") Integer id);

}
