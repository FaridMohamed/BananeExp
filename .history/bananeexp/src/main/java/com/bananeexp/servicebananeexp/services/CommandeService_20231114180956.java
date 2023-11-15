package com.bananeexp.servicebananeexp.services;

import java.util.List;

import com.bananeexp.servicebananeexp.entities.Commande;

public interface CommandeService {

    Commande save(Commande cmd);

    void delete(Commande cmd);

    Commande upDateCommande(Integer id,;

    List<Commande> findAll();
}
