package com.example.l8_20211049.controller;

import com.example.l8_20211049.entity.MonitoreoClimatico;
import com.example.l8_20211049.service.ClimaService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/clima")
public class ClimaController {

    private final ClimaService climaService;

    public ClimaController(ClimaService climaService) {
        this.climaService = climaService;
    }

    @GetMapping("/actual")
    public ResponseEntity<?> obtenerClimaActual(@RequestParam String ciudad) {
        return ResponseEntity.ok(climaService.obtenerClimaActual(ciudad));
    }

    @GetMapping("/pronostico")
    public ResponseEntity<?> obtenerPronostico(@RequestParam String ciudad) {
        return ResponseEntity.ok(climaService.obtenerPronosticoHorasHoy(ciudad));
    }

    @PostMapping("/monitoreo")
    public ResponseEntity<?> registrarMonitoreo(@RequestBody MonitoreoClimatico monitoreo) {
        return ResponseEntity.ok(climaService.registrarMonitoreo(monitoreo));
    }
}
