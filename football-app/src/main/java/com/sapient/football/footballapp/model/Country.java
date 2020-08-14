package com.sapient.football.footballapp.model;

import com.google.gson.annotations.SerializedName;
import lombok.*;

@EqualsAndHashCode
@ToString
@Getter
@Setter
@RequiredArgsConstructor
public class Country {

    @SerializedName("countryId")
    private String country_id;

    @SerializedName("countryName")
    private String country_name;

    public String getCountry_id() {
        return country_id;
    }

    public void setCountry_id(String country_id) {
        this.country_id = country_id;
    }

    public String getCountry_name() {
        return country_name;
    }

    public void setCountry_name(String country_name) {
        this.country_name = country_name;
    }
}
