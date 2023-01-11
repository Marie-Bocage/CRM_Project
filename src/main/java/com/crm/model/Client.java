package com.crm.model;

import org.springframework.data.annotation.*;

public class Client {

    @Id

    private Integer id;

//    @Column(name = "company_name")
    private String companyName;

//    @Column(name = "first_name")
    private String firstName;

//    @Column(name = "last_name")
    private String lastName;

    private String email;

    private String phone;

    private String address;

//    @Column(name = "zip_code")
    private String zipCode;

    private String city;

    private String country;

    private ClientState state;
}
