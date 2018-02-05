package com.handsonjava.objectmapper.example;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "name",
        "mobiles",
        "address",
        "shoe"
})
public class ShopInfo {

    @JsonProperty("name")
    private String name;
    @JsonProperty("mobiles")
    private List<Object> mobiles = null;
    @JsonProperty("address")
    private Address address;
    @JsonProperty("shoe")
    private List<Shoe> shoe = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("mobiles")
    public List<Object> getMobiles() {
        return mobiles;
    }

    @JsonProperty("mobiles")
    public void setMobiles(List<Object> mobiles) {
        this.mobiles = mobiles;
    }

    @JsonProperty("address")
    public Address getAddress() {
        return address;
    }

    @JsonProperty("address")
    public void setAddress(Address address) {
        this.address = address;
    }

    @JsonProperty("shoe")
    public List<Shoe> getShoe() {
        return shoe;
    }

    @JsonProperty("shoe")
    public void setShoe(List<Shoe> shoe) {
        this.shoe = shoe;
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
