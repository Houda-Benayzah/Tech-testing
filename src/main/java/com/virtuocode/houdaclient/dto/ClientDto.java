package com.virtuocode.houdaclient.dto;

import com.virtuocode.houdaclient.entities.Client;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Builder
@AllArgsConstructor
@Data
public class ClientDto {
    private Long id;
    private String firstName;
    private String lastName;
    private int age;
    private String email;

    public static ClientDto fromEntity(Client client){
        return ClientDto.builder().id(client.getId())
                .firstName(client.getFirstName())
                .lastName(client.getLastName())
                .email(client.getEmail())
                .age(client.getAge())
                .build();
    }

    public static Client toEntity(ClientDto clientDto){
        return Client.builder().id(clientDto.getId())
                .firstName(clientDto.getFirstName())
                .lastName(clientDto.getLastName())
                .email(clientDto.getEmail())
                .age(clientDto.getAge())
                .build();
    }
}
