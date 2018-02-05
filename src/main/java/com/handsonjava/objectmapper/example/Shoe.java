package com.handsonjava.objectmapper.example;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "shoeName",
        "number",
        "producent",
        "price",
        "sizes"
})
public class Shoe {

    @JsonProperty("shoeName")
    private String shoeName;
    @JsonProperty("number")
    private String number;
    @JsonProperty("producent")
    private String producent;
    @JsonProperty("price")
    private Double price;
    @JsonProperty("sizes")
    private List<Double> sizes = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("shoeName")
    public String getShoeName() {
        return shoeName;
    }

    @JsonProperty("shoeName")
    public void setShoeName(String shoeName) {
        this.shoeName = shoeName;
    }

    @JsonProperty("number")
    public String getNumber() {
        return number;
    }

    @JsonProperty("number")
    public void setNumber(String number) {
        this.number = number;
    }

    @JsonProperty("producent")
    public String getProducent() {
        return producent;
    }

    @JsonProperty("producent")
    public void setProducent(String producent) {
        this.producent = producent;
    }

    @JsonProperty("price")
    public Double getPrice() {
        return price;
    }

    @JsonProperty("price")
    public void setPrice(Double price) {
        this.price = price;
    }

    @JsonProperty("sizes")
    public List<Double> getSizes() {
        return sizes;
    }

    @JsonProperty("sizes")
    public void setSizes(List<Double> sizes) {
        this.sizes = sizes;
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
