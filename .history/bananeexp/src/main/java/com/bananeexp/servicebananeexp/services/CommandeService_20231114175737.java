package com.bananeexp.servicebananeexp.services;

import java.util.List;

import com.bananeexp.servicebananeexp.entities.Commande;

public interface CommandeService {

    Commande save(Commande cmd);

    void delete(Commande cmd);

    Commande updaetCommande()

    List<Commande> findAll();
}
