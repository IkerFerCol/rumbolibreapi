package com.iker.rumbolibreapi.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataInitializer implements CommandLineRunner {

    @Autowired
    private vueloRepository vueloRepository;

    @Override
    public void run(String... args) {
        if (vueloRepository.count() == 0) {
            vueloRepository.save(new vuelo("Barcelona", "Roma", "Ryanair", "06:45", "08:30", "2025-04-12", "2025-04-12", "1h45m", "19:15", "21:00", "2025-04-15", "2025-04-15", "1h45m", 89.0));
            vueloRepository.save(new vuelo("Chicago", "Houston", "United", "11:20", "13:45", "2025-05-03", "2025-05-03", "2h25m", "", "", "", "", "", 149.0));
            vueloRepository.save(new vuelo("Madrid", "Bilbao", "Iberia", "09:30", "10:40", "2025-03-18", "2025-03-18", "1h10m", "", "", "", "", "", 65.0));
            vueloRepository.save(new vuelo("París", "Berlin", "Air France", "14:15", "15:40", "2025-06-22", "2025-06-22", "1h25m", "17:10", "18:35", "2025-06-25", "2025-06-25", "1h25m", 119.0));
            vueloRepository.save(new vuelo("Sídney", "Melbourne", "Qantas", "07:00", "08:40", "2025-07-07", "2025-07-07", "1h40m", "", "", "", "", "", 129.0));
            vueloRepository.save(new vuelo("Sevilla", "Barcelona", "Vueling", "16:50", "18:20", "2025-08-14", "2025-08-14", "1h30m", "", "", "", "", "", 59.0));
            vueloRepository.save(new vuelo("Tokio", "Osaka", "ANA", "13:10", "14:30", "2025-09-09", "2025-09-09", "1h20m", "20:45", "22:05", "2025-09-12", "2025-09-12", "1h20m", 139.0));
            vueloRepository.save(new vuelo("Buenos Aires", "Córdoba", "Aerolíneas Argentinas", "10:15", "11:35", "2025-10-05", "2025-10-05", "1h20m", "", "", "", "", "", 89.0));
            vueloRepository.save(new vuelo("Málaga", "Londres", "British Airways", "12:30", "14:45", "2025-11-11", "2025-11-11", "2h15m", "16:00", "18:15", "2025-11-18", "2025-11-18", "2h15m", 159.0));
            vueloRepository.save(new vuelo("Nueva York", "Miami", "Delta", "08:00", "11:10", "2025-12-03", "2025-12-03", "3h10m", "", "", "", "", "", 169.0));
            vueloRepository.save(new vuelo("Valencia", "París", "Air Europa", "15:20", "17:35", "2025-01-15", "2025-01-15", "2h15m", "09:30", "11:45", "2025-01-18", "2025-01-18", "2h15m", 109.0));
            vueloRepository.save(new vuelo("Berlín", "Hamburgo", "Lufthansa", "18:30", "19:25", "2025-02-20", "2025-02-20", "0h55m", "", "", "", "", "", 79.0));
            vueloRepository.save(new vuelo("Bilbao", "Málaga", "Volotea", "07:45", "09:15", "2025-03-25", "2025-03-25", "1h30m", "", "", "", "", "", 49.0));
            vueloRepository.save(new vuelo("Roma", "Nápoles", "ITA Airways", "11:50", "12:45", "2025-04-30", "2025-04-30", "0h55m", "14:30", "15:25", "2025-05-02", "2025-05-02", "0h55m", 69.0));
            vueloRepository.save(new vuelo("Madrid", "Dubai", "Emirates", "22:10", "07:30", "2025-05-15", "2025-05-16", "7h20m", "14:00", "19:20", "2025-05-22", "2025-05-22", "6h20m", 499.0));
            vueloRepository.save(new vuelo("Ámsterdam", "Bruselas", "KLM", "09:40", "10:30", "2025-06-18", "2025-06-18", "0h50m", "", "", "", "", "", 89.0));
            vueloRepository.save(new vuelo("Barcelona", "Estocolmo", "Norwegian", "13:15", "16:30", "2025-07-22", "2025-07-22", "3h15m", "08:00", "11:15", "2025-07-28", "2025-07-28", "3h15m", 189.0));
            vueloRepository.save(new vuelo("Zaragoza", "Palma de Mallorca", "Air Nostrum", "17:20", "18:30", "2025-08-17", "2025-08-17", "1h10m", "", "", "", "", "", 75.0));
            vueloRepository.save(new vuelo("Lisboa", "Oporto", "TAP Portugal", "10:10", "11:00", "2025-09-14", "2025-09-14", "0h50m", "16:30", "17:20", "2025-09-17", "2025-09-17", "0h50m", 59.0));
            vueloRepository.save(new vuelo("Alicante", "Berlín", "Air Berlin", "14:40", "18:00", "2025-10-10", "2025-10-10", "3h20m", "07:30", "10:50", "2025-10-15", "2025-10-15", "3h20m", 139.0));
            vueloRepository.save(new vuelo("Madrid", "Tenerife", "Iberia", "08:15", "10:05", "2025-01-22", "2025-01-22", "2h50m", "", "", "", "", "", 99.0));
            vueloRepository.save(new vuelo("Múnich", "Singapur", "Lufthansa", "22:40", "17:20", "2025-02-14", "2025-02-15", "12h40m", "19:30", "14:10", "2025-02-21", "2025-02-22", "12h40m", 689.0));
            vueloRepository.save(new vuelo("Barcelona", "Sevilla", "Vueling", "13:25", "14:55", "2025-03-08", "2025-03-08", "1h30m", "", "", "", "", "", 59.0));
            vueloRepository.save(new vuelo("Los Ángeles", "Honolulu", "Delta", "09:10", "12:35", "2025-04-03", "2025-04-03", "5h25m", "", "", "", "", "", 229.0));
            vueloRepository.save(new vuelo("Valencia", "Bruselas", "Brussels Airlines", "06:30", "08:50", "2025-05-17", "2025-05-17", "2h20m", "20:15", "22:35", "2025-05-20", "2025-05-20", "2h20m", 149.0));
            vueloRepository.save(new vuelo("Berlín", "Viena", "Austrian", "11:45", "12:55", "2025-06-11", "2025-06-11", "1h10m", "", "", "", "", "", 89.0));
            vueloRepository.save(new vuelo("Bilbao", "París", "Air France", "15:20", "17:05", "2025-07-09", "2025-07-09", "1h45m", "08:30", "10:15", "2025-07-13", "2025-07-13", "1h45m", 119.0));
            vueloRepository.save(new vuelo("Sídney", "Auckland", "Air New Zealand", "16:10", "21:25", "2025-08-07", "2025-08-07", "3h15m", "", "", "", "", "", 179.0));
            vueloRepository.save(new vuelo("Madrid", "Ámsterdam", "KLM", "10:40", "13:15", "2025-09-05", "2025-09-05", "2h35m", "14:30", "17:05", "2025-09-09", "2025-09-09", "2h35m", 139.0));
            vueloRepository.save(new vuelo("Roma", "Palermo", "ITA Airways", "18:20", "19:25", "2025-10-12", "2025-10-12", "1h05m", "", "", "", "", "", 69.0));
            vueloRepository.save(new vuelo("Málaga", "Frankfurt", "Ryanair", "07:15", "10:05", "2025-11-08", "2025-11-08", "2h50m", "16:30", "19:20", "2025-11-12", "2025-11-12", "2h50m", 79.0));
            vueloRepository.save(new vuelo("México DF", "Monterrey", "Volaris", "12:50", "14:35", "2025-12-15", "2025-12-15", "1h45m", "", "", "", "", "", 109.0));
            vueloRepository.save(new vuelo("Barcelona", "Estambul", "Turkish Airlines", "14:00", "18:30", "2025-01-30", "2025-01-30", "3h30m", "20:00", "22:30", "2025-02-05", "2025-02-05", "3h30m", 199.0));
            vueloRepository.save(new vuelo("Lisboa", "Faro", "TAP Portugal", "09:30", "10:20", "2025-02-28", "2025-02-28", "0h50m", "", "", "", "", "", 49.0));
            vueloRepository.save(new vuelo("Sevilla", "Milán", "Volotea", "17:40", "20:10", "2025-03-19", "2025-03-19", "2h30m", "06:45", "09:15", "2025-03-23", "2025-03-23", "2h30m", 89.0));
            vueloRepository.save(new vuelo("París", "Marsella", "Air France", "20:15", "21:30", "2025-04-25", "2025-04-25", "1h15m", "", "", "", "", "", 85.0));
            vueloRepository.save(new vuelo("Zaragoza", "Barcelona", "Air Nostrum", "11:10", "12:00", "2025-05-30", "2025-05-30", "0h50m", "18:20", "19:10", "2025-06-02", "2025-06-02", "0h50m", 65.0));
            vueloRepository.save(new vuelo("Alicante", "Düsseldorf", "Eurowings", "13:55", "16:30", "2025-06-27", "2025-06-27", "2h35m", "", "", "", "", "", 109.0));
            vueloRepository.save(new vuelo("Santiago de Compostela", "Zúrich", "Swiss", "08:20", "10:50", "2025-07-24", "2025-07-24", "2h30m", "12:00", "14:30", "2025-07-29", "2025-07-29", "2h30m", 159.0));
            vueloRepository.save(new vuelo("Palma de Mallorca", "Viena", "Ryanair", "16:45", "19:10", "2025-08-31", "2025-08-31", "2h25m", "07:30", "10:00", "2025-09-05", "2025-09-05", "2h25m", 129.0));
            vueloRepository.save(new vuelo("Barcelona", "Tokyo", "JAL", "13:15", "08:30", "2025-09-18", "2025-09-19", "12h15m", "10:00", "14:15", "2025-09-25", "2025-09-25", "11h15m", 899.0));
            vueloRepository.save(new vuelo("Madrid", "Sydney", "Qantas", "23:40", "06:10", "2025-10-03", "2025-10-05", "20h30m", "", "", "", "", "", 1299.0));
            vueloRepository.save(new vuelo("Valencia", "Manchester", "Ryanair", "06:45", "08:30", "2025-11-12", "2025-11-12", "1h45m", "21:00", "22:45", "2025-11-15", "2025-11-15", "1h45m", 79.0));
            vueloRepository.save(new vuelo("Bilbao", "Marrakech", "Air Arabia", "14:20", "15:40", "2025-12-07", "2025-12-07", "2h20m", "", "", "", "", "", 129.0));
            vueloRepository.save(new vuelo("Sevilla", "Casablanca", "Royal Air Maroc", "11:30", "12:15", "2026-01-14", "2026-01-14", "0h45m", "18:00", "18:45", "2026-01-18", "2026-01-18", "0h45m", 149.0));
            vueloRepository.save(new vuelo("Málaga", "Algérie", "Air Algérie", "09:15", "10:05", "2026-02-22", "2026-02-22", "0h50m", "", "", "", "", "", 119.0));
            vueloRepository.save(new vuelo("Zaragoza", "Toulouse", "Volotea", "17:30", "18:40", "2026-03-09", "2026-03-09", "1h10m", "", "", "", "", "", 69.0));
            vueloRepository.save(new vuelo("Alicante", "Oslo", "Norwegian", "07:00", "10:15", "2026-04-05", "2026-04-05", "3h15m", "16:30", "19:45", "2026-04-10", "2026-04-10", "3h15m", 159.0));
            vueloRepository.save(new vuelo("Santiago", "Edinburgh", "Ryanair", "13:45", "15:30", "2026-05-17", "2026-05-17", "1h45m", "", "", "", "", "", 89.0));
            vueloRepository.save(new vuelo("Palma", "Helsinki", "Finnair", "10:20", "14:35", "2026-06-08", "2026-06-08", "3h15m", "16:00", "20:15", "2026-06-13", "2026-06-13", "3h15m", 199.0));
            vueloRepository.save(new vuelo("Barcelona", "Cairo", "EgyptAir", "22:10", "02:30", "2026-07-12", "2026-07-13", "4h20m", "", "", "", "", "", 349.0));
            vueloRepository.save(new vuelo("Madrid", "Johannesburg", "South African", "20:45", "08:30", "2026-08-19", "2026-08-20", "10h45m", "22:00", "10:45", "2026-08-27", "2026-08-28", "10h45m", 799.0));
            vueloRepository.save(new vuelo("Valencia", "Tel Aviv", "El Al", "05:30", "10:45", "2026-09-23", "2026-09-23", "4h15m", "12:00", "17:15", "2026-09-28", "2026-09-28", "4h15m", 429.0));
            vueloRepository.save(new vuelo("Bilbao", "Dubrovnik", "Eurowings", "09:15", "11:30", "2026-10-14", "2026-10-14", "2h15m", "", "", "", "", "", 139.0));
            vueloRepository.save(new vuelo("Sevilla", "Amsterdam", "KLM", "14:50", "17:35", "2026-11-05", "2026-11-05", "2h45m", "09:00", "11:45", "2026-11-09", "2026-11-09", "2h45m", 149.0));
            vueloRepository.save(new vuelo("Málaga", "Stockholm", "SAS", "06:30", "10:15", "2026-12-12", "2026-12-12", "3h45m", "17:00", "20:45", "2026-12-17", "2026-12-17", "3h45m", 189.0));
            vueloRepository.save(new vuelo("Zaragoza", "Lisbon", "TAP Portugal", "12:40", "13:30", "2027-01-18", "2027-01-18", "0h50m", "", "", "", "", "", 79.0));
            vueloRepository.save(new vuelo("Alicante", "Prague", "SmartWings", "15:20", "17:50", "2027-02-22", "2027-02-22", "2h30m", "08:30", "11:00", "2027-02-26", "2027-02-26", "2h30m", 119.0));
            vueloRepository.save(new vuelo("Santiago", "Warsaw", "LOT", "10:10", "13:40", "2027-03-15", "2027-03-15", "3h30m", "", "", "", "", "", 169.0));
            vueloRepository.save(new vuelo("Palma", "Athens", "Aegean", "07:45", "11:05", "2027-04-09", "2027-04-09", "3h20m", "13:00", "16:20", "2027-04-14", "2027-04-14", "3h20m", 159.0));
        }
    }
}