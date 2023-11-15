package com.bananeexp.bananeexp.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import entities.Commande;




public interface CommandeRepository extends JpaRepository<Commande, Long> {

}
