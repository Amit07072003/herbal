package com.example.herbalgarden.service;

import com.example.herbalgarden.model.PlantDetail;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class PlantDetailService {

    private static final String API_URL = "https://perenual.com/api/species/details/{id}?key=sk-5tpZ67401de8ad9557605";

    public PlantDetail getPlantDetailsById(String plantId) {
        // Use RestTemplate to call the external API
        RestTemplate restTemplate = new RestTemplate();
        String url = API_URL;

        // Make the API request and map the JSON response to the PlantDetail object
        PlantDetail plantDetail = restTemplate.getForObject(url, PlantDetail.class, plantId);
        
        return plantDetail;
    }
}
