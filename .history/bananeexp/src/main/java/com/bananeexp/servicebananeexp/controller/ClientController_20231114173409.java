package com.bananeexp.servicebananeexp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.bananeexp.servicebananeexp.controller.inter.ClientInter;
import com.bananeexp.servicebananeexp.entities.Client;
import com.bananeexp.servicebananeexp.services.ClientService;

@RestController
public class ClientController implements ClientInter {

    private ClientService clientService;

    @Autowired
    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }

    @Override
    public Client save(Client clt) {
        return clientService.save(clt);
    }

    @Override
    public Client findById(Integer id) {
    return clientService.findById(id);
    }

    @Override
    public List<Client> findAll() {
    return clientService.findAll();   
    }

    @Override
    public void delete(Integer id) {
      clientService.delete(id);
    }

}
