package com.handsonjava.objectmapper;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties({"additionalProperties"})
@JsonPropertyOrder({
        "fName",
        "lName",
        "id"
})
public class EmployeeInfo {

    @JsonProperty("fName")
    private String fName;
    @JsonProperty("lName")
    private String lName;
    @JsonProperty("id")
    private Integer id;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("fName")
    public String getFName() {
        return fName;
    }

    @JsonProperty("fName")
    public void setFName(String fName) {
        this.fName = fName;
    }

    @JsonProperty("lName")
    public String getLName() {
        return lName;
    }

    @JsonProperty("lName")
    public void setLName(String lName) {
        this.lName = lName;
    }

    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    @JsonIgnore
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonIgnore
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }
}
