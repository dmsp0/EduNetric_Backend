package com.edunetric.entity

import jakarta.persistence.*

@Entity
@Table(name = "Class")
open class ClassEntity(

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "class_id")
    open val classId: Long = 0,

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "employee_id", referencedColumnName = "employee_id", nullable = true)
    open var employee: EmployeeEntity? = null,

    @Enumerated(EnumType.STRING)
    @Column(name = "class_subject", nullable = false)
    open var classSubject: Subject,

    @Column(name = "class_course", length = 50)
    open var classCourse: String? = null,

    @Column(name = "class_grade", nullable = false)
    open var classGrade: Int,

    @Column(name = "class_name", length = 50, nullable = false)
    open var className: String,

    @Column(name = "class_cost")
    open var classCost: Int? = null,

    @Column(name = "class_color", length = 20)
    open var classColor: String? = null
)
