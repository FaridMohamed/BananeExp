package com.bananeexp.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.bananeexp.bananeexp.entities.Commande;

@RepositoryRestResource
public interface CommandeRepository extends JpaRepository<Commande, Long> {

}
