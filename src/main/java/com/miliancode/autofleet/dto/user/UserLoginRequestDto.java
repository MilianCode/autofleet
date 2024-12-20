package com.miliancode.autofleet.dto.user;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

@Data
public class UserLoginRequestDto {
    @NotBlank
    @Email
    private String email;
    @NotBlank
    @Length(min = 8, max = 50)
    private String password;

    public UserLoginRequestDto(String email, String password) {
        this.email = email;
        this.password = password;
    }
}
