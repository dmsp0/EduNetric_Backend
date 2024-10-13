package com.edunetric.entity

import jakarta.persistence.*
import java.time.LocalDate

@Entity
@Table(name = "Material")
open class Material(

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "material_id")
    open val materialId: Int = 0,

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "class_id", referencedColumnName = "class_id", nullable = false)
    open var classEntity: Class,

    @Column(name = "material_name", length = 255, nullable = false)
    open var materialName: String,

    @Column(name = "material_type", length = 50, nullable = false)
    open var materialType: String,

    @Column(name = "upload_date", nullable = false)
    open var uploadDate: LocalDate,

    @Column(name = "file_name", length = 255, nullable = false)
    open var fileName: String,

    @Column(name = "file_path", length = 255, nullable = false)
    open var filePath: String,

    @Column(name = "file_size", nullable = false)
    open var fileSize: Long
)
