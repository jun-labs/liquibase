## 사용자 테이블 생성 ##
CREATE TABLE IF NOT EXISTS user
(
    id         BIGINT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    name       VARCHAR(50),
    created_at TIMESTAMP
) engine = 'InnoDB';

## 최종 수정일 칼럼 추가 ##
ALTER TABLE user
    ADD COLUMN last_modified_at TIMESTAMP;

## 최종 수정일 칼럼 제거 ##
ALTER TABLE `user`
    DROP `last_modified_at`;

## 최종 수정일 칼럼 추가 ##
ALTER TABLE user
    ADD COLUMN last_modified_at TIMESTAMP;
