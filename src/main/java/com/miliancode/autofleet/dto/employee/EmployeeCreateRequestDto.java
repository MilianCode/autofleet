package com.miliancode.autofleet.dto.employee;

import lombok.Data;

@Data
public class EmployeeCreateRequestDto {
    private String email;
    private String password;
    private String firstName;
    private String lastName;
    private String username;
}
