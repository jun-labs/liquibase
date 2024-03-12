package project.liquibase.app.core.user.domain

import jakarta.persistence.*
import org.springframework.data.annotation.CreatedDate
import org.springframework.data.annotation.LastModifiedDate
import java.time.LocalDateTime

@Entity
class User(
    @Column(name = "name")
    private var _name: String
) {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null

    @CreatedDate
    @Column(name = "created_at")
    val createdAt: LocalDateTime? = LocalDateTime.now()

    @LastModifiedDate
    @Column(name = "last_modified_at")
    val lastModifiedAt: LocalDateTime? = LocalDateTime.now()

    @Column(name = "marketing")
    var marketing: Boolean = false
        private set

    @Column(name = "deleted")
    var deleted: Boolean = false
        private set

    val name: String
        get() = _name

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false
        other as User
        return id == other.id
    }

    override fun hashCode(): Int {
        return id?.hashCode() ?: 0
    }
}
