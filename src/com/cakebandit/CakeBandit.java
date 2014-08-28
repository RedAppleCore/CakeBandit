package com.cakebandit;

import com.cakebandit.threads.StartCountdown;
import org.bukkit.plugin.java.JavaPlugin;

public class CakeBandit extends JavaPlugin{

    public void onEnable(){
        GameState.setState(GameState.IN_LOBBY);
        new Thread(new StartCountdown()).start();
    }
    
    public static void start(){
        
    }
    
    public static void stop(){
        
    }
    
    public static boolean canStart() {
        return false;
    }
    
}
