package com.example.userReg.registration;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@Getter
@AllArgsConstructor
@Entity
@ToString
@EqualsAndHashCode
public class RegistratioRequest {
    private final String firstName;
    private final String lastName;
    private final String email;
    private final String password;


}
