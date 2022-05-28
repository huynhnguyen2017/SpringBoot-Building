package com.example.SpringBootBuilding.hello;

import com.example.SpringBootBuilding.entities.UserDetails;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {

    @GetMapping(path = "/helloworldbean")
    public UserDetails helloWorldBean() {
        return new UserDetails("Huynh", "Nguyen", "Hau Giang");
    }

}
