package me.raynah.testplugin.other;

import me.raynah.testplugin.TestPlugin;
import org.bukkit.ChatColor;

import java.util.List;

public class Utils {

    public static String setColor(String messageToColor) {
        return ChatColor.translateAlternateColorCodes('&', messageToColor);
    }
    public static String getPrefix() {
        return TestPlugin.getPlugin().getConfig().getString("prefix");
    }

}
