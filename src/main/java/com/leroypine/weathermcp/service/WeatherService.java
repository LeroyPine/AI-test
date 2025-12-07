package com.leroypine.weathermcp.service;

import com.leroypine.weathermcp.model.WeatherInfo;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;

@Service
public class WeatherService {

    private final Random random = new Random();

    public WeatherInfo getWeather(String city) {
        WeatherInfo weather = new WeatherInfo();
        weather.setCity(city);
        weather.setCondition(getRandomCondition());
        weather.setTemperature(String.valueOf(random.nextInt(30) + 5));
        weather.setHumidity(String.valueOf(random.nextInt(60) + 30));
        weather.setWindDirection(getRandomWindDirection());
        weather.setWindPower(getRandomWindPower());
        weather.setAirQuality(getRandomAirQuality());
        weather.setUpdateTime(LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
        
        return weather;
    }

    private String getRandomCondition() {
        String[] conditions = {"晴", "多云", "阴", "小雨", "中雨", "雷阵雨", "雪"};
        return conditions[random.nextInt(conditions.length)];
    }

    private String getRandomWindDirection() {
        String[] directions = {"北风", "东北风", "东风", "东南风", "南风", "西南风", "西风", "西北风"};
        return directions[random.nextInt(directions.length)];
    }

    private String getRandomWindPower() {
        return (random.nextInt(5) + 1) + "级";
    }

    private String getRandomAirQuality() {
        String[] qualities = {"优", "良", "轻度污染", "中度污染"};
        return qualities[random.nextInt(qualities.length)];
    }
}