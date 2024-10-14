package com.edunetric.repository;

import com.edunetric.entity.UserEntityKt;
import org.springframework.data.jpa.repository.JpaRepository;

import com.edunetric.entity.UserEntity;  // UserEntity import

import java.util.Optional;

public interface UserRepository extends JpaRepository<UserEntity, Long> {
    // 사용자 이름으로 검색하는 메소드
    Optional<UserEntity> findByUserName(String userName);
}
