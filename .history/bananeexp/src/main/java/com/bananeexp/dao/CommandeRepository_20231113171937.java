package com.bananeexp.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bananeexp.entities.Commande;

@RepositoryRestResource
public interface CommandeRepository extends JpaRepository<Commande, Long> {

}
