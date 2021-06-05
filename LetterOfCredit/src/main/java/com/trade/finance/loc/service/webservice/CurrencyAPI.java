package com.sonal.cbx.service.webservice;

import com.sonal.cbx.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class CurrencyAPI {

    @Autowired
    private RestTemplate myRestTemplate;

    @Value("${myrest.url}")
    private String restUrl;

    public User[] getUsers() {

        var users = myRestTemplate.getForObject(restUrl, User[].class);
        System.out.println(users);
        return users;
    }
}
