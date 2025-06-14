package com.example.l8_20211049.dto;

public class PronosticoHoraDTO {
    private String hora;
    private double temperatura;
    private String condicion;

    public PronosticoHoraDTO(String hora, double temperatura, String condicion) {
        this.hora = hora;
        this.temperatura = temperatura;
        this.condicion = condicion;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }

    public String getCondicion() {
        return condicion;
    }

    public void setCondicion(String condicion) {
        this.condicion = condicion;
    }
}