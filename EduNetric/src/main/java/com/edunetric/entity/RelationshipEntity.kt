package com.edunetric.entity

import jakarta.persistence.*

@Entity
@Table(name = "Relationship", uniqueConstraints = [UniqueConstraint(columnNames = ["guardian_id", "student_id"])])
open class RelationshipEntity(

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "relationship_id")
    open val relationshipId: Long = 0,

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "guardian_id", referencedColumnName = "guardian_id", nullable = false)
    open var guardian: GuardianEntity,

    @Enumerated(EnumType.STRING)
    @Column(name = "relationship", nullable = false)
    open var relationship: RelationshipType,

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "student_id", referencedColumnName = "student_id", nullable = false)
    open var student: StudentEntity
)

enum class RelationshipType {
    Parent, Grandparent, Other
}
