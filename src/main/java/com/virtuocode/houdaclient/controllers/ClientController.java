package com.virtuocode.houdaclient.controllers;

import com.virtuocode.houdaclient.dto.ClientDto;
import com.virtuocode.houdaclient.entities.Client;
import com.virtuocode.houdaclient.services.ClientService;
import com.virtuocode.houdaclient.validation.ClientValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("clients")
public class ClientController {

    @Autowired
    private ClientService clientService;

    @GetMapping
    public List<ClientDto> getAll(){
        return clientService.getAll();
    }

    @PostMapping
    public Client add(@RequestBody ClientDto clientDto) throws Exception {
        String errorMessage = ClientValidator.validateClient(clientDto);
        if (errorMessage != "")throw new RuntimeException(errorMessage);
        return clientService.add(clientDto);
    }
}
