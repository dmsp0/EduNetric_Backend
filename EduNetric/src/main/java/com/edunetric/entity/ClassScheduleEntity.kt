package com.edunetric.entity

import jakarta.persistence.*
import java.time.LocalTime

@Entity
@Table(name = "ClassSchedule")
open class ClassScheduleEntity(

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "class_schedule_order")
    open val classScheduleOrder: Int = 0,

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "class_id", referencedColumnName = "class_id", nullable = false)
    open var classEntity: ClassEntity,

    @Enumerated(EnumType.STRING)
    @Column(name = "class_day", nullable = false)
    open var classDay: ClassDay,

    @Column(name = "class_start_time")
    open var classStartTime: LocalTime? = null,

    @Column(name = "class_end_time")
    open var classEndTime: LocalTime? = null
)

enum class ClassDay {
    Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday
}
