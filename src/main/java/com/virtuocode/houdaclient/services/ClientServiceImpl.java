package com.virtuocode.houdaclient.services;

import com.virtuocode.houdaclient.dao.ClientRepository;
import com.virtuocode.houdaclient.dto.ClientDto;
import com.virtuocode.houdaclient.entities.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ClientServiceImpl implements ClientService{

    @Autowired
    ClientRepository clientRepository;

    @Override
    public Client add(ClientDto clientDto) {
        return this.clientRepository.save(ClientDto.toEntity(clientDto));
    }

    @Override
    public List<ClientDto> getAll() {
        return clientRepository.findAll().stream().map(client -> ClientDto.fromEntity(client)).collect(Collectors.toList());
    }
}
