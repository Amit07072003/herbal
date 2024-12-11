package com.example.herbalgarden.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

public class Plant {
    private int id;

    @JsonProperty("common_name")
    private String commonName;

    @JsonProperty("scientific_name")
    private List<String> scientificName;

    @JsonProperty("other_name")
    private List<String> otherName;

    private String cycle;
    private String watering;
    private List<String> sunlight;

    @JsonProperty("default_image")
    private DefaultImage defaultImage;

    // Default constructor
    public Plant() {
    }

    // Parameterized constructor
    public Plant(int id, String commonName, List<String> scientificName, List<String> otherName, String cycle, String watering, List<String> sunlight, DefaultImage defaultImage) {
        this.id = id;
        this.commonName = commonName;
        this.scientificName = scientificName;
        this.otherName = otherName;
        this.cycle = cycle;
        this.watering = watering;
        this.sunlight = sunlight;
        this.defaultImage = defaultImage;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCommonName() {
        return commonName;
    }

    public void setCommonName(String commonName) {
        this.commonName = commonName;
    }

    public List<String> getScientificName() {
        return scientificName;
    }

    public void setScientificName(List<String> scientificName) {
        this.scientificName = scientificName;
    }

    public List<String> getOtherName() {
        return otherName;
    }

    public void setOtherName(List<String> otherName) {
        this.otherName = otherName;
    }

    public String getCycle() {
        return cycle;
    }

    public void setCycle(String cycle) {
        this.cycle = cycle;
    }

    public String getWatering() {
        return watering;
    }

    public void setWatering(String watering) {
        this.watering = watering;
    }

    public List<String> getSunlight() {
        return sunlight;
    }

    public void setSunlight(List<String> sunlight) {
        this.sunlight = sunlight;
    }

    public DefaultImage getDefaultImage() {
        return defaultImage;
    }

    public void setDefaultImage(DefaultImage defaultImage) {
        this.defaultImage = defaultImage;
    }

    // Inner class for DefaultImage
    public static class DefaultImage {
        private int license;

        @JsonProperty("license_name")
        private String licenseName;

        @JsonProperty("license_url")
        private String licenseUrl;

        @JsonProperty("original_url")
        private String originalUrl;

        @JsonProperty("regular_url")
        private String regularUrl;

        @JsonProperty("medium_url")
        private String mediumUrl;

        @JsonProperty("small_url")
        private String smallUrl;

        private String thumbnail;

        // Default constructor
        public DefaultImage() {
        }

        // Parameterized constructor
        public DefaultImage(int license, String licenseName, String licenseUrl, String originalUrl, String regularUrl, String mediumUrl, String smallUrl, String thumbnail) {
            this.license = license;
            this.licenseName = licenseName;
            this.licenseUrl = licenseUrl;
            this.originalUrl = originalUrl;
            this.regularUrl = regularUrl;
            this.mediumUrl = mediumUrl;
            this.smallUrl = smallUrl;
            this.thumbnail = thumbnail;
        }

        // Getters and Setters
        public int getLicense() {
            return license;
        }

        public void setLicense(int license) {
            this.license = license;
        }

        public String getLicenseName() {
            return licenseName;
        }

        public void setLicenseName(String licenseName) {
            this.licenseName = licenseName;
        }

        public String getLicenseUrl() {
            return licenseUrl;
        }

        public void setLicenseUrl(String licenseUrl) {
            this.licenseUrl = licenseUrl;
        }

        public String getOriginalUrl() {
            return originalUrl;
        }

        public void setOriginalUrl(String originalUrl) {
            this.originalUrl = originalUrl;
        }

        public String getRegularUrl() {
            return regularUrl;
        }

        public void setRegularUrl(String regularUrl) {
            this.regularUrl = regularUrl;
        }

        public String getMediumUrl() {
            return mediumUrl;
        }

        public void setMediumUrl(String mediumUrl) {
            this.mediumUrl = mediumUrl;
        }

        public String getSmallUrl() {
            return smallUrl;
        }

        public void setSmallUrl(String smallUrl) {
            this.smallUrl = smallUrl;
        }

        public String getThumbnail() {
            return thumbnail;
        }

        public void setThumbnail(String thumbnail) {
            this.thumbnail = thumbnail;
        }
    }
}
