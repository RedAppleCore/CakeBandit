package com.cakebandit.utils;

import org.bukkit.Bukkit;
import static org.bukkit.ChatColor.*;
import org.bukkit.entity.Player;

public class ChatUtilities {
    
    public static void broadcast(String msg){
        for(Player player : Bukkit.getOnlinePlayers()){
            player.sendMessage(starter() + msg);
        }
    }
    
    private static String starter(){
        return GRAY + "[" + DARK_AQUA + "CakeBandit" + GRAY + "] " + GOLD;
    }
}
