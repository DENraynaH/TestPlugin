package me.raynah.testplugin.commands;

import me.raynah.testplugin.TestPlugin;
import me.raynah.testplugin.other.Utils;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class SpawnCommand implements CommandExecutor {

    public static TestPlugin main = TestPlugin.getPlugin();

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player player) {

            double x = main.getConfig().getDouble("spawn.x");
            double y = main.getConfig().getDouble("spawn.y");
            double z = main.getConfig().getDouble("spawn.z");

            Location spawnLocation = new Location(player.getWorld(), x, y ,z);
            player.teleport(spawnLocation);
            player.sendMessage(Utils.setColor(Utils.getPrefix() + "&7Teleporting..."));
        }
        return false;
    }

}
