package com.bananeexp.servicebananeexp.controller;

import org.springframework.web.bind.annotation.RestController;

import com.bananeexp.servicebananeexp.services.ClientService;

@RestController
public class ClientController {

    @Au
    private ClientService clientService;

    
}