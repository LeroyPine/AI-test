package com.leroypine.weathermcp.model;

import lombok.Data;
import java.util.List;

@Data
public class McpToolsListResponse {
    private List<ToolDefinition> tools;
}