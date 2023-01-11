package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("api")
public class CrmClientController {

    @Autowired
    CrmClientService crmClientService;

    @GetMapping("clients")
    public List<Client>  getAllClients() {
        return crmClientService.getClients();
    }
}
