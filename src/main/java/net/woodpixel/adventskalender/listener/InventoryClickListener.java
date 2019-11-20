package net.woodpixel.adventskalender.listener;

import net.woodpixel.adventskalender.Data;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

public class InventoryClickListener implements Listener {

    @EventHandler
    public void onInventoryClick(InventoryClickEvent event) {

        Player player = (Player) event.getWhoClicked();

        try {

            if (event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§cTürchen #1")) {

                player.sendMessage(Data.PREFIX + "§cT1");

            }else if (event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§cTürchen #2")) {

                player.sendMessage(Data.PREFIX + "§cT2");

            }else if (event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§cTürchen #3")) {

                player.sendMessage(Data.PREFIX + "§cT3");

            }else if (event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§cTürchen #4")) {

                player.sendMessage(Data.PREFIX + "§cT4");

            }else if (event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§cTürchen #5")) {

                player.sendMessage(Data.PREFIX + "§cT5");

            }else if (event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§cTürchen #6")) {

                player.sendMessage(Data.PREFIX + "§cT6");

            }else if (event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§cTürchen #7")) {

                player.sendMessage(Data.PREFIX + "§cT7");

            }else if (event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§cTürchen #8")) {

                player.sendMessage(Data.PREFIX + "§cT8");

            }else if (event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§cTürchen #9")) {

                player.sendMessage(Data.PREFIX + "§cT9");

            }else if (event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§cTürchen #10")) {

                player.sendMessage(Data.PREFIX + "§cT10");

            }else if (event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§cTürchen #11")) {

                player.sendMessage(Data.PREFIX + "§cT11");

            }else if (event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§cTürchen #12")) {

                player.sendMessage(Data.PREFIX + "§cT12");

            }else if (event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§cTürchen #13")) {

                player.sendMessage(Data.PREFIX + "§cT13");

            }else if (event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§cTürchen #14")) {

                player.sendMessage(Data.PREFIX + "§cT14");

            }else if (event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§cTürchen #15")) {

                player.sendMessage(Data.PREFIX + "§cT15");

            }else if (event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§cTürchen #16")) {

                player.sendMessage(Data.PREFIX + "§cT16");

            }else if (event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§cTürchen #17")) {

                player.sendMessage(Data.PREFIX + "§cT17");

            }else if (event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§cTürchen #18")) {

                player.sendMessage(Data.PREFIX + "§cT18");

            }else if (event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§cTürchen #19")) {

                player.sendMessage(Data.PREFIX + "§cT19");

            }else if (event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§cTürchen #20")) {

                player.sendMessage(Data.PREFIX + "§cT20");

            }else if (event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§cTürchen #21")) {

                player.sendMessage(Data.PREFIX + "§cT21");

            }else if (event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§cTürchen #22")) {

                player.sendMessage(Data.PREFIX + "§cT22");

            }else if (event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§cTürchen #23")) {

                player.sendMessage(Data.PREFIX + "§cT23");

            }else if (event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§cTürchen #24")) {

                player.sendMessage(Data.PREFIX + "§cT24");

            }

        }catch (Exception ex) {

        }

    }

}
