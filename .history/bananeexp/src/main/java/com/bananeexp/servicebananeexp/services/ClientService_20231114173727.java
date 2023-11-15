package com.bananeexp.servicebananeexp.services;

import java.util.List;
import java.util.Optional;

import com.bananeexp.servicebananeexp.entities.Client;

public interface ClientService {

    Client save(Client clt);

    void delete(Client id);

    Client findById(Integer id);

    List<Client> findAll();

}