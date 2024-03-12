package project.liquibase.app.core.databasechangelog.domain

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query

interface DatabaseChangelogJpaRepository : JpaRepository<DatabaseChangelog, Long> {
    @Query(
        value = "SELECT l " +
                "FROM databasechangelog l " +
                "ORDER BY l.orderExecuted DESC " +
                "LIMIT 10"
    )
    fun findRecentlyChangelog(): List<DatabaseChangelog>

    @Query(
        value = "SELECT l " +
                "FROM databasechangelog l " +
                "WHERE l.orderExecuted < :orderExecuted " +
                "ORDER BY l.orderExecuted DESC " +
                "LIMIT 10"
    )
    fun findByOrderExecuted(orderExecuted: Long): List<DatabaseChangelog>
}
