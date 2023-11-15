package com.bananeexp.servicebananeexp.services;

import java.util.List;

import com.bananeexp.servicebananeexp.entities.Client;

public interface ClientService {

    Client save(Client clt);

    void delete(Client clt);

    Client findById(Integer id);

    List<Client> findAll();

}