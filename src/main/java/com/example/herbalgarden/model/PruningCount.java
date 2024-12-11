package com.example.herbalgarden.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PruningCount {

    @JsonProperty("amount")
    private int amount;
    @JsonProperty("interval")
    private String interval;

    // Constructors, getters, and setters
    public PruningCount() {}

    public PruningCount(int amount, String interval) {
        this.amount = amount;
        this.interval = interval;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getInterval() {
        return interval;
    }

    public void setInterval(String interval) {
        this.interval = interval;
    }
}
