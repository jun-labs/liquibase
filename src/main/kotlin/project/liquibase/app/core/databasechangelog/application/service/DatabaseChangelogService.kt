package project.liquibase.app.core.databasechangelog.application.service

import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional
import project.liquibase.app.core.databasechangelog.application.DatabaseChangelogSearchUseCase
import project.liquibase.app.core.databasechangelog.domain.DatabaseChangelog
import project.liquibase.app.core.databasechangelog.domain.DatabaseChangelogJpaRepository

@Service
class DatabaseChangelogService(
    private val databaseChangelogRepository: DatabaseChangelogJpaRepository
) : DatabaseChangelogSearchUseCase {

    @Transactional(readOnly = true)
    override fun searchDatabaseChangeLog(executionOrder: Long?): List<DatabaseChangelog> {
        if (executionOrder == null) {
            return databaseChangelogRepository.findRecentlyChangelog()
        }
        return databaseChangelogRepository.findByOrderExecuted(executionOrder)
    }
}
