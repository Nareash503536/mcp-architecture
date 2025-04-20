package com.example.mcp_server;

import org.springframework.ai.tool.annotation.Tool;
import org.springframework.ai.tool.annotation.ToolParam;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

@Service
public class WeatherService {
    private final RestClient restClient;

    public WeatherService() {
        this.restClient = RestClient.builder()
                            .baseUrl("https://api.weather.gov")
                            .defaultHeader("Accept", "application/geo+json")
                            .defaultHeader("User-Agent", "WeatherApiClient/1.0 (your@email.com)")
                            .build();

    }

    @Tool(description = "Get weather forecast for a specific latitude/longitude")
    public String getWeatherForecastByLocation(
        double latitude,
        double longitude        
    ) {

        // Returns detailed forecast including:
        // - Temperature and unit
        // - Wind speed and direction
        // - Detailed forecast description
    }

    @Tool(description = "Get weatehr alerts for US state")
    public String getAlert(
        @ToolParam(description = "Two letter US state code (eg. CA, NY)") String state
    ){
        // Returns active alerts including:
        // - Event type
        // - Affected area
        // - Severity
        // - Description
        // - Safety instructions
    }

}
