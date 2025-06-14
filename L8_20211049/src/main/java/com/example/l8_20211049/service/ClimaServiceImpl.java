package com.example.l8_20211049.service;

import com.example.l8_20211049.dto.PronosticoHoraDTO;
import com.example.l8_20211049.entity.MonitoreoClimatico;
import com.example.l8_20211049.repository.MonitoreoRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ClimaServiceImpl implements ClimaService {

    private final RestTemplate restTemplate = new RestTemplate();
    private final String API_KEY = "88e12060abad41ab97212738250906";
    private final MonitoreoRepository repository;

    public ClimaServiceImpl(MonitoreoRepository repository) {
        this.repository = repository;
    }

    @Override
    public Map<String, Object> obtenerClimaActual(String ciudad) {
        String url = "https://api.weatherapi.com/v1/current.json?key=" + API_KEY + "&q=" + ciudad;
        ResponseEntity<Map> response = restTemplate.getForEntity(url, Map.class);
        Map<String, Object> current = (Map<String, Object>) response.getBody().get("current");
        Map<String, Object> condition = (Map<String, Object>) current.get("condition");

        Map<String, Object> resultado = new HashMap<>();
        resultado.put("temperatura", current.get("temp_c"));
        resultado.put("condicion", condition.get("text"));
        resultado.put("sensacion", current.get("feelslike_c"));
        resultado.put("humedad", current.get("humidity"));

        return resultado;
    }

    @Override
    public List<PronosticoHoraDTO> obtenerPronosticoHorasHoy(String ciudad) {
        String url = "https://api.weatherapi.com/v1/forecast.json?key=" + API_KEY + "&q=" + ciudad + "&days=1";
        ResponseEntity<Map> response = restTemplate.getForEntity(url, Map.class);

        Map forecast = (Map) response.getBody().get("forecast");
        List forecastDays = (List) forecast.get("forecastday");
        Map today = (Map) forecastDays.get(0);
        List<Map<String, Object>> horas = (List<Map<String, Object>>) today.get("hour");

        List<PronosticoHoraDTO> resultado = new ArrayList<>();
        for (Map<String, Object> hora : horas) {
            Map<String, Object> cond = (Map<String, Object>) hora.get("condition");
            resultado.add(new PronosticoHoraDTO(
                    (String) hora.get("time"),
                    (Double) hora.get("temp_c"),
                    (String) cond.get("text")
            ));
        }

        return resultado;
    }

    @Override
    public MonitoreoClimatico registrarMonitoreo(MonitoreoClimatico monitoreo) {
        return repository.save(monitoreo);
    }
}
