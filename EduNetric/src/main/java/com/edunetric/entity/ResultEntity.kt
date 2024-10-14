package com.edunetric.entity

import jakarta.persistence.*
import java.time.LocalDate

@Entity
@Table(name = "Result")
open class ResultEntity(

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "result_id")
    open val resultId: Long = 0,

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "student_id", referencedColumnName = "student_id", nullable = false)
    open var student: StudentEntity,

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "class_id", referencedColumnName = "class_id", nullable = false)
    open var classEntity: ClassEntity,

    @Column(name = "result_month")
    open var resultMonth: LocalDate? = null,

    @Column(name = "result_name", length = 50, nullable = false)
    open var resultName: String,

    @Column(name = "result_score", nullable = false)
    open var resultScore: Int,

    @Column(name = "feedback", length = 800)
    open var feedback: String? = null
)
