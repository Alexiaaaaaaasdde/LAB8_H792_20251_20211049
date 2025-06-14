CREATE DATABASE IF NOT EXISTS lab8;
USE lab8;

CREATE TABLE monitoreo_climatico (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    ciudad VARCHAR(100),
    fecha DATE,
    temperatura_promedio DOUBLE,
    condicion_mas_frecuente VARCHAR(100),
    temperatura_max DOUBLE,
    temperatura_min DOUBLE
);

INSERT INTO monitoreo_climatico (ciudad, fecha, temperatura_promedio, condicion_mas_frecuente, temperatura_max, temperatura_min)
VALUES ('Lima', '2025-06-14', 22.5, 'Soleado', 26.0, 18.2);

INSERT INTO monitoreo_climatico (ciudad, fecha, temperatura_promedio, condicion_mas_frecuente, temperatura_max, temperatura_min)
VALUES ('Cusco', '2025-06-14', 16.3, 'Parcialmente nublado', 19.0, 12.1);