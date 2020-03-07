/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ohtu;

import com.google.gson.Gson;
import java.io.IOException;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Collections;

import java.util.List;
import org.apache.http.client.fluent.Request;

public class Main {
    public static void main(String[] args) throws IOException {
        String url = "https://nhlstatisticsforohtu.herokuapp.com/players";
        
        String bodyText = Request.Get(url).execute().returnContent().asString();
        
        Gson mapper = new Gson();
        Player[] players = mapper.fromJson(bodyText, Player[].class);
        List<Player> oliot = new ArrayList<>();
       
        System.out.println("Players from FIN " + ZonedDateTime.now());
        System.out.println("");
        
        for (Player player : players) {
            if (player.getNationality().equals("FIN")) {
                oliot.add(player);
            }
        }   
        Collections.sort(oliot);
        
        for (Player player : oliot) {
            System.out.println(player);
        }
    }
  
}