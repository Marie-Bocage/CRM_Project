package com.service;

import com.crm.model.Client;
import com.crm.model.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CrmClientService {

    @Autowired
    ClientRepository clientRepository;

    public void addCLient(Client client) {
        clientRepository.save(client);
    }

    public List<Client> getClients() {
        return clientRepository.findAll();
    }

    public Optional<Client> getClientById(Integer id) {
        return clientRepository.findById(id);
    }

    public void deleteClientById(Integer id) {
        clientRepository.deleteById(id);
    }

    public void updateClient (Integer id, Client client) {
        clientRepository.save(client);
    }
}
