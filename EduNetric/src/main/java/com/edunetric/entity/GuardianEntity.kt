package com.edunetric.entity

import jakarta.persistence.*

@Entity
@Table(name = "Guardian")
open class GuardianEntity(

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "guardian_id")
    open val guardianId: Long = 0,

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", referencedColumnName = "user_id", nullable = false)
    open var user: UserEntity,

    @Column(name = "children_name", length = 50, nullable = false)
    open var childrenName: String
)
