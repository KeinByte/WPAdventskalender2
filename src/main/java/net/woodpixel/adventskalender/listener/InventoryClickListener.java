package net.woodpixel.adventskalender.listener;

import net.woodpixel.adventskalender.Adventskalender;
import net.woodpixel.adventskalender.Data;
import net.woodpixel.adventskalender.DateHandler;
import net.woodpixel.adventskalender.storage.MoneyDatabase;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryDragEvent;

public class InventoryClickListener implements Listener {

    @EventHandler
    public void onDrag(InventoryDragEvent event) {
        try {
            if (!event.getView().getTitle().equalsIgnoreCase("§cAdventskalender")) return;
            event.setCancelled(true);
        } catch (Exception e) {}
    }

    @EventHandler
    public void onInventoryClick(InventoryClickEvent event) {

        Player player = (Player) event.getWhoClicked();

        try {

            if (!event.getView().getTitle().equalsIgnoreCase("§cAdventskalender")) return;
            event.setCancelled(true);
            if (!event.getCurrentItem().hasItemMeta()) return;

            if (event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§cTürchen #1")) {

                if (!DateHandler.getDate(System.currentTimeMillis()).equalsIgnoreCase("01.12.")) {

                    player.sendMessage(Data.PREFIX + "§cDieser Tag ist heute nicht!");

                    return;
                }

                if (MoneyDatabase.getDatabase().isAlreadyUsed(player.getUniqueId(), 1)) {
                    player.sendMessage(Data.PREFIX + "§cDu hast dieses Türchen schon eingelöst!");
                    return;
                }

                if (!player.hasPermission("group.pixel")) {
                    Bukkit.getScheduler().runTask(Adventskalender.getAdventskalender(), () -> {

                        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "lp user " + player.getName() + " parent addtemp pixel 25d");
                        player.sendMessage(Data.PREFIX + "§7Du hast den Rang: §ePixel §8[§c24 Tage§8] §7bekommen.");

                    });
                }else{

                    player.sendMessage(Data.PREFIX + "§7Du hast den Rang: §ePixel §7bereits. Also bekommst du den Rang nicht.");

                }

                MoneyDatabase.getDatabase().addMoney(player.getUniqueId(), 1000);
                MoneyDatabase.getDatabase().setUsed(player.getUniqueId(), 1);
                player.sendMessage(Data.PREFIX + "§7Du hast das Türchen: §a#1 §7eingelöst und hast: §e1000$ §7bekommen.");
                player.closeInventory();

            }else if (event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§cTürchen #2")) {

                if (!DateHandler.getDate(System.currentTimeMillis()).equalsIgnoreCase("02.12.")) {

                    player.sendMessage(Data.PREFIX + "§cDieser Tag ist heute nicht!");

                    return;
                }

                if (MoneyDatabase.getDatabase().isAlreadyUsed(player.getUniqueId(), 2)) {
                    player.sendMessage(Data.PREFIX + "§cDu hast dieses Türchen schon eingelöst!");
                    return;
                }

                MoneyDatabase.getDatabase().addMoney(player.getUniqueId(), 2000);
                MoneyDatabase.getDatabase().setUsed(player.getUniqueId(), 2);
                player.sendMessage(Data.PREFIX + "§7Du hast das Türchen: §a#2 §7eingelöst und hast: §e2000$ §7bekommen.");
                player.closeInventory();

            }else if (event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§cTürchen #3")) {

                if (!DateHandler.getDate(System.currentTimeMillis()).equalsIgnoreCase("03.12.")) {

                    player.sendMessage(Data.PREFIX + "§cDieser Tag ist heute nicht!");

                    return;
                }

                if (MoneyDatabase.getDatabase().isAlreadyUsed(player.getUniqueId(), 3)) {
                    player.sendMessage(Data.PREFIX + "§cDu hast dieses Türchen schon eingelöst!");
                    return;
                }

                MoneyDatabase.getDatabase().addMoney(player.getUniqueId(), 3000);
                MoneyDatabase.getDatabase().setUsed(player.getUniqueId(), 3);
                player.sendMessage(Data.PREFIX + "§7Du hast das Türchen: §a#3 §7eingelöst und hast: §e3000$ §7bekommen.");
                player.closeInventory();

            }else if (event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§cTürchen #4")) {

                if (!DateHandler.getDate(System.currentTimeMillis()).equalsIgnoreCase("04.12.")) {

                    player.sendMessage(Data.PREFIX + "§cDieser Tag ist heute nicht!");

                    return;
                }

                if (MoneyDatabase.getDatabase().isAlreadyUsed(player.getUniqueId(), 4)) {
                    player.sendMessage(Data.PREFIX + "§cDu hast dieses Türchen schon eingelöst!");
                    return;
                }

                MoneyDatabase.getDatabase().addMoney(player.getUniqueId(), 4000);
                MoneyDatabase.getDatabase().setUsed(player.getUniqueId(), 4);
                player.sendMessage(Data.PREFIX + "§7Du hast das Türchen: §a#4 §7eingelöst und hast: §e4000$ §7bekommen.");
                player.closeInventory();

            }else if (event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§cTürchen #5")) {

                if (!DateHandler.getDate(System.currentTimeMillis()).equalsIgnoreCase("05.12.")) {

                    player.sendMessage(Data.PREFIX + "§cDieser Tag ist heute nicht!");

                    return;
                }

                if (MoneyDatabase.getDatabase().isAlreadyUsed(player.getUniqueId(), 5)) {
                    player.sendMessage(Data.PREFIX + "§cDu hast dieses Türchen schon eingelöst!");
                    return;
                }

                MoneyDatabase.getDatabase().addMoney(player.getUniqueId(), 5000);
                MoneyDatabase.getDatabase().setUsed(player.getUniqueId(), 5);
                player.sendMessage(Data.PREFIX + "§7Du hast das Türchen: §a#5 §7eingelöst und hast: §e5000$ §7bekommen.");
                player.closeInventory();

            }else if (event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§cTürchen #6")) {

                if (!DateHandler.getDate(System.currentTimeMillis()).equalsIgnoreCase("06.12.")) {

                    player.sendMessage(Data.PREFIX + "§cDieser Tag ist heute nicht!");

                    return;
                }

                if (MoneyDatabase.getDatabase().isAlreadyUsed(player.getUniqueId(), 6)) {
                    player.sendMessage(Data.PREFIX + "§cDu hast dieses Türchen schon eingelöst!");
                    return;
                }

                MoneyDatabase.getDatabase().addMoney(player.getUniqueId(), 6000);
                MoneyDatabase.getDatabase().setUsed(player.getUniqueId(), 6);
                player.sendMessage(Data.PREFIX + "§7Du hast das Türchen: §a#6 §7eingelöst und hast: §e6000$ §7bekommen.");
                player.closeInventory();

            }else if (event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§cTürchen #7")) {

                if (!DateHandler.getDate(System.currentTimeMillis()).equalsIgnoreCase("07.12.")) {

                    player.sendMessage(Data.PREFIX + "§cDieser Tag ist heute nicht!");

                    return;
                }

                if (MoneyDatabase.getDatabase().isAlreadyUsed(player.getUniqueId(), 7)) {
                    player.sendMessage(Data.PREFIX + "§cDu hast dieses Türchen schon eingelöst!");
                    return;
                }

                MoneyDatabase.getDatabase().addMoney(player.getUniqueId(), 7000);
                MoneyDatabase.getDatabase().setUsed(player.getUniqueId(), 7);
                player.sendMessage(Data.PREFIX + "§7Du hast das Türchen: §a#7 §7eingelöst und hast: §e7000$ §7bekommen.");
                player.closeInventory();

            }else if (event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§cTürchen #8")) {

                if (!DateHandler.getDate(System.currentTimeMillis()).equalsIgnoreCase("08.12.")) {

                    player.sendMessage(Data.PREFIX + "§cDieser Tag ist heute nicht!");

                    return;
                }

                if (MoneyDatabase.getDatabase().isAlreadyUsed(player.getUniqueId(), 8)) {
                    player.sendMessage(Data.PREFIX + "§cDu hast dieses Türchen schon eingelöst!");
                    return;
                }

                MoneyDatabase.getDatabase().addMoney(player.getUniqueId(), 8000);
                MoneyDatabase.getDatabase().setUsed(player.getUniqueId(), 8);
                player.sendMessage(Data.PREFIX + "§7Du hast das Türchen: §a#8 §7eingelöst und hast: §e8000$ §7bekommen.");
                player.closeInventory();

            }else if (event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§cTürchen #9")) {

                if (!DateHandler.getDate(System.currentTimeMillis()).equalsIgnoreCase("09.12.")) {

                    player.sendMessage(Data.PREFIX + "§cDieser Tag ist heute nicht!");

                    return;
                }

                if (MoneyDatabase.getDatabase().isAlreadyUsed(player.getUniqueId(), 9)) {
                    player.sendMessage(Data.PREFIX + "§cDu hast dieses Türchen schon eingelöst!");
                    return;
                }

                MoneyDatabase.getDatabase().addMoney(player.getUniqueId(), 9000);
                MoneyDatabase.getDatabase().setUsed(player.getUniqueId(), 9);
                player.sendMessage(Data.PREFIX + "§7Du hast das Türchen: §a#9 §7eingelöst und hast: §e9000$ §7bekommen.");
                player.closeInventory();

            }else if (event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§cTürchen #10")) {

                if (!DateHandler.getDate(System.currentTimeMillis()).equalsIgnoreCase("10.12.")) {

                    player.sendMessage(Data.PREFIX + "§cDieser Tag ist heute nicht!");

                    return;
                }

                if (MoneyDatabase.getDatabase().isAlreadyUsed(player.getUniqueId(), 10)) {
                    player.sendMessage(Data.PREFIX + "§cDu hast dieses Türchen schon eingelöst!");
                    return;
                }

                MoneyDatabase.getDatabase().addMoney(player.getUniqueId(), 10000);
                MoneyDatabase.getDatabase().setUsed(player.getUniqueId(), 10);
                player.sendMessage(Data.PREFIX + "§7Du hast das Türchen: §a#10 §7eingelöst und hast: §10000 §7bekommen.");
                player.closeInventory();

            }else if (event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§cTürchen #11")) {

                if (!DateHandler.getDate(System.currentTimeMillis()).equalsIgnoreCase("11.12.")) {

                    player.sendMessage(Data.PREFIX + "§cDieser Tag ist heute nicht!");

                    return;
                }

                if (MoneyDatabase.getDatabase().isAlreadyUsed(player.getUniqueId(), 11)) {
                    player.sendMessage(Data.PREFIX + "§cDu hast dieses Türchen schon eingelöst!");
                    return;
                }

                MoneyDatabase.getDatabase().addMoney(player.getUniqueId(), 11000);
                MoneyDatabase.getDatabase().setUsed(player.getUniqueId(), 11);
                player.sendMessage(Data.PREFIX + "§7Du hast das Türchen: §a#11 §7eingelöst und hast: §e11000$ §7bekommen.");
                player.closeInventory();

            }else if (event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§cTürchen #12")) {

                if (!DateHandler.getDate(System.currentTimeMillis()).equalsIgnoreCase("12.12.")) {

                    player.sendMessage(Data.PREFIX + "§cDieser Tag ist heute nicht!");

                    return;
                }

                if (MoneyDatabase.getDatabase().isAlreadyUsed(player.getUniqueId(), 12)) {
                    player.sendMessage(Data.PREFIX + "§cDu hast dieses Türchen schon eingelöst!");
                    return;
                }

                MoneyDatabase.getDatabase().addMoney(player.getUniqueId(), 12000);
                MoneyDatabase.getDatabase().setUsed(player.getUniqueId(), 12);
                player.sendMessage(Data.PREFIX + "§7Du hast das Türchen: §a#12 §7eingelöst und hast: §e12000$ §7bekommen.");
                player.closeInventory();

            }else if (event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§cTürchen #13")) {

                if (!DateHandler.getDate(System.currentTimeMillis()).equalsIgnoreCase("13.12.")) {

                    player.sendMessage(Data.PREFIX + "§cDieser Tag ist heute nicht!");

                    return;
                }

                if (MoneyDatabase.getDatabase().isAlreadyUsed(player.getUniqueId(), 13)) {
                    player.sendMessage(Data.PREFIX + "§cDu hast dieses Türchen schon eingelöst!");
                    return;
                }

                MoneyDatabase.getDatabase().addMoney(player.getUniqueId(), 13000);
                MoneyDatabase.getDatabase().setUsed(player.getUniqueId(), 13);
                player.sendMessage(Data.PREFIX + "§7Du hast das Türchen: §a#13 §7eingelöst und hast: §e13000$ §7bekommen.");
                player.closeInventory();

            }else if (event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§cTürchen #14")) {

                if (!DateHandler.getDate(System.currentTimeMillis()).equalsIgnoreCase("14.12.")) {

                    player.sendMessage(Data.PREFIX + "§cDieser Tag ist heute nicht!");

                    return;
                }

                if (MoneyDatabase.getDatabase().isAlreadyUsed(player.getUniqueId(), 14)) {
                    player.sendMessage(Data.PREFIX + "§cDu hast dieses Türchen schon eingelöst!");
                    return;
                }

                MoneyDatabase.getDatabase().addMoney(player.getUniqueId(), 14000);
                MoneyDatabase.getDatabase().setUsed(player.getUniqueId(), 14);
                player.sendMessage(Data.PREFIX + "§7Du hast das Türchen: §a#14 §7eingelöst und hast: §e14000$ §7bekommen.");
                player.closeInventory();

            }else if (event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§cTürchen #15")) {

                if (!DateHandler.getDate(System.currentTimeMillis()).equalsIgnoreCase("15.12.")) {

                    player.sendMessage(Data.PREFIX + "§cDieser Tag ist heute nicht!");

                    return;
                }

                if (MoneyDatabase.getDatabase().isAlreadyUsed(player.getUniqueId(), 15)) {
                    player.sendMessage(Data.PREFIX + "§cDu hast dieses Türchen schon eingelöst!");
                    return;
                }

                MoneyDatabase.getDatabase().addMoney(player.getUniqueId(), 15000);
                MoneyDatabase.getDatabase().setUsed(player.getUniqueId(), 15);
                player.sendMessage(Data.PREFIX + "§7Du hast das Türchen: §a#15 §7eingelöst und hast: §e15000$ §7bekommen.");
                player.closeInventory();

            }else if (event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§cTürchen #16")) {

                if (!DateHandler.getDate(System.currentTimeMillis()).equalsIgnoreCase("16.12.")) {

                    player.sendMessage(Data.PREFIX + "§cDieser Tag ist heute nicht!");

                    return;
                }

                if (MoneyDatabase.getDatabase().isAlreadyUsed(player.getUniqueId(), 16)) {
                    player.sendMessage(Data.PREFIX + "§cDu hast dieses Türchen schon eingelöst!");
                    return;
                }

                MoneyDatabase.getDatabase().addMoney(player.getUniqueId(), 16000);
                MoneyDatabase.getDatabase().setUsed(player.getUniqueId(), 16);
                player.sendMessage(Data.PREFIX + "§7Du hast das Türchen: §a#16 §7eingelöst und hast: §e16000$ §7bekommen.");
                player.closeInventory();

            }else if (event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§cTürchen #17")) {

                if (!DateHandler.getDate(System.currentTimeMillis()).equalsIgnoreCase("17.12.")) {

                    player.sendMessage(Data.PREFIX + "§cDieser Tag ist heute nicht!");

                    return;
                }

                if (MoneyDatabase.getDatabase().isAlreadyUsed(player.getUniqueId(), 17)) {
                    player.sendMessage(Data.PREFIX + "§cDu hast dieses Türchen schon eingelöst!");
                    return;
                }

                MoneyDatabase.getDatabase().addMoney(player.getUniqueId(), 17000);
                MoneyDatabase.getDatabase().setUsed(player.getUniqueId(), 17);
                player.sendMessage(Data.PREFIX + "§7Du hast das Türchen: §a#17 §7eingelöst und hast: §e17000$ §7bekommen.");
                player.closeInventory();

            }else if (event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§cTürchen #18")) {

                if (!DateHandler.getDate(System.currentTimeMillis()).equalsIgnoreCase("18.12.")) {

                    player.sendMessage(Data.PREFIX + "§cDieser Tag ist heute nicht!");

                    return;
                }

                if (MoneyDatabase.getDatabase().isAlreadyUsed(player.getUniqueId(), 18)) {
                    player.sendMessage(Data.PREFIX + "§cDu hast dieses Türchen schon eingelöst!");
                    return;
                }

                MoneyDatabase.getDatabase().addMoney(player.getUniqueId(), 18000);
                MoneyDatabase.getDatabase().setUsed(player.getUniqueId(), 18);
                player.sendMessage(Data.PREFIX + "§7Du hast das Türchen: §a#18 §7eingelöst und hast: §e18000$ §7bekommen.");
                player.closeInventory();

            }else if (event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§cTürchen #19")) {

                if (!DateHandler.getDate(System.currentTimeMillis()).equalsIgnoreCase("19.12.")) {

                    player.sendMessage(Data.PREFIX + "§cDieser Tag ist heute nicht!");

                    return;
                }

                if (MoneyDatabase.getDatabase().isAlreadyUsed(player.getUniqueId(), 19)) {
                    player.sendMessage(Data.PREFIX + "§cDu hast dieses Türchen schon eingelöst!");
                    return;
                }

                MoneyDatabase.getDatabase().addMoney(player.getUniqueId(), 19000);
                MoneyDatabase.getDatabase().setUsed(player.getUniqueId(), 19);
                player.sendMessage(Data.PREFIX + "§7Du hast das Türchen: §a#19 §7eingelöst und hast: §e19000$ §7bekommen.");
                player.closeInventory();

            }else if (event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§cTürchen #20")) {

                if (!DateHandler.getDate(System.currentTimeMillis()).equalsIgnoreCase("20.12.")) {

                    player.sendMessage(Data.PREFIX + "§cDieser Tag ist heute nicht!");

                    return;
                }

                if (MoneyDatabase.getDatabase().isAlreadyUsed(player.getUniqueId(), 20)) {
                    player.sendMessage(Data.PREFIX + "§cDu hast dieses Türchen schon eingelöst!");
                    return;
                }

                MoneyDatabase.getDatabase().addMoney(player.getUniqueId(), 20000);
                MoneyDatabase.getDatabase().setUsed(player.getUniqueId(), 20);
                player.sendMessage(Data.PREFIX + "§7Du hast das Türchen: §a#20 §7eingelöst und hast: §e20000$ §7bekommen.");
                player.closeInventory();

            }else if (event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§cTürchen #21")) {

                if (!DateHandler.getDate(System.currentTimeMillis()).equalsIgnoreCase("21.12.")) {

                    player.sendMessage(Data.PREFIX + "§cDieser Tag ist heute nicht!");

                    return;
                }

                if (MoneyDatabase.getDatabase().isAlreadyUsed(player.getUniqueId(), 21)) {
                    player.sendMessage(Data.PREFIX + "§cDu hast dieses Türchen schon eingelöst!");
                    return;
                }

                MoneyDatabase.getDatabase().addMoney(player.getUniqueId(), 21000);
                MoneyDatabase.getDatabase().setUsed(player.getUniqueId(), 21);
                player.sendMessage(Data.PREFIX + "§7Du hast das Türchen: §a#21 §7eingelöst und hast: §e21000$ §7bekommen.");
                player.closeInventory();

            }else if (event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§cTürchen #22")) {

                if (!DateHandler.getDate(System.currentTimeMillis()).equalsIgnoreCase("22.12.")) {

                    player.sendMessage(Data.PREFIX + "§cDieser Tag ist heute nicht!");

                    return;
                }

                if (MoneyDatabase.getDatabase().isAlreadyUsed(player.getUniqueId(), 22)) {
                    player.sendMessage(Data.PREFIX + "§cDu hast dieses Türchen schon eingelöst!");
                    return;
                }

                MoneyDatabase.getDatabase().addMoney(player.getUniqueId(), 22000);
                MoneyDatabase.getDatabase().setUsed(player.getUniqueId(), 22);
                player.sendMessage(Data.PREFIX + "§7Du hast das Türchen: §a#22 §7eingelöst und hast: §e22000$ §7bekommen.");
                player.closeInventory();

            }else if (event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§cTürchen #23")) {

                if (!DateHandler.getDate(System.currentTimeMillis()).equalsIgnoreCase("23.12.")) {

                    player.sendMessage(Data.PREFIX + "§cDieser Tag ist heute nicht!");

                    return;
                }

                if (MoneyDatabase.getDatabase().isAlreadyUsed(player.getUniqueId(), 23)) {
                    player.sendMessage(Data.PREFIX + "§cDu hast dieses Türchen schon eingelöst!");
                    return;
                }

                MoneyDatabase.getDatabase().addMoney(player.getUniqueId(), 23000);
                MoneyDatabase.getDatabase().setUsed(player.getUniqueId(), 23);
                player.sendMessage(Data.PREFIX + "§7Du hast das Türchen: §a#23 §7eingelöst und hast: §e23000$ §7bekommen.");
                player.closeInventory();

            }else if (event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§cTürchen #24")) {

                if (!DateHandler.getDate(System.currentTimeMillis()).equalsIgnoreCase("24.12.")) {

                    player.sendMessage(Data.PREFIX + "§cDieser Tag ist heute nicht!");

                    return;
                }

                if (MoneyDatabase.getDatabase().isAlreadyUsed(player.getUniqueId(), 24)) {
                    player.sendMessage(Data.PREFIX + "§cDu hast dieses Türchen schon eingelöst!");
                    return;
                }

                if (!player.hasPermission("perks.fallschaden")) {

                    Bukkit.getScheduler().runTask(Adventskalender.getAdventskalender(), () -> {
                        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "lp user " + player.getName() + " permission set perks.fallschaden");
                        player.sendMessage(Data.PREFIX + "§7Du hast das Perk: §eKein Fallschaden §8[§cLIFETIME§8] §7bekommen.");
                    });

                }else{

                    player.sendMessage(Data.PREFIX + "§7Du hast das Perk: §eKein Fallschaden §7bereits. Also bekommst du das Perk nicht.");

                }

                MoneyDatabase.getDatabase().addMoney(player.getUniqueId(), 24000);
                MoneyDatabase.getDatabase().setUsed(player.getUniqueId(), 24);
                player.sendMessage(Data.PREFIX + "§7Du hast das Türchen: §a#24 §7eingelöst und hast: §e24000$ §7bekommen.");

                player.sendMessage("§8§m--------------------§cFROHE WEIHNACHTEN§8§m-------------------");
                player.sendMessage(" ");
                player.sendMessage(Data.PREFIX + "§cDas WoodPixel-Team wünscht frohe Weihnachten und schöne Feiertage mit der Familie.");
                player.sendMessage(" ");
                player.sendMessage("§8§m-------------------§cFROHE WEIHNACHTEN§8§m-------------------");

                player.closeInventory();

            }

        }catch (Exception ex) {

        }

    }

}
