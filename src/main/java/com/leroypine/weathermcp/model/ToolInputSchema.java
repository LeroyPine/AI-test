package com.leroypine.weathermcp.model;

import lombok.Data;
import java.util.List;
import java.util.Map;

@Data
public class ToolInputSchema {
    private String type;
    private Map<String, Object> properties;
    private List<String> required;
}