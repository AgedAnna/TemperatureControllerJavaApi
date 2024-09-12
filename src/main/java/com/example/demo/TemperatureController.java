package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TemperatureController {

    @GetMapping("/celsiusParaFahrenheit")
    public String celsiusParaFahrenheit(@RequestParam double grau) {
        double fahrenheit = (grau * 9 / 5) + 32;
        return String.format("%.2f ºC é igual a %.2f ºF", grau, fahrenheit);
    }

    @GetMapping("/fahrenheitParaCelsius")
    public String fahrenheitParaCelsius(@RequestParam double grau) {
        double celsius = (grau - 32) * 5 / 9;
        return String.format("%.2f ºF é igual a %.2f ºC", grau, celsius);
    }
}
