import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    id("org.springframework.boot")
    id("io.spring.dependency-management")
    id("org.liquibase.gradle")
    kotlin("jvm")
    kotlin("plugin.jpa")
    kotlin("plugin.spring")
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-reflect")
    implementation("org.springframework.boot:spring-boot-starter-web")
    implementation("org.springframework.boot:spring-boot-starter-data-jpa")
    implementation("org.liquibase:liquibase-core")
    liquibaseRuntime("org.liquibase:liquibase-core")
    liquibaseRuntime("org.liquibase:liquibase-groovy-dsl:2.1.1")
    liquibaseRuntime("info.picocli:picocli:4.7.5")
    liquibaseRuntime("org.yaml:snakeyaml:1.33")
    liquibaseRuntime("mysql:mysql-connector-java:8.0.28")
    implementation("mysql:mysql-connector-java:${property("mysqlVersion")}")
    testImplementation("org.springframework.boot:spring-boot-starter-test")
}

tasks.withType<KotlinCompile> {
    kotlinOptions {
        freeCompilerArgs = listOf("-Xjsr305=strict")
        jvmTarget = "17"
    }
}

tasks.withType<Test> {
    useJUnitPlatform()
}

liquibase {
    activities.register("main") {
        this.arguments = mapOf(
            "changelogFile" to "db/changelog/db.changelog-dev.xml",
            "url" to System.getProperty("DB_URL"),
            "username" to System.getProperty("USERNAME"),
            "password" to System.getProperty("PASSWORD"),
            "searchPath" to "src/main/resources"
        )
    }
}

