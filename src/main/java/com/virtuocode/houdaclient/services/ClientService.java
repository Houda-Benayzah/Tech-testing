package com.virtuocode.houdaclient.services;

import com.virtuocode.houdaclient.dto.ClientDto;
import com.virtuocode.houdaclient.entities.Client;

import java.util.List;

public interface ClientService {
    Client add(ClientDto clientDto);
    List<ClientDto> getAll();
}
