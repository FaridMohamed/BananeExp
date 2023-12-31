package com.bananeexp.servicebananeexp.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.bananeexp.servicebananeexp.entities.Client;

@RepositoryRestResource
public interface ClientRepository extends JpaRepository<Client, Integer> {

    List<Client> findByPrenom(String prenom);

   /* @Query("select a from client a where a.prenom= :prenom and a.nom= :nom")
    List<Client> findByPrenom(@Param("prenom") String p, @Param("nom") String n);
*/
}
