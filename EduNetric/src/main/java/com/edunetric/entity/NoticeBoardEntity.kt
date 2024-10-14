package com.edunetric.entity

import jakarta.persistence.*
import java.time.LocalDateTime

@Entity
@Table(name = "NoticeBoard")
open class NoticeBoardEntity(

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "notice_id")
    open val noticeId: Int = 0,

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "employee_id", referencedColumnName = "employee_id", nullable = false)
    open var employee: EmployeeEntity,

    @Column(name = "notice_type", length = 20)
    open var noticeType: String? = null,

    @Column(name = "notice_title", length = 255)
    open var noticeTitle: String? = null,

    @Column(name = "notice_content", length = 255)
    open var noticeContent: String? = null,

    @Column(name = "created_at", nullable = false, updatable = false)
    open var createdAt: LocalDateTime = LocalDateTime.now(),

    @Column(name = "updated_at")
    open var updatedAt: LocalDateTime = LocalDateTime.now()
)
