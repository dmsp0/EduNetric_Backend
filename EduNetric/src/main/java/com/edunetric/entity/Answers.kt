package com.edunetric.entity

import jakarta.persistence.*
import java.time.LocalDateTime

@Entity
@Table(name = "Answers")
open class Answers(

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "answer_id")
    open val answerId: Int = 0,

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "employee_id", referencedColumnName = "employee_id", nullable = false)
    open var employee: Employee,

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "question_id", referencedColumnName = "question_id", nullable = false)
    open var question: Questions,

    @Column(name = "answer_date", nullable = false)
    open var answerDate: LocalDateTime,

    @Column(name = "answer", length = 500, nullable = false)
    open var answer: String
)
