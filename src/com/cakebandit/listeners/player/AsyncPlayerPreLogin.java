package com.cakebandit.listeners.player;

import com.cakebandit.CakeBandit;
import com.cakebandit.handlers.Game;
import com.cakebandit.listeners.CBListener;
import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.player.AsyncPlayerPreLoginEvent;
import org.bukkit.event.player.AsyncPlayerPreLoginEvent.Result;

public class AsyncPlayerPreLogin extends CBListener{
    
    public AsyncPlayerPreLogin(CakeBandit pl) {
        super(pl);
    }
    
    @EventHandler
    public void playerPreLogin(AsyncPlayerPreLoginEvent e){
        if(Game.hasStarted())
            e.disallow(Result.KICK_OTHER, ChatColor.RED + "A game is in progress!");
    }
    
}