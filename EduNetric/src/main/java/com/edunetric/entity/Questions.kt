package com.edunetric.entity

import Student
import jakarta.persistence.*
import java.time.LocalDateTime

@Entity
@Table(name = "Questions")
open class Questions(

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "question_id")
    open val questionId: Int = 0,

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "student_id", referencedColumnName = "student_id", nullable = false)
    open var student: Student,

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "class_id", referencedColumnName = "class_id", nullable = false)
    open var classEntity: Class,

    @Column(name = "question_date", nullable = false)
    open var questionDate: LocalDateTime,

    @Column(name = "question", length = 500, nullable = false)
    open var question: String
)
