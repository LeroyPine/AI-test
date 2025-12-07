package com.leroypine.weathermcp.model;

import lombok.Data;
import java.util.List;

@Data
public class McpToolCallResponse {
    private List<ToolCallContent> content;
    private Boolean isError;
}