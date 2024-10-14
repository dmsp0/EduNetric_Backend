package com.edunetric.entity

import jakarta.persistence.*
import java.time.LocalDate

@Entity
@Table(name = "Attendance")
open class AttendanceEntity(

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "attendance_id")
    open val attendanceId: Long = 0,

    @Column(name = "attendance_date", nullable = false)
    open var attendanceDate: LocalDate,

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "student_id", referencedColumnName = "student_id", nullable = false)
    open var student: StudentEntity,

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "class_id", referencedColumnName = "class_id", nullable = false)
    open var classEntity: ClassEntity,

    @Enumerated(EnumType.STRING)
    @Column(name = "attendance_status", nullable = false)
    open var attendanceStatus: AttendanceStatus,

    @Enumerated(EnumType.STRING)
    @Column(name = "homework_status")
    open var homeworkStatus: HomeworkStatus? = null,

    @Enumerated(EnumType.STRING)
    @Column(name = "today_issue")
    open var todayIssue: TodayIssue? = null
)

enum class AttendanceStatus {
    Present, Absent, Late
}

enum class HomeworkStatus {
    Complete, Incomplete
}

enum class TodayIssue {
    None, Issue
}
