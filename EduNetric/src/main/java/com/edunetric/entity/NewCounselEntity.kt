package com.edunetric.entity

import jakarta.persistence.*
import java.time.LocalDateTime

@Entity
@Table(name = "NewCounsel")
open class NewCounselEntity(

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "new_counsel_id")
    open val newCounselId: Int = 0,

    @Column(name = "new_applicant_name", length = 10, nullable = false)
    open var applicantName: String,

    @Column(name = "new_applicant_phonenumber", length = 15, nullable = false)
    open var applicantPhoneNumber: String,

    @Column(name = "new_counsel_way", length = 20)
    open var counselWay: String? = null,

    @Enumerated(EnumType.STRING)
    @Column(name = "new_counsel_how", nullable = false)
    open var counselHow: CounselHow,

    @Column(name = "new_counsel_date", nullable = false)
    open var counselDate: LocalDateTime,

    @Column(name = "new_counsel_confirmdate")
    open var counselConfirmDate: LocalDateTime? = null,

    @Column(name = "new_counsel_content", length = 300)
    open var counselContent: String? = null,

    @Enumerated(EnumType.STRING)
    @Column(name = "new_counsel_status", nullable = false)
    open var counselStatus: CounselStatus
)

enum class CounselHow {
    방문, 전화
}

enum class CounselStatus {
    Pending, Confirmed, Cancelled
}
