package me.raynah.testplugin.commands;

import me.raynah.testplugin.other.Utils;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class SetHealth implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player player) {
            if (args.length != 2) {
                player.sendMessage(Utils.setColor(Utils.getPrefix() + "&7INVALID USAGE!"));
                player.sendMessage(Utils.setColor(Utils.getPrefix() + "&7&lUSAGE: &7/sethealth <player> <amount>"));
            }
            else { Player target = Bukkit.getPlayer(args[0]); target.setHealth(Integer.parseInt(args[1])); }
        }
        return true;
    }

}
