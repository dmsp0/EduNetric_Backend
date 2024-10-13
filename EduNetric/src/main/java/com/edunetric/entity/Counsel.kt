package com.edunetric.entity

import Student
import jakarta.persistence.*
import java.time.LocalDateTime

@Entity
@Table(name = "Counsel")
open class Counsel(

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "counsel_id")
    open val counselId: Int = 0,

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "student_id", referencedColumnName = "student_id", nullable = false)
    open var student: Student,

    @Enumerated(EnumType.STRING)
    @Column(name = "counsel_how", nullable = false)
    open var counselHow: CounselHow,

    @Column(name = "counsel_date", nullable = false)
    open var counselDate: LocalDateTime,

    @Column(name = "counsel_confirmdate")
    open var counselConfirmDate: LocalDateTime? = null,

    @Column(name = "counsel_content", length = 300)
    open var counselContent: String? = null,

    @Enumerated(EnumType.STRING)
    @Column(name = "counsel_status", nullable = false)
    open var counselStatus: CounselStatus
)
