package com.bananeexp.servicebananeexp.services;

import com.bananeexp.servicebananeexp.entities.Commande;

public interface CommandeService {

    Commande save(Commande cmd);

    void delete(Commande cmd);

    List<Commande> findAll();
}
