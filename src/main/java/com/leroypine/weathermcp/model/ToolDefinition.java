package com.leroypine.weathermcp.model;

import lombok.Data;

@Data
public class ToolDefinition {
    private String name;
    private String description;
    private ToolInputSchema inputSchema;
}