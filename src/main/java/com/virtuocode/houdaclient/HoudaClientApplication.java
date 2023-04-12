package com.virtuocode.houdaclient;

import com.virtuocode.houdaclient.dao.ClientRepository;
import com.virtuocode.houdaclient.entities.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HoudaClientApplication /*implements CommandLineRunner*/ {

    @Autowired
    ClientRepository clientRepository;

    public static void main(String[] args) {
        SpringApplication.run(HoudaClientApplication.class, args);
    }

    /*@Override
    public void run(String... args) throws Exception {
        clientRepository.save(new Client("houda","benayzah",25,"houdabenayzah9@gmail.com"));
    }*/
}
