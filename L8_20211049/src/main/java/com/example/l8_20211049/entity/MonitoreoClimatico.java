package com.example.l8_20211049.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDate;

@Entity
public class MonitoreoClimatico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String ciudad;
    private LocalDate fecha;
    private double temperaturaPromedio;
    private String condicionMasFrecuente;
    private double temperaturaMax;
    private double temperaturaMin;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public double getTemperaturaPromedio() {
        return temperaturaPromedio;
    }

    public void setTemperaturaPromedio(double temperaturaPromedio) {
        this.temperaturaPromedio = temperaturaPromedio;
    }

    public String getCondicionMasFrecuente() {
        return condicionMasFrecuente;
    }

    public void setCondicionMasFrecuente(String condicionMasFrecuente) {
        this.condicionMasFrecuente = condicionMasFrecuente;
    }

    public double getTemperaturaMax() {
        return temperaturaMax;
    }

    public void setTemperaturaMax(double temperaturaMax) {
        this.temperaturaMax = temperaturaMax;
    }

    public double getTemperaturaMin() {
        return temperaturaMin;
    }

    public void setTemperaturaMin(double temperaturaMin) {
        this.temperaturaMin = temperaturaMin;
    }
}