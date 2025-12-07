package com.leroypine.weathermcp.model;

import lombok.Data;
import java.util.Map;

@Data
public class McpRequest {
    private String jsonrpc;
    private String method;
    private Map<String, Object> params;
    private Object id;
}