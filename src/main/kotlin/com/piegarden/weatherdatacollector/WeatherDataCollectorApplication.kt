package com.piegarden.weatherdatacollector

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class WeatherDataCollectorApplication

fun main(args: Array<String>) {
    runApplication<WeatherDataCollectorApplication>(*args)
}
