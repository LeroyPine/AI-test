package com.leroypine.weathermcp.model;

import lombok.Data;
import java.util.Map;

@Data
public class ToolCallParams {
    private String name;
    private Map<String, Object> arguments;
}