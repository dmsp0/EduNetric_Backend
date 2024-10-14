package com.edunetric.entity

import Student
import jakarta.persistence.*

@Entity
@Table(name = "StudentNote")
open class StudentNote(

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "note_id")
    open val noteId: Long = 0,

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "student_id", referencedColumnName = "student_id", nullable = false)
    open var student: Student,

    @Column(name = "additional_info", length = 255)
    open var additionalInfo: String? = null
)
