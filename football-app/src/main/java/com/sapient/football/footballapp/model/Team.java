package com.sapient.football.footballapp.model;

import com.google.gson.annotations.SerializedName;
import lombok.*;

import java.util.List;

@EqualsAndHashCode
@ToString
@Getter
@Setter
@RequiredArgsConstructor
public class Team {

    @SerializedName("teamId")
    private String team_id;

    @SerializedName("teamName")
    private String team_name;

    @SerializedName("teams")
    private List<Player> teams;

    @SerializedName("teamBadge")
    private String team_badge;
}
