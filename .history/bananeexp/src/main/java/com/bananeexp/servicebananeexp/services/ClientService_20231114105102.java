package com.bananeexp.servicebananeexp.services;

import com.bananeexp.servicebananeexp.entities.Client;

public interface ClientService {

    Client save(Client clt);

    Boolean delete(Client clt);

    List<Client> findAll();
    
}