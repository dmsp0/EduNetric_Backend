package com.edunetric.entity

import jakarta.persistence.*

@Entity
@Table(name = "NoticeImage")
open class NoticeImageEntity(

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "notice_image_id")
    open val noticeImageId: Int = 0,

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "notice_id", referencedColumnName = "notice_id", nullable = false)
    open var notice: NoticeBoardEntity,

    @Column(name = "image_filename", length = 255)
    open var imageFilename: String? = null,

    @Column(name = "image_filepath", length = 255)
    open var imageFilePath: String? = null
)
