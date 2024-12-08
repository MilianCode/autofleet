package com.miliancode.autofleet.mapper;

import com.miliancode.autofleet.config.MapStructConfig;
import com.miliancode.autofleet.dto.user.UserRegistrationRequestDto;
import com.miliancode.autofleet.dto.user.UserResponseDto;
import com.miliancode.autofleet.model.User;
import org.mapstruct.Mapper;

@Mapper(config = MapStructConfig.class)
public interface UserMapper {

    User toModel(UserRegistrationRequestDto requestDto);

    UserResponseDto toUserResponse(User user);
}
