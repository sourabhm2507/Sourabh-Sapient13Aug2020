package com.sapient.football.footballapp.model;

import com.google.gson.annotations.SerializedName;
import lombok.*;

import java.util.List;

@EqualsAndHashCode
@ToString
@Getter
@Setter
@RequiredArgsConstructor
public class Standings {

    @SerializedName("countryName")
    private String country_name;

    @SerializedName("leagueId")
    private String league_id;

    @SerializedName("team_id")
    private String team_id;

    @SerializedName("leagueName")
    private String league_name;

    @SerializedName("overallLeaguePosition")
    private String overall_league_position;
}
