package net.woodpixel.adventskalender.listener;

import net.woodpixel.adventskalender.builder.ItemCreater;
import org.bukkit.Bukkit;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.entity.Villager;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEntityEvent;
import org.bukkit.inventory.Inventory;

public class PlayerInteractEntityListener implements Listener {

    @EventHandler
    public void onPlayerInteractEntity(PlayerInteractEntityEvent event) {

        if (event.getRightClicked().getType() == EntityType.VILLAGER) {

            Villager v = (Villager) event.getRightClicked();
            Player player = event.getPlayer();

            if (v.getCustomName().equalsIgnoreCase("§cAdventskalender")) {

                event.setCancelled(true);

                Inventory inventory = Bukkit.createInventory(null, 6*9, "§cAdventskalender");

                inventory.setItem(10, ItemCreater.customSkull("cb7e589138bb8e7cababc23b62d312a369cc34b7f4ca4154d87b2de101a8c4d", "§cTürchen #1", ""));
                inventory.setItem(11, ItemCreater.customSkull("5387f05f85341ce3cf4b35e3a3b39c4a67d96a220e395439c35f48a369d35fa", "§cTürchen #2", ""));
                inventory.setItem(12, ItemCreater.customSkull("347fda5947418f791475a1a4de4a47d539fa6bd5f428a3e3d48b8624ad1557", "§cTürchen #3", ""));
                inventory.setItem(13, ItemCreater.customSkull("ca4e7cdd3f87c3f44e1a6df78f1ffb7542a2b0e336a8b7e27e11a9e68a7f8999", "§cTürchen #4", ""));
                inventory.setItem(14, ItemCreater.customSkull("56585d7841d05f89375631564fca774b3edefe86af2b6ae39f3baecebb549", "§cTürchen #5", ""));
                inventory.setItem(15, ItemCreater.customSkull("8a159236d7512bdb4326a24e14502167b76bcd85c041931c2194201b17f5e7", "§cTürchen #6", "§c§lNIKOLAUS"));
                inventory.setItem(16, ItemCreater.customSkull("de5c4e52de3a38cd87bcff48668a55cbbae506c9a97e5d8df6f5975e74427", "§cTürchen #7", ""));
                inventory.setItem(19, ItemCreater.customSkull("b1033667cff3c7fd91fc99552a4281e77f8a9dba4c79d7041b247dd2ca8a3", "§cTürchen #8", ""));
                inventory.setItem(20, ItemCreater.customSkull("559ada31623a87f8d4a0f99370ab60103dbfff35a5917899984e0a0fb89dffe", "§cTürchen #9", ""));
                inventory.setItem(21, ItemCreater.customSkull("4a9a2b5a196fd0e721ee519ffc4bef51a0aacb98a14646ddbac7fb5b7f27f2", "§cTürchen #10", ""));
                inventory.setItem(22, ItemCreater.customSkull("215dd046e0d5094942b807b3a3a7599b227887667137183ce8fbf190cec261", "§cTürchen #11", ""));
                inventory.setItem(23, ItemCreater.customSkull("8b9ed1a43b324f85ae59d7fafc34a911c5babc5eddffc96bebbacc35cb9af76e", "§cTürchen #12", ""));
                inventory.setItem(24, ItemCreater.customSkull("c2dd3e8beb78c2a35e6a96a4c677ccfae42697b16afa8f52be68b7a4324c66c", "§cTürchen #13", ""));
                inventory.setItem(25, ItemCreater.customSkull("c2c96b557097fea8d58aa1a68e64dc1816803a2f197c476beaed4144e85c8", "§cTürchen #14", ""));
                inventory.setItem(28, ItemCreater.customSkull("9c6a8a3803d48b9e2d21255993a558ef3ef8a74413211f242711d7026a738d4", "§cTürchen #15", ""));
                inventory.setItem(29, ItemCreater.customSkull("eb807c4d9fc3ecafb6ccdb6564ca073184144cde56d5671267e46677f66457", "§cTürchen #16", ""));
                inventory.setItem(30, ItemCreater.customSkull("645731d7605b895372d41f7791455a93350ab6f74d59e6d8582668ebcba7", "§cTürchen #17", ""));
                inventory.setItem(31, ItemCreater.customSkull("272e4673a53268afc36d7a327dc257b927a82218ae15596f13c62b7037dcf", "§cTürchen #18", ""));
                inventory.setItem(32, ItemCreater.customSkull("272cad3786fa4c83ffab91929dfdfcdc568e43d221751665a7e309489295055", "§cTürchen #19", ""));
                inventory.setItem(33, ItemCreater.customSkull("ee5219abe2cf5184ee5a5e951127a7f7d3dee399d8a46822f63794f165e", "§cTürchen #20", ""));
                inventory.setItem(34, ItemCreater.customSkull("ecacfdc77952c7f1afacbc5ac65376e498bda536f4f639ffe614d28898e4a6ad", "§cTürchen #21", ""));
                inventory.setItem(39, ItemCreater.customSkull("8091b7fbdc4fcae5dfa59b784e122ceb5c2fe51babb5fdcffa9deabd7105", "§cTürchen #22", ""));
                inventory.setItem(40, ItemCreater.customSkull("e46ab7261da317b15cf3f619bb9daf792e277cfda865729da528279ec318f8", "§cTürchen #24", "§c§lWEIHNACHTEN"));
                inventory.setItem(41, ItemCreater.customSkull("e01b996c5ae5a058d1a1d7c530cc8f5ac13e3b41de23d63dcf3eaf7360b33f", "§cTürchen #23", ""));

                player.openInventory(inventory);

            }

        }

    }

}
