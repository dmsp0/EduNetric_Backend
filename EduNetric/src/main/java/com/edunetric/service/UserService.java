package com.edunetric.service;

import com.edunetric.dto.UserDto;
import com.edunetric.entity.UserEntity;  // UserEntity 클래스 import
import com.edunetric.repository.UserRepository;
import org.springframework.stereotype.Service;

import static com.edunetric.entity.UserEntityKt.toDto; // 코틀린 확장 함수 import

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public UserDto getUserDtoById(Long id) {
        UserEntity userEntity = userRepository.findById(id).orElseThrow(() -> new RuntimeException("User not found"));
        return toDto(userEntity);  // 코틀린 확장 함수 toDto() 호출
    }
}
