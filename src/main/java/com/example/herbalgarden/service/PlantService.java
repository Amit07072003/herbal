package com.example.herbalgarden.service;

import kong.unirest.HttpResponse;
import kong.unirest.Unirest;
import org.springframework.stereotype.Service;
import com.example.herbalgarden.model.Plant;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;

@Service
public class PlantService {
    private final ObjectMapper objectMapper = new ObjectMapper();
    private static final String API_KEY = "sk-5tpZ67401de8ad9557605";
    private static final String BASE_URL = "https://perenual.com/api/species-list";

    public ApiResponse getPlants(int page, int size) {
        String url = String.format("%s?page=%d&per_page=%d&key=%s", BASE_URL, page, size, API_KEY);
        try {
            HttpResponse<String> response = Unirest.get(url).asString();
            String jsonResponse = response.getBody();
            return objectMapper.readValue(jsonResponse, ApiResponse.class);
        } catch (IOException e) {
            // Handle errors
            System.err.println("Error: " + e.getMessage());
            return null;
        }
    }

    public Plant searchPlant(String plantName) {
        String url = String.format("%s?key=%s&q=%s", BASE_URL, API_KEY, plantName);
        try {
            HttpResponse<String> response = Unirest.get(url).asString();
            String jsonResponse = response.getBody();
            ApiResponse apiResponse = objectMapper.readValue(jsonResponse, ApiResponse.class);
            Plant[] plants = apiResponse.getData();
            if (plants != null && plants.length > 0) {
                return plants[0]; // Return the first matching plant
            }
        } catch (IOException e) {
            // Handle errors
            System.err.println("Error: " + e.getMessage());
        }
        return null; // Return null if no plant is found
    }

    // Inner class to match the API response structure
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class ApiResponse {
        private Plant[] data;
        private int to;
        private int per_page;
        private int current_page;
        private int from;
        private int last_page;
        private int total;

        public Plant[] getData() {
            return data;
        }

        public void setData(Plant[] data) {
            this.data = data;
        }

        public int getTo() {
            return to;
        }

        public void setTo(int to) {
            this.to = to;
        }

        public int getPer_page() {
            return per_page;
        }

        public void setPer_page(int per_page) {
            this.per_page = per_page;
        }

        public int getCurrent_page() {
            return current_page;
        }

        public void setCurrent_page(int current_page) {
            this.current_page = current_page;
        }

        public int getFrom() {
            return from;
        }

        public void setFrom(int from) {
            this.from = from;
        }

        public int getLast_page() {
            return last_page;
        }

        public void setLast_page(int last_page) {
            this.last_page = last_page;
        }

        public int getTotal() {
            return total;
        }

        public void setTotal(int total) {
            this.total = total;
        }
    }
}