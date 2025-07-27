CREATE TABLE topicos (
                         id BIGINT PRIMARY KEY AUTO_INCREMENT,
                         titulo VARCHAR(255) NOT NULL,
                         mensaje VARCHAR(255) NOT NULL,
                         autor VARCHAR(100) NOT NULL,
                         curso VARCHAR(100) NOT NULL,
                         fecha_creacion TIMESTAMP DEFAULT CURRENT_TIMESTAMP,

                         CONSTRAINT uk_titulo_mensaje UNIQUE (titulo, mensaje)
);
