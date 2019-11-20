package net.woodpixel.adventskalender.commands;

import net.minecraft.server.v1_8_R3.EntityVillager;
import net.minecraft.server.v1_8_R3.NBTTagCompound;
import net.woodpixel.adventskalender.Data;
import org.bukkit.Bukkit;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.craftbukkit.v1_8_R3.entity.CraftVillager;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.entity.Villager;

public class CreateCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String label, String[] args) {

        Player player = (Player)commandSender;

        if (command.getName().equalsIgnoreCase("setwpadvent")) {
            if (player.hasPermission("woodpixel.setwpadvent")) {
                if (args.length == 0) {

                    for (World world : Bukkit.getWorlds()) {
                        for (Villager v : world.getEntitiesByClass(Villager.class)) {
                            if (v.getCustomName() != null && v.getCustomName().equals("§cAdventskalender")) {
                                v.remove();
                            }
                        }
                    }

                }else{
                    player.sendMessage(Data.PREFIX + "§cVerwendung: §6/setwpadvent");
                }

            }else{
                player.sendMessage(Data.PREFIX + "§cDazu hast du keine Rechte.");
            }
        }

        Villager villager = (Villager) player.getWorld().spawnEntity(player.getLocation(), EntityType.VILLAGER);
        villager.setCustomName("§cAdventskalender");
        villager.setCustomNameVisible(true);

        EntityVillager nmsVillager = ((CraftVillager) villager).getHandle();
        NBTTagCompound tag = new NBTTagCompound();
        nmsVillager.c(tag);
        tag.setInt("NoAI", 1);
        nmsVillager.f(tag);
        nmsVillager.b(true);

        return true;
    }
}
