import com.edunetric.entity.User

import jakarta.persistence.*
import java.time.LocalDate

@Entity
@Table(name = "Student")
open class Student(

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "student_id")
    open val studentId: Long = 0,

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", referencedColumnName = "user_id", nullable = false)
    open var user: User,

    @Column(name = "student_birthdate", nullable = false)
    open var studentBirthdate: LocalDate,

    @Enumerated(EnumType.STRING)
    @Column(name = "student_gender", nullable = false)
    open var studentGender: Gender,

    @Column(name = "school", length = 50, nullable = false)
    open var school: String,

    @Column(name = "student_grade", nullable = false)
    open var studentGrade: Int,

    @Column(name = "guardian_phoneNumber1", length = 15, nullable = false)
    open var guardianPhoneNumber1: String,

    @Column(name = "guardian_phoneNumber2", length = 15)
    open var guardianPhoneNumber2: String? = null,

    @Enumerated(EnumType.STRING)
    @Column(name = "student_status", nullable = false)
    open var studentStatus: StudentStatus,

    @Column(name = "join_date")
    open var joinDate: LocalDate? = null
)

enum class Gender {
    M, F
}

enum class StudentStatus {
    Enrolled, OnLeave, Withdrawn
}
