package project.liquibase.app.test.changelog.intergrationtest

import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.ActiveProfiles
import org.springframework.test.context.jdbc.Sql
import project.liquibase.app.core.databasechangelog.application.DatabaseChangelogSearchUseCase
import project.liquibase.app.logger
import project.liquibase.app.test.DatabaseInitialization

@SpringBootTest
@ActiveProfiles("test")
@Sql(executionPhase = Sql.ExecutionPhase.BEFORE_TEST_METHOD, value = ["classpath:/sql/databasechangelog.sql"])
@DisplayName("[IntegrationTest] 데이터베이스 변경내역 조회 통합 테스트")
class DatabaseChangelogSearchIntegrationTest {

    private val log = logger()

    @Autowired
    lateinit var dbInitialization: DatabaseInitialization

    @AfterEach
    fun setUp() {
        dbInitialization.truncateAllEntity()
    }

    @Autowired
    private lateinit var dbChangelogSearchUseCase: DatabaseChangelogSearchUseCase

    @Test
    @DisplayName("변경 내역이 있다면 데이터베이스 변경내역을 조회할 수 있다.")
    fun changelogsSearchTest() {
        val findChangeLogs = dbChangelogSearchUseCase.searchDatabaseChangeLog(100)

        log.info("changelogs:{}", findChangeLogs)

        assertTrue(findChangeLogs.isNotEmpty())
    }
}
