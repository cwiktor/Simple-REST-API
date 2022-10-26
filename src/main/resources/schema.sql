CREATE TABLE Student(
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    id_university BIGINT NULL,
    name VARCHAR(50) NOT NULL,
    last_name VARCHAR(50) NOT NULL
);

CREATE TABLE University(
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(50) NOT NULL
);

ALTER TABLE Student ADD CONSTRAINT student_university_id FOREIGN KEY (id_university) REFERENCES University(id);