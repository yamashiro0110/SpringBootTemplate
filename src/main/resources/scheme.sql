DROP TABLE hoge IF EXISTS;
CREATE TABLE hoge (
    id VARCHAR PRIMARY KEY NOT NULL,
    content VARCHAR NOT NULL DEFAULT ''
);
