package com.classification.client_classification.controller;

import com.classification.client_classification.model.Client;
import com.classification.client_classification.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Controlador Rest criado para expor o endpoint para a classificação dos clientes
 */

@RestController
@RequestMapping("/api/clients")
public class ClientController {
    private final ClientClassificationService ClientClassificationService;

    @Autowired
    public ClientController(ClientClassificationService ClientClassificationService){
        this.ClientClassificationService = ClientClassificationService;
    }
    @PostMapping("/toRank")
    public Client clientToRank(@ResquestBody Client client){
        ClientClassificationService.clientToRank(client);
        return client;
    }
}
