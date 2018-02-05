package com.handsonjava.objectmapper.example;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "town",
        "street",
        "streetNumber",
        "cordX",
        "cordY"
})
public class Address {

    @JsonProperty("town")
    private String town;
    @JsonProperty("street")
    private String street;
    @JsonProperty("streetNumber")
    private String streetNumber;
    @JsonProperty("cordX")
    private Double cordX;
    @JsonProperty("cordY")
    private Double cordY;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("town")
    public String getTown() {
        return town;
    }

    @JsonProperty("town")
    public void setTown(String town) {
        this.town = town;
    }

    @JsonProperty("street")
    public String getStreet() {
        return street;
    }

    @JsonProperty("street")
    public void setStreet(String street) {
        this.street = street;
    }

    @JsonProperty("streetNumber")
    public String getStreetNumber() {
        return streetNumber;
    }

    @JsonProperty("streetNumber")
    public void setStreetNumber(String streetNumber) {
        this.streetNumber = streetNumber;
    }

    @JsonProperty("cordX")
    public Double getCordX() {
        return cordX;
    }

    @JsonProperty("cordX")
    public void setCordX(Double cordX) {
        this.cordX = cordX;
    }

    @JsonProperty("cordY")
    public Double getCordY() {
        return cordY;
    }

    @JsonProperty("cordY")
    public void setCordY(Double cordY) {
        this.cordY = cordY;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
