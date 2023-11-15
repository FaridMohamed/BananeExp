package com.bananeexp.servicebananeexp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.bananeexp.servicebananeexp.services.ClientService;

@RestController
public class ClientController {

   /* */ @Autowired
    private ClientService clientService;

}
