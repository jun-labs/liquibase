INSERT INTO liqui.databasechangelog (ID, AUTHOR, FILENAME, DATEEXECUTED, ORDEREXECUTED, EXECTYPE, MD5SUM, DESCRIPTION,
                                     COMMENTS, TAG, LIQUIBASE, CONTEXTS, LABELS, DEPLOYMENT_ID)
VALUES ('v1.0.0/user/table-create', 'jun', 'db/changelog/release-1.0.0/release-1.0.0.xml', '2024-03-10 16:15:19', 1,
        'EXECUTED', '8:ec746b145a89cf859cfd6523a9736e69', 'sqlFile path=user-table-create.sql', '사용자 테이블 생성', null,
        '4.20.0', 'dev', null, '0087319861');
INSERT INTO liqui.databasechangelog (ID, AUTHOR, FILENAME, DATEEXECUTED, ORDEREXECUTED, EXECTYPE, MD5SUM, DESCRIPTION,
                                     COMMENTS, TAG, LIQUIBASE, CONTEXTS, LABELS, DEPLOYMENT_ID)
VALUES ('v1.0.0/user/column-add/last-modified-at', 'jun', 'db/changelog/release-1.0.0/release-1.0.0.xml',
        '2024-03-10 16:15:19', 2, 'EXECUTED', '8:0367073d9120e47c66e91789b0c6cd21',
        'sqlFile path=add-last-modified-at.sql', '', null, '4.20.0', 'dev', null, '0087319861');
INSERT INTO liqui.databasechangelog (ID, AUTHOR, FILENAME, DATEEXECUTED, ORDEREXECUTED, EXECTYPE, MD5SUM, DESCRIPTION,
                                     COMMENTS, TAG, LIQUIBASE, CONTEXTS, LABELS, DEPLOYMENT_ID)
VALUES ('v1.0.0/user/column-delete/last-modified-at', 'jun', 'db/changelog/release-1.0.0/release-1.0.0.xml',
        '2024-03-10 16:15:19', 3, 'EXECUTED', '8:cf61061aca7933e4256398c5f64d764c',
        'sqlFile path=delete-last-modified-at.sql', '', null, '4.20.0', 'dev', null, '0087319861');
INSERT INTO liqui.databasechangelog (ID, AUTHOR, FILENAME, DATEEXECUTED, ORDEREXECUTED, EXECTYPE, MD5SUM, DESCRIPTION,
                                     COMMENTS, TAG, LIQUIBASE, CONTEXTS, LABELS, DEPLOYMENT_ID)
VALUES ('v1.0.0/datachangelog/table-create', 'jun', 'db/changelog/release-1.0.0/release-1.0.0.xml',
        '2024-03-10 16:17:25', 4, 'EXECUTED', '8:b9fca5b91fdf4801c7276bfed77a407b',
        'sqlFile path=user-table-create.sql', '데이터베이스 스키마 관리 테이블 생성', null, '4.20.0', 'dev', null, '0087445867');
INSERT INTO liqui.databasechangelog (ID, AUTHOR, FILENAME, DATEEXECUTED, ORDEREXECUTED, EXECTYPE, MD5SUM, DESCRIPTION,
                                     COMMENTS, TAG, LIQUIBASE, CONTEXTS, LABELS, DEPLOYMENT_ID)
VALUES ('v1.1.0/user/add-deleted', 'jun', 'db/changelog/release-1.1.0/release-1.1.0.xml', '2024-03-11 01:39:21', 5,
        'EXECUTED', '8:0cc421a1b8645b41bd8a235e9acf6722', 'sqlFile path=add-deleted.sql', '', null, '4.20.0', 'dev',
        null, '0121161532');
INSERT INTO liqui.databasechangelog (ID, AUTHOR, FILENAME, DATEEXECUTED, ORDEREXECUTED, EXECTYPE, MD5SUM, DESCRIPTION,
                                     COMMENTS, TAG, LIQUIBASE, CONTEXTS, LABELS, DEPLOYMENT_ID)
VALUES ('v1.1.0/datachangelog/add-index-execution-order', 'jun', 'db/changelog/release-1.1.0/release-1.1.0.xml',
        '2024-03-11 02:48:30', 6, 'EXECUTED', '8:4ccf0cf3cc4d78399eac0cee0d58134f',
        'sqlFile path=add-index-execution-order.sql', '', null, '4.20.0', 'dev', null, '0125310752');
INSERT INTO liqui.databasechangelog (ID, AUTHOR, FILENAME, DATEEXECUTED, ORDEREXECUTED, EXECTYPE, MD5SUM, DESCRIPTION,
                                     COMMENTS, TAG, LIQUIBASE, CONTEXTS, LABELS, DEPLOYMENT_ID)
VALUES ('v1.1.0/user/add-marketing-alarm', 'jun', 'db/changelog/release-1.1.0/release-1.1.0.xml', '2024-03-11 06:36:07',
        7, 'EXECUTED', '8:acce47971c8ca5c1542ef83175941926', 'sqlFile path=add-marketing-alarm.sql', '', null, '4.20.0',
        'dev', null, '0138967791');
