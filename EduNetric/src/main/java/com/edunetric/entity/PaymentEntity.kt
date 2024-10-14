package com.edunetric.entity

import jakarta.persistence.*
import java.time.LocalDateTime
import java.time.LocalDate

@Entity
@Table(name = "Payment")
open class PaymentEntity(

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "payment_id")
    open val paymentId: Int = 0,

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "student_id", referencedColumnName = "student_id", nullable = false)
    open var student: StudentEntity,

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "class_id", referencedColumnName = "class_id", nullable = false)
    open var classEntity: ClassEntity,

    @Column(name = "payment_year_month")
    open var paymentYearMonth: LocalDate? = null,

    @Column(name = "payment_content", length = 50, nullable = false)
    open var paymentContent: String,

    @Column(name = "cost", nullable = false)
    open var cost: Int,

    @Column(name = "claim_date", nullable = false)
    open var claimDate: LocalDateTime,

    @Column(name = "completion_date")
    open var completionDate: LocalDate? = null
)
