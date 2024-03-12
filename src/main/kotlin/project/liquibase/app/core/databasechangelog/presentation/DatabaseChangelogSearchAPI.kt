package project.liquibase.app.core.databasechangelog.presentation

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import project.liquibase.app.core.databasechangelog.application.DatabaseChangelogSearchUseCase
import project.liquibase.app.core.databasechangelog.domain.DatabaseChangelog
import project.liquibase.app.logger

@RestController
@RequestMapping("/api/db-schema-logs")
class DatabaseChangelogSearchAPI(
    private val databaseChangelogSearchUseCase: DatabaseChangelogSearchUseCase
) {

    private val log = logger()

    @GetMapping
    fun searchDatabaseChangelog(
        @RequestParam(required = false) orderExecuted: Long?
    ): ResponseEntity<List<DatabaseChangelogResponse>> {
        val payload = databaseChangelogSearchUseCase.searchDatabaseChangeLog(orderExecuted).stream()
            .map { DatabaseChangelogResponse(it) }
            .toList()
        log.info("data:{}", payload)
        return ResponseEntity.ok(payload)
    }
}

data class DatabaseChangelogResponse(
    private val databaseChangelog: DatabaseChangelog
) {
    val orderExecution: Int = databaseChangelog.orderExecuted
    val id: String = databaseChangelog.id
    val tag: String? = databaseChangelog.tag
    val labels: String? = databaseChangelog.labels
    val contexts: String? = databaseChangelog.contexts

    override fun toString(): String {
        return """
            "orderExecution":${orderExecution},
            "databaseChangelog":${databaseChangelog},
            "id:${id},
            "tag":${tag},
            "labels":${labels},
            "contexts":${contexts}
        """.trimIndent()
    }
}
