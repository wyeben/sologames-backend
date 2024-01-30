package com.sologamesbackend.sologamesbackend.dto.request;

import lombok.Data;

@Data
public class UserRequest {

    private String firstName;
    private String lastName;
    private String password;
}
