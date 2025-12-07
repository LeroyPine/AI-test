package com.leroypine.weathermcp.model;

import lombok.Data;

@Data
public class McpInitializeResponse {
    private String protocolVersion;
    private ServerInfo serverInfo;
    private ServerCapabilities capabilities;
}