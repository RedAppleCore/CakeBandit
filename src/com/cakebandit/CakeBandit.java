package com.cakebandit;

import com.cakebandit.listeners.player.AsyncPlayerPreLogin;
import com.cakebandit.listeners.player.PlayerJoin;
import com.cakebandit.listeners.player.PlayerQuit;
import com.cakebandit.threads.StartCountdown;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class CakeBandit extends JavaPlugin{

    public void onEnable(){
        GameState.setState(GameState.IN_LOBBY);
        new Thread(new StartCountdown()).start();
    }
    
    public void registerListeners(){
        PluginManager pm = getServer().getPluginManager();
        pm.registerEvents(new PlayerJoin(this), this);
        pm.registerEvents(new PlayerQuit(this), this);
        pm.registerEvents(new AsyncPlayerPreLogin(this), this);
    }
    
}
