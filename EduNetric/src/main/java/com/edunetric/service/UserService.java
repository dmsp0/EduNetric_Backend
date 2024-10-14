package com.edunetric.service;

import com.edunetric.dto.UserDto;
import com.edunetric.entity.User;
import com.edunetric.repository.UserRepository;
import org.springframework.stereotype.Service;

import static com.edunetric.entity.UserKt.toDto;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public UserDto getUserDtoById(Long id) {
        User user = userRepository.findById(id).orElseThrow(() -> new RuntimeException("User not found"));
        return  toDto(user);  // UserKt.toDto(user)로 호출 코틀린의 확장 함수 toDto()를 호출하는 방식입니다.
                              // 자바에서는 이를 UserKt.toDto(user)처럼 사용합니다.
    }
}
