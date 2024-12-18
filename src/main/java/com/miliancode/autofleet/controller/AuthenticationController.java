package com.miliancode.autofleet.controller;

import com.miliancode.autofleet.dto.user.UserLoginRequestDto;
import com.miliancode.autofleet.dto.user.UserLoginResponseDto;
import com.miliancode.autofleet.dto.user.UserRegistrationRequestDto;
import com.miliancode.autofleet.dto.user.UserResponseDto;
import com.miliancode.autofleet.security.AuthenticationService;
import com.miliancode.autofleet.service.UserService;
import jakarta.servlet.http.HttpServletResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.io.IOException;

@Controller
@RequiredArgsConstructor
@RequestMapping("/")
public class AuthenticationController {
    private final AuthenticationService authenticationService;
    private final UserService userService;

    @PostMapping("/registration")
    public UserResponseDto register(@RequestBody @Valid UserRegistrationRequestDto registrationRequestDto) {
        System.out.println(registrationRequestDto);
        return userService.register(registrationRequestDto);
    }

    @GetMapping("/login")
    public String login() {
        return "login";
    }
    @PostMapping("/login")
    public void login(@RequestParam("email") String email, @RequestParam("password") String password,
                                      HttpServletResponse response) throws IOException {
        UserLoginRequestDto requestDto = new UserLoginRequestDto(email, password);
        String token = authenticationService.authenticate(requestDto).token();

        // Set the token in a cookie
        jakarta.servlet.http.Cookie cookie = new jakarta.servlet.http.Cookie("auth_token", token);
        cookie.setHttpOnly(true);
        cookie.setSecure(true);
        cookie.setPath("/");
        cookie.setMaxAge(24 * 60 * 60);

        response.addCookie(cookie);
        response.sendRedirect("/");
    }

    @GetMapping
    public String test() {
        return "main";
    }
}
