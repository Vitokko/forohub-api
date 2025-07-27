CREATE TABLE usuario (
                         id BIGINT NOT NULL AUTO_INCREMENT,
                         login VARCHAR(100) NOT NULL UNIQUE,
                         clave VARCHAR(255) NOT NULL,
                         PRIMARY KEY (id)
);
INSERT INTO usuario (login, clave)
VALUES ('admin', '{noop}123456');

