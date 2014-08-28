package com.cakebandit.handlers;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

public class Game {
    
    private static boolean canStart = false;
    
    public static List<Player> players = new ArrayList<Player>();
    
    public static Player bandit;
    
    public static void start(){
        new Role("Bandit");
        new Role("Innocent");
        for(Player p : Bukkit.getOnlinePlayers()){
            players.add(p);
        }
        bandit = players.get(new Random().nextInt(players.size()));
        Role.getRole("Bandit").add(bandit);
        for(Player p : players){
            if(p != bandit){
                Role.getRole("Innocent").add(p);
            }
        }
    }
    
    public static void stop(){
        
    }
    
    public static boolean canStart() {
        return false;
    }
    
    public static void setCanStart(boolean b){
        canStart = b;
    }
    
}
