-- Table Student
CREATE TABLE IF NOT EXISTS student (
    id SERIAL PRIMARY KEY,
    first_name VARCHAR(255) NOT NULL,
    last_name VARCHAR(255) NOT NULL,
    email VARCHAR(255) NOT NULL UNIQUE,
    school_id INT NOT NULL
);

-- Insertions initiales
INSERT INTO student (first_name, last_name, email, school_id) VALUES ('John', 'Doe', 'john.doe@example.com', 1);
INSERT INTO student (first_name, last_name, email, school_id) VALUES ('Jane', 'Smith', 'jane.smith@example.com', 1);
INSERT INTO student (first_name, last_name, email, school_id) VALUES ('Alice', 'Brown', 'alice.brown@example.com', 2);
