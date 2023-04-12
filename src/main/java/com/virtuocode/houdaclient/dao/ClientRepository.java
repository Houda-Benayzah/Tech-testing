package com.virtuocode.houdaclient.dao;

import com.virtuocode.houdaclient.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client,Long> {
}
