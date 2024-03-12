package project.liquibase.app.core.databasechangelog.application

import project.liquibase.app.core.databasechangelog.domain.DatabaseChangelog

interface DatabaseChangelogSearchUseCase {
    fun searchDatabaseChangeLog(executionOrder: Long?): List<DatabaseChangelog>
}
