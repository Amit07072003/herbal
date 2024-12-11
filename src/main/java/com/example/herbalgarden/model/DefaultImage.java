package com.example.herbalgarden.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DefaultImage {
	@JsonProperty("license")
	private int license;
	@JsonProperty("license_name")
	private String llicenseName;
	@JsonProperty("original_url")
	private String originalUrl;
	@JsonProperty("regular_url")
	private String regularUrl;
	@JsonProperty("medium_url")
	private String mediumUrl;
	@JsonProperty("small_url")
	private String smallUrl;
	@JsonProperty("thumbnail")
	private String thumbnail;
	
	 public DefaultImage() {}
	
	public DefaultImage(int license, String llicenseName, String originalUrl, String regularUrl, String mediumUrl,
			String smallUrl, String thumbnail) {
		super();
		this.license = license;
		this.llicenseName = llicenseName;
		this.originalUrl = originalUrl;
		this.regularUrl = regularUrl;
		this.mediumUrl = mediumUrl;
		this.smallUrl = smallUrl;
		this.thumbnail = thumbnail;
	}

	public int getLicense() {
		return license;
	}

	public void setLicense(int license) {
		this.license = license;
	}

	public String getLlicenseName() {
		return llicenseName;
	}

	public void setLlicenseName(String llicenseName) {
		this.llicenseName = llicenseName;
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
