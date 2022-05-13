package me.raynah.testplugin.commands;

import me.raynah.testplugin.TestPlugin;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
public class SetSpawnCommand implements CommandExecutor {
    public static TestPlugin main = TestPlugin.getPlugin();

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player player) {
            Location location = player.getLocation();
            setSpawnLocation(location.getX(), location.getY(), location.getZ());
            main.saveConfig();
        }
        return false;
    }

    public static void setSpawnLocation(double x, double y, double z) {
        main.getConfig().set("spawn.x", x);
        main.getConfig().set("spawn.y", y);
        main.getConfig().set("spawn.z", z);
    }


}
