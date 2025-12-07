package com.leroypine.weathermcp.model;

import lombok.Data;

@Data
public class McpToolCallRequest {
    private String jsonrpc;
    private String method;
    private ToolCallParams params;
    private Object id;
}