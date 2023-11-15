package com.bananeexp.servicebananeexp.services.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.bananeexp.servicebananeexp.entities.Commande;
import com.bananeexp.servicebananeexp.services.CommandeService;

@Service
public class CommandeServiceImpl implements CommandeService {

    @Override
    public Commande save(Commande cmd) {
        
        throw new UnsupportedOperationException("Unimplemented method 'save'");
    }

    @Override
    public void delete(Commande cmd) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }

    @Override
    public List<Commande> findAll() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findAll'");
    }

}
