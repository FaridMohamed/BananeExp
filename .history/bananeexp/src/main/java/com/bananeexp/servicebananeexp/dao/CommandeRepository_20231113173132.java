package com.bananeexp.servicebananeexp.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.bananeexp.servicebananeexp.entities.Commande;

@RepositoryRestResource
public interface CommandeRepository extends JpaRepository<Commande, Long> {

}
