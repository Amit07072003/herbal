package com.example.herbalgarden.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Dimensions {

    @JsonProperty("type")
    private String type;
    @JsonProperty("min_value")
    private int minValue;
    @JsonProperty("max_value")
    private int maxValue;
    @JsonProperty("unit")
    private String unit;

    // Constructors, getters, and setters
    public Dimensions() {}

    public Dimensions(String type, int minValue, int maxValue, String unit) {
        this.type = type;
        this.minValue = minValue;
        this.maxValue = maxValue;
        this.unit = unit;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getMinValue() {
        return minValue;
    }

    public void setMinValue(int minValue) {
        this.minValue = minValue;
    }

    public int getMaxValue() {
        return maxValue;
    }

    public void setMaxValue(int maxValue) {
        this.maxValue = maxValue;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }
}
