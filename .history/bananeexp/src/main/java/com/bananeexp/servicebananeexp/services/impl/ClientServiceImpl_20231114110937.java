package com.bananeexp.servicebananeexp.services.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.bananeexp.servicebananeexp.dao.ClientRepository;
import com.bananeexp.servicebananeexp.entities.Client;
import com.bananeexp.servicebananeexp.services.ClientService;

import lombok.extern.slf4j.Slf4j;

@Service
// pour les log
@Slf4j
public class ClientServiceImpl implements ClientService {

    private ClientRepository

    public ClientServiceImpl(){

    };

    @Override
    public Client save(Client clt) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'save'");
    }

    @Override
    public void delete(Client clt) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }

    @Override
    public List<Client> findAll() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findAll'");
    }

}