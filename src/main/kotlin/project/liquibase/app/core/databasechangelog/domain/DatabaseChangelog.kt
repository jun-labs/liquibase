package project.liquibase.app.core.databasechangelog.domain

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.Id
import jakarta.persistence.Table
import java.time.LocalDateTime

@Entity(name = "databasechangelog")
@Table(name = "databasechangelog")
data class DatabaseChangelog(
    @Id
    @Column(name = "ID", length = 255, nullable = false)
    var id: String,

    @Column(name = "AUTHOR", length = 255, nullable = false)
    var author: String,

    @Column(name = "FILENAME", length = 255, nullable = false)
    var fileName: String,

    @Column(name = "DATEEXECUTED", nullable = false)
    var dateExecuted: LocalDateTime,

    @Column(name = "ORDEREXECUTED", nullable = false)
    var orderExecuted: Int,

    @Column(name = "EXECTYPE", length = 10, nullable = false)
    var execType: String,

    @Column(name = "MD5SUM", length = 35)
    var md5Sum: String? = null,

    @Column(name = "DESCRIPTION", length = 255)
    var description: String? = null,

    @Column(name = "COMMENTS", length = 255)
    var comments: String? = null,

    @Column(name = "TAG", length = 255)
    var tag: String? = null,

    @Column(name = "LIQUIBASE", length = 20)
    var liquibase: String? = null,

    @Column(name = "CONTEXTS", length = 255)
    var contexts: String? = null,

    @Column(name = "LABELS", length = 255)
    var labels: String? = null,

    @Column(name = "DEPLOYMENT_ID", length = 10)
    var deploymentId: String? = null
)
