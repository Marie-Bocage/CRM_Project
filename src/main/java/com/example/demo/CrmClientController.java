package com.example.demo;

import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("api")
public class CrmClientController {

    @Autowired
    CrmClientService crmClientService;

    @GetMapping("clients")
    public List<Client>  getAllClients() {
        return crmClientService.getClients();
    }

    @GetMapping("clients/{id}")
    public ResponseEntity getOneClient(@PathVariable Integer id) {
        Optional<Client> optional = crmClientService.getClientById(id);
        if(optional.isEmpty()) {
            return ResponseEntity.notFound().build();
        } else {
            return ResponseEntity.ok(optional.get());
        }
    }

    @PostMapping("clients")
    public void createClient(@RequestBody Client client) {
        crmClientService.addClient(client);
    }

    @DeleteMapping("client/{id}")
    public void deleteClient(@PathVariable Integer id) {
        crmClientService.deleteClientById(id);
    }

    @PutMapping("client/{id}")
    public void updateClient(@PathVariable Integer id, @RequestBody Client client) {
        crmClientService.updateClient(id, client);
    }
}
