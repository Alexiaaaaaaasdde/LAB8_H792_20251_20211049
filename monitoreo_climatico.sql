DROP TABLE IF EXISTS monitoreo_climatico;

CREATE TABLE monitoreo_climatico (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    ciudad VARCHAR(100),
    fecha DATE,
    temperatura_promedio DOUBLE,
    condicion_mas_frecuente VARCHAR(100),
    temperatura_max DOUBLE,
    temperatura_min DOUBLE
);