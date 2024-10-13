package com.edunetric.entity

import jakarta.persistence.*
import java.time.LocalDate

@Entity
@Table(name = "Employee")
open class Employee(

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "employee_id")
    open val employeeId: Long = 0,

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", referencedColumnName = "user_id", nullable = false)
    open var user: User,

    @Column(name = "email", length = 100, unique = true)
    open var email: String? = null,

    @Enumerated(EnumType.STRING)
    @Column(name = "subject", nullable = false)
    open var subject: Subject,

    @Column(name = "join_date", nullable = false)
    open var joinDate: LocalDate
)

enum class Subject {
    Korean, Math, English, Science, Social
}
