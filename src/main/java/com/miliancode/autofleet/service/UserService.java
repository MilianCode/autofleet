package com.miliancode.autofleet.service;

import com.miliancode.autofleet.dto.user.UserRegistrationRequestDto;
import com.miliancode.autofleet.dto.user.UserResponseDto;

public interface UserService {
    UserResponseDto register(UserRegistrationRequestDto requestDto);
}
