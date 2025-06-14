package com.example.l8_20211049.service;

import com.example.l8_20211049.dto.PronosticoHoraDTO;
import com.example.l8_20211049.entity.MonitoreoClimatico;

import java.util.List;
import java.util.Map;

public interface ClimaService {
    Map<String, Object> obtenerClimaActual(String ciudad);
    List<PronosticoHoraDTO> obtenerPronosticoHorasHoy(String ciudad);
    MonitoreoClimatico registrarMonitoreo(MonitoreoClimatico monitoreo);
}