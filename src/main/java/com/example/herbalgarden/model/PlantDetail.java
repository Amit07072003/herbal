package com.example.herbalgarden.model;

import java.util.List;


import com.fasterxml.jackson.annotation.JsonProperty;

public class PlantDetail{

    
    
    @JsonProperty("common_name")
    private String commonName;
    @JsonProperty("scientific_name")
    private List<Object> scientificName;
    @JsonProperty("other_name")
    private List<Object> otherName;
    @JsonProperty("family")
    private String family;
    @JsonProperty("origin")
    private List<Object> origin;
    @JsonProperty("type")
    private String type;
    @JsonProperty("dimension")
    private String dimension;
    @JsonProperty("dimensions")
    private Dimensions dimensions;
    public Dimensions getDimensions() {
		return dimensions;
	}
	public void setDimensions(Dimensions dimensions) {
		this.dimensions = dimensions;
	}
	@JsonProperty("cycle")
    private String cycle;
    @JsonProperty("attracts")
    private List<Object> attracts;
    @JsonProperty("propagation")
    private List<Object> propagation;
    @JsonProperty("hardiness")
    private Hardiness hardiness;
    public Hardiness getHardiness() {
		return hardiness;
	}
	public void setHardiness(Hardiness hardiness) {
		this.hardiness = hardiness;
	}
    @JsonProperty("hardiness_location")
	private HardinessLocation hardinessLocation;
    public HardinessLocation getHardinessLocation() {
		return hardinessLocation;
	}
	public void setHardinessLocation(HardinessLocation hardinessLocation) {
		this.hardinessLocation = hardinessLocation;
	}
	@JsonProperty("watering")
    private String watering;
//    @JsonProperty("depth_water_requirement")
//    private List<Object> depthWaterRequirement;
    @JsonProperty("volume_water_requirement")
    private List<Object> volumeWaterRequirement;
    @JsonProperty("wateriing_period")
    private String wateringPeriod;
    @JsonProperty("watering_general_benchmark")
    private WateringGeneralBenchmark wateringGeneralBenchmark;
    public WateringGeneralBenchmark getWateringGeneralBenchmark() {
		return wateringGeneralBenchmark;
	}
	public void setWateringGeneralBenchmark(WateringGeneralBenchmark wateringGeneralBenchmark) {
		this.wateringGeneralBenchmark = wateringGeneralBenchmark;
	}
	@JsonProperty("plant_anatomy")
    private List<Object> plantAnatomy;
	@JsonProperty("sunlight")
    private List<Object> sunlight;
    @JsonProperty("pruning_month")
    private List<Object> pruningMonth;
//    @JsonProperty("pruning_count")
//    private PruningCount pruningCount;
//    public PruningCount getPruningCount() {
//		return pruningCount;
//	}
//	public void setPruningCount(PruningCount pruningCount) {
//		this.pruningCount = pruningCount;
//	}
	@JsonProperty("seeds  ")
    private float seeds;
    @JsonProperty("maintenance")
    private String maintenance;
    @JsonProperty("care-guide")
    private String careGuides;
    @JsonProperty("growth_rate")
    private String growthRate;
    @JsonProperty("drought_tolerant")
    private boolean droughtTolerant;
    @JsonProperty("salt_tolerant ")
    private boolean saltTolerant;
    @JsonProperty("thorny")
    private boolean thorny;
    @JsonProperty("invasive")
    private boolean invasive;
    @JsonProperty("tropical")
    private boolean tropical;
    @JsonProperty("indoor")
    private boolean indoor;
    @JsonProperty("care_level")
    private String careLevel;
    @JsonProperty("pest_susceptibility")
    private List<Object> pestSusceptibility;
    @JsonProperty("pest_susceptibility_api")
    private String pestSusceptibilityApi;
    @JsonProperty("flowers")
    private boolean flowers;
    @JsonProperty("flowering_season")
    private String floweringSeason;
    @JsonProperty("flower_color")
    private String flowerColor;
    @JsonProperty("cones")
    private boolean cones;
    @JsonProperty("fruits")
    private boolean fruits;
    @JsonProperty("edible_fruit")
    private boolean edibleFruit;
    @JsonProperty("edible_fruit_taste_profile")
    private String edibleFruitTasteProfile;
    @JsonProperty("fruit_nutritional_value")
    private String fruitNutritionalValue;
    @JsonProperty("fruit_color")
    private List<Object> fruitColor;
    @JsonProperty("harvest_season")
    private String harvestSeason;
    @JsonProperty("leaf")
    private boolean leaf;
    @JsonProperty("leaf_color")
    private List<Object> leafColor;
    @JsonProperty("edible_leaf")
    private boolean edibleLeaf;
    @JsonProperty("cuisine")
    private boolean cuisine;
    @JsonProperty("medicinal")
    private boolean medicinal;
    @JsonProperty("poisonous_to_humans")
    private float poisonousToHumans;
    @JsonProperty("poisonous_to_pets")
    private float poisonousToPets;
    @JsonProperty("description")
    private String description;
    @JsonProperty("default_image")
    private DefaultImage defaultImage;
    @JsonProperty("other_images  ")
    private String otherImages;
   
	public String getCommonName() {
		return commonName;
	}
	public void setCommonName(String commonName) {
		this.commonName = commonName;
	}
	public List<Object> getScientificName() {
		return scientificName;
	}
	public void setScientificName(List<Object> scientificName) {
		this.scientificName = scientificName;
	}
	public List<Object> getOtherName() {
		return otherName;
	}
	public void setOtherName(List<Object> otherName) {
		this.otherName = otherName;
	}
	public String getFamily() {
		return family;
	}
	public void setFamily(String family) {
		this.family = family;
	}
	public List<Object> getOrigin() {
		return origin;
	}
	public void setOrigin(List<Object> origin) {
		this.origin = origin;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getDimension() {
		return dimension;
	}
	public void setDimension(String dimension) {
		this.dimension = dimension;
	}
	
	public String getCycle() {
		return cycle;
	}
	public void setCycle(String cycle) {
		this.cycle = cycle;
	}
	public List<Object> getAttracts() {
		return attracts;
	}
	public void setAttracts(List<Object> attracts) {
		this.attracts = attracts;
	}
	public List<Object> getPropagation() {
		return propagation;
	}
	public void setPropagation(List<Object> propagation) {
		this.propagation = propagation;
	}
	
	
	public String getWatering() {
		return watering;
	}
	public void setWatering(String watering) {
		this.watering = watering;
	}
//	public List<Object> getDepthWaterRequirement() {
//		return depthWaterRequirement;
//	}
//	public void setDepthWaterRequirement(List<Object> depthWaterRequirement) {
//		this.depthWaterRequirement = depthWaterRequirement;
//	}
//	public List<Object> getVolumeWaterRequirement() {
//		return volumeWaterRequirement;
//	}
	public void setVolumeWaterRequirement(List<Object> volumeWaterRequirement) {
		this.volumeWaterRequirement = volumeWaterRequirement;
	}
	public String getWateringPeriod() {
		return wateringPeriod;
	}
	public void setWateringPeriod(String wateringPeriod) {
		this.wateringPeriod = wateringPeriod;
	}
	
	public List<Object> getPlantAnatomy() {
		return plantAnatomy;
	}
	public void setPlantAnatomy(List<Object> plantAnatomy) {
		this.plantAnatomy = plantAnatomy;
	}
	public List<Object> getSunlight() {
		return sunlight;
	}
	public void setSunlight(List<Object> sunlight) {
		this.sunlight = sunlight;
	}
	public List<Object> getPruningMonth() {
		return pruningMonth;
	}
	public void setPruningMonth(List<Object> pruningMonth) {
		this.pruningMonth = pruningMonth;
	}
	
	public float getSeeds() {
		return seeds;
	}
	public void setSeeds(float seeds) {
		this.seeds = seeds;
	}
	public String getMaintenance() {
		return maintenance;
	}
	public void setMaintenance(String maintenance) {
		this.maintenance = maintenance;
	}
	public String getCareGuides() {
		return careGuides;
	}
	public void setCareGuides(String careGuides) {
		this.careGuides = careGuides;
	}
	public String getGrowthRate() {
		return growthRate;
	}
	public void setGrowthRate(String growthRate) {
		this.growthRate = growthRate;
	}
	public boolean isDroughtTolerant() {
		return droughtTolerant;
	}
	public void setDroughtTolerant(boolean droughtTolerant) {
		this.droughtTolerant = droughtTolerant;
	}
	public boolean isSaltTolerant() {
		return saltTolerant;
	}
	public void setSaltTolerant(boolean saltTolerant) {
		this.saltTolerant = saltTolerant;
	}
	public boolean isThorny() {
		return thorny;
	}
	public void setThorny(boolean thorny) {
		this.thorny = thorny;
	}
	public boolean isInvasive() {
		return invasive;
	}
	public void setInvasive(boolean invasive) {
		this.invasive = invasive;
	}
	public boolean isTropical() {
		return tropical;
	}
	public void setTropical(boolean tropical) {
		this.tropical = tropical;
	}
	public boolean isIndoor() {
		return indoor;
	}
	public void setIndoor(boolean indoor) {
		this.indoor = indoor;
	}
	public String getCareLevel() {
		return careLevel;
	}
	public void setCareLevel(String careLevel) {
		this.careLevel = careLevel;
	}
	public List<Object> getPestSusceptibility() {
		return pestSusceptibility;
	}
	public void setPestSusceptibility(List<Object> pestSusceptibility) {
		this.pestSusceptibility = pestSusceptibility;
	}
	public String getPestSusceptibilityApi() {
		return pestSusceptibilityApi;
	}
	public void setPestSusceptibilityApi(String pestSusceptibilityApi) {
		this.pestSusceptibilityApi = pestSusceptibilityApi;
	}
	public boolean isFlowers() {
		return flowers;
	}
	public void setFlowers(boolean flowers) {
		this.flowers = flowers;
	}
	public String getFloweringSeason() {
		return floweringSeason;
	}
	public void setFloweringSeason(String floweringSeason) {
		this.floweringSeason = floweringSeason;
	}
	public String getFlowerColor() {
		return flowerColor;
	}
	public void setFlowerColor(String flowerColor) {
		this.flowerColor = flowerColor;
	}
	public boolean isCones() {
		return cones;
	}
	public void setCones(boolean cones) {
		this.cones = cones;
	}
	public boolean isFruits() {
		return fruits;
	}
	public void setFruits(boolean fruits) {
		this.fruits = fruits;
	}
	public boolean isEdibleFruit() {
		return edibleFruit;
	}
	public void setEdibleFruit(boolean edibleFruit) {
		this.edibleFruit = edibleFruit;
	}
	public String getEdibleFruitTasteProfile() {
		return edibleFruitTasteProfile;
	}
	public void setEdibleFruitTasteProfile(String edibleFruitTasteProfile) {
		this.edibleFruitTasteProfile = edibleFruitTasteProfile;
	}
	public String getFruitNutritionalValue() {
		return fruitNutritionalValue;
	}
	public void setFruitNutritionalValue(String fruitNutritionalValue) {
		this.fruitNutritionalValue = fruitNutritionalValue;
	}
	public List<Object> getFruitColor() {
		return fruitColor;
	}
	public void setFruitColor(List<Object> fruitColor) {
		this.fruitColor = fruitColor;
	}
	public String getHarvestSeason() {
		return harvestSeason;
	}
	public void setHarvestSeason(String harvestSeason) {
		this.harvestSeason = harvestSeason;
	}
	public boolean isLeaf() {
		return leaf;
	}
	public void setLeaf(boolean leaf) {
		this.leaf = leaf;
	}
	public List<Object> getLeafColor() {
		return leafColor;
	}
	public void setLeafColor(List<Object> leafColor) {
		this.leafColor = leafColor;
	}
	public boolean isEdibleLeaf() {
		return edibleLeaf;
	}
	public void setEdibleLeaf(boolean edibleLeaf) {
		this.edibleLeaf = edibleLeaf;
	}
	public boolean isCuisine() {
		return cuisine;
	}
	public void setCuisine(boolean cuisine) {
		this.cuisine = cuisine;
	}
	public boolean isMedicinal() {
		return medicinal;
	}
	public void setMedicinal(boolean medicinal) {
		this.medicinal = medicinal;
	}
	public float getPoisonousToHumans() {
		return poisonousToHumans;
	}
	public void setPoisonousToHumans(float poisonousToHumans) {
		this.poisonousToHumans = poisonousToHumans;
	}
	public float getPoisonousToPets() {
		return poisonousToPets;
	}
	public void setPoisonousToPets(float poisonousToPets) {
		this.poisonousToPets = poisonousToPets;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public DefaultImage getDefaultImage() {
		return defaultImage;
	}
	public void setDefaultImage(DefaultImage defaultImage) {
		this.defaultImage = defaultImage;
	}
	
	
	
	public String getOtherImages() {
		return otherImages;
	}
	public void setOtherImages(String otherImages) {
		this.otherImages = otherImages;
	}
    
    
    
}




