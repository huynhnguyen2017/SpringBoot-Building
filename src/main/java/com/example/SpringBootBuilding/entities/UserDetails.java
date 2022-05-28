package com.example.SpringBootBuilding.entities;

import lombok.*;

@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserDetails {
    private String firstName;
    private String lastName;
    private String city;

}
