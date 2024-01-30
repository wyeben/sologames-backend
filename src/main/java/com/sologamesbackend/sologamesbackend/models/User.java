package com.sologamesbackend.sologamesbackend.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class User {
    @Id
    private String id;
    private String firstName;
    private String lastName;
    private String password;
}
