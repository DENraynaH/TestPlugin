package me.raynah.testplugin.commands;

import me.raynah.testplugin.other.Utils;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Item;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import java.util.ArrayList;

public class ArcherCommand implements CommandExecutor {

    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (sender instanceof Player player) {
            ItemStack stoneSword = new ItemStack(Material.STONE_SWORD);

            ItemStack leatherBoots = new ItemStack(Material.LEATHER_BOOTS);  ItemMeta bootsMeta = leatherBoots.getItemMeta();
            ItemStack leatherLeggings = new ItemStack(Material.LEATHER_LEGGINGS); ItemMeta leggingsMeta = leatherLeggings.getItemMeta();
            ItemStack leatherChestplate = new ItemStack(Material.LEATHER_CHESTPLATE); ItemMeta chestplateMeta = leatherChestplate.getItemMeta();
            ItemStack leatherHelmet = new ItemStack(Material.LEATHER_HELMET); ItemMeta helmetMeta = leatherHelmet.getItemMeta();

            bootsMeta.setDisplayName(Utils.setColor("&a&lArcher Boots"));
            leggingsMeta.setDisplayName(Utils.setColor("&a&lArcher Leggings"));
            chestplateMeta.setDisplayName(Utils.setColor("&a&lArcher Chestplate"));
            helmetMeta.setDisplayName(Utils.setColor("&a&lArcher Helmet"));

            ArrayList<String> lore = new ArrayList<>();
            lore.add(Utils.setColor("&c&lLine 1"));
            lore.add(Utils.setColor("&a&lLine 2"));
            lore.add(Utils.setColor("&4&lLine 3"));

            bootsMeta.setLore(lore); leggingsMeta.setLore(lore); chestplateMeta.setLore(lore); helmetMeta.setLore(lore);

            ItemStack[] armor = { leatherBoots, leatherLeggings, leatherChestplate, leatherHelmet };

            // Adding to Player //

            leatherBoots.setItemMeta(bootsMeta);
            leatherLeggings.setItemMeta(leggingsMeta);
            leatherChestplate.setItemMeta(chestplateMeta);
            leatherHelmet.setItemMeta(helmetMeta);

            player.getInventory().addItem(stoneSword);
            player.getInventory().setArmorContents(armor);
            player.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 2));

        }

        return true;
    }


}
