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
import io.swagger.annotations.ApiResponses;

@Api("exportBanane/client")
public interface ClientInter {

    @PostMapping(value = "exportBanane/client/create", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    @ApiOperation(value = "Enregistrer un client", notes = "Cette methode permet d'enregistrer un client", response = Client.class)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "L'objet client cree / modifie"),
            @ApiResponse(code = 400, message = "L'objet client n'est pas valide")
    })
    Client save(@RequestBody Client clt);

    @GetMapping(value = "exportBanane/client/find/{idClient}", produces = MediaType.APPLICATION_JSON_VALUE)
    @ApiOperation(value = "Rechercher du client par ID", notes = "Cette methode permet de chercher un client par son ID", response = Client.class)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Le client a ete trouve dans la BDD"),
            @ApiResponse(code = 404, message = "Aucun client n'existe dans la BDD avec l'ID fourni")
    })
    Client findById(@PathVariable("idClient") Integer id);

    @GetMapping(value = "exportBanane/client/all", produces = MediaType.APPLICATION_JSON_VALUE)
    @ApiOperation(value = "Renvoi la liste des clients", notes = "Cette methode permet de chercher et renvoyer la liste des clients qui existent "
            + "dans la BDD", responseContainer = "List<Client>")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "La liste des clients / Une liste vide")
    })
    List<Client> findAll();

    @DeleteMapping(value = "exportBanane/client/delete/{idClient}")
    @ApiOperation(value = "Supprimer un client", notes = "Cette methode permet de supprimer un client par ID")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Le client a ete supprime")
    })
    void delete(@PathVariable("idClient") Integer id);

}
