CREATE TABLE IF NOT EXISTS user
(
    id         BIGINT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    name       VARCHAR(50),
    created_at TIMESTAMP
) engine = 'InnoDB';
