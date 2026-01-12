-- Table Student (si elle n'existe pas encore)
CREATE TABLE IF NOT EXISTS student (
    id SERIAL PRIMARY KEY,
    firstname VARCHAR(255) NOT NULL,
    lastname VARCHAR(255) NOT NULL,
    email VARCHAR(255) NOT NULL UNIQUE,
    school_id INT NOT NULL);

-- Insertions initiales
INSERT INTO student (firstname, lastname, email, school_id) VALUES ('John', 'Doe', 'john.doe@example.com', 1);
INSERT INTO student (firstname, lastname, email, school_id) VALUES ('Jane', 'Smith', 'jane.smith@example.com', 1);
INSERT INTO student (firstname, lastname, email, school_id) VALUES ('Alice', 'Brown', 'alice.brown@example.com', 2);
