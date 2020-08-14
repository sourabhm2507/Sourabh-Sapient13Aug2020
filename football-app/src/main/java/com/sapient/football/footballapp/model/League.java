package com.sapient.football.footballapp.model;

import com.google.gson.annotations.SerializedName;
import lombok.*;

@EqualsAndHashCode
@ToString
@Getter
@Setter
@RequiredArgsConstructor
public class League {

    @SerializedName("countryId")
    private String countryId;

    @SerializedName("countryName")
    private String countryName;

    @SerializedName("leagueId")
    private String leagueId;

    @SerializedName("leagueName")
    private String leagueName;
}
