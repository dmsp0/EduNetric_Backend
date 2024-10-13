package com.edunetric.entity

import Student
import jakarta.persistence.*
import java.time.LocalDate

@Entity
@Table(name = "Enrollment")
open class Enrollment(

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "enrollment_order")
    open val enrollmentOrder: Int = 0,

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "student_id", referencedColumnName = "student_id", nullable = false)
    open var student: Student,

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "class_id", referencedColumnName = "class_id", nullable = false)
    open var classEntity: Class,

    @Column(name = "enrollment_date", nullable = false)
    open var enrollmentDate: LocalDate,

    @Enumerated(EnumType.STRING)
    @Column(name = "enrollment_status", nullable = false)
    open var enrollmentStatus: EnrollmentStatus
)

enum class EnrollmentStatus {
    Active, Completed, OnLeave, Cancelled, Dropped, Withdrawn
}
