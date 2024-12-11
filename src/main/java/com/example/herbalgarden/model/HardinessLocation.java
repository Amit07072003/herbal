package com.example.herbalgarden.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class HardinessLocation {

    @JsonProperty("full_url")
    private String fullUrl;
    @JsonProperty("full_iframe")
    private String fullIframe;

    // Constructors, getters, and setters
    public HardinessLocation() {}

    public HardinessLocation(String fullUrl, String fullIframe) {
        this.fullUrl = fullUrl;
        this.fullIframe = fullIframe;
    }

    public String getFullUrl() {
        return fullUrl;
    }

    public void setFullUrl(String fullUrl) {
        this.fullUrl = fullUrl;
    }

    public String getFullIframe() {
        return fullIframe;
    }

    public void setFullIframe(String fullIframe) {
        this.fullIframe = fullIframe;
    }
}
