package com.edunetric.entity

import jakarta.persistence.*
import java.time.LocalDateTime

@Entity
@Table(name = "Answers")
open class AnswersEntity(

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "answer_id")
    open val answerId: Int = 0,

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "employee_id", referencedColumnName = "employee_id", nullable = false)
    open var employee: EmployeeEntity,

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "question_id", referencedColumnName = "question_id", nullable = false)
    open var question: QuestionsEntity,

    @Column(name = "answer_date", nullable = false)
    open var answerDate: LocalDateTime,

    @Column(name = "answer", length = 500, nullable = false)
    open var answer: String
)
