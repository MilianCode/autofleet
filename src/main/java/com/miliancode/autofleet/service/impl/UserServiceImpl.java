package com.miliancode.autofleet.service.impl;

import com.miliancode.autofleet.dto.user.UserRegistrationRequestDto;
import com.miliancode.autofleet.dto.user.UserResponseDto;
import com.miliancode.autofleet.exception.RegistrationException;
import com.miliancode.autofleet.mapper.UserMapper;
import com.miliancode.autofleet.model.Role;
import com.miliancode.autofleet.model.User;
import com.miliancode.autofleet.repository.RoleRepository;
import com.miliancode.autofleet.repository.UserRepository;
import com.miliancode.autofleet.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import java.util.Set;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;
    private final UserMapper userMapper;
    private final PasswordEncoder passwordEncoder;
    private final RoleRepository roleRepository;

    @Override
    public UserResponseDto register(UserRegistrationRequestDto requestDto) {
        System.out.println("Registration");
        if (userRepository.findByEmail(requestDto.getEmail()).isPresent()) {
            throw new RegistrationException("User with this email is already registered");
        }
        User user = userMapper.toModel(requestDto);
        user.setPassword(passwordEncoder.encode(requestDto.getPassword()));
        Role userRole = roleRepository.findByName(Role.RoleName.USER);
        user.setRoles(Set.of(userRole));
        user = userRepository.save(user);
        return userMapper.toUserResponse(user);
    }
}
