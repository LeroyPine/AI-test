package com.leroypine.weathermcp.model;

import lombok.Data;

@Data
public class WeatherInfo {
    private String city;
    private String condition;
    private String temperature;
    private String humidity;
    private String windDirection;
    private String windPower;
    private String airQuality;
    private String updateTime;
}