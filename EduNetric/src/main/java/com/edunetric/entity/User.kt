package com.edunetric.entity

import com.edunetric.dto.UserDto
import jakarta.persistence.*
import java.time.LocalDateTime

@Entity
@Table(name = "User")
open class User(

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    open val userId: Long = 0,

    @Column(name = "user_name", length = 50)
    open var userName: String? = null,

    @Column(name = "password", length = 255)
    open var password: String? = null,

    @Column(name = "full_name", length = 50)
    open var fullName: String? = null,

    @Column(name = "phone_number", length = 15, unique = true)
    open var phoneNumber: String? = null,

    @Enumerated(EnumType.STRING)
    @Column(name = "role")
    open var role: UserRole? = null,

    @Column(name = "created_at", updatable = false)
    open var createdAt: LocalDateTime = LocalDateTime.now(),

    @Column(name = "updated_at")
    open var updatedAt: LocalDateTime = LocalDateTime.now()
)

enum class UserRole {
    STUDENT, GUARDIAN, TEACHER, ADMIN
}

// User 엔티티를 UserDto로 변환하는 확장 함수
fun User.toDto(): UserDto {
    return UserDto(
        userId = this.userId,
        userName = this.userName,
        fullName = this.fullName,
        phoneNumber = this.phoneNumber,
        role = this.role
    )
}
