package com.bananeexp.bananeexp.services.Impl;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.bananeexp.servicebananeexp.entities.Client;
import com.bananeexp.servicebananeexp.services.ClientService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ClientServiceImplTest {
    
    @Autowired
    private ClientService servicetest;

    @Test
    public void creationSaveClientAvecSucc(){
        Client clientAttendu= Client.builder()
        .nom("Farid")
        .prenom("TesFarid")
        .idClient("1")
        .adr
    }

}
