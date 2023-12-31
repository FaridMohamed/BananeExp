package com.bananeexp.servicebananeexp.services.impl;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bananeexp.servicebananeexp.dao.ClientRepository;
import com.bananeexp.servicebananeexp.entities.Client;
import com.bananeexp.servicebananeexp.exception.ErrorCodes;
import com.bananeexp.servicebananeexp.exception.InvalidEntityException;
import com.bananeexp.servicebananeexp.services.ClientService;
import com.bananeexp.servicebananeexp.validator.ClientValidator;

import lombok.extern.slf4j.Slf4j;

@Service
// pour les log
@Slf4j
public class ClientServiceImpl implements ClientService {

    private ClientRepository clientRepository;

    @Autowired
    public ClientServiceImpl(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    };

    @Override
    public Client save(Client clt) {
        List<String> erreurs = ClientValidator.validate(clt);
        if (!erreurs.isEmpty()) {
            log.error("Client est invalide", clt);
            throw new InvalidEntityException("Client est invalide", ErrorCodes.CLIENT_INV);
        }

        return clientRepository.save(clt);
    }

    @Override
    public void delete(Client clt) {

        if (clt == null || clt.getId() == null) {
            log.error(("Le client est null"));
            return;
        }
        clientRepository.delete(clt);
    }

    @Override
    public List<Client> findAll() {

        return clientRepository.findAll().stream().collect(Collectors.toList());
    }

    @Override
    public Client findById(Integer id) {
        if (id == null) {
            log.error("Client ID is null");
            return null;
        }

        return clientRepository.findById(id).get();

    }

    @Override
    public void deleteById(Integer id) {

        if (id == null) {
            log.error(("Le client est null"));
            return;
        }
        clientRepository.deleteById(id);
    }

}
