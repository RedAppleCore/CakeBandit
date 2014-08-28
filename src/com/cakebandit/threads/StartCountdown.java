package com.cakebandit.threads;

import com.cakebandit.CakeBandit;
import com.cakebandit.GameState;
import com.cakebandit.utils.ChatUtilities;
import org.bukkit.Bukkit;

public class StartCountdown implements Runnable {

    private static int timeUntilStart;

    public void run() {
        while (true) {
            if (GameState.isState(GameState.IN_LOBBY)) {
                if (CakeBandit.canStart()) {
                    ChatUtilities.broadcast("Minimum players reached! Countdown starting!");
                    timeUntilStart = 60;
                    for (; timeUntilStart >= 0; timeUntilStart--) {
                        if(!CakeBandit.canStart()){
                            ChatUtilities.broadcast("Not enough players! Countdown stopped!");
                        }
                        if (timeUntilStart == 0) {
                            CakeBandit.start();
                            break;
                        }

                        if (timeUntilStart % 10 == 0 || timeUntilStart < 10) {
                            ChatUtilities.broadcast(timeUntilStart + " seconds until the game starts!");
                        }

                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                            Bukkit.shutdown();
                        }
                    }
                }
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                    Bukkit.shutdown();
                }
            }
        }
    }
}
