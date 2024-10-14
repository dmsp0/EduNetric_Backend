package com.edunetric.repository;

import com.edunetric.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    // 추가적으로 사용자 이름으로 검색하는 메소드도 작성할 수 있습니다.
    Optional<User> findByUserName(String userName);
}
