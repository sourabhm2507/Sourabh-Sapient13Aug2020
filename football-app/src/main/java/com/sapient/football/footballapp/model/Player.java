package com.sapient.football.footballapp.model;

import com.google.gson.annotations.SerializedName;
import lombok.*;

@EqualsAndHashCode
@ToString
@Getter
@Setter
@RequiredArgsConstructor
public class Player {

    @SerializedName("playerKey")
    private String player_key;

    @SerializedName("playerName")
    private String player_name;

    @SerializedName("playerType")
    private String player_type;

    @SerializedName("playerAge")
    private String player_age;

    @SerializedName("playerGoals")
    private String player_goals;
}
