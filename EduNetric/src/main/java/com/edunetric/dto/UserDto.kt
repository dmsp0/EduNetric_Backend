package com.edunetric.dto

import com.edunetric.entity.UserRole

data class UserDto(
    val userId: Long,
    val userName: String?,
    val fullName: String?,
    val phoneNumber: String?,
    val role: UserRole?
)
