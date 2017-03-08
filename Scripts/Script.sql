-- 마이바티스
DROP SCHEMA IF EXISTS mybatis;

-- 학생
CREATE TABLE mybatis.student (
	STUD_ID INTEGER     NOT NULL, -- 학번
	NAME    VARCHAR(50) NOT NULL, -- 성명
	EMAIL   VARCHAR(50) NOT NULL, -- 메일
	DOB     DATE        NULL      -- 입학일자
);

-- 학생
ALTER TABLE mybatis.student
	ADD CONSTRAINT PK_student -- 학생 기본키
		PRIMARY KEY (
			STUD_ID -- 학번
		);

ALTER TABLE mybatis.student
	MODIFY COLUMN STUD_ID INTEGER NOT NULL AUTO_INCREMENT;