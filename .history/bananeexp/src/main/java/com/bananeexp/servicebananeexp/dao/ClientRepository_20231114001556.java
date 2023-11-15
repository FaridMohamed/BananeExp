package com.bananeexp.servicebananeexp.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.bananeexp.servicebananeexp.entities.Client;

@RepositoryRestResource
public interface ClientRepository extends JpaRepository<Integer, Client> {

    List<Client> findByPrenon(String prenom);
@
    List<Client> findByCommandeQuery()

}
