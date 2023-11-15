package com.bananeexp.bananeexp.services.Impl;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.math.BigDecimal;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.bananeexp.servicebananeexp.entities.Client;
import com.bananeexp.servicebananeexp.entities.Commande;
import com.bananeexp.servicebananeexp.services.ClientService;
import com.bananeexp.servicebananeexp.services.CommandeService;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = { com.bananeexp.servicebananeexp.BananeexpApplication.class })
public class ClientServiceImplTest {

    @Autowired
    private ClientService servicetest;
    @Autowired
    private CommandeService commandeServicetest;

    @Test
    public void testcreationSaveClientAvecSuccess() {
        Client clientAttendu = new Client("test", "cl", "test", "tettetetet", "testrr",
                "yyyyyy", null);

        Client saveClient = servicetest.save(clientAttendu);

        assertNotNull(saveClient);
        assertNotNull(saveClient.getId());
        assertEquals(clientAttendu.getId(), saveClient.getId());
        assertEquals(clientAttendu.getPays(), saveClient.getPays());
        assertEquals(clientAttendu.getAdresse(), saveClient.getAdresse());

    }

    @Test
    public void testcreationSaveCommandeAvecSuc() {
        Instant dateLivraison = LocalDate.now().plusWeeks(2).atStartOfDay(ZoneId.systemDefault()).toInstant();
         Client clientAttendu = new Client("test", "cl", "test", "tettetetet", "testrr",
                "yyyyyy", null);
        Commande comAtendu = new Commande(
        dateLivraison, new BigDecimal(250),2.50,100,clientAttendu);

        Commande saveCommande= commandeServicetest.save(comAtendu);

        saveCommande.setQuantite(50);
        saveCommande=
    }

}
