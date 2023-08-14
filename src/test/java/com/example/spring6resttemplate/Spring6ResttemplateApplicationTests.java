package com.example.spring6resttemplate;

import com.example.spring6resttemplate.client.BeerClient;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Spring6ResttemplateApplicationTests {

    @Autowired
    BeerClient beerClient;

    @Test
    void contextLoads() {

        beerClient.listBeers();
    }

}
