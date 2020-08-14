package com.sapient.football.footballapp.service;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.sapient.football.footballapp.model.Country;
import com.sapient.football.footballapp.model.League;
import com.sapient.football.footballapp.model.Standings;
import com.sapient.football.footballapp.model.Team;
import com.sapient.football.footballapp.util.HTTPClient;
import org.springframework.boot.json.GsonJsonParser;
import org.springframework.boot.json.JsonParserFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/")
public class APIService {

    private HTTPClient httpClient = new HTTPClient();
    private String baseUrl = "https://apiv2.apifootball.com";

    @GetMapping("/getAllCountries")
    private List<Country> getAllCountries(){
        Map<String, String> headers = new HashMap<>();
        headers.put("action","get_countries");
        String output = HTTPClient.makeHTTPGet(baseUrl, headers);
        System.out.println(output);
        Gson gson = new Gson();
        ArrayList<Country> response = gson.fromJson(output, new TypeToken<ArrayList<Country>>(){}.getType());
        return response;
    }

    @GetMapping("/getAllLeaguesForCountry")
    private List<League> getAllLeagues(@RequestParam(value = "countryId", defaultValue = "") String countryId){
        if(countryId == null){
            return new ArrayList<>();
        }

        Map<String, String> headers = new HashMap<>();
        headers.put("action","get_leagues");
        headers.put("country_id",countryId);
        String output = HTTPClient.makeHTTPGet(baseUrl, headers);
        System.out.println(output);
        Gson gson = new Gson();
        List<League> response = gson.fromJson(output, new TypeToken<List<League>>(){}.getType());
        return response;
    }

    @GetMapping("/getTeamDetailsForCountry")
    private List<Team> getTeamDetailsForCountry(@RequestParam(value = "leagueId", defaultValue = "") String leagueId){
        if(leagueId == null){
            return new ArrayList<>();
        }

        Map<String, String> headers = new HashMap<>();
        headers.put("action","get_teams");
        headers.put("league_id",leagueId);
        String output = HTTPClient.makeHTTPGet(baseUrl, headers);
        System.out.println(output);
        Gson gson = new Gson();
        List<Team> response = gson.fromJson(output, new TypeToken<List<Team>>(){}.getType());
        return response;
    }

    @GetMapping("/getStandingsForLeague")
    private List<Standings> getStandings(@RequestParam(value = "leagueId", defaultValue = "") String leagueId){
        if(leagueId == null){
            return new ArrayList<>();
        }

        Map<String, String> headers = new HashMap<>();
        headers.put("action","get_standings");
        headers.put("league_id",leagueId);
        String output = HTTPClient.makeHTTPGet(baseUrl, headers);
        System.out.println(output);
        Gson gson = new Gson();
        List<Standings> response = gson.fromJson(output, new TypeToken<List<Standings>>(){}.getType());
        return response;
    }
}
