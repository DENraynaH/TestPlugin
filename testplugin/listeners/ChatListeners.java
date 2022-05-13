package me.raynah.testplugin.listeners;

import me.raynah.testplugin.other.Utils;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

import java.util.Random;

public class ChatListeners implements Listener {

    @EventHandler
    public void onPlayerChat(AsyncPlayerChatEvent event) {
        String[] randomOutputs = {"output1", "output2", "output3", "output4"};
        Player player = event.getPlayer();
        Random random = new Random();
        int randomNumber = random.nextInt(4);
        if (player.getName().equals("itsRAYNAH")) {
            Bukkit.broadcastMessage(Utils.setColor("&7&lYESSSS"));
            Bukkit.broadcastMessage(Integer.toString(randomNumber));
            event.setMessage(randomOutputs[randomNumber]);
        }
    }
}
