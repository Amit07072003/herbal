package com.example.herbalgarden.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Hardiness {

    @JsonProperty("min")
    private String min;
    @JsonProperty("max")
    private String max;

    // Constructors, getters, and setters
    public Hardiness() {}

    public Hardiness(String min, String max) {
        this.min = min;
        this.max = max;
    }

    public String getMin() {
        return min;
    }

    public void setMin(String min) {
        this.min = min;
    }

    public String getMax() {
        return max;
    }

    public void setMax(String max) {
        this.max = max;
    }
}
