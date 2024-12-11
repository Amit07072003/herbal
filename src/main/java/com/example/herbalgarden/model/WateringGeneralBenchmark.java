package com.example.herbalgarden.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class WateringGeneralBenchmark {

    @JsonProperty("value")
    private String value;
    @JsonProperty("unit")
    private String unit;

    // Constructors, getters, and setters
    public WateringGeneralBenchmark() {}

    public WateringGeneralBenchmark(String value, String unit) {
        this.value = value;
        this.unit = unit;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }
}
