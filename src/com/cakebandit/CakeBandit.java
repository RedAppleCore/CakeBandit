package com.cakebandit;

import com.cakebandit.threads.StartCountdown;
import org.bukkit.plugin.java.JavaPlugin;

public class CakeBandit extends JavaPlugin{
    
    public void onEnable(){
        new Thread(new StartCountdown()).start();
    }
    
    public static void start(){
        
    }
    
    public static void stop(){
        
    }
    
}
