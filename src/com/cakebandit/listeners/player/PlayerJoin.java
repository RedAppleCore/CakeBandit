package com.cakebandit.listeners.player;

import com.cakebandit.CakeBandit;
import com.cakebandit.handlers.Game;
import com.cakebandit.listeners.CBListener;
import com.cakebandit.utils.ChatUtilities;
import com.cakebandit.utils.LocationUtilities;
import org.bukkit.Bukkit;
import org.bukkit.GameMode;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.potion.PotionEffectType;

public class PlayerJoin extends CBListener{
    
    public PlayerJoin(CakeBandit pl){
        super(pl);
    }
    
    @EventHandler(priority = EventPriority.HIGHEST)
    public void onPlayerJoinEvent(PlayerJoinEvent e) {
        //if (ingame == false) {
            e.setJoinMessage("");
            //setPoints(e.getPlayer(), 0);
            //setPass(e.getPlayer(), 0);
            Player p = e.getPlayer();
            //p.setScoreboard(loby);
            //l.addPlayer(p);
            p.setHealth(20.0);
            p.setExp(0);
            ChatUtilities.broadcast(e.getPlayer().getDisplayName() + " has joined!");
            //lobby.setPitch(0);
            //p.teleport(lobby);
            p.removePotionEffect(PotionEffectType.INVISIBILITY);
            p.setGameMode(GameMode.ADVENTURE);
            p.getInventory().clear();
            p.getInventory().setHelmet(null);
            Game.setCanStart(Bukkit.getOnlinePlayers().length >= 5);
            LocationUtilities.teleportToLobby(p);
            //alive.add(p);
            //players.add(p);
        //} else {
            //e.setJoinMessage("");
            //Player p = e.getPlayer();
            //spec.add(p);
            //p.setHealth(20.0);
            //setPoints(e.getPlayer(), 0);
            //setPass(e.getPlayer(), 0);
            //for (Player everyone : Bukkit.getOnlinePlayers()) {
            //    for (Player r : spec) {
            //        everyone.hidePlayer(r);
            //    }
            //}
            //p.sendMessage(ChatColor.AQUA + "[" + ChatColor.RED + "Cake" + ChatColor.GREEN + "Bandit" + ChatColor.AQUA + "] " + ChatColor.GREEN + "****************************************");
            //p.sendMessage(ChatColor.AQUA + "[" + ChatColor.RED + "Cake" + ChatColor.GREEN + "Bandit" + ChatColor.AQUA + "] " + ChatColor.GOLD + "You are now a spectator!");
            //p.setGameMode(GameMode.ADVENTURE);
            //p.setAllowFlight(true);
            //p.setFlying(true);
            //p.getInventory().clear();
            //p.setExp(0);
            //p.teleport(spawn);
            //p.setScoreboard(health);
            //blue.addPlayer(e.getPlayer());
        //}
    }
    
}
