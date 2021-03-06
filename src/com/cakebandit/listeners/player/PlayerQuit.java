package com.cakebandit.listeners.player;

import com.cakebandit.CakeBandit;
import com.cakebandit.GameState;
import com.cakebandit.GameState;
import com.cakebandit.handlers.Game;
import com.cakebandit.listeners.CBListener;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.player.PlayerQuitEvent;

public class PlayerQuit extends CBListener {

    public PlayerQuit(CakeBandit pl) {
        super(pl);
    }

    public void onPlayerLeaveEvent(PlayerQuitEvent q) {
        Player p = q.getPlayer();
        q.setQuitMessage("");
        if (GameState.isState(GameState.IN_LOBBY)) {
            Game.setCanStart(Bukkit.getOnlinePlayers().length - 1 >= 8);
        }
        //players.remove(p);
        //alive.remove(p);
        //if (q.getPlayer() == randomPlayer && ingame == false) {
        //    forceb = false;
        //}
        //if (q.getPlayer() == randomPlayer && ingame == true) {
        //    ingame = false;
        //    Bukkit.getServer().broadcastMessage(ChatColor.AQUA + "[" + ChatColor.RED + "Cake" + ChatColor.GREEN + "Bandit" + ChatColor.AQUA + "] " + ChatColor.RED + "BANDIT " + ChatColor.GOLD + randomPlayer.getName() + " chickened out...");
        //    this.getServer().getScheduler().scheduleAsyncDelayedTask(this, new Runnable() {
        //        @Override
        //        public void run() {
        //            players.clear();
        //            tested.clear();
        //            alive.clear();
        //            Player[] playe = Bukkit.getServer().getOnlinePlayers();
        //            for (Player r : playe) {
        //                r.setScoreboard(Bukkit.getServer().getScoreboardManager().getNewScoreboard());
        //                r.kickPlayer(ChatColor.AQUA + "[" + ChatColor.RED + "Cake" + ChatColor.GREEN + "Bandit" + ChatColor.AQUA + "] " + ChatColor.GOLD + "Thanks for playing! A new game will start soon!");
        //                blue.removePlayer(r);
        //                trusted.removePlayer(r);
        //                bandit.removePlayer(r);
        //                spec.clear();
        //                time = 60;
        //                cakecount = 9;
        //                mephmode = false;
        //                caught = false;
        //            }
        //        }
        //    }, 200L);
        //}
    }
}
