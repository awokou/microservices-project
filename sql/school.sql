-- Table School (si elle n'existe pas encore)
CREATE TABLE IF NOT EXISTS school (
      id SERIAL PRIMARY KEY,
      name VARCHAR(255) NOT NULL UNIQUE,
      email VARCHAR(255) NOT NULL UNIQUE
);

-- Insertions initiales
INSERT INTO school (name, email) VALUES ('Lycée International', 'contact@lyceeinternational.com');
INSERT INTO school (name, email) VALUES ('Collège Saint-Pierre', 'info@college-stpierre.com');
INSERT INTO school (name, email) VALUES ('École des Arts', 'hello@ecoledesarts.com');
