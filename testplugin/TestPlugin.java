package me.raynah.testplugin;

import me.raynah.testplugin.commands.ArcherCommand;
import me.raynah.testplugin.commands.SetHealth;
import me.raynah.testplugin.commands.SetSpawnCommand;
import me.raynah.testplugin.commands.SpawnCommand;
import me.raynah.testplugin.listeners.ChatListeners;
import me.raynah.testplugin.other.Utils;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;

public final class TestPlugin extends JavaPlugin implements Listener {

    public static TestPlugin mainPlugin;

    @Override
    public void onEnable() {
        mainPlugin = this;
        System.out.println(Utils.setColor("&a&lTest Plugin Active!"));

        saveDefaultConfig();

        //getServer().getPluginManager().registerEvents(new ChatListeners(), this);
        getCommand("sethealth").setExecutor(new SetHealth());
        getCommand("archer").setExecutor(new ArcherCommand());
        //getCommand("setspawn").setExecutor(new SetSpawnCommand());
        //getCommand("spawn").setExecutor(new SpawnCommand());
    }
    public static TestPlugin getPlugin() {
        return mainPlugin;
    }

}
