package com.example.l8_20211049.repository;

import com.example.l8_20211049.entity.MonitoreoClimatico;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MonitoreoRepository extends JpaRepository<MonitoreoClimatico, Long> {
}
