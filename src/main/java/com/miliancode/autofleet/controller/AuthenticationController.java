package com.miliancode.autofleet.controller;

import com.miliancode.autofleet.dto.user.UserLoginRequestDto;
import com.miliancode.autofleet.dto.user.UserLoginResponseDto;
import com.miliancode.autofleet.dto.user.UserRegistrationRequestDto;
import com.miliancode.autofleet.dto.user.UserResponseDto;
import com.miliancode.autofleet.security.AuthenticationService;
import com.miliancode.autofleet.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import javax.validation.Valid;

@RestController
@RequiredArgsConstructor
@RequestMapping("/auth")
public class AuthenticationController {
    private final AuthenticationService authenticationService;
    private final UserService userService;

    @PostMapping("/registration")
    public UserResponseDto register(@RequestBody @Valid UserRegistrationRequestDto registrationRequestDto) {
        System.out.println(registrationRequestDto);
        return userService.register(registrationRequestDto);
    }

    @PostMapping("/login")
    public UserLoginResponseDto login(@RequestBody @Valid UserLoginRequestDto requestDto) {
        return authenticationService.authenticate(requestDto);
    }
}
