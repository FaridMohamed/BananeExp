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
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;

@Api("exportBanane/client")
public interface ClientInter {

    @PostMapping(value = "exportBanane/client/create", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    @ApiOperation(value = "Enregistrer un client", notes = "Cette methode permet d'enregistrer un client", response = Client.class)
    @ApiResponse(value = {
            @ApiResponse(code = 200, message = "L'objet client cree / modifie"),
            @ApiResponse(code = 400, message = "L'objet client n'est pas valide")    
        })
    Client save(@RequestBody Client clt);

    @GetMapping(value = "exportBanane/client/find/{idClient}", produces = MediaType.APPLICATION_JSON_VALUE)
    Client findById(@PathVariable("idClient") Integer id);

    @GetMapping(value = "exportBanane/client/all", produces = MediaType.APPLICATION_JSON_VALUE)
    List<Client> findAll();

    @DeleteMapping(value = "exportBanane/client/delete/{idClient}")
    void delete(@PathVariable("idClient") Integer id);

}