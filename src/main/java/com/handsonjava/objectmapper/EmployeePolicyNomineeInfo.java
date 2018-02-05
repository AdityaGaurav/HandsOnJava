package com.handsonjava.objectmapper;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "beneficiaryName",
        "dateOfBirth",
        "name"
})
public class EmployeePolicyNomineeInfo {

    @JsonProperty("beneficiaryName")
    private String beneficiaryName;
    @JsonProperty("dateOfBirth")
    private String dateOfBirth;
    @JsonProperty("name")
    private String name;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("beneficiaryName")
    public String getBeneficiaryName() {
        return beneficiaryName;
    }

    @JsonProperty("beneficiaryName")
    public void setBeneficiaryName(String beneficiaryName) {
        this.beneficiaryName = beneficiaryName;
    }

    @JsonProperty("dateOfBirth")
    public String getDateOfBirth() {
        return dateOfBirth;
    }

    @JsonProperty("dateOfBirth")
    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "EmployeePolicyNomineeInfo{" +
                "beneficiaryName='" + beneficiaryName + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", name='" + name + '\'' +
                ", additionalProperties=" + additionalProperties +
                '}';
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

