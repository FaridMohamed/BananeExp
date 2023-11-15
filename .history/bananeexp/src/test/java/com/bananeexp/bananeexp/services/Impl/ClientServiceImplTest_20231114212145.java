package com.bananeexp.bananeexp.services.Impl;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.bananeexp.servicebananeexp.entities.Client;
import com.bananeexp.servicebananeexp.services.ClientService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ClientServiceImplTest {
    
    @Autowired
    private ClientService servicetest;

    @Test
    public void creationSaveClientAvecSucc(){
        Client clientAttendu= new Client("test", "cl", "test", "tettetetet", "testrr",
	 "yyyyyy", null);

     Client saveClient= servicetest.save(clientAttendu);

      assertNotNull(saveClient);
    assertNotNull(saveClient.getId());
    assertEquals(expectedCategory.getCode(), saveClient.getId);
    assertEquals(expectedCategory.getDesignation(), savedsaveClientCategory.getDesignation());
    assertEquals(expectedCategory.getIdEntreprise(), savedCategory.getIdEntreprise());

    }

}